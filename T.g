grammar T;

prog:
  stmt+
  ;

stmt:
  'hextrans' '0x' value=HEXCHAR {
    String hexvalue = $value.text;
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
  ;


HEXCHAR: ('0'.. '9'| 'A' .. 'A')+
  ;



WS: (' ' | '\n' | '\t' | '\r')+ {skip();}
  ;
