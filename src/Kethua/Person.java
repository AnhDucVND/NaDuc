package Kethua;

public class Person {
    public String name;
    public int age;
    public float height;

    public Person() {
    }

    public void Person(String name, int age, float height) {
        this.name=name;
        this.age = age;
        this.height=height;
    }
    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.height);
    }
    public static void main(String[] args){
        Person tt =new Person();
        tt.Person("Nguyễn Anh Đức",20,90.5f);
        tt.getInfo();

    }
}


