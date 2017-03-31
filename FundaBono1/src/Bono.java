
public class Bono {
	

	public static void main(String[] args) {
		FidingPrimerNumbers p= new FidingPrimerNumbers();
		p.findPrimes(1, 100);
		p.findPrimes(1, 1000);
		p.findPrimes(1, 10000);
		p.findPrimes(1, 100000);
		p.findPrimes(1, 1000000);
		p.findPrimes(1, 10000000);
		p.findPrimes(7870000000L, 7879999999L);
		p.findPrimes(9390000000L, 9399999999L);

	}

}

