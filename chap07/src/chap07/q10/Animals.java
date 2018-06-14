package chap07.q10;

import java.io.Closeable;
import java.io.IOException;

public class Animals {
	class Lamb implements Closeable {

		@Override
		public void close() throws IOException {
			System.out.println("Lam - close");
			throw new RuntimeException("a");
		}
	}

	public static void main(String[] args) {
		new Animals().run();
	}

	private void run() {
		try (Lamb l = new Lamb();) {
			throw new IOException();
		} catch (Exception e) {
			throw new RuntimeException("c");
		}
	}
}
