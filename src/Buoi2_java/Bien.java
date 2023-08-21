package Buoi2_java;

class Bien {
    //public: Phạm vi truy cập
    public static int age = 10;
    public String get_info = "Auto"; // Biến toàn cục

    public static void main(String[] args) {
        // int n=10;
        String name = "Duc Automation Testing";
        int Age = 39;
        float weight = 0.6f;
        boolean sex = true;// Giới tính là Nam

        System.out.println(name);
        System.out.println(Age);
        System.out.println(weight);
        System.out.println(sex);
        // System.out.println(" Hello World!!");

        // System.out.println("Tuoi="+n);

        // System.out.println("Tuoi="+age);
        String Ten = "Nguyễn Anh Đức";
        int age = 26;
        String Congviec = " Sinh vien";
        String Ngaysinh = "13-05-1998";


    }

    public void Get_info() {
        int age = 10; //Biến local
        System.out.println(age);
    }
}
