
public class FidingPrimerNumbers {

	FidingPrimerNumbers() {
		// Calcular intervalo de 1 al 100

	}

	public void findPrimes(long start, long end) {
		long countPrimes = 0;

		for (long number = start; number <= end; number++) {
			for (long j = 2; j <= number; j++) {
				if (j != number) {
					if (number % j == 0) {
						break;
					}
				}
				if (number == j) {
					countPrimes++;
					if (countPrimes < 6) {
						System.out.println("Prime number #" + countPrimes + " is " + number);
					}
				}
			}
		}
		printLast(countPrimes, start, end);
		System.out.println("From: " + start + "\nTo: " + end + "\nThere are " + countPrimes + ".");
	}

	public void printLast(long numPrimes, long start, long end) {
		long count = 0;
		for (long number = start; number <= end; number++) {
			for (long j = 2; j <= number; j++) {
				if (j != number) {
					if (number % j == 0) {
						break;
					}
				}
				if (number == j) {
					count++;
					if (numPrimes - 5 < count) {
						System.out.println("Prime number #" + count + " is " + number);
					}
				}
			}
		}
	}

}
