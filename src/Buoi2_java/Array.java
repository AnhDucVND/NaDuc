package Buoi2_java;

public class Array {
    public static void main(String[] args){
        //Khai báo mảng nặc danh
        //int arr[]={12,45,32,56,68};
//        int arr2[]= new int[6];
//        arr2[0]=20;
//        arr2[1]=40;
//        arr2[2]=10;
//        arr2[3]=60;
//        arr2[4]=340;
//        arr2[5]=2034;
//        arr2[5]=2034;
//        System.out.println(arr2[0]+arr2[1]);
//        //Chạy từ 0 đến độ dài của mảng
//        for (int i=0;i<arr2.length;i++){
//            System.out.println(arr2[i]);
//        }
//        String arr3[]=new String[3];
//        arr3[0]="20";
//        arr3[1]="22";
//        arr3[2]="Khanh";
//
//        for (int i=0;i<arr3.length;i++){
//            System.out.println(arr3[i]);
//        }
//        int number0= Integer.valueOf(arr3[0]).intValue();
//        int number1= Integer.valueOf(arr3[1]).intValue();
//        System.out.println(number0+number1);
        // Bài toán gán giá trị 25 cho mảng 100 phần tử
        int arr25[]= new int[100];
        for (int i=0;i<arr25.length;i++){
            arr25[i]=25;
        }
        for (int i=0; i<arr25.length;i++){
            System.out.println("Phần tử thứ " +(i+1)+" "+arr25[i]);
        }
    }
}
