package JavaProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 101; i++) {
			count = 0;
			for (int j = 0; j < 101; j++) {

				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
            System.out.println(i);
			}

		}

	}

}
