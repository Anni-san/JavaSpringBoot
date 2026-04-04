class A{
    public A(){
        System.out.println("In A");
    }
    public A(int n){
        System.out.println("In Parameterized A");
    }
}
class B extends A{
    public B(){
        System.out.println("In B");
    }
    public B(int n){
        this();
        System.out.println("In parameterized B");
    }
}

public class Practice {
    public static void main(String[] args) {
        B obj=new B(5);
    }
}
