package com.example.demo.repository.datphong;

import com.example.demo.entity.datphong.DatPhong;
import com.example.demo.entity.datphong.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
    @Query("from KhachHang where makh like %:keyword%")
    List<KhachHang> findByKeyword(@Param("keyword") String keyword);
}
