package com.rodriguemouadeu.ocjp092018.chap07.q8;

public class MultipleResources {
	class Lamb implements AutoCloseable {

		@Override
		public void close() throws Exception {
			System.out.println("l");
		}
	}

	class Goat implements AutoCloseable {

		@Override
		public void close() throws Exception {
			System.out.println("g");
		}
	}

	public static void main(String[] args) throws Exception {
		new MultipleResources().run();
	}

	private void run() throws Exception {
		try (Lamb l = new Lamb(); 
				//System.out.println("1"); // Fails to compile because System.out.println does not implement AutoCloseable
				Goat g = new Goat();) { 
			System.out.println("2");
		} finally {
			System.out.println("f");
		}
	}
}
