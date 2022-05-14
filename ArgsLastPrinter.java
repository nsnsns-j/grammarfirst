
public class ArgsLastPrinter {
	public static void main(String[] args) {
		int n = args.length;
		if (n <= 0) {
			System.out.println("‚È‚µ");
		} else {
			System.out.println(args[n - 1]);
		}
	}
}
