
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

	static class SINNER {
		static class II {
			static int b;
		}
	}

	private class INNER extends E {

		
		public INNER() {

			SINNER.II.b = 8;

			f = null;
			C.this.f = null;
			array = null;
			C.this.array = null;
			// just d means inherited attr
			C.this.d = null;

			this.d = 8;
			d = 3;
			super.d = 3;

		}
	}
}
