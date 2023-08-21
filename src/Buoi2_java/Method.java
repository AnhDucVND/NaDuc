package Buoi2_java;

public class Method {
    static void PrintData(){
        System.out.println("Đây là phương thức của tôi");
    }
    static void checkTuoi(int age){
        if (age<18){
            System.out.println("Ban không đur tuổi");
        } else {
            System.out.println("Bạn đã đủ tuổi");
        }
    }
    static void Cong2So(int a,int b){
            System.out.println("Tổng hai số là: "+(a+b));

        }


    public static void main(String[] args){
        PrintData();
        checkTuoi(12);
        Cong2So(3,8);
    }
}

