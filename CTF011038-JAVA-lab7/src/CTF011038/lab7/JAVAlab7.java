package CTF011038.lab7;
import java.util.Scanner;
public class JAVAlab7 {
	public static void main(String[] args) {
//1
	int count = 20;
	do {
		System.out.println(count);
		count--;
	} while(count>0);
	
//2
	Scanner Keyboard = new Scanner(System.in);
	System.out.println("ใส่ตัวเลข  ");
	int number = Keyboard.nextInt();
	while (number%2 ==0) {
		System.out.println("ใส่ตัวเลข  ");
		number = Keyboard.nextInt();
		}
	}
}
