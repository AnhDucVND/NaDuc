package Buoi4;

public class NhanVien {
    public void Info_Nhanvien(){
         String name="Nguyễn Anh Đức";
         int age=25;
         String Ngaysinh="13/05/1998";
         String Gioitinh="Nam";


             System.out.println(name);
            System.out.println(age);
            System.out.println(Ngaysinh);
            System.out.println(Gioitinh);

    }
    public int Cong2so(int a,int b){
        return a+b;
    }
//    public void KetquaCong(){
//        System.out.println(Cong2so(3,4));}
    public int Nhan2so(int a,int b){
        return a*b;

    }
//    public void Ketquanhan(){
//        System.out.println(Nhan2so(3,4));
//
//    }

    public static void main (String[] args){
        NhanVien Nv =new NhanVien();
        Nv.Info_Nhanvien();

        System.out.println(Nv.Cong2so(3,333));
        System.out.println(Nv.Nhan2so(3,333));
    }
}
