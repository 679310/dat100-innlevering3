package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	protected String url;
	
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;
		this.url = url;
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		String idtxt = getId() + "";
		String brukertxt = getBruker() + "";
		String datotxt = getDato() + "";
		String likestxt = getLikes() + "";
		String teksttxt = getTekst() + "";
		String urltxt = getUrl() + "";
		
		
		String str = "BILDE" + "\n" + idtxt + "\n" + brukertxt + "\n" + datotxt + "\n" + likestxt + "\n" + teksttxt + "\n" + urltxt + "\n";
		
		return str;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
