package com.example.demo.entity.dichvu1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "dich_vu")
public class DichVu1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "don_gia")
    private BigDecimal dg;

    @ManyToOne
    @JoinColumn(name = "id_loai_dich_vu", referencedColumnName = "id")
    private LoaiDichVu1 ldv;

    @Column(name = "don_vi_tien")
    private String dvtien;

    @Column(name = "don_vi_tinh")
    private String dvtinh;

    @Column(name = "mo_ta")
    private String mt;

    @Column(name = "ten_dich_vu")
    private String tendv;

    @Column(name = "trang_thai")
    private String trangThai;


}
