import java.util.*;
public class Bai_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chieu dai: ");
        int chieudai = sc.nextInt();

        System.out.println("Nhap chieu rong: ");
        int chieurong = sc.nextInt();


        System.out.println("Chu vi hinh chu nhat la: "+(chieudai+chieurong)*2);
        System.out.println("Dien tich hinh chu nhat la: "+(chieudai*chieurong));
        System.out.println("Canh nho nhat la: "+Math.min(chieudai, chieurong));
        
        sc.close();

    }
    
}
