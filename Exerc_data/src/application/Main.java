package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		// Trabalhando por data
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfAtual = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
		
		//PADR�O ISO 8601 -> yyyy-MM-ddTHH:mm:ssZ
		Date dt = Date.from(Instant.parse("1977-04-15T23:35:15Z"));
		Date dtAtual = new Date();
		Date dtParse = sdf1.parse("25/10/2019");
		
		//Exibe a data sem formata��o
		System.out.println(dt);
		
		//Exibe a data com formata��o SimpleDateFormat
		System.out.println(sdf1.format(dt));
		System.out.println(sdfAtual.format(dtAtual));
		System.out.println(sdf1.format(dtParse));
	}
}
