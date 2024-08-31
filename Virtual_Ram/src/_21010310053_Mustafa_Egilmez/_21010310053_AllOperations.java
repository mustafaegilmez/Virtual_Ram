package _21010310053_Mustafa_Egilmez;

import java.io.FileNotFoundException;

public class _21010310053_AllOperations {

	 static void generalOperations() throws FileNotFoundException, InterruptedException  {
		
		 
		 String[] output = new String[16]; 
		 String[] decoder4X16Outputs = new String[16];
		 String[] decoder3X8Outputs = new String[16];	
		 int sayac1 = 0;
		 for (int i = 0; i < 16; i++) {
			 decoder4X16Outputs[i] = _21010310053_sequenceCounter.sqCounter(i);
			 decoder3X8Outputs[i] = _21010310053_decoder_3X8.dec_3X8(_21010310053_IR.instruction_Register(i,sayac1));
			 sayac1 = 1;
			 output[i]  = decoder4X16Outputs[i];
			 output[i] += decoder3X8Outputs[i];
			 output[i] += _21010310053_Instructions.instructions(_21010310053_IR.instruction_Register(i,sayac1));
			 Thread.sleep(1000);
		     System.out.println(output[i]);
		     
		}   	 
	 }
	 
}