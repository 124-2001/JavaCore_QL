package Method;

import Company.CanBo;

import java.util.List;
import java.util.Scanner;

public class QLCB {

    public void Show_info(CanBo canbo){
        System.out.println("****************");
        System.out.println("Ten can bo : "+canbo.ho_ten);
        System.out.println(canbo.tuoi+ " tuoi");
        System.out.print("Gioi tinh : ");
        if(canbo.gioi_tinh==1){
            System.out.println("Nam");
        }
        if(canbo.gioi_tinh==2){
            System.out.println("Nu");
        }
        if(canbo.gioi_tinh==3){
            System.out.println("Khac");
        }
        System.out.println("Dia chi : "+canbo.dia_chi);
        System.out.println("****************");
    }

    public void Show_list_info(List<CanBo> canbo_s){
        if(canbo_s.size()==0){
            System.out.println("Danh sach can bo rong");
        }
        else {
            for(CanBo cb : canbo_s){
                Show_info(cb);
            }
        }
    }

    public void Them_moi_can_bo(List<CanBo> canbo_s){
        Scanner sc = new Scanner(System.in);
        CanBo cb = new CanBo();
        System.out.print("Ho va ten can bo : ");
        cb.ho_ten = sc.nextLine();
        System.out.print("Tuoi : ");
        cb.tuoi = sc.nextInt();
        System.out.print("Gioi tinh : ");
        System.out.println("1) Nam ---2) Nu ---3) Khac");
        cb.gioi_tinh = sc.nextInt();
        System.out.print("Dia chi : ");
        cb.dia_chi = sc.nextLine();
        cb.dia_chi = sc.nextLine();
        canbo_s.add(cb);
        System.out.println("Them can bo thanh cong .");
    }

    public void Tim_kiem_can_bo(List<CanBo> canbo_s , String key_char){
        int count =0;
        for(CanBo cb :canbo_s){
            if(cb.ho_ten.contains(key_char)==true){
                count++;
                Show_info(cb);
            }
        }
        if(count==0){
            System.out.println("Khong tim thay can bo nao phu hop .");
        }
    }
}
