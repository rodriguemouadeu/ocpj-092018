package com.rodriguemouadeu.chap07.q4;

import java.io.IOException;
import java.sql.SQLException;

public class AllGoesWrong {
	public static void main(String... args) {
		AllGoesWrong a = new AllGoesWrong();
		try{
			a.blowUp();
			System.out.println("a");
		} catch(IOException | SQLException e){
			System.out.println("c");
		} finally {
			System.out.println("d");
		}
		
	}

	private void blowUp() throws IOException, SQLException {
		throw new SQLException();
	}
}
