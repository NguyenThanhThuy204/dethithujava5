package com.example.demo.entity.phong;

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
@Table(name = "loai_phong")
@Entity
public class LoaiPhong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "don_gia_qua_dem")
    private BigDecimal dgqd;

    @Column(name = "don_gia_theo_gio")
    private BigDecimal dgtg;

    @Column(name = "ho_ten_nguoi_dai_dien")
    private String hoten;

    @Column(name = "don_gia_qua_gio")
    private BigDecimal dgqg;

    @Column(name = "ghi_chu")
    private String ghichu;

    @Column(name = "so_nguoi")
    private String songuoi;

    @Column(name = "ten_loai_phong")
    private String tenlp;

    @Column(name = "trang_thai")
    private String trangthai;


}
