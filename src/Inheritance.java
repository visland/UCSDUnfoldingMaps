class Base {
  public void foo() {
    System.out.println("base.foo");
  }
}

class Derived1 extends Base {
  public void bar() {
    System.out.println("Derived1.bar");
  }
}

class Derived2 extends Base {
  public void bar() {
    System.out.println("Derived2.bar");
  }
}

public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Derived1 b = new Derived1();
	  b.foo();
	  b.bar();
	  
	  Derived1 d1 = new Derived1();
	  d1.bar();
	  
	  Derived2 d2 = new Derived2();
    d2.bar();
	}
}
