package BTcuoikhoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		CongTy cty = new CongTy();

		cty.setListNhanVien(nhanSuBanDau());

		String dieuhuong;
		do {
			System.out.println("==> Menu chọn các chức năng sau: \n" + "1. Nhập thông tin công ty\n"
					+ "2. Phân bổ nhân viên vào trưởng phòng\n"
					+ "3. Thêm, xóa thông tin một nhân sự (Có thể là nhân viên, trưởng phòng hoặc giám đốc). Lưu ý, khi xóa trưởng phòng phải ngắt liên kết với các nhân viên đang tham chiếu tới\n"
					+ "4. Xuất ra thông tin toàn bộ người trong công ty\n" + "5. Tính và xuất tổng lương toàn công ty\n"
					+ "6. Tìm nhân viên thường có lương cao nhất\n"
					+ "7. Tìm trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất\n"
					+ "8. Sắp xếp nhân viên toàn công ty theo thứ tự abc\n"
					+ "9. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần\n"
					+ "10. Tìm giám đốc có số lượng cổ phần nhiều nhất\n"
					+ "11. Tính và xuất tổng thu nhập của từng giám đốc\n");

			int opt = Integer.parseInt(sc.nextLine());

			switch (opt) {
			case 1:
				cty.nhapThongTin();
				break;
			case 2:
				cty.phanBoNVvaoTP();
				break;
			case 3:
				cty.themXoaNhanSu();
				break;
			case 4:
				cty.xuatThongTinToanNhanVien();
				break;
			case 5:
				double tongLuongCty = cty.tongLuongToanCongTy();
				System.out.println("Tổng lương toàn công ty: " + tongLuongCty + " USD");
				break;
			case 6:
				cty.nhanVienThuongLuongCaoNhat();
				break;
			case 7:
				cty.truongPhongCoCapDuoiNhat();
				break;
			case 8:
				cty.sapXepTenNhanVienTheoABC();
				break;
			case 9:
				cty.sapXepNhanVienThuTuLuongGiamDan();
				break;
			case 10:
				cty.giamDocCoCoPhanNhieuNhat();
				break;
			case 11:
				cty.tongThuNhapTungGiamDoc();
				break;
			default:
				System.out.println("Lựa chọn của bạn không có trong menu danh sách.");
				break;
			}
			System.out.println("Nhập 0 để quay lại menu, nhập 00 để dừng chương trình. ");
			dieuhuong = sc.nextLine();
			if (dieuhuong.equalsIgnoreCase("0") == false)
				System.out.println("Chương trình đã dừng lại.");
			return;
		} while (dieuhuong.equals("0"));

	}

	public static ArrayList<NhanVien> nhanSuBanDau() {
		ArrayList<NhanVien> listNhanvien = new ArrayList<NhanVien>();

		// Cty có 2 giám đốc, 3 trưởng phòng, 4 nhân viên
		NhanVien giamdoc1 = new GiamDoc("01", "Leehd", "0766906924", 20);
//		giamdoc1.coPhan = 10;
		listNhanvien.add(giamdoc1);
		NhanVien giamdoc2 = new GiamDoc("02", "LeeThong", "0766906924", 23);
//		giamdoc2.coPhan = (float) 11.5;
		listNhanvien.add(giamdoc2);

		NhanVien truongphong1 = new TruongPhong("001", "Lead1", "01237589", 26);
//		truongphong1.nhanVienCapDuoi = 1;
		listNhanvien.add(truongphong1);
		NhanVien truongphong2 = new TruongPhong("002", "Lead2", "01231239", 26);
		// truongphong2.nhanVienCapDuoi = 2;
		listNhanvien.add(truongphong2);
		NhanVien truongphong3 = new TruongPhong("003", "Lead3", "01235435", 26);
		listNhanvien.add(truongphong3);

		NhanVien nhanvien1 = new NhanVienThuong("0001", "Employee1", "0567392", 27);
		((NhanVienThuong) nhanvien1).maSepTruongPhong = "001";
		listNhanvien.add(nhanvien1);
		NhanVien nhanvien2 = new NhanVienThuong("0002", "Employee2", "0567234", 27);
		// nhanvien2.maSepTruongPhong = "002";
		listNhanvien.add(nhanvien2);
		NhanVien nhanvien3 = new NhanVienThuong("0003", "Employee3", "0567642", 27);
		((NhanVienThuong) nhanvien3).maSepTruongPhong = "002";
		listNhanvien.add(nhanvien3);
		NhanVien nhanvien4 = new NhanVienThuong("0004", "Employee4", "0567864", 27);
		listNhanvien.add(nhanvien4);

		return listNhanvien;
	}
}
