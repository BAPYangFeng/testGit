package main;
import entity.*;
import enums.codex;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		SinhVienKhoaTuNhien sv1 = new SinhVienKhoaTuNhien("Thanh", "Khoa tu nhien", 9.0 , 6.0, 8.0);
		SinhVienKhoaTuNhien sv2 = new SinhVienKhoaTuNhien("Khanh", "Khoa tu nhien", 3.0 , 5.9, 1.7);
		SinhVienKhoaTuNhien sv3 = new SinhVienKhoaTuNhien("Dat", "Khoa tu nhien", 7.3 , 7.9, 6.7);
		SinhVienKhoaXaHoi sv4 = new SinhVienKhoaXaHoi("Tuan", "Khoa xa hoi", 7.8 , 6.9 , 9.4);
		SinhVienKhoaXaHoi sv5 = new SinhVienKhoaXaHoi("Thai", "Khoa xa hoi", 4.8 , 2.7 , 3.6);
		
		ArrayList<SinhVien> listSinhVien = new ArrayList<>();
		listSinhVien.add(sv1);
		listSinhVien.add(sv2);
		listSinhVien.add(sv3);
		listSinhVien.add(sv4);
		listSinhVien.add(sv5);
		System.out.print(">>  " + codex.soPI.getcode());
	}	
}












