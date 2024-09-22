package com.example.demo.entity.dichvu;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "loai_dich_vu")
public class LoaiDichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "ten_loai_dich_vu")
    private String tenLoaiDichVu;

    @Column(name = "trang_thai")
    private String trangThai;

}
