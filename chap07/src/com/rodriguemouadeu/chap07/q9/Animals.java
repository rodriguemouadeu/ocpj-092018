package com.rodriguemouadeu.chap07.q9;

public class Animals {
	
	class Lamb implements AutoCloseable {

		public void close() throws Exception {
			System.out.println("Lamb - close");
		}
	}

	public void run() throws Exception {
		try (Lamb l = new Lamb()) {

		}
	}

	public static void main(String[] args) throws Exception {
		new Animals().run();
	}

}
