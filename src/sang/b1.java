package sang;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        System.out.println("Nhập số để lựa chọn menu dưới dây: ");
        System.out.println("1. Kiểm tra tích của 2 số.");
        System.out.println("2. Kiểm tra giai thừa của 1 số.");
        System.out.println("3. Kiểm tra Khai căn và làm tròn tới 3 chữ số sau dấu phẩy.");
        System.out.println("4. Đếm số ước của 1 số nguyên dương nhập vào.");
        System.out.println("5. Thoát");
        menu = sc.nextInt();
        switch (menu){
            case 1:
                System.out.println("tích của 2 số");
                System.out.print("Nhập số thứ nhất: ");
                double number1 = sc.nextInt();
                System.out.print("Nhập số thứ hai: ");
                double number2 = sc.nextInt();
                double tich2so = number1 * number2;
                System.out.println(tich2so);
            case 2:
                System.out.println("giai thừa của 1 số");
                System.out.print("Nhập số:");
                double number = sc.nextInt();
                long fact = 1;
                for(int i = 1; i <= number; i++)
                {
                    fact = fact * i;
                }
                System.out.println("Giai thừa của "+number+" là: "+fact);
            case 3:
                System.out.println("làm tròn tới 3 chữ số");
                System.out.print("Nhập số:");
                double number4 = sc.nextDouble();
                if(number4 <0){
                    System.out.println("ko hợp lệ");
                }else {
                    double can = Math.sqrt(number4);
                    System.out.println((double) Math.round(can * 1000) / 1000);
                }

            default:
                System.out.println("Vui lòng chạy lại chương trình và lựa chọn trong khoảng từ 1 đến 5.");
                break;
        }
    }

}
