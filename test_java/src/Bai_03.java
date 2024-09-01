import java.util.*;
public class Bai_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap canh: ");
        int canh = sc.nextInt();
        
        System.out.println("the tich hinh lap phuong co canh = "+canh+" la "+Math.pow(canh, 3));

        sc.close();
    }
}
