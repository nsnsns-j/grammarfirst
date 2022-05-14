public class FizzBuzz {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[args.length - 1]);

		for (int i = 1; i <= x; i++) {
			int a = i % 3;
			int b = i % 5;

			if (a == 0 && b >= 1) {
				System.out.print("Fizz ");

			} else if (a >= 1 && b == 0) {
				System.out.print("Buzz ");

			} else if (a == 0 && b == 0) {
				System.out.print("FizzBuzz ");

			} else {
				System.out.print(i + " ");
			}
		}

	}
}
