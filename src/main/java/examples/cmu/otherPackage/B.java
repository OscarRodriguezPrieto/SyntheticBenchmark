package examples.cmu.otherPackage;

import examples.cmu.A;
import examples.cmu.SubA;


public class B extends A {
	public int a = SubA.c;
	public char c = (char) 9.8;
	@Override
	public Object clone() {
		Object clon;
		System.out.println((clon = a == c ? super.clone() : null).hashCode());
		return clon;
	}

}
