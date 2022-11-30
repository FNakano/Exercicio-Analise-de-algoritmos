import java.util.Random;

public class RNGTest extends Random{  // para contornar o modificador de acesso protected de rng.next.
/*
	int nextUInt32() {
		return this.next(31);
	}
*/
	public void cinquenta () {
		for (int i=0;i<50;i++) {
			System.out.print (next(31) + " ");
		}
	}
	public static void main (String args[]) {
		RNGTest rng = new RNGTest();
		rng.setSeed(0L);
		rng.cinquenta();
	}
}
