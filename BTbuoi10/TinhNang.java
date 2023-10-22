package BTbuoi10;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public interface TinhNang {
	Scanner sc = new Scanner(System.in);
	void napTien();
	void rutTien();
	void daoHan();
	

	// tạo 1 NumberFormat để định dạng tiền tệ theo tiêu chuẩn của Việt Nam
    // đơn vị tiền tệ của Việt Nam là đồng
    Locale localeVN = new Locale("vi", "VN");
    NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
   
    String dinhDangTienTe(double soTienTrongTK);
    
}
