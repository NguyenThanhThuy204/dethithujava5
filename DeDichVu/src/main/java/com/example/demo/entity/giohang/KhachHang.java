package com.example.demo.entity.giohang;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "khach_hang")
@Entity
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "gioi_tinh")
    private Integer gioitinh;

    @Column(name = "cccd")
    private String cccd;

    @Column(name = "dia_chi")
    private String diachi;

    @Column(name = "email")
    private String email;

    @Column(name = "ma_khach_hang")
    private String makh;

    @Column(name = "quoc_tinh")
    private String qt;

    @Column(name = "so_dien_thoai")
    private String sdt;

    @Column(name = "ten_khach_hang")
    private String tenkh;

    @Column(name = "trang_thai")
    private String trangThai;


}
