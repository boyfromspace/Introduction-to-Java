
/*
1.10 Napisz program, który pobierze od użytkownika imię i przechowa je w zmiennej.
 Następnie stwórz kilka warunków z różnymi imionami.
 Jeśli któreś z imion będzie pasowało wyświetl "Cześć jakieś_imię",
 gdy program nie znajdzie imienia wyświetl "Przykro mi, ale Cię nie znam".
*/
import java.util.Scanner;
public class Task10 {
	public static void main(String[] args) {
		String name,surname;
		Scanner read = new Scanner(System.in);
		System.out.println("Wpisz swoje imię: ");
		name = read.nextLine();
		System.out.println("Wpisz swoje nazwisko: ");
		surname = read.nextLine();

		switch(name){
			case "Maciek":
					switch(surname){
						case "Grzyb":

								System.out.println("Poznałen Cię, wchodź!");

						break;
						case "Kowalski":

								System.out.println("Poznałen Cię, wchodź!");

						break;
						case "Nowak":

								System.out.println("Poznałen Cię, wchodź!");

						break;
						default:

						System.out.println("Nie znam Cię, odejdź");

						break;
						}
		
		break;
		case "Wojtek":
					switch(surname){
						case "Grzyb":

								System.out.println("Poznałen Cię, wchodź!");

						break;
						case "Kowalski":

								System.out.println("Poznałen Cię, wchodź!");

						break;
						case "Nowak":

								System.out.println("Poznałen Cię, wchodź!");

						break;
						default:

						System.out.println("Nie znam Cię, odejdź");
						
						break;
					}
		break;
		case "Michał":
					switch(surname){
						case "Grzyb":

								System.out.println("Poznałen Cię, wchodź!");

						break;
						case "Kowalski":

								System.out.println("Poznałen Cię, wchodź!");

						break;
						case "Nowak":

								System.out.println("Poznałen Cię, wchodź!");

						break;
						default:

						System.out.println("Nie znam Cię, odejdź");
						
						break;
					}
		break;
		default:

		System.out.println("Nie znam Cię, odejdź");

		break;
		}

	}
}