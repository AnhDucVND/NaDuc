package Buoi2_java;

public class Function {
    static void InputData( int arr[], int number){
        for(int i=0; i<arr.length;i++){
            arr[i]=number;
        }
    }
//    public void PrintData(int arr[]){
//        for
//    }
    static void PrintData(int arr[], int Number){
        for(int i=0; i<arr.length;i++){
            System.out.println("Phần tử thứ "+(i+1)+" là "+ (arr[i]+Number));
        }
    }
    //main : Ten hàm
    // Đối số trong hàm là 1 biến thuộc kiểu dữ liệu nào đó
    public static void main(String[] args){
        int Mang[]=new int[100];
        InputData(Mang,99);
        PrintData(Mang,5);
    }

}
