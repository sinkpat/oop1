/*
	make sure to set cmd charset to 65001 to display custom chars (ä, ö, ü)
	
	command:    >chcp 65001




*/

import java.util.Scanner;

public class manageKH{
	public static void main(String[] args){
		
		System.out.print("Initialisiere manageKH");
		try{Thread.sleep(333);} catch(InterruptedException ex){Thread.currentThread().interrupt();}
		System.out.print(".");
		try{Thread.sleep(333);} catch(InterruptedException ex){Thread.currentThread().interrupt();}
		System.out.print(".");
		try{Thread.sleep(333);} catch(InterruptedException ex){Thread.currentThread().interrupt();}
		System.out.print(".");
		try{Thread.sleep(333);} catch(InterruptedException ex){Thread.currentThread().interrupt();}
		System.out.print(".");
		try{Thread.sleep(333);} catch(InterruptedException ex){Thread.currentThread().interrupt();}
		
		
		String name = "testname";							         // hauptspeicher
		String vorname = "testvorname";
		String geschlecht = "m";
		String alter = "127";
		String kasse = "aok";
		
		String name1 = "";									         // zwischenspeicher für case 1
		String vorname1 = "";
		String geschlecht1 = "";
		String alter1 = "";
		String kasse1 = "";
		
		
		short fallzahl = 0;
		short threadSleepTime = 5000;
		//boolean schonwiederda = false;                             // nicht mehr von nutzen
		boolean programmende = false;
		String auswahl = "";
		
		String auswahl1 = "";								         // bzgl case 1
		boolean korrekterDatensatz = false;					         // bzgl case 1
		boolean allowedInput = false;                                // bzgl case 1
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Fertig!");
		try{Thread.sleep(835);} catch(InterruptedException ex){Thread.currentThread().interrupt();}
		System.out.println("");
		//System.out.println("");
		System.out.println("");
		
		/*                                                           // println: *** willkommen zu manageKH ***
		System.out.println("                       ******** Willkommen zu manageKH ********         ");
		System.out.println("");
		*/
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("                                                    _  ___    _ ");
		System.out.println("                                                   | |/ / |  | |");
		System.out.println("             _ __ ___   __ _ _ __   __ _  __ _  ___| ' /| |__| |");
		System.out.println("            | '_ ` _ \\ / _` | '_ \\ / _` |/ _` |/ _ \\  < |  __  |");
		System.out.println("            | | | | | | (_| | | | | (_| | (_| |  __/ . \\| |  | |");
		System.out.println("            |_| |_| |_|\\__,_|_| |_|\\__,_|\\__, |\\___|_|\\_\\_|  |_|");
		System.out.println("                                          __/ |                 ");
		System.out.println("                                         |___/                  ");
		
		System.out.println("");
		System.out.println("             Weil unser Programm einfach besser ist als das der Konkurrenz!");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		try{Thread.sleep(3000);} catch(InterruptedException ex){Thread.currentThread().interrupt();}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		
		do{
			System.out.println("                ******************************************************");
			System.out.println("                * Was wollen Sie tun?                                *");
			System.out.println("                *                                                    *");
			System.out.println("                * Einen neuen Patienten hinzufügen               - 1 *");
			System.out.println("                * Den letzten eingegebenen Patienten anzeigen    - 2 *");
			System.out.println("                * Die aktuelle Fallzahl anzeigen                 - 3 *");
			System.out.println("                * Alle vorhandenen Informationen anzeigen        - 4 *");
			System.out.println("                * manageKH beenden                               - 5 *");
			System.out.println("                ******************************************************");
			System.out.println("");
			//System.out.println("");
			auswahl = scan.next();
			//System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("                            *** Sie haben " + auswahl + " gewählt! ***");
			System.out.println("");
			System.out.println("");
			switch(auswahl){
				case "1":			                                 // neuen Patienten eingeben
					do{
						System.out.println("                ******************************************************");
						System.out.print("                * Nachname des Patienten: ");
						name1 = scan.next();
						System.out.print("                * Vorname des Patienten: ");
						vorname1 = scan.next();
						System.out.print("                * Geschlecht des Patienten (m/w/d): ");
						geschlecht1 = scan.next();
						System.out.print("                * Alter des Patienten: ");
						alter1 = scan.next();
						System.out.print("                * Krankenkasse des Patienten: ");
						kasse1 = scan.next();
						System.out.println("                ******************************************************");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						
						
						
						
						do{
							System.out.print("                    Sind die eingegebenen Daten korrekt? (j/n): ");
							auswahl1 = scan.next();
							System.out.println("");
							
							switch(auswahl1){
								case "j":
									korrekterDatensatz = true;
									allowedInput = true;
									break;
								case "n":
									korrekterDatensatz = false;
									allowedInput = true;
									break;
								default:
									//korrekterDatensatz = false;
									System.out.println("                                   ungültige Eingabe: " + auswahl1);
									allowedInput = false;
									System.out.println("");
									//System.out.println("                           Geben Sie den neuen Datensatz erneut ein.");
									break;
							}
						}
						while(allowedInput == false);
						
					}
					while(korrekterDatensatz == false);
					
					
					/*                                               // ausgabe haupt- und zwischenspeicher und fallzahl
					
					System.out.println("haupt: " + name + ", " + vorname + ", " + geschlecht + alter);
					System.out.println("zwisc: " + name1 + ", " + vorname1 + ", " + geschlecht1 + alter1);
					System.out.println("Fallzahl: " + fallzahl);
					System.out.println("");
					
					 */
					
					/*                                               // ergebnisse von String == String1 ausgeben	
					
					System.out.print("name1==name             ");
					System.out.println(name1==name);
					System.out.print("vorname1==vorname       ");
					System.out.println(vorname1==vorname);
					System.out.print("geschlecht1==geschlecht ");
					System.out.println(geschlecht1==geschlecht);
					System.out.print("alter1==alter           ");
					System.out.println(alter1==alter);
					System.out.print("kasse1==kasse           ");
					System.out.println(kasse1==kasse);
					
					System.out.println("");
					
					System.out.print("name==name1             ");
					System.out.println(name==name1);
					System.out.print("vorname==vorname1       ");
					System.out.println(vorname==vorname1);
					System.out.print("geschlecht==geschlecht1 ");
					System.out.println(geschlecht==geschlecht1);
					System.out.print("alter==alter1           ");
					System.out.println(alter==alter1);
					System.out.print("kasse==kasse1           ");
					System.out.println(kasse==kasse1);
					
					*/
					
					
					System.out.println("");
					System.out.println("");
					
					/*                                               // switch case funktioniert nicht mit variablen als case
					
					switch(name1){
						case name:
							System.out.println("name1 == name");
							System.out.println("Gleicher Datensatz, Fallzahl unverändert");
							break;
						default:
							System.out.println("name1 != name");
							System.out.println("Neuer Datensatz, Fallzahl++");
							break;
					}
					
					*/
					
					/*                                               // warum auch immer funktioniert die if else Verzweigung nicht ?!
					
					if(name == name1){
						//fallzahl++;
						//System.out.println("                         Neuer Datensatz, erhöhe Fallzahl um 1");
						System.out.println("                          Gleicher Datensatz, kein neuer Fall");
						System.out.println("");
					} else {
						fallzahl++;
						System.out.println("                         Neuer Datensatz, erhöhe Fallzahl um 1");
						//System.out.println("                          Gleicher Datensatz, kein neuer Fall");
						System.out.println("");
					}
					
					*/
					
					if(name1.equals(name) && vorname1.equals(vorname) && alter1.equals(alter) && geschlecht1.equals(geschlecht)){
						//System.out.println("                             Gleicher Datensatz, kein neuer Fall");
						//System.out.println("");
					} else {
						//System.out.println("                            Neuer Datensatz, erhöhe Fallzahl um 1");
						//System.out.println("");
						fallzahl++;
					}
					
					name = name1;
					vorname = vorname1;
					geschlecht = geschlecht1;
					alter = alter1;
					kasse = kasse1;
					
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("                             *** Datensatz hinzugefügt *** ");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					
					
					break;
				case "2":			                                 // letzten patienten ausgeben
				
					System.out.println("");
					System.out.println("                              Letzter Patientendatensatz");
					System.out.println("                ******************************************************");
					System.out.println("                * Nachname des Patienten: " + name);
					System.out.println("                * Vorname des Patienten: " + vorname);
					System.out.println("                * Geschlecht des Patienten: " + geschlecht);
					System.out.println("                * Alter des Patienten: " + alter);
					System.out.println("                * Krankenkasse des Patienten: " + kasse);
					System.out.println("                ******************************************************");
					System.out.println("");
					//System.out.println("");
					
					
					
					break;
				case "3":			                                 // fallzahl ausgeben
					System.out.println("           *** Aktuelle Fallzahl: Es sind bis jetzt " + fallzahl + " Fälle registriert! ***");
					System.out.println("");
					System.out.println("");
					break;
				case "4":			                                 // infoanzeige = patient + fallzahl
					System.out.println("");
					System.out.println("                            ***** Informationsabfrage *****");
					System.out.println("                        Letzter Patient: " + name + ", " + vorname + ", " + geschlecht + alter + "J");
					System.out.println("                        Kostenträger: " + kasse);
					System.out.println("");
					System.out.println("                        Fallzahl: " + fallzahl);
					System.out.println("                              ***** Ende der Abfrage *****");
					
					System.out.println("");
					System.out.println("");
				
					
					break;
				case "5":			                                 // programmende herbeiführen
					System.out.println("                              Programm wird beendet :(");
					System.out.println("                               Tschöö, bis de Herbst");
					System.out.println("");
					programmende = true;
					break;
				case "exit":			                             // programmende herbeiführen
					System.out.println("                              es gibt kein entkommen!");
					System.out.println("                                   raus mit dir!");
					System.out.println("");
					programmende = true;
					break;
				case "42":		                                     // easteregg
					//System.err.println("                                 insert easter egg here");
					System.out.println("");                                                                                                                                                                                                              System.out.println(""); System.out.println("                             \\\\\\\\\\\\\\\\            __                                          "); System.out.println("        *le me              \\\\\\\\\\\\\\\\\\\\\\\\        / _| ___  _ __ _____   _____ _ __            "); System.out.println("                          \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\      | |_ / _ \\| '__/ _ \\ \\ / / _ \\ '__|           "); System.out.println("  -----------,-|           |C>   // )\\\\\\\\|     |  _| (_) | | |  __/\\ V /  __/ |              "); System.out.println("           ,','|          /    || ,'/////|     |_|  \\___/|_|  \\___| \\_/ \\___|_|              "); System.out.println("---------,','  |         (,    ||   /////                                              "); System.out.println("         ||    |          \\  ||||//''''|                            _                  "); System.out.println("         ||    |           |||||||     _|                      __ _| | ___  _ __   ___ "); System.out.println("         ||    |______      `````\\____/ \\                     / _` | |/ _ \\| '_ \\ / _ \\"); System.out.println("         ||    |     ,|         _/_____/ \\                   | (_| | | (_) | | | |  __/"); System.out.println("         ||  ,'    ,' |        /          |                   \\__,_|_|\\___/|_| |_|\\___|"); System.out.println("         ||,'    ,'   |       |         \\  |     "); System.out.println("_________|/    ,'     |      /           | |     "); System.out.println("_____________,'      ,',_____|      |    | |     "); System.out.println("             |     ,','      |      |    | |     "); System.out.println("             |   ,','    ____|_____/    /  |     "); System.out.println("             | ,','  __/ |             /   |     "); System.out.println("_____________|','   ///_/-------------/   |"); System.out.println("              |===========,'"); try{Thread.sleep(threadSleepTime);} catch(InterruptedException ex){Thread.currentThread().interrupt();} System.out.println(""); System.out.println(""); System.out.println(""); System.out.println(""); System.out.println(""); System.out.println(""); System.out.println(""); System.out.println(""); System.out.println(""); System.out.println(""); System.out.println(""); System.out.println(""); System.out.println(""); System.out.println(""); System.out.println(""); System.out.println(""); 
					break;
				case "help":
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("                                      NIEMAND");
					System.out.println("");
					System.out.println("");
					System.out.println("                                       WIRD");
					System.out.println("");
					System.out.println("");
					System.out.println("                                       DIR");
					System.out.println("");
					System.out.println("");
					System.out.println("                                      HELFEN");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					programmende = true;
					break;
				default:
					System.err.println("                   *** ERROR: Bitte wählen Sie zwischen 1 und 5! ***");
					System.out.println("");
					System.out.println("");
					break;
			}
			
			
			
		}
		while(programmende == false);
		
		System.out.println("                                   winke winke ;)");
		scan.close();
	}
}
		