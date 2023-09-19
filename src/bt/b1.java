package bt;
import java.util.Scanner;
public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TÍNH TỔNG CÁC SỐ CHẴN TRONG KHOẢNG CHO TRƯỚC");
        int min, max, sum = 0;
        System.out.print("Nhập vào cận dưới (số nhỏ hơn): ");
        min = sc.nextInt();
        System.out.print("Nhập vào cận trên (số lớn hơn): ");
        max = sc.nextInt();
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng từ " + min + " đến " + max + " là " + sum);
    }
}
