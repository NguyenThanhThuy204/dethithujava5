package com.example.demo.entity.dichvu1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "loai_dich_vu")
public class LoaiDichVu1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "mo_ta")
    private String mota;

    @Column(name = "ten_loai_dich_vu")
    private String tenldv;

    @Column(name = "trang_thai")
    private String trangThai;
}
