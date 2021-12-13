
public class Debugger1 {

	public static void main(String[] args) {
			
		System.out.println("Dame un numero");
		int num = Console.readInt();
		
		int n_factorial = factorial(num);
		System.out.println("El factorial del numero "+num+" es: "+n_factorial);
			
	}
	public static int factorial (int num) {
		
		int fact = 1;
		
		for(int i = 1; i <= num; i++){
			
	      fact = fact * i;
	      
		}
	return fact;
	}
}
