package _21010310053_Mustafa_Egilmez;

public class _21010310053_Instructions {

	static String instructions(String IR){
		
		String son12Bit = IR.substring(4,16);
		String OP_CODE = IR.substring(1,4);
		String I = IR.substring(0,1);
		String buyrukTanima1 = IR.substring(4,16);
		String buyrukTanima2 = IR.substring(0,4);
		String buyrukTipi ="";
		
        String[] bellekAdreslemeli = {"AND","ADD","LDA","STA","BUN","BSA","ISZ"};
        String[] bellekAdreslemeliAdres = {"0000","0001","0010","0011","0100","0101","0110"};
              
        String[] bellekAdreslemeliDolayli = {"AND","ADD","LDA","STA","BUN","BSA","ISZ"};
        String[] bellekAdreslemeliDolayliAdres = {"1000","1001","1010","1011","1100","1101","1110"};
        
        String[] yazacAdreslemeli = {"CLA","CLE","CMA","CME","CIR","CIL","INC","SPA","SNA","SZA","SZE","HLT"};
        String[] yazacAdreslemeliAdres = {"100000000000","010000000000","001000000000","000100000000","000010000000","000001000000","000000010000","000000001000","000000000100","000000000010","000000000001"};
        
        String[] giris_cikisAdreslemeli = {"INP","OUT","SKI","SKO","ION","IOF"};
        String[] giris_cikisAdreslemeliAdres = {"100000000000","010000000000","001000000000","000100000000","000010000000","000001000000"};
        
        if(I.equals("0") && !OP_CODE.equals("111") ) {
        	for (int j = 0; j < bellekAdreslemeliAdres.length; j++) {
				if(bellekAdreslemeliAdres[j].equals(buyrukTanima2)){
					buyrukTipi = bellekAdreslemeli[j];					
				}
			}     	
        }    
        else if(I.equals("1") && !OP_CODE.equals("111")) {
        	for (int j = 0; j < bellekAdreslemeliDolayliAdres.length; j++) {
				if(bellekAdreslemeliDolayliAdres[j].equals(buyrukTanima2)){
					buyrukTipi = bellekAdreslemeliDolayli[j];					
				}
			}
        }    
        else if(I.equals("0") && OP_CODE.equals("111")) {
        	for (int j = 0; j < yazacAdreslemeliAdres.length; j++) {
				if(yazacAdreslemeliAdres[j].equals(buyrukTanima1)) {
					buyrukTipi =  yazacAdreslemeli[j];
				}
			}
        }        
        else if(I.equals("1") && OP_CODE.equals("111")) {
        	for (int j = 0; j < giris_cikisAdreslemeliAdres.length; j++) {
        		if(giris_cikisAdreslemeliAdres[j].equals(buyrukTanima1)) {
					buyrukTipi =  giris_cikisAdreslemeli[j];
				}
			}
        }        	
		return " IR(11-0)"+" ="+" "+son12Bit+" "+"buyruk = " +buyrukTipi;			
	}
}