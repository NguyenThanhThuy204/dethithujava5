package com.example.demo.repository.phong;

import com.example.demo.entity.phong.LoaiPhong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiPhongRepository extends JpaRepository<LoaiPhong, Integer> {
}
