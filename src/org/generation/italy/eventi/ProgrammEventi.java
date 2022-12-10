package org.generation.italy.eventi;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgrammEventi {
	private String titolo;
	private List <Evento> eventi;
	

	public ProgrammEventi(String titolo) {
		setTitolo (titolo);
		this.eventi = new ArrayList<Evento>();
	}


	public String getTitolo() {
		return titolo;
	}

	private void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public List<Evento> getEventi() {
		return eventi;
	}


	public void setEventi(List<Evento> eventi) {
		this.eventi = new ArrayList<Evento>(eventi);
	}
	
	//aggiungere lista ad evento
	public void addEvento(Evento e) {
		eventi.add(e);
	}
	
	//restituisce una lista con tutti gli elementi in una certa data
	public List <Evento> getEventiByData(LocalDate d) throws Exception
	
	{	
		if(this.eventi.size() == 0) {
		throw new Exception ("La lista è vuota");
		}
		
		List <Evento> eventiByData = new ArrayList<>();
		
		for(int i = 0; i < this.eventi.size(); i++) {
			if(this.eventi.get(i).getData().equals(d)) {
				eventiByData.add(this.eventi.get(i));
			}
		}
		
		for(Evento e : eventiByData) {
			System.out.println(e.toString());
			
		}
		return eventiByData;
		
	}
	//restituisce quanti eventi sono presenti nel programma
	public int getNumEventi() {
		return eventi.size();
	}
	
	//metodo che svuota la lista degli eventi
	public void clearEventi() {
		eventi.clear();
	}
	
	//metodo che restituisce una stringa che mostra il titolo del programma e tutti gli eventi ordinati
	public String getListaOrdinata() {
		String lista = " ";
		
		sortEventi();
		for(Evento e: this.eventi) {
			lista += e.getData() + " - " + e.getTitolo() + "\n";
		}
		return lista;		
		
	}
	public void sortEventi() {
		 eventi.sort(Comparator.comparing(Evento::getData));	
	}
	
	@Override
	public String toString() {
		return "ProgrammEventi [titolo=" + this.getTitolo() + ", eventi=" + this.getEventi() + "]";
	}
	
}