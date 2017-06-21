import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;
/*here's the functional code for the cinema price ticket calculator, finctional programming style. OOP to come*/

public class Cinema_calculator_simple{
	
	public static void main(String args[]) {
		 HashMap<String, Integer> ticket = new HashMap<String, Integer>();
		 
		 	ticket.put("Standard", 10);
		 	ticket.put("OAP", 6);
		 	ticket.put("Student", 6);
		 	ticket.put("Child",  4);
		 	
		 	int discount;
		 	int dayOfWeek;
		 	
		 	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e");
		 	LocalDate localDate = LocalDate.now();
		 	//System.out.println(dtf.format(localDate)); //2016/11/16
		 	
		 	dayOfWeek = Integer.valueOf(dtf.format(localDate));
		 	
		 	if(dayOfWeek == 3){
		 		System.out.println("it's Wednesday brah! Sick discounts for everyone!);
		 		discount = 2;
		 	}else {
		 		discount = 0;
		 	}
		 	//System.out.println("discount= "+ discount);
		 	System.out.println("program start");
		 	Scanner reader = new Scanner(System.in);  // Reading from System.in
		 	System.out.println("How many Standard tickets?: ");
		 	int n = reader.nextInt(); 
		 	
		 	Scanner reader1 = new Scanner(System.in);  // Reading from System.in
		 	System.out.println("How many pensioner tickets?: ");
		 	int x = reader1.nextInt();
		 	
		 	Scanner reader2 = new Scanner(System.in);  // Reading from System.in
		 	System.out.println("How many Student tickets?: ");
		 	int y = reader2.nextInt();
		 	
		 	Scanner reader3 = new Scanner(System.in);  // Reading from System.in
		 	System.out.println("How many Child tickets?: ");
		 	int z = reader3.nextInt();
		 	
			int stdtotal = (ticket.get("Standard")-discount)*n;
			int oaptotal = (ticket.get("OAP")-discount)*x;
			int stutotal = (ticket.get("Student")-discount)*y;
			int chldtotal = (ticket.get("Child")-discount)*z;
			int total = stdtotal+oaptotal+stutotal+chldtotal;
		 
			System.out.println("Your total is : £"+total);
			 	
	}	  
}
