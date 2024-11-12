package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		PrintWriter writer;
        String filsti = mappe + filnavn;
        
        try  {
        	File file = new File(filsti);
        	writer = new PrintWriter(file);
            writer.write(samling.toString());  // Skriver samlingen til fil
            writer.close();
            return true;  // Returnerer true hvis filen ble skrevet uten problemer
        } catch (FileNotFoundException e) {
            System.err.println("Feil under skriving til fil: " + e.getMessage());
              // Returnerer false ved feil
        }
        return false;
		
	}
}
