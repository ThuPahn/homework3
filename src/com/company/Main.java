package com.company;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

    public static void main(String[] args) {
        /*Bài 2*/
//            int aNumber, bNumber;
//            double nghiem;
//            DecimalFormat decimalFormat = new DecimalFormat("#.##");
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Nhập vào số a: ");
//            aNumber = scanner.nextInt();
//            System.out.println("Nhập vào số b: ");
//            bNumber = scanner.nextInt();
//            System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
//            if (aNumber == 0) {
//                if (bNumber == 0) {
//                    System.out.println("Phương trình này có vô số nghiệm.");
//                } else {
//                    System.out.println("Phương trình vô nghiệm.");
//                }
//            } else {
//                nghiem = (double) -bNumber / aNumber;
//                System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
//            }
//            System.out.println("-----------------------------");

        /*bài 1*/

        String chuoi = "You only live once, but if you do it right, once is enough";
        char kyTu = 'o';
        int count = 0;


        // duyệt từ đầu đến cuối chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
//            for (int i = 0; i < chuoi.length(); i++) {
//
//                if (chuoi.charAt(i) == kyTu) {
//                    System.out.println("Vị Trí " + kyTu + " trong chuỗi :" + i);
//
//                }
            }

            System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                    " trong chuỗi " + chuoi + " = " + count);


        }


}



