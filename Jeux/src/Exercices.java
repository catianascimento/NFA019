import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercices {

	public static void main(String[] args) {
		question1();

//		question2();

//		question3();
	}

	public static void question1() {
		var sc = new Scanner(System.in);

		System.out.println("Veuillez saisir votre date de naissance au format (jj/mm/aaaa), svp:");

		var formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

		String date = sc.next();

		var dateDeNaissance = LocalDate.parse(date, formatter);

		sc.close();

		Period period = Period.between(dateDeNaissance, LocalDate.now());

		System.out.println("Votre age est: " + period.getYears());

	}

	public static void question2() {

		var sc = new Scanner(System.in);

		System.out.println("Veuillez saisir votre salaire brut, svp:");

		var salaireBrut = sc.next();

		System.out.println("Votre salaire net est: " + Double.parseDouble(salaireBrut) * 0.40 + " euros");

		sc.close();
	}

	public static void question3() {
		var sc = new Scanner(System.in);

		System.out.println("Veuillez saisir un verbe du premier groupe, svp:");

		var verbe = sc.next();

		String radical = verbe.substring(0, verbe.length() - 2);

		System.out.println("Je " + radical + "e");
		System.out.println("Tu " + radical + "es");
		System.out.println("On/Il/Elle " + radical + "e");
		System.out.println("Nous " + radical + "ons");
		System.out.println("Vous " + radical + "ez");
		System.out.println("Ils/Elles " + radical + "ent");

		sc.close();
	}

}
