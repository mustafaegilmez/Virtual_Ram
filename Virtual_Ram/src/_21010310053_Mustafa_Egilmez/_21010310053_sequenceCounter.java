package _21010310053_Mustafa_Egilmez;

public class _21010310053_sequenceCounter {
	
	static String sqCounter(int sayac) {
	
		int[] _4bitSayici = new int[4];
		_4bitSayici[0] = 0;
		_4bitSayici[1] = 0;
		_4bitSayici[2] = 0;
		_4bitSayici[3] = 0;
        String[] time = new String[16]; 
		int siraSayaci = sayac;
		
		for (int i = sayac; i < 16; i++) {
			
			if(i == 8) {
				_4bitSayici[0] = 1;
			
			}
			if(i == 4 || i == 12) {
				_4bitSayici[1] = 1;
				
			}
			if(i == 8) {
				_4bitSayici[1] = 0;  
				
			}
			if(i== 2 || i == 6 || i == 10 || i == 14) {
				_4bitSayici[2] = 1;  
				
			}
			if(i == 4 || i == 8 || i == 12) {
				_4bitSayici[2] = 0;
				
			}
			if(i == 1 || i == 3 || i == 5 || i == 7 || i== 9 || i == 11 || i == 13 || i == 15) {
				_4bitSayici[3] = 1;
				
			}
			if(i == 2 || i== 4 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) {
				_4bitSayici[3] = 0;
			}
		     
		     time[sayac] = _21010310053_decoder_4X16._4X16Dec(_4bitSayici, siraSayaci);
		     if(sayac != 15) {
		    	 return time[sayac];
		     }	    
		}
		return time[15];
			
	}
	
}