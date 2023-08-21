package Buoi4;

class getinfoStudent {

    String name;
    int age;

    public void Display(String name,int age) {
        System.out.println("Tên tui là: " + name);
        System.out.println("Tuổi là: " + age);
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        getinfoStudent St5 = new getinfoStudent();
        St5.Display("Đức",35);
    }
}
