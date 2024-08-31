package _21010310053_Mustafa_Egilmez;

public class _21010310053_decoder_3X8 {

	static String dec_3X8(String IR){
		
		
		String I = IR.substring(0,1);
		String x = IR.substring(1,2);
		String y = IR.substring(2,3);
		String z = IR.substring(3,4);
		String xDegili = "";
		String yDegili = "";
		String zDegili = "";

	    String selected = "";
	   
	   if(x.equals("0")) {
		   xDegili = "1";
	   }
	   else {
		   xDegili = "0";
	   }
	   
	   if(y.equals("0")) {
		   yDegili = "1";
	   }
	   else{
		   yDegili = "0";
	   }
	   
	   if(z.equals("0")) {
		   zDegili = "1";
	   }
	   else {
		   zDegili = "0";
	   }
	   
			if(xDegili.equals("1") && yDegili.equals("1") && zDegili.equals("1")) {
				selected = "D0";
			}
			else if(xDegili.equals("1") && yDegili.equals("1") && z.equals("1")) {
				selected = "D1";
			}
            else if(xDegili.equals("1") && y.equals("1") && zDegili.equals("1")) {
            	selected = "D2";
			}
            else if(xDegili.equals("1") && y.equals("1") && z.equals("1")) {
            	selected = "D3";
            }
            else if(x.equals("1") && yDegili.equals("1") && zDegili.equals("1")) {
            	selected = "D4";
 			}
            else if(x.equals("1") && yDegili.equals("1") && z.equals("1")) {
            	selected = "D5";
 			}
            else if(x.equals("1") && y.equals("1") && zDegili.equals("1")) {
            	selected = "D6";
            }
            else if(x.equals("1") && y.equals("1") && z.equals("1")) {
            	selected = "D7";
           }
		return " zamanında "+"I"+" = "+I+" "+selected+" "+"aktif";	
	}
}