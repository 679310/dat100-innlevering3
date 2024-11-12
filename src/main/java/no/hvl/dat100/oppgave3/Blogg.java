package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	// TODO: objektvariable

	private Innlegg[] innlegg;
	private int nesteLedig;

	public Blogg() {
		this.innlegg = new Innlegg[20];
	}

	public Blogg(int lengde) {
		this.innlegg = new Innlegg[lengde];
		nesteLedig = 0;
	}

	public int getAntall() {
		return nesteLedig;
	}

	public Innlegg[] getSamling() {
		return innlegg;

	}

	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteLedig; i++) {
			if (this.innlegg[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;

	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig; i++) {
			if (this.innlegg[i].erLik(innlegg)) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		return nesteLedig < innlegg.length;
	}

	public boolean leggTil(Innlegg innlegg) {
		if (ledigPlass() && !finnes(innlegg)) {
			this.innlegg[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		}
		return false;
		
	}

	public String toString() {
		 StringBuilder sb = new StringBuilder();
		    sb.append(nesteLedig).append("\n");
		    
		    for (int i = 0; i < nesteLedig; i++) {
		    	sb.append(innlegg[i].toString()).append("\n");
		    }
		    return sb.toString();   
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}