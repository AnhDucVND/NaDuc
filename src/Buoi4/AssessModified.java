package Buoi4;
class A{
    private int data=2;
    private void msg(){
        System.out.println(data);
    }
    public int data1=2;
    public void msg1(){
        System.out.println(data1);

    }
}
public class AssessModified {
    public static void main(String[] args){
        A obj = new A();
        System.out.println(obj.data1);
        obj.msg1();
    }

}
