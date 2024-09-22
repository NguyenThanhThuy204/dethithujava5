package com.example.demo.entity.datphong;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Remove;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "dat_phong")
public class DatPhong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @NotBlank
    @Column(name = "ghi_chu")
    private String gc;
    @NotBlank
    @Column(name = "ma_dat_phong")
    private String mdp;

    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "ngay_gio_dat")
    private Date ngd;
    @NotNull
    @Column(name = "so_luong_khach")
    private Integer slk;
    @NotNull
    @Column(name = "so_luong_phong_dat")
    private Integer slp;
    @NotNull
    @Column(name = "thoi_gian_luu_tru")
    private Integer tglt;
    @NotBlank
    @Column(name = "trang_thai")
    private String trangThai;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang", referencedColumnName = "id")
    private KhachHang kh;
    @NotNull
    @Column(name = "id_loai_phong")
    private Integer idlp;


}
