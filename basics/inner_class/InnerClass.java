class OuterClass {
    int num = 10;
    public class InnerClass {
        public void display() {
            System.out.println("This is an inner class");
        }
    }
    void displayInner() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

public class InnerClass {
    public static void main(String args[]) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
        outer.displayInner();
    }
}
