import java.util.*;
public class Bai_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap ten: ");
        String ten = scanner.nextLine();

        System.out.println("nhap diem: ");
        float diem = scanner.nextFloat();

        System.out.println(ten+" co diem : "+diem);
        
        scanner.close();
    }
    
}
