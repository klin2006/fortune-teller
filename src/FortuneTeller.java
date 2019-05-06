import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		{System.out.println(
				"Welcome to my Fortune Teller! \nI will tell you your fortune based on just a few questions! \nFirst, what is your first name?");
		String firstName = input.next();
		if (firstName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0); 
		}
		System.out.println("Hi, " + firstName + ". What is your last name?");
		String lastName = input.next();
		if (lastName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0); }
			
		System.out.println("Hi " + firstName + " " + lastName + ". How old are you?");

		String age = input.next();
		if (age.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);}
		System.out.println(age + " years young. What month were you born in? \nPlease answer as a two-digit number.");
		
		String month = input.next();
		if (month.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);}
		
		String color = null;
		
		Boolean colorLoop = true;
		while (colorLoop == true) {
			
<<<<<<< HEAD
			System.out.println("What is your favorite ROYGBIV color? \nType \"Help\" if you do not know what ROYGBIV means.");
=======
			System.out.println("What is your favorite ROYGBIV color? Type \"Help\" if you do not know what ROYGBIV means.");
>>>>>>> d7a1f40d72f7b34d027c229ab044ab849aff9c7d
			color = input.next();
			
			if (color.toLowerCase().contentEquals(("help"))) {
			System.out.println(("R = Red, O = Orange, Y = Yellow, G = Green, B = Blue, I = Indigo, V = Violet."));
			
		} else if (color.toLowerCase().contains("blue")||(color.toLowerCase().contains("red")||(color.toLowerCase().contains("yellow")||(color.toLowerCase().contains("green")||(color.toLowerCase().contains("orange")||(color.toLowerCase().contains("violet")||(color.toLowerCase().contains("indigo")))))))) {
				System.out.println("I love that color.");
				colorLoop = false;
		} else if (color.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0); 
		} else {
			System.out.println("Pick a valid color");
		}}
			
		System.out.println("How many siblings do you have?");
		String siblings = input.next();
		if (siblings.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);}

			System.out.println("Now I will tell you your fortune!");{{
			int ret;
			String sib = null;
			String travel = null;
			int bank;
			
			if (Integer.parseInt(age) % 2 == 0) {
				ret = 20;
			} else {
				ret = 40;
			}
			int convertsib = Integer.parseInt(siblings);
			if (convertsib<0) convertsib = -1; 
			switch (convertsib) {
			case 0: sib = "on Saturn";
			break;
			case 1: sib = "on the moon";
			break;
			case 2: sib = "on Mars";
			break;
			case 3: sib = "on Venus";
			break;
			case -1: sib = "on the sun";
			break;
			default: sib = "on Jupiter";
			
			}
			switch (color) {
			case "blue": travel = "camel";
			case "red": travel = "goat";
			case "orange": travel = "elephant";
			case "yellow": travel = "horse";
			case "indigo": travel = "ostrich";
			case "violet": travel = "goat";
			case "green": travel = "rhino";
			}
			
			if (color.toLowerCase().equals("blue")) {
				travel = "camel";
			} else if (color.toLowerCase().equals("red")) {
				travel = "goat";
			} else if (color.toLowerCase().equals("orange")) {
				travel = "elephant";
			} else if (color.toLowerCase().equals("yellow")) {
				travel = "horse";
			} else if (color.toLowerCase().equals("green")) {
				travel = "rhino";
			} else if (color.toLowerCase().equals("indigo")) {
				travel = "ostrich";
			} else {
				travel = "pterodactyl";}
			int convertmonth = Integer.parseInt(month);
			if (convertmonth >= 1 && convertmonth<= 4 ){
				bank = 1000000;
			} else if (convertmonth > 4 && convertmonth <= 8) {
				bank = 2000000;
			} else if (convertmonth > 8 && convertmonth <= 12) {
				bank = 3000000;
			} else {
				bank = 0;}
			
			System.out.println(firstName + " " + lastName + " will retire in " + ret + " years with $" + bank + " in the bank, \na vacation home "+ sib + ", and travel by " + travel + ".");
			}}}
		
		input.close();
	
			}
			
		}
		
		
		
