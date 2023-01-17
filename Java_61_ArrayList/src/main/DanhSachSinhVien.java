package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}
	
	// them sinh vien
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}
	
	// in danh sach sinh vien
	public void inDanhSinhVien() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}
	
	// kiểm tra danh sách sinh viên rỗng hay 
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}
	
	// lấy ra số lượng sinh viên
	public int laySoLuongSinhVien() {
		return this.danhSach.size();
	}
	
	// làm rỗng danh sách
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}
	
	// kiểm tra sinh viên có trong danh sách
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}
	
	// xóa sinh viên
	public void xoaSinhVien(SinhVien sv) {
		this.danhSach.remove(sv);
	}
	
	// tìm kiếm sinh viên dựa trên tên sinh viên
	public void timSinhVien(String name) {
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoVaTen().indexOf(name) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}
	
	// xuất ra danh sách sinh viên giảm dần theo điểm trung bình
	public void xapSepSinhVienGiamDan() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
					return 1;
				} else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
					return -1;
				} else {
					return 0;
				}
			}
			
		});
	}
	
}
