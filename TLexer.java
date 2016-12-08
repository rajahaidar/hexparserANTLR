// $ANTLR 3.2 Sep 23, 2009 12:02:23 T.g 2016-12-08 14:01:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TLexer extends Lexer {
    public static final int WS=5;
    public static final int HEXCHAR=4;
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__6=6;

    // delegates
    // delegators

    public TLexer() {;} 
    public TLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "T.g"; }

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:3:6: ( 'hextrans' )
            // T.g:3:8: 'hextrans'
            {
            match("hextrans"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:4:6: ( '0x' )
            // T.g:4:8: '0x'
            {
            match("0x"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "HEXCHAR"
    public final void mHEXCHAR() throws RecognitionException {
        try {
            int _type = HEXCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:23:8: ( ( '0' .. '9' | 'A' .. 'A' )+ )
            // T.g:23:10: ( '0' .. '9' | 'A' .. 'A' )+
            {
            // T.g:23:10: ( '0' .. '9' | 'A' .. 'A' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||LA1_0=='A') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // T.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='A' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEXCHAR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:28:3: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
            // T.g:28:5: ( ' ' | '\\n' | '\\t' | '\\r' )+
            {
            // T.g:28:5: ( ' ' | '\\n' | '\\t' | '\\r' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // T.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // T.g:1:8: ( T__6 | T__7 | HEXCHAR | WS )
        int alt3=4;
        switch ( input.LA(1) ) {
        case 'h':
            {
            alt3=1;
            }
            break;
        case '0':
            {
            int LA3_2 = input.LA(2);

            if ( (LA3_2=='x') ) {
                alt3=2;
            }
            else {
                alt3=3;}
            }
            break;
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
        case 'A':
            {
            alt3=3;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=4;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;
        }

        switch (alt3) {
            case 1 :
                // T.g:1:10: T__6
                {
                mT__6(); 

                }
                break;
            case 2 :
                // T.g:1:15: T__7
                {
                mT__7(); 

                }
                break;
            case 3 :
                // T.g:1:20: HEXCHAR
                {
                mHEXCHAR(); 

                }
                break;
            case 4 :
                // T.g:1:28: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}