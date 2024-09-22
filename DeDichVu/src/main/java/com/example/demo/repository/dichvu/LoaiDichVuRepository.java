package com.example.demo.repository.dichvu;

import com.example.demo.entity.dichvu.LoaiDichVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiDichVuRepository extends JpaRepository<LoaiDichVu, Integer> {
}
