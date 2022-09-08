import Company.CanBo;
import Method.QLCB;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        QLCB ql = new QLCB();
        List<CanBo> canbo_s = new ArrayList<CanBo>();
        while (true){
            System.out.println("******___________________******");
            System.out.println("1)Them moi can bo");
            System.out.println("2)Tim kiem theo ho ten");
            System.out.println("3)Hien thi danh sach can bo");
            System.out.println("******___________________******");
            int n = sc.nextInt();
            while (n>4 || n<0){
                System.out.print("Nhap lai :");
                n = sc.nextInt();
            }
            switch (n){
                case 1:
                    ql.Them_moi_can_bo(canbo_s);
                    break;
                case 2:
                    System.out.print("Nhap ten can bo: ");
                    String key_chars ;
                    key_chars = sc.nextLine();
                    key_chars= sc.nextLine();
                    ql.Tim_kiem_can_bo(canbo_s,key_chars);
                    break;
                case 3:
                    ql.Show_list_info(canbo_s);
                    break;

            }
        }
    }


}
