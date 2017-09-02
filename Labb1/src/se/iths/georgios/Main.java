package se.iths.georgios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean exitLoop = false;
			do {
				System.out.println();
				System.out.println("Vad vill du göra? (mata in 'e' för att avsluta)");
				System.out.println("1. Addera två tal");
				System.out.println("2. Räkna bokstäver i en sträng");
				System.out.println("3. Spegelvänd en sträng");
				System.out.println("4. Summera alla tal i en sträng");

				String i = s.next();

				if (i.equals("1")) {
					menu1();
				} else if (i.equals("2")) {
					menu2();
				} else if (i.equals("3")) {
					menu3();
				} else if (i.equals("4")) {
					menu4();
				} else if (i.equals("e")) {
					exitLoop = true;
				}
			} while (exitLoop == false);
			System.out.println("Tack för att du använder detta fantastiska programm.");

    }

    public static void menu1() {
		Scanner s1 = new Scanner(System.in);
		System.out.println();
    	System.out.println("Här adderar vi två tal");
		System.out.println("Skriv det första talet: ");
		int a = s1.nextInt();
		System.out.println("Skriv det andra talet: ");
		int b = s1.nextInt();
		System.out.println("Summan är " + (a + b));

	}

	public static void menu2() {
    	Scanner s2 = new Scanner(System.in);
    	System.out.println();
		System.out.println("Här räknar vi bokstäver i en sträng");
		System.out.println("Ange ordet du vill leta i: ");
		String ord = s2.next();
		System.out.println("Ange bokstaven du vill leta efter: ");
		char c = s2.next().charAt(0);
		int counter = 0;
		for (int j = 0;j < ord.length(); j++){
			if(ord.charAt(j) == c) {
				counter++;
			}
		}
		System.out.println("Det finns "+counter+ " " +c+ " i ordet "+ord );
	}

	public static void menu3() {
    	Scanner s3 = new Scanner(System.in);
    	System.out.println();
		System.out.println("Ge mig en sträng!");
		String s = s3.nextLine();
		String y = "";

		for(int i = s.length()-1; i >= 0; i--){
			y=y + s.charAt(i);
		}
		System.out.println(y);
	}

	public static void menu4() {
		Scanner s4 = new Scanner(System.in);
		System.out.println();
		System.out.println("Här summerar vi alla tal i en sträng");
		System.out.println("Skriv in en sträng.");
		System.out.println("Programmet kommer sedan att addera ihop alla tal som förekommer i strängen.");

    	String a = s4.next();

		int sum = 0;

		for(int i = 0; i < a.length(); i++) {
			if(Character.isDigit(a.charAt(i))) {
				sum = sum + Integer.parseInt(a.charAt(i) + "");
			}
		}
		System.out.println("Summan är: "+sum);
	}
}
