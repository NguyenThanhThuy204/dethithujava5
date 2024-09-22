package com.example.demo.entity.giohang;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "hoa_don")
@Entity
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "coc_tien")
    private BigDecimal coctien;

    @Column(name = "giam_gia")
    private BigDecimal giamgia;

    @Column(name = "id_dat_phong")
    private Integer iddp;

    @Column(name = "id_giao_dich")
    private Integer idgd;

//    @Column(name = "id_khach_hang")
//    private Integer idkh;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang", referencedColumnName = "id")
    private KhachHang kh;

    @Column(name = "id_tai_khoan")
    private Integer idtk;

    @Column(name = "phu_thu")
    private BigDecimal phuthu;

    @Column(name = "thuevat")
    private BigDecimal thue;

    @Column(name = "tien_khach_dua")
    private BigDecimal tienkd;

    @Column(name = "tien_tra_lai")
    private BigDecimal tientl;

    @Column(name = "tong_tien")
    private BigDecimal tt;

    @Column(name = "ghi_chu")
    private String ghichu;

    @Column(name = "ma_hoa_don")
    private String mahd;

    @Column(name = "trang_thai")
    private String trangThai;
}
