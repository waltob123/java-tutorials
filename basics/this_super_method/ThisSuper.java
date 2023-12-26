class A {
    
    public A() {
        System.out.println("A");
    }

    public A(int x) {
        this();
        System.out.println("A" + x);
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B");
    }

    public B(int x) {
        super(x);
        System.out.println("B" + x);
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        B b = new B(20);
    }
}
