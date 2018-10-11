
public class ComplexTest {

	public static void main(String[] args) {

		Complex c = new Complex(2, 3);

		System.out.println(c.getRe());
		System.out.println(c.getIm());
		System.out.println(c.getAbs2());
		Complex z = new Complex(3, 2);
		c.add(z);
		System.out.println(c.getRe());
		System.out.println(c.getIm());
		Complex k = new Complex(4, 1);
		z.mul(k);
		System.out.println(z.getRe());
		System.out.println(z.getIm());
	}

}
