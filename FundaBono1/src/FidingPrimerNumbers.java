
public class FidingPrimerNumbers {

	public void findPrimes(long start, long end) {
		long[] primes = new long[(int) (end-start)];
		long countPrimes = 0;
		double startingTime = System.currentTimeMillis();


		for (long number = start; number <= end; number++) {
			for (long j = 2; j <= number; j++) {
				if (j != number) {
					if (number % j == 0) {
						break;
					}
				}
				if (number == j) {
					primes[(int) countPrimes]=number;
					countPrimes++;
				}
			}
		}
		
		double endingTime = System.currentTimeMillis();
		double deltaTime = 0.001*(endingTime - startingTime);
		System.out.println("\nFrom: " + start + "\nTo: " + end + "\nThere are " + countPrimes + " prime numbers.");
		System.out.println("Estimated Running: "+ deltaTime+" seconds");
		printPrimes(primes, countPrimes);
	}

	public void printPrimes(long[] numPrimes, long count) {
		for (int i=0; i<5; i++){
			System.out.println("Prime number #" + i + " is " + numPrimes[i]);
		}
		for (int i=((int) count-5);i<count; i++){
			System.out.println("Prime number #" + i + " is " + numPrimes[i]);
		}
	}
					
				

}
