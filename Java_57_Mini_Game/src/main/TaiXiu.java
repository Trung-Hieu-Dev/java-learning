package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Người chơi đặt cước số tiền ít hơn hoặc bằng số tiền đang có
 * 
 * Luật chơi: 
 * 3 viên xúc xắc, mỗi viên có 6 mặt có giá trị từ 1-6. 
 * Mỗi lần lắc cho ra 1 kết quả
 * Tình huống 1: nếu tổng = 3 || tổng = 18 	-> Cái ăn hết 
 * Tình huống 2: nếu tổng = 1 - 10 			-> xỉu
 * Tình huống 3: nếu tổng > 10 				-> tài */

public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000000;
		
		Scanner sc = new Scanner(System.in);
		
		//format number
		Locale lc = new Locale("vi", "VN");
		NumberFormat numf = NumberFormat.getInstance(lc);
		
		int luaChon = 1;
		do {
			System.out.println("------------------- Mời Bạn Lựa Chọn --------------");
			System.out.println("Chọn 1 để tiếp tục chơi.");
			System.out.println("Chọn phím bất kỳ để thoát.");
			luaChon = sc.nextInt();
			
			if (luaChon == 1) {
				System.out.println("*** Bắt đầu chơi: ");
				System.out.println("****** Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi) + " Bạn muốn cược bao nhiêu?");
				
				// đặt cược
				double datCuoc = 0;
				do {
					System.out.println("****** Đặt cược (0 < số tiền cược < " + numf.format(taiKhoanNguoiChoi) + " )");
					datCuoc = sc.nextDouble();
				} while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);
				
				//Chọn tài | xỉu
				int luaChonTaiXiu = 0;
				do {
					System.out.println("****** Chọn 1 <-> tài. Chọn 2 <-> xỉu ");
					luaChonTaiXiu = sc.nextInt();
				} while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
				
				// tung xúc xắc
				Random xucxac1 = new Random();
				Random xucxac2 = new Random();
				Random xucxac3 = new Random();
				
				int giaTri1 = xucxac1.nextInt(5) + 1;
				int giaTri2 = xucxac2.nextInt(5) + 1;
				int giaTri3 = xucxac3.nextInt(5) + 1;
				
				int tong = giaTri1 + giaTri2 + giaTri3;
				// tính toán kết quả
				System.out.println("****** Kết quả: " + giaTri1 + " - " + giaTri2 + " - "  + giaTri3);
				
				if (tong == 3 || tong == 18) {
					System.out.println("****** Tổng là: " + tong + " Nhà cái ăn hết! Bạn đã thua");
					taiKhoanNguoiChoi -= datCuoc;
					System.out.println("****** Tài khoản của bạn là " + numf.format(taiKhoanNguoiChoi));
				} else if (tong >= 4 && tong <= 10) {
					System.out.println("****** Tổng là " + tong + " -> Xỉu");
					
					if(luaChon == 2) {
						System.out.println("****** Bạn đã thắng cược");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("****** Tài khoản của bạn là " + numf.format(taiKhoanNguoiChoi));
					} else {
						System.out.println("****** Bạn đã thua cược");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("****** Tài khoản của bạn là " + numf.format(taiKhoanNguoiChoi));
					}
				} else {
					if(luaChon == 1) {
						System.out.println("****** Bạn đã thắng cược");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("****** Tài khoản của bạn là " + numf.format(taiKhoanNguoiChoi));
					} else {
						System.out.println("****** Bạn đã thua cược");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("****** Tài khoản của bạn là " + numf.format(taiKhoanNguoiChoi));
					}
				}
			}
			
		} while (luaChon == 1);
	}
}
