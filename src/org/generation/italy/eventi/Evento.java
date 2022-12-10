package org.generation.italy.eventi;

 import java.time.LocalDate;

 public class Evento {

 	private String titolo;
 	private LocalDate data;
 	private int postiTotali;
 	private int postiPren;

 	public Evento(String titolo, LocalDate data, int postiTot) throws Exception {
 		setTitolo (titolo);
 		setData (data);
 		setPostiTot (postiTot);
 		this.postiPren = 0;
 	}

 	public String getTitolo() {
 		return titolo;
 	}
 	public void setTitolo(String titolo) {
 		this.titolo = titolo;
 	}

 	public LocalDate getData() {
 		return data;
 	}
 	public void setData(LocalDate data) throws IllegalArgumentException {
		
		if (LocalDate.now().isAfter(data))
			throw new IllegalArgumentException
			("La data non può essere nel passato ");	
		this.data = data;
	}

 	public int getPostiTot() {
 		return postiTotali;
 	}
 	private void setPostiTot(int postiTot) throws Exception {
 		if (postiTot < 0)
 			throw new Exception
 			("Il numero inserito deve essere diverso da 0");
 		this.postiTotali = postiTot;
 	}

 	public int getPostiPren() {
 		return postiPren;
 	}
 	
 
 	
 	public void prenota(int prenotazioni) throws Exception {
 		
 		if (prenotazioni > postiTotali) {
 			throw new Exception 			
 			("Le prenotazioni superano il num di posti disp");
 						
 		}
 		this.postiPren += prenotazioni;
 		
 		System.out.println("Posti prenotati: " 
 				+ this.postiPren 
 				+ "/" + this.postiTotali);
 	}

	
 	public void disdici(int disdette) throws Exception {
 		if(disdette > postiPren) {
 			throw new Exception
 			("Non puoi disdire perchè i posti disdetti sono maggiori dei posti prenotati");
 		}
 		
 		this.postiPren -= disdette;
 		System.out.println("Posti prenotati: " 
 				+ this.postiPren 
 				+ "/" + this.postiTotali);
 	
 	}

 	protected String dataFormattata() {
 		return (data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear()).toLowerCase();	
 		}


 	@Override
 		public String toString() {
 	// TODO Auto-generated method stub
 			return dataFormattata() + " - " + getTitolo();
 		}

 }
