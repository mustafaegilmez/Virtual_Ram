package _21010310053_Mustafa_Egilmez;

public class _21010310053_decoder_4X16 {

static String _4X16Dec(int[] dizi,int sayac) {
		
		String zaman = "T";
   
		int x = dizi[0];
		int y = dizi[1];
		int z = dizi[2];
		int q = dizi[3];
	
		int xDegili = 0;
		int yDegili = 0;
        int zDegili = 0;
        int qDegili = 0;	
		
		if(x == 0) {
			xDegili = 1;
		}	
		if(y == 0) {
			yDegili = 1;
		}
		if(z == 0) {
			zDegili = 1;
	    }	
		if(q == 0) {
			qDegili = 1;
		}

	    if(xDegili == 1 && yDegili == 1 && zDegili == 1 && qDegili == 1) { 
			zaman = zaman +String.valueOf(sayac);
		}
		else if(xDegili == 1 && yDegili == 1 && zDegili == 1 && q== 1) {
			zaman = zaman +String.valueOf(sayac);
		}
		else if(xDegili == 1 && yDegili == 1 && z == 1 && qDegili== 1) {
			zaman = zaman +String.valueOf(sayac);
		}
		else if(xDegili == 1 && yDegili == 1 && z == 1 && q== 1) {
			zaman = zaman +String.valueOf(sayac);
		}
		else if(xDegili == 1 && y == 1 && zDegili == 1 && qDegili== 1) {
			zaman = zaman +String.valueOf(sayac);
		}
		else if(xDegili == 1 && y == 1 && zDegili == 1 && q== 1) {
			zaman = zaman +String.valueOf(sayac);
		}
		else if(xDegili == 1 && y == 1 && z == 1 && qDegili== 1) {
			zaman = zaman +String.valueOf(sayac);
		}
		else if(xDegili == 1 && y == 1 && z == 1 && q== 1) { 
			zaman = zaman +String.valueOf(sayac);
		}
		else if(x == 1 && yDegili == 1 && zDegili == 1 && qDegili== 1) {
			zaman = zaman +String.valueOf(sayac);
		}
		else if(x == 1 && yDegili == 1 && zDegili == 1 && q== 1) {
			zaman = zaman +String.valueOf(sayac);
		}
		else if(x == 1 && yDegili == 1 && z == 1 && qDegili== 1) {
			zaman = zaman +String.valueOf(sayac);
		}
		else if(x == 1 && yDegili == 1 && z == 1 && q== 1) {
			zaman = zaman +String.valueOf(sayac);
		}
		else if(x == 1 && y == 1 && zDegili == 1 && qDegili== 1) {
			zaman = zaman +String.valueOf(sayac);
		}
		else if(x == 1 && y == 1 && zDegili == 1 && q== 1) {
			zaman = zaman +String.valueOf(sayac);
		}
		else if(x == 1 && y == 1 && z == 1 && qDegili== 1) {
			zaman = zaman +String.valueOf(sayac);
		}
		else if(x == 1 && y == 1 && z == 1 && q== 1) {
			zaman = zaman +String.valueOf(sayac);
		}    
		return zaman;
	}
}
