 import java.util.*;
 import java.text.DecimalFormat;
  
 public class CurrencyConverter {
 
 	public static void main(String[] args) {
 
 		double amount, code,  rupee, dollar, pound, euro, yen, taka;

 		DecimalFormat f = new DecimalFormat("##.##");
 Scanner sc = new Scanner(System.in);
 
		System.out.println("Hi, Welcome to the Currency Converter!");

 		System.out.println("Which currency You want to Convert ? ");
		
		System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Taka ");
		code = sc.nextInt();
 		System.out.println("How much Money you want to convert ?");
		amount = sc.nextFloat();

 if (code == 1) {
 
dollar = amount / 70;
 System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");
  
 pound = amount / 88;
 System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");

 euro = amount / 80;
 System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");
 
 yen = amount / 0.63;
 System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Yen");
 
 taka = amount / 1.1342;
 System.out.println("Your " + amount + " Rupee is : " + f.format(taka) + " taka");
 } else if (code == 2) {
 rupee = amount * 70;
 System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");

  pound = amount * 0.78;
 System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");
 
 euro = amount * 0.87;
 System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");

 yen = amount * 111.087;
 System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");
 
 taka = amount * 87.92;
 System.out.println("Your " + amount + " Dollar is : " + f.format(taka) + " taka");
 } else if (code == 3) {
 rupee = amount * 88;
 System.out.println("Your " + amount + " pound is : " + f.format(rupee) + " Ruppes");

 dollar = amount * 1.26;
 System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");
  
 euro = amount * 1.10;
 System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");
System.out.println("Your " + amount + " euro is : " + f.format(taka) + " taka");
} else if (code == 5) {
rupee = amount * 0.63;
System.out.println("Your " + amount + " yen is : " + f.format(rupee) + " Ruppes");
 
 dollar = amount * 0.008;
 System.out.println("Your " + amount + " yen is : " + f.format(dollar) + " Dollar");
pound = amount * 0.007;
System.out.println("Your " + amount + " yen is : " + f.format(pound) + " Pound");
euro = amount * 0.007;
System.out.println("Your " + amount + " yen is : " + f.format(euro) + " Euro");
taka = amount * 0.6902;
System.out.println("Your " + amount + " yen is : " + f.format(taka) + " taka");
} else if (code == 6) {
rupee = amount / 1.134 ;
System.out.println("Your " + amount + " taka is : " + f.format(rupee) + " Ruppes");
dollar = amount / 87.92 ;
System.out.println("Your " + amount + " taka is : " + f.format(dollar) + " dollar");
pound = amount / 110.67 ;
System.out.println("Your " + amount + " taka is : " + f.format(pound) + " pound");
euro = amount / 94.09 ;
System.out.println("Your " + amount + " taka is : " + f.format(euro) + " euro");
yen = amount / 0.6901 ;
 System.out.println("Your " + amount + " taka is : " + f.format(yen) + " yen");
               } else {
			System.out.println("Invalid input");
                                 }
   System.out.println("Thank you ");
	}
        }


