
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//While loop that prints all even numbers from 0 -> 100
		System.out.println("FIRST LOOP");
		int countEven = 0;
		while (countEven != 100) {
			countEven++;
			if (countEven % 2 == 0) {
				System.out.println(countEven);
			}
		}
		System.out.println("");
		
		//while loop that prints every 3rd number going backwards from 100 to 0
		System.out.println("SECOND LOOP");
		
		int countThirds = 100;
		System.out.println(countThirds);
		
		while (countThirds > 0) {
			if (countThirds == 1) {
				System.out.println("0");
				break;
			} else {
				countThirds -= 3;
				System.out.println(countThirds);
			}
		}
		System.out.println("");
		
		//a for loop that prints every other number from 0 to 100
		System.out.println("THIRD LOOP");
		
		for (int x = 1; x < 100; x += 2) {
			System.out.println(x);
		}
		System.out.println("");
		
		/* a for loop that prints every number from 0 - 100, 
		 * if number is divisible by 3 prints hello instead of number
		 *  and if it is divisible by 5, it prints World. 
		 *  If both prints hello world (BELOW)
		*/
		System.out.println("FINAL LOOP");
		for (int number = 0; number <= 100; number++) {
			
			if (number % 3 == 0 && number % 5 == 0) {
				//System.out.println(number);
				System.out.println("Hello World");
				System.out.println("");
			} else if (number % 3 == 0) {
				//System.out.println(number);
				System.out.println("Hello");
				System.out.println("");
			} else if (number % 5 == 0) {
				//System.out.println(number);
				System.out.println("World");
				System.out.println("");
			} else {
				System.out.println(number);
				System.out.println("");
			}
			
		}
		/*
		 * The above for loop will print hello if it is number is divisible by 3
		 *if divisible by 5, it prints world
		 *if divisible by both it prints Hello World
		 *other wise it outputs a number
		 */
	}

}
