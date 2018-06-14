package com.rodriguemouadeu.ocjp092018.chap07.q5;

import java.io.IOException;
import java.sql.SQLException;

public class BadIO {
	public static void main(String... args) {
		BadIO a = new BadIO();
		try {
			a.fileBlowUp();
			a.databaseBlowUp();
			System.out.println("a");
		} catch (IOException | SQLException e) {
			System.out.println("b");
		} catch (Exception e) {
			System.out.println("c");
		}

	}

	private void databaseBlowUp() throws SQLException {
		throw new SQLException();
	}

	private void fileBlowUp() throws IOException {
		throw new IOException();
	}
}
