package com.example.demo.entity.phong;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "phong")
@Entity
public class Phong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "id_co_so")
    private Integer idcs;
    @NotNull
    @Column(name = "id_lau")
    private Integer idlau;

    @ManyToOne
    @JoinColumn(name = "id_loai_phong", referencedColumnName = "id")
    private LoaiPhong lp;
    @NotBlank
    @Column(name = "ghi_chu")
    private String ghichu;
    @NotBlank
    @Column(name = "so_luong_phong")
    private String slp;
    @NotBlank
    @Column(name = "ten_phong")
    private String tenp;
    @NotBlank
    @Column(name = "trang_thai")
    private String trangThai;

}
