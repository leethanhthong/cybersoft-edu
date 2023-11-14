package BTcuoikhoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CongTy implements TinhNang {
	private String tenCty;
	private String maSoThue;
	private double doanhThuThang;
	private ArrayList<NhanVien> listNhanVien;

	public CongTy() {
	};

// Menu: 1
	public void nhapThongTin() {
		System.out.println("Nhập vào tên công ty của bạn: ");
		tenCty = sc.nextLine();
		while (tenCty.isEmpty()) {
			System.out.println("Tên công ty không được để trống, mời nhập lại: ");
			tenCty = sc.nextLine();
		}
		System.out.println("Mã số thuế: ");
		maSoThue = sc.nextLine();
		System.out.println("Doanh thu tháng: ");
		doanhThuThang = Double.parseDouble(sc.nextLine());
		while (doanhThuThang < 0) {
			System.out.println("Doanh thu tháng phải >= 0, vui lòng nhập lại: ");
			doanhThuThang = Double.parseDouble(sc.nextLine());
		}
		sc.close();
	}

	public void setListNhanVien(ArrayList<NhanVien> listNhanVien) {
		this.listNhanVien = listNhanVien;
	}

	private void dsNhanVienChuaCoTP() {
		System.out.println("Danh sách nhân viên thường chưa có trưởng phòng: ");
		System.out.printf("%-10s | %-20s | %-10s | %-10s\n", "Mã số", "Họ Tên", "SDT", "Mã sếp trưởng phòng");
		for (NhanVien nv : listNhanVien) {
			if (nv instanceof NhanVienThuong && ((NhanVienThuong) nv).maSepTruongPhong == null) {
				System.out.printf("%-10s | %-20s | %-10s | %-10s\n", nv.getMaSo(), nv.getHoTen(), nv.getSdt(),
						((NhanVienThuong) nv).maSepTruongPhong);
			}
		}
	}

// Menu 2:
	public void phanBoNVvaoTP() {
		dsNhanVienChuaCoTP();
		System.out.println("Nhập vào mã nhân viên thường cần phân bổ: ");
		String nvThuongPhanBo;
		NhanVienThuong nvThuongTimDuoc;
		do {
			nvThuongPhanBo = sc.nextLine();
			nvThuongTimDuoc = (NhanVienThuong) timNhanVienThuong(nvThuongPhanBo);
			if (nvThuongTimDuoc == null)
				System.out.println("Không tìm thấy nhân viên thường có mã là: " + nvThuongPhanBo);
			else if (nvThuongTimDuoc.maSepTruongPhong != null)
				System.out.println("Nhân viên thường này đã có trưởng phòng. ");
			else
				break;
			System.out.println("Vui lòng nhập lại: ");
		} while (true);
		dsTruongPhong();
		System.out.println("Nhập mã trưởng phòng tiếp nhận: ");
		String matptiepnhan;
		TruongPhong tpTimDuoc;
		do {
			matptiepnhan = sc.nextLine();
			tpTimDuoc = (TruongPhong) timTruongPhong(matptiepnhan);
			if (tpTimDuoc == null)
				System.out.println("Không tìm thấy trưởng phòng có mã là: " + matptiepnhan);
			else
				break;
			System.out.println("Vui lòng nhập lại: ");
		} while (true);
		nvThuongTimDuoc.setMaSepTruongPhong(matptiepnhan);
		tpTimDuoc.tiepNhanNhanVien(nvThuongTimDuoc);
	}

	private NhanVien timNhanVienThuong(String maNV) {
		for (NhanVien nv : listNhanVien) {
			if (nv instanceof NhanVienThuong && nv.getMaSo().equalsIgnoreCase(maNV))
				return nv;
		}
		return null;
	}

	private void dsTruongPhong() {
		System.out.println("Danh sách trưởng phòng: ");
		System.out.printf("%-10s | %-20s | %-10s\n", "Mã số", "Họ Tên", "Sđt");
		for (NhanVien nv : listNhanVien)
			if (nv instanceof TruongPhong)
				System.out.printf("%-10s | %-20s | %-10s\n", nv.getMaSo(), nv.getHoTen(), nv.getSdt());
	}

	private NhanVien timTruongPhong(String maTP) {
		for (NhanVien tp : listNhanVien) {
			if (tp instanceof TruongPhong && tp.getMaSo().equalsIgnoreCase(maTP))
				return tp;
		}
		return null;
	}

	// Menu 3:
	public void themXoaNhanSu() {
		System.out.println("Nhập T để thêm nhân sự, nhập X để xóa nhân sự: ");
		String optThemXoa = sc.nextLine().toUpperCase();
		while (true) {
			if (optThemXoa.equals("T") || optThemXoa.equals("X"))
				break;
			else
				System.out.println("Vui lòng nhập lại, nhập T hoặc X: ");
			optThemXoa = sc.nextLine().toUpperCase();
		}
		switch (optThemXoa) {
		case "T":
			NhanVien nhansuthem;
			int optThem;
			System.out.println("Lựa chọn loại nhân viên cần thêm: \n" + "1. Nhân viên thường\n" + "2. Trưởng phòng\n"
					+ "3. Giám Đốc");
			optThem = Integer.parseInt(sc.nextLine());
			while (optThem < 1 || optThem > 3) {
				System.out.println("Vui lòng chọn lại: ");
				optThem = Integer.parseInt(sc.nextLine());
			}
			switch (optThem) {
			case 1:
				nhansuthem = new NhanVienThuong();
				((NhanVienThuong) nhansuthem).nhapThongTin();
				while (ktnvTonTai(nhansuthem)) {
					System.out.println("Nhân viên có mã " + nhansuthem.getMaSo() + " đã tồn tại, vui lòng nhập lại: .");
					((NhanVienThuong) nhansuthem).nhapThongTin();
				}
				listNhanVien.add(nhansuthem);
				break;
			case 2:
				nhansuthem = new TruongPhong();
				((TruongPhong) nhansuthem).nhapThongTin();
				while (ktnvTonTai(nhansuthem)) {
					System.out.println("Nhân viên có mã " + nhansuthem.getMaSo() + " đã tồn tại, vui lòng nhập lại: .");
					((TruongPhong) nhansuthem).nhapThongTin();
				}
				listNhanVien.add(nhansuthem);
				break;
			case 3:
				nhansuthem = new GiamDoc();
				((GiamDoc) nhansuthem).nhapThongTin();
				while (ktnvTonTai(nhansuthem)) {
					System.out.println("Nhân viên có mã " + nhansuthem.getMaSo() + " đã tồn tại, vui lòng nhập lại: .");
					((GiamDoc) nhansuthem).nhapThongTin();
				}
				listNhanVien.add(nhansuthem);
				break;
			}
			break;

		case "X":
			NhanVien nhansuxoa;
			int optXoa;
			System.out.println("Lựa chọn loại nhân viên cần xóa: \n" + "1. Nhân viên thường\n" + "2. Trưởng phòng\n"
					+ "3. Giám Đốc");
			optXoa = Integer.parseInt(sc.nextLine());
			while (optXoa < 1 || optXoa > 3) {
				System.out.println("Vui lòng chọn lại: ");
				optXoa = Integer.parseInt(sc.nextLine());
			}
			switch (optXoa) {
			case 1:
				nhansuxoa = new NhanVienThuong();
				System.out.println("Nhập mã số nhân viên thường cần xóa: ");
				((NhanVienThuong) nhansuxoa).maSo = sc.nextLine();
				while (ktnvTonTai(nhansuxoa) == false) {
					System.out
							.println("Nhân viên có mã " + nhansuxoa.getMaSo() + " không tồn tại, vui lòng nhập lại: .");
					((NhanVienThuong) nhansuxoa).maSo = sc.nextLine();
				}
				xoaNhanVienThuong((NhanVienThuong) nhansuxoa);

				break;
			case 2:
				nhansuxoa = new TruongPhong();
				System.out.println("Nhập mã số trưởng phòng cần xóa: ");
				((TruongPhong) nhansuxoa).maSo = sc.nextLine();
				while (ktnvTonTai(nhansuxoa) == false) {
					System.out.println(
							"Trưởng phòng có mã " + nhansuxoa.getMaSo() + " không tồn tại, vui lòng nhập lại: .");
					((TruongPhong) nhansuxoa).maSo = sc.nextLine();
				}
				xoaTP((TruongPhong) nhansuxoa);

				break;
			case 3:
				nhansuxoa = new GiamDoc();
				System.out.println("Nhập mã số giám đốc cần xóa: ");
				((GiamDoc) nhansuxoa).maSo = sc.nextLine();
				while (ktnvTonTai(nhansuxoa) == false) {
					System.out
							.println("Giám đốc có mã " + nhansuxoa.getMaSo() + " không tồn tại, vui lòng nhập lại: .");
					((GiamDoc) nhansuxoa).maSo = sc.nextLine();
				}
				listNhanVien.remove(nhansuxoa);
				
				break;

			}
		}
	}

	private boolean ktnvTonTai(NhanVien nvKiemTra) {
		for (NhanVien nv : listNhanVien) {
			if (nv.getMaSo().equalsIgnoreCase(nvKiemTra.getMaSo()))
				return true;
		}

		return false;
	}

	private void xoaNhanVienThuong(NhanVienThuong nvThuong) {
		if (nvThuong.getMaSepTruongPhong() != null) {
			TruongPhong sepTP = (TruongPhong) timTruongPhong(nvThuong.getMaSepTruongPhong());
			if (sepTP != null)
				sepTP.loaiBoNhanVien(nvThuong);
		}
		listNhanVien.remove(nvThuong);
	}

	private void xoaTP(TruongPhong tp) {
		for (NhanVien nv : listNhanVien)
			if (nv instanceof NhanVienThuong && ((NhanVienThuong) nv).getMaSepTruongPhong() != null
					&& ((NhanVienThuong) nv).getMaSepTruongPhong().equalsIgnoreCase(tp.getMaSo()))
				((NhanVienThuong) nv).setMaSepTruongPhong(null);
		;
		listNhanVien.remove(tp);
	}
	
	//Menu 4:
	 public void xuatThongTinToanNhanVien() {
	        System.out.printf("%-10s | %-20s | %-10s | %-10s | %-10s | %-10s\n", "Mã số", "Họ Tên", "Sđt", "Số ngày", "Lương ngày", "Lương tháng");
	        for (NhanVien nv: listNhanVien) {
	            nv.xuatThongTinNhanVien();;
	        }
	    }
	
	 //Menu 5:
	 public double tongLuongToanCongTy() {
	        double tongLuongCty = 0;
	        for (NhanVien nv: listNhanVien)
	            tongLuongCty += nv.tinhLuong();
	        return tongLuongCty;
	    }
	 
	 //Menu 6:
	 public void nhanVienThuongLuongCaoNhat() {
	        System.out.printf("%-10s | %-20s | %-10s | %-10s | %-10s | %-10s\n", "Mã số", "Họ tên", "Sđt", "Số Ngày", "Luong ngày", "Lương tháng");
	        for (NhanVien nv: listNhanVien)
	            if(nv instanceof NhanVienThuong && ((NhanVienThuong)nv).tinhLuong() == luongNhanVienThuongCaoNhat())
	                nv.xuatThongTinNhanVien();;
	        System.out.println("Nhan vien thuong co luong cao nhat la:" + luongNhanVienThuongCaoNhat());
	    }

	    private Double luongNhanVienThuongCaoNhat() {
	        double luongnvtCaoNhat = 0;
	        for (NhanVien nv: listNhanVien)
	            if(nv instanceof NhanVienThuong && ((NhanVienThuong)nv).tinhLuong() > luongnvtCaoNhat)
	            	luongnvtCaoNhat = nv.tinhLuong();
	        return luongnvtCaoNhat;
	    }
	    
	    //Menu 7:
	    public void truongPhongCoCapDuoiNhat() {
	        System.out.printf("%-10s | %-20s | %-10s | %-10s | %-10s | %-10s\n", "Mã số", "Họ tên", "Sđt", "Số Ngày", "Luong ngày", "Lương tháng");
	        for (NhanVien nv: listNhanVien)
	            if(nv instanceof TruongPhong && ((TruongPhong)nv).nhanVienCapDuoi == nhanVienCapDuoiNhieuNhat())
	                nv.xuatThongTinNhanVien();
	        System.out.println("So luong nhan vien duoi quyen nhieu nhat la: " + nhanVienCapDuoiNhieuNhat());
	    }

	    private int nhanVienCapDuoiNhieuNhat() {
	        int capDuoiNhieuNhat = 0;
	        for (NhanVien nv: listNhanVien)
	            if(nv instanceof TruongPhong && ((TruongPhong) nv).nhanVienCapDuoi > capDuoiNhieuNhat)
	            	capDuoiNhieuNhat = ((TruongPhong) nv).nhanVienCapDuoi;
	        return capDuoiNhieuNhat;
	    }
	    
	    //Menu 8:
	    public void sapXepTenNhanVienTheoABC() {
	        Collections.sort(listNhanVien, (nv1, nv2) -> nv1.tenNhanVien().compareTo(nv2.tenNhanVien()));
	        xuatThongTinToanNhanVien();
	    }
	
	    //Menu 9 :
	    public void sapXepNhanVienThuTuLuongGiamDan() {
	        Collections.sort(listNhanVien, (nv1, nv2) -> (int) (nv2.tinhLuong() - nv1.tinhLuong()));
	        xuatThongTinToanNhanVien();
	    }
	    
	    //Menu 10:
	    public void giamDocCoCoPhanNhieuNhat() {
	        System.out.printf("%-10s | %-20s | %-10s | %-10s | %-10s | %-10s\n", "Mã số", "Họ tên", "Sđt", "Số Ngày", "Luong ngày", "Lương tháng");
	        for (NhanVien nv: listNhanVien)
	            if(nv instanceof GiamDoc && ((GiamDoc)nv).coPhan == phanTramCoPhanNhieuNhat())
	                nv.xuatThongTinNhanVien();
	        System.out.println("Phan tram co phan nhieu nhat la " + phanTramCoPhanNhieuNhat());
	    }

	    private float phanTramCoPhanNhieuNhat() {
	        float ptcpNhieuNhat = 0;
	        for (NhanVien nv: listNhanVien)
	            if(nv instanceof GiamDoc && ((GiamDoc) nv).coPhan > ptcpNhieuNhat)
	                ptcpNhieuNhat = ((GiamDoc) nv).coPhan;
	        return ptcpNhieuNhat;
	    }
	
	    //Menu 11:
	    public void tongThuNhapTungGiamDoc() {
	        System.out.printf("%-10s | %-20s | %-10s | %-10s\n", "Mã số", "Họ tên", "Sđt", "Thu nhập");
	        for (NhanVien nv: listNhanVien) {
	            if(nv instanceof GiamDoc) {
	                System.out.printf("%-10s | %-20s | %-10s | %-10.2f\n", nv.getMaSo(), nv.getHoTen(), nv.getSdt(), nv.tinhLuong() + ((GiamDoc) nv).coPhan/100*LoiNhuanCongTy());
	            }
	        }
	    }

	    private double LoiNhuanCongTy() {
	        return this.doanhThuThang - tongLuongToanCongTy();
	    }
	
	
	
	
	
	
	
	
	
	
	
	
}
