package hello.com;
class A1{
    int a;

    public int getA() {
        return a;
    }

    A1(int b){
        this.a = b;
    }
    public int c(){
        return 1;
    }
}
class B1 extends A1{
    B1(int c){
        super(c);
        System.out.println(c);
    }
}
public class Lec_47_This_Superkayword_in_constructor_oop {
    public static void main(String[] args) {
 A1 ae = new A1(75);
        System.out.println(ae.getA());
        B1 be = new B1(10);
    }
}
