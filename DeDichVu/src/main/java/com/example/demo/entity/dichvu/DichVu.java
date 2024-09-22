package com.example.demo.entity.dichvu;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "dich_vu")
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "don_gia")
    private BigDecimal donGia;

    @ManyToOne
    @JoinColumn(name = "id_loai_dich_vu", referencedColumnName = "id")
    private LoaiDichVu loaiDichVu;

    @Column(name = "don_vi_tien")
    private String donViTien;

    @Column(name = "don_vi_tinh")
    private String donViTinh;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "ten_dich_vu")
    private String tenDichVu;

    @Column(name = "trang_thai")
    private String trangThai;
}
