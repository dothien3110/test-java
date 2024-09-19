//Nhập vào một dãy số cho đến khi tổng của chúng lớn hon 2018
//a.	Tỉnh tổng của các số dương chia hết cho 3. Đưa kết quả ra màn hình
//b.	Tỉnh trung bình cộng của các số đã nhập vào. Đưa kết quả ra màn hình
import java.util.Scanner;
import java.util.ArrayList;
public class LTM_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> dayso = new ArrayList<>();
        int tong = 0;

        // Nhập dãy số cho đến khi tổng lớn hơn 2018
        while (tong <= 2018) {
            System.out.print("Nhap mot so: ");
            int so = scanner.nextInt();
            dayso.add(so);
            tong += so;
        }

        // Tính tổng các số dương chia hết cho 3
        int sumsoduongchia3 = 0;
        for (int so : dayso) {
            if (so > 0 && so % 3 == 0) {
                sumsoduongchia3 += so;
            }
        }
        System.out.println("Tong cac so duong chia het cho 3: " + sumsoduongchia3);

        // Tính trung bình cộng của các số đã nhập
        double average = (double) tong / dayso.size();
        System.out.println("Trung binh cong cua cac so da nhap: " + average);
    }
}

    

