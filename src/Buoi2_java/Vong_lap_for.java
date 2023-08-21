package Buoi2_java;

public class Vong_lap_for {
    public static void main(String[] args){

        //int =1 để khởi tạo giá trị biến chạy
        // i<=10 Giới hạn biến i, dến khi biến i =10
        //i++ để tăng i sau mỗi lần i thoả mãn điều kiện
        String Name="Anh Đức";
        int temp=48;
        for (int i=1; i<=68; i++){
            if (i==temp){
            System.out.println("Dừng lại ở lần thứ "+i);
            break;
            } else {
                System.out.println("Lần" + i);
            }

        }
    }
}
