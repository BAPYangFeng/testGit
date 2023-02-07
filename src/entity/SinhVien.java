package entity;

public abstract class SinhVien {
	public static String Truong = "JavaBasic";
	private String Ten;
	private String Khoa;
	private Double diemTB;
	
	
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getKhoa() {
		return Khoa;
	}
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}
	
	SinhVien(String Ten, String Khoa)
	{
		this.Ten = Ten;
		this.Khoa = Khoa;
	}
}
