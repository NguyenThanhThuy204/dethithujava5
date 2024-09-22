package com.example.demo.entity.phong;

import com.example.demo.entity.phong.LoaiPhong;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

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
    //    @NotNull(message = "khong duoc de trong idcs")
    @Column(name = "id_co_so")
    private Integer idcs;
    //    @NotNull(message = "khong duoc de trong idlau")
    @Column(name = "id_lau")
    private Integer idlau;

    @ManyToOne
    @JoinColumn(name = "id_loai_phong", referencedColumnName = "id")
    private LoaiPhong lp;
    //    @NotBlank(message = "khong duoc de trong ghi chu")
    @Column(name = "ghi_chu")
    private String ghichu;

    @Column(name = "so_luong_phong")
    private String soluong;

    @Column(name = "ten_phong")
    private String ten;

    @Column(name = "trang_thai")
    private String trangthai;


}
