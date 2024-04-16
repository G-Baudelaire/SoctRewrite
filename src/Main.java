import intermediate_representation.Binding;

public class Main {
    // Main method to test our Foo class
    public static void main(String[] args) {
        Binding foo1 = new Binding();
        Binding foo2 = new Binding();
        Binding foo3 = foo1;

        System.out.println(foo1.equals(foo2));  // Output: false
        System.out.println(foo1.equals(foo3));  // Output: true
        System.out.println(foo1);  // Output: Foo{id=1}
        System.out.println(foo2);  // Output: Foo{id=2}
    }
}