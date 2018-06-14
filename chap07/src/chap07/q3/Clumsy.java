package chap07.q3;

public class Clumsy {
	public static void main(String... args) {
		int j = 7;
		assert (++j > 7);
		assert (++j < 8) : "Hi";
		assert (j > 10) : j = 12;
		assert (j == 12) : doStuff();
		assert(j == 12): new Clumsy();
	}

	private static String doStuff() {
		return "Hello";
	}
}
