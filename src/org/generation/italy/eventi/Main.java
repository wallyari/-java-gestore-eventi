package org.generation.italy.eventi;

 import java.math.BigDecimal;
 import java.time.LocalDate;
 import java.time.LocalTime;
 import java.util.Scanner;

 public class Main {
	 
	
 	public static void main(String[] args) throws Exception {
 		
 		//es1();
 		//es2();
 		es3();
 		
 	}
 		
 		public static void es1() {
 			
 			try {
 			Scanner sc = new Scanner(System.in);

 	 		//nuovo evento
 	 		System.out.println("Vuoi creare un nuovo evento? si/no");
 	 		String userChoice = sc.nextLine().toLowerCase().trim();

 	 		if(userChoice.equals("si")) {

 	 			System.out.println("Inserisci nome dell'evento");
 	 			String titolo = sc.nextLine();

 	 			System.out.println("Inserisci la data dell'evento YYYY-MM-dd");
 	 			LocalDate data = LocalDate.parse(sc.nextLine());

 	 			System.out.println("Quante persone può ospitare l'evento?");
 	 			int postiTot = Integer.parseInt(sc.nextLine());
 	 		
 	 
 	 			
 	 			Evento e1 = new Evento(titolo, data, postiTot);



 	 			//prenotazioni
 	 			System.out.println("---------------\nVuoi effettuare delle prenotazioni? si/no");
 	 			String res = sc.nextLine();
 	 			
 	 			res = res.toLowerCase().trim();
 	 			
 	 			if (res.equals("si")) {
 	 				
 	 				System.out.println("Quante prenotazioni vuoi effettuare?");
 	 				String userPrenotazioni = sc.nextLine();
 	 				
 	 				int prenotazioni = Integer.parseInt(userPrenotazioni);				
 	 			
 	 				e1.prenota(prenotazioni);
 	 			}
 	 			

 	 			//disdetta
 	 			System.out.println("---------------\nVuoi effettuare una o più disedette? si/no");
 	 			String disdAnswer = sc.nextLine().toLowerCase().trim();


 	 			if(disdAnswer.equals("si")) {

 	 				System.out.println("Quante disdette vuoi effettuare?");
 	 				int disdetteNum = Integer.parseInt(sc.nextLine());
 	 				System.out.println("Hai effettutato " + disdetteNum + " disdette");
 	 				e1.disdici(disdetteNum);
 	 				}
 	 				
 	 			} else {
 	 			System.out.println("Alla prossima");
 	 		}
 	 			sc.close();
 			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());;
			}
 			
 		}
 		
 		public static void es2() {
 			try {
				Evento e1 = new Evento("Evento1",LocalDate.of(2023, 03, 13),300);
				Evento e2 = new Evento("Evento2",LocalDate.of(2023, 04, 14),400);
	 			Evento e3 = new Evento("Evento3",LocalDate.of(2023, 05, 15),500);
	 			Evento e4 = new Evento("Evento4",LocalDate.of(2023, 04, 14),400);
	 			
	 			//programmi eventi
	 			ProgrammEventi listaEventi = new ProgrammEventi("ListaEventi");
	 			listaEventi.addEvento(e1);
	 			listaEventi.addEvento(e2);
	 			listaEventi.addEvento(e3);
	 			listaEventi.addEvento(e4);
	 			
	 			System.out.println("----------------");
	 			System.out.println("Eventi in data 2023,04,14");
	 			System.out.println(listaEventi.getEventiByData(LocalDate.of(2023, 04, 14)));
	 			
	 			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 		
 			
 			
 			
 		}
 		
 		public static void es3() {
 			try {
 				Concerto c1 = new Concerto ("Concerto1", LocalDate.of(2023, 05, 15), 500, LocalTime.of(21, 30),BigDecimal.valueOf(33.3));
 				System.out.println(c1.toString());
 			}catch(Exception err) {
 			// TODO Auto-generated catch block
				System.err.println(err.getMessage());
 			}
 			
 		}
 		
		
	}
 	
 
