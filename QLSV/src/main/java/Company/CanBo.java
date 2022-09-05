package Company;

public class CanBo {

    public String ho_ten;

    public int tuoi;

    public int gioi_tinh; // 1 : Nam     2: Nu     3 :Khac

    public String dia_chi;

    public CanBo() {
    }

    public CanBo(String ho_ten, int tuoi, int gioi_tinh, String dia_chi) {
        this.ho_ten = ho_ten;
        this.tuoi = tuoi;
        this.gioi_tinh = gioi_tinh;
        this.dia_chi = dia_chi;
    }
}
