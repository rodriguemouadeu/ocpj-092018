package chap07.q11;

import java.io.IOException;

public class Animals {
	public class Lamb implements AutoCloseable {

		@Override
		public void close() {
			throw new RuntimeException("a");
		}
	}

	public static void main(String[] args) throws IOException {
		new Animals().run();
	}

	private void run() throws IOException {
		try (Lamb l = new Lamb();) {
			throw new IOException();
		} catch (Exception e) {
			throw e;
		}
	}
}
