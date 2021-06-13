package jaspreet;
import java.util.Scanner;

public class int2roman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String hun[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String t[] = {"","M","MM","MMM"};
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter first number(less than 4000)- ");
		int a= sc.nextInt();
		System.out.println(t[(a/1000)]+hun[(a%1000)/100]+tens[(a&100)/10]+ones[(a%10)]);
		
	}

}
