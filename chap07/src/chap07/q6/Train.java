package chap07.q6;

public class Train {
	class RanOutOfTrack extends Exception {
	}

	class AnotherTrainIsComing extends Exception {
	}

	public static void main(String[] args) throws RanOutOfTrack, AnotherTrainIsComing {
		Train a = new Train();
		try {
			a.drive();
			System.out.println("honk! honk!");
		 } catch (RanOutOfTrack | AnotherTrainIsComing e) {
			// } catch (Exception e) {
			System.out.println("Error driving");
			throw e;
		}
	}

	private void drive() throws RanOutOfTrack, AnotherTrainIsComing {
		throw new RanOutOfTrack();
	}

}
