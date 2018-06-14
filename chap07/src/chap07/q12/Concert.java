package chap07.q12;

public class Concert {

	static class PowerOutage extends Exception {
	}

	static class ThunderStorm extends Exception {
	}

	public static void main(String[] args){
		try{
			new Concert().listen();
			System.out.println("a");
		} catch (PowerOutage | ThunderStorm e){
			e = new PowerOutage(); // Not allowed to reassign the exception when using multi-catch clause
			System.out.println("b");
		} finally {
			System.out.println("c");
		}
	}

	private void listen() throws PowerOutage, ThunderStorm {
		
	}
}
