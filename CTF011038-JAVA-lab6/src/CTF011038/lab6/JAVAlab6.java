package CTF011038.lab6;

public class JAVAlab6 {
	public static void main(String [] args) {
//1
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
//2
		int sum=0;
		for (int j=1;j<=10;j++) {
			sum = sum + j;
			System.out.println(sum);
		}
//3
		for (int deVide=1;deVide<=100;deVide++) {
			if (deVide%12==0) {
			System.out.println(deVide);
			}
		}
//4
		int myArray[] = {1,2,3,4,5};
			for(int counter:myArray) {
				System.out.println(counter);
			}
	}
}
