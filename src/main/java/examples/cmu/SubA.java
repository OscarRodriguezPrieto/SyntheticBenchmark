package examples.cmu;

public class SubA extends A {

	public static int c;

	public final D d = null;

	public int[] getArray() {
		return array;
	}

	@Override
	public void confusing(int i, String g) {
		// array[2] = 0;
	}


}
