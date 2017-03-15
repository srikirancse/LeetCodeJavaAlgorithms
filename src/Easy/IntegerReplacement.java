package Easy;

public class IntegerReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 4;
		final int c;
		System.out.println("Original:        "+Integer.toBinaryString(a)+"Decimal:"+a);
		System.out.println("Right Shift: 	"+Integer.toBinaryString(a>>1)+"Decimal:"+(a>>1));
		System.out.println("Left Shift: 	 "+Integer.toBinaryString(a<<1)+"Decimal:"+(a<<1));
		System.out.println("Unsigned Right Shift: "+Integer.toBinaryString(a>>>1)+"Decimal:"+(a>>>1));
		System.out.println(Integer.bitCount(a));
		System.out.println("\t"+(b&1));
	}

}
