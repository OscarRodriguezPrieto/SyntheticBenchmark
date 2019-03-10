
package examples.cmu;

class C extends A {
	public final A a = null;
	public int b = 2;
	D d;

	@Override
	public void confusing(int i, String g) {
		g = null;
	}

	public void m() {
		d = null;
	}

}
