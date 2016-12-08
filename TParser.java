// $ANTLR 3.2 Sep 23, 2009 12:02:23 T.g 2016-12-08 14:01:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "HEXCHAR", "WS", "'hextrans'", "'0x'"
    };
    public static final int WS=5;
    public static final int HEXCHAR=4;
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__6=6;

    // delegates
    // delegators


        public TParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TParser.tokenNames; }
    public String getGrammarFileName() { return "T.g"; }



    // $ANTLR start "prog"
    // T.g:3:1: prog : ( stmt )+ ;
    public final void prog() throws RecognitionException {
        try {
            // T.g:3:5: ( ( stmt )+ )
            // T.g:4:3: ( stmt )+
            {
            // T.g:4:3: ( stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==6) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // T.g:4:3: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_prog11);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "stmt"
    // T.g:7:1: stmt : 'hextrans' '0x' value= HEXCHAR ;
    public final void stmt() throws RecognitionException {
        Token value=null;

        try {
            // T.g:7:5: ( 'hextrans' '0x' value= HEXCHAR )
            // T.g:8:3: 'hextrans' '0x' value= HEXCHAR
            {
            match(input,6,FOLLOW_6_in_stmt24); 
            match(input,7,FOLLOW_7_in_stmt26); 
            value=(Token)match(input,HEXCHAR,FOLLOW_HEXCHAR_in_stmt30); 

                String hexvalue = (value!=null?value.getText():null);
                System.out.println("Transferring your value: 0x"+hexvalue+" into decimal");
                String digits = "0123456789ABCDEF";
                int val = 0;
                for (int i = 0; i < hexvalue.length(); i++) {
                  char c = hexvalue.charAt(i);
                  int d = digits.indexOf(c);
                  val = 16*val + d;
                }
                System.out.println(hexvalue+" is "+ val +" in decimal");
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "stmt"

    // Delegated rules


 

    public static final BitSet FOLLOW_stmt_in_prog11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6_in_stmt24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_stmt26 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_HEXCHAR_in_stmt30 = new BitSet(new long[]{0x0000000000000002L});

}