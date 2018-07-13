import java.util.Scanner;
public class vowel {
	public static void main(String[] args) {
		char n;
		Scanner in=new Scanner(System.in);
		n=in.next().charAt(0);
		if(n==('0')||n==('1')||n==('2')||n==('3')||n==('4')||n==('5')||n==('6')||n==('7')||
				n==('8')||n==('9'))
		{
			System.out.println("Invalid");
		}
		else if(n==('a')||n==('e')||n==('i')||n==('o')||n==('u')||n==('A')||n==('E')||n==('I')||n==('O')||n==('U'))
		{
			System.out.println("Vowels");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}
