import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	
String [] canali = new String [20];
	
	canali [0] = "RAI 1";	
	canali [1] = "RAI 2";
	canali [2] = "RAI 3";
	canali [3] = "Rete 4";
	canali [4] = "Canale 5";
	canali [5] = "Italia 1";
	canali [6] = "La7";
	canali [7] = "Real Time";
	canali [8] = "Food Network";
	canali [9] = "Focus";
	canali [10] = "K2";
	canali [11] = "Rai Gulp";
	canali [12] = "Frisbee";
	canali [13] = "Boing Plus";
	canali [14] = "Super!";
	canali [15] = "DMAX";
	canali [16] = "Italia 2";
	canali [17] = "Mediaset Extra";
	canali [18] = "Rai Storia";
	canali [19] = "Rai Sport";
	
	
	//variabili scelta nome stanza TV
	int scelta;
	boolean esci = false;
	
	
	
	int volumeup;
	int volumedown;
	
	TV tv1 = new TV();
	TV tv2 = new TV();
	
	for(int i=1; i<3; i++) {
	
	do {
		
		System.out.print("Inserisci il nome della stanza dove verrà installata la "+i+"° TV: ");
	
	if(i==1) {
		
				String stanza = scanner.nextLine();
	
				tv1.setstanza(stanza);
		
				System.out.println();
				System.out.println("La "+i+"° TV verrà installata in "+tv1.stanza);
				System.out.println();
				
				do {
					
					System.out.println("Confermi?");
					System.out.println();
					System.out.println("1:Confermare");
					System.out.println("0:Annullare");
					System.out.println();
					
					scelta = scanner.nextInt();
					
					scanner.nextLine();
					
						if(scelta==1) {
							
							esci=true;
					
							}
					
						else if(scelta==0) {
						
							esci=false;
						
							}
						
					} while (scelta !=0 && scelta!=1);
				}
	
	
	if(i==2) {
		
		String stanza = scanner.nextLine();

		tv2.setstanza(stanza);

		System.out.println();
		System.out.println("La "+i+"° TV verrà installata in "+tv2.stanza);
		System.out.println();
		
		do {
			
			System.out.println("Confermi?");
			System.out.println();
			System.out.println("1:Confermare");
			System.out.println("0:Annullare");
			System.out.println();
			
			scelta = scanner.nextInt();
			
			scanner.nextLine();
			
				if(scelta==1) {
					
					esci=true;
			
					}
			
				else if(scelta==0) {
				
					esci=false;
				
					}
				
			} while (scelta !=0 && scelta!=1);
		}
		
		}	while(esci==false);
	
	}
	
	
	tv1.display();
	tv2.display();
	System.out.println();
	System.out.println("Premere INVIO per continuare");
	scanner.nextLine();
	
	//variabili menù
	int opzione;
	boolean menuesci = false;
	
	int volpiu;
	int volmeno;
	boolean result;
	
	boolean menuvol = false;
	boolean menucanl = false;
	
	for(int i = 1; i<3; i++) {
	
	do { // while menuesci==FALSE			
		
		if(i==1) {
		
			if(tv1.volume<1) {
				
				System.out.println("Hai impostato il volume MIN");
			}
			
			if(tv1.volume>9) {
				
				System.out.println("Hai impostato il volume MAX");
			}
			
			System.out.println("Scegliere cosa fare qui di seguito con la TV in "+tv1.stanza+": ");
			System.out.println("1: Alzare il volume");
			System.out.println("2: Abbassare il volume");
			System.out.println("3: Cambiare canale"); 
			System.out.println("0: Nulla");
		
		}
		
		
		
		if(i==2) {
			
			if(tv2.volume<1) {
				
				System.out.println("Hai impostato il volume MIN");
			}
			
			if(tv2.volume>9) {
				
				System.out.println("Hai impostato il volume MAX");
			}
			
			System.out.println("Scegliere cosa fare qui di seguito con la TV in "+tv2.stanza+": ");
			System.out.println("1: Alzare il volume");
			System.out.println("2: Abbassare il volume");
			System.out.println("3: Cambiare canale"); 
			System.out.println("0: Nulla");
		
		}
		
		
		
		do { //scelta tra alzare/abbassare volume ; cambiare canale	
		opzione = scanner.nextInt();
		} while(opzione!=1 && opzione!=2 && opzione!=3 && opzione!=0);

		
		if (opzione==1) { //Alzare il volume
				
			do { //Fai questo fino a quando non ha scelto quanto vuole alzare il volume
			
			if(i==1) {
				
				if(tv1.volume>9) {
					
					menuvol = true;
					menuesci=false;
					
				}
				
				if(tv1.volume<10) {
				
				System.out.println("Volume impostato a "+tv1.volume);
				
				do {
					
				    System.out.println("Scegliere di quanto vuoi alzare il volume della TV in "+ tv1.stanza +": ");
					
					volpiu = scanner.nextInt();
					
					result = tv1.volumepiu(volpiu);
					
					if (result==false) {
						
						System.out.println("Il volume è ora impostato a: "+tv1.volume);
						System.out.println("Il volume MAX è 10 / Hai inserito: +"+volpiu);
					}
					
					else if(result==true) {
						
						System.out.println("Il volume della TV in "+ tv1.stanza + " è ora impostato a "+tv1.volume);
						
						/*if(tv1.volume>9) {
							
							System.out.println("Hai impostato il volume MAX");
						}*/
					
					}
					
					} while(result==false);
				
				if(tv1.volume<10) {
				System.out.println("Continuare ad alzare il volume della TV in "+tv1.stanza);
				System.out.println("1:Sì");
				System.out.println("0:No");
				
				do {
					volumeup = scanner.nextInt();					
				}while (volumeup!=1 && volumeup!=0);
				
					if(volumeup==1) {
					
					menuvol = false;
					menuesci=false;
					
					}
				
					if(volumeup==0) {
					
					menuvol = true;
					menuesci=false;
					
					}
				
				}
				
				else if(tv1.volume>9) {
					
					menuvol = true;
					menuesci=false;
				}
			}
		}	//fine alzare volume tv1
			
			
			if(i==2) {
				
				if(tv2.volume>9) {
					
					menuvol = true;
					menuesci=false;
					
				}
				
				if(tv2.volume<10) {
				
				System.out.println("Volume impostato a "+tv2.volume);
				
				do {
					
				    System.out.println("Scegliere di quanto vuoi alzare il volume della TV in "+ tv2.stanza +": ");
					
					volpiu = scanner.nextInt();
					
					result = tv2.volumepiu(volpiu);
					
					if (result==false) {
						
						System.out.println("Il volume è ora impostato a: "+tv2.volume);
						System.out.println("Il volume MAX è 10 / Hai inserito: +"+volpiu);
					}
					
					else if(result==true) {
						
						System.out.println("Il volume della TV in "+ tv2.stanza + " è ora impostato a "+tv2.volume);
						
						}
					
					} while(result==false);
				
				
				if(tv2.volume<10) {
					
				System.out.println("Continuare ad alzare il volume della TV in "+tv2.stanza);
				System.out.println("1:Sì");
				System.out.println("0:No");
				
				do {
					volumeup = scanner.nextInt();					
				}while (volumeup !=1 && volumeup!=0);
				
					if(volumeup==1) {
					
					menuvol = false;
					menuesci=false;
					
					}
				
					if(volumeup==0) {
					
					menuvol = true;
					menuesci=false;
					
					}
					
				}
				
					else if(tv2.volume>9) {
					
					menuvol = true;
					menuesci=false;
					
					}
				
				}
			} //fine alzare volume tv2
			
		} while(menuvol==false);
			
		
		
			} //if (opzione==1)
	
		
		if (opzione==2) { //Abbassare il volume
			
			do { //Fai questo fino a quando non ha scelto quanto vuole abbassare il volume
			
			if(i==1) {
				
				if(tv1.volume<1) {
					
					menuvol = true;
					menuesci=false;
					
				}
				
				if(tv1.volume>0) {
				
				System.out.println("Volume impostato a "+tv1.volume);
				
				do {
					
				    System.out.println("Scegliere di quanto vuoi abbassare il volume della TV in "+ tv1.stanza +": ");
					
					volmeno = scanner.nextInt();
					
					result = tv1.volumemeno(volmeno);
					
					if (result==false) {
						
						System.out.println("Il volume è ora impostato a: "+tv1.volume);
						System.out.println("Il volume MIN è 0 / Hai inserito: - "+volmeno);
					}
					
					else if(result==true) {
						
						System.out.println("Il volume della TV in "+ tv1.stanza + " è ora impostato a "+tv1.volume);
					}
					
					} while(result==false);
				
				
				if(tv1.volume>0) {
					
				System.out.println("Continuare ad abbassare il volume della TV in "+tv1.stanza);
				System.out.println("1:Sì");
				System.out.println("0:No");
				
				do {
					volumedown = scanner.nextInt();					
				} while (volumedown!=1 && volumedown!=0);
				
					if(volumedown==1) {
					
					menuvol = false;
					menuesci=false;
					
					}
				
					if(volumedown==0) {
					
					menuvol = true;
					menuesci=false;
					
					}
				}
				
					else if(tv1.volume<1) {
					
					menuvol = true;
					menuesci=false;
					}
			
				}
			}	//fine abbassare volume tv1
			
			
			if(i==2) {
				
				if(tv2.volume<1) {
					
					menuvol = true;
					menuesci=false;
					
				}

				if(tv2.volume>0) {
					
				System.out.println("Volume impostato a "+tv2.volume);
				
				do {
					
				    System.out.println("Scegliere di quanto vuoi abbassare il volume della TV in "+ tv2.stanza +": ");
					
					volmeno = scanner.nextInt();
					
					result = tv2.volumemeno(volmeno);
					
					if (result==false) {
						
						System.out.println("Il volume è ora impostato a: "+tv2.volume);
						System.out.println("Il volume MIN è 0 / Hai inserito: - "+volmeno);
					}
					
					else if(result==true) {
						
						System.out.println("Il volume della TV in "+ tv2.stanza + " è ora impostato a "+tv2.volume);
					}
					
					} while(result==false);
				
				
				if(tv2.volume>0) {	
				
				System.out.println("Continuare ad abbassare il volume della TV in "+tv2.stanza);
				System.out.println("1:Sì");
				System.out.println("0:No");
				
				do {
					volumedown = scanner.nextInt();					
				}while (volumedown !=1 && volumedown!=0);
				
					if(volumedown==1) {
					
					menuvol = false;
					menuesci=false;
					
					}
				
					if(volumedown==0) {
					
					menuvol = true;
					menuesci=false;
					
					}
				}
				
					else if(tv2.volume<1) {
					
					menuvol = true;
					menuesci=false;
					}
				}	
			} //fine abbassare volume tv2
			
		
		} while(menuvol==false);
			
		} //if (opzione==2)
	
		
		int canale;
		
		if(opzione==3) {
			
			do {
			
			if(i==1) {
				
					do {
					
					System.out.println("Scegliere il canale che vuoi guardare: ");
					
					canale = scanner.nextInt();
			 
						if(canale<1 || canale >20) {
						
							System.out.println("Hai a disposizione canali da #1 a #20");
					
							}
					
						} while(canale<1 && canale>20);
			
			tv1.setcanale(canale);
			
			if(canale>0 && canale<21) {
				
			System.out.println();
			System.out.println("Stai ora guardando in "+tv1.stanza+" il canale "+tv1.canale+": " +canali[tv1.canale-1]);
			System.out.println();
			
			System.out.println("Cambiare canale?");
			System.out.println("1:Sì");
			System.out.println("2:No");
			
			int change;
			
			do {
				change = scanner.nextInt();
			}while(change!=1 && change!=2);
			
				if(change==1) {
				
				menucanl = false;
				
				}	
			
				else if(change==2) {
				
				menucanl = true;
				
				}
			}
			
		} //if(i==1)
			
			
			if(i==2) {
				
					do {
					
					System.out.println("Scegliere il canale che vuoi guardare: ");
					
					canale = scanner.nextInt();
			 
						if(canale<1 || canale >20) {
						
							System.out.println("Hai a disposizione canali da #1 a #20");
					
							}
					
						} while(canale<1 && canale>20);
				
				tv2.setcanale(canale);
				
				if(canale>0 && canale<21) {
					
				System.out.println();
				System.out.println("Stai ora guardando in "+tv2.stanza+" il canale "+tv2.canale+": " +canali[tv2.canale-1]);
				System.out.println();
				
				System.out.println("Cambiare canale?");
				System.out.println("1:Sì");
				System.out.println("2:No");
				
				int change;
				
				do {
					change = scanner.nextInt();
				}while(change!=1 && change!=2);
				
					if(change==1) {
					
					menucanl = false;
					
					}	
				
					else if(change==2) {
					
					menucanl = true;
					
					}
				}
				
				
				
				
				} //if(i==1)
			
			} while(menucanl==false);
		
		} //if(opzione==3)
		
		
		
		if (opzione==0) { //Opzione Non fare nulla
			
			menuesci=true;
		}	
		
		
	} while(menuesci==false);
	
	
	
 } // for(int i = 1; i<3; i++)

	System.out.println("La TV in "+tv1.stanza+" è impostata a volume: "+tv1.volume+" e canale #"+tv1.canale+": " +canali[tv1.canale-1]);
	System.out.println("La TV in "+tv2.stanza+" è impostata a volume: "+tv2.volume+" e canale #"+tv2.canale+": " +canali[tv2.canale-1]);

	//tv1.displayfinale();
	//tv2.displayfinale();
	
	} //public static void main(String[] args)	
} // main
