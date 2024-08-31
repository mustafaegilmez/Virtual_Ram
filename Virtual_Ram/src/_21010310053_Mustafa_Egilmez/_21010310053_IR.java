package _21010310053_Mustafa_Egilmez;

import java.io.FileNotFoundException;

public class _21010310053_IR {

	static String instruction_Register(int i, int sayac1) throws FileNotFoundException {
		String IR = "";
		String[] araBirim = _21010310053_RAM.ram(sayac1);
		IR = araBirim[i];
		return IR;
	}
}
