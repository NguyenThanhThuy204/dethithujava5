package com.example.demo.repository.dichvu1;

import com.example.demo.entity.dichvu1.LoaiDichVu1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiDichVu1Repository extends JpaRepository<LoaiDichVu1, Integer> {
}
