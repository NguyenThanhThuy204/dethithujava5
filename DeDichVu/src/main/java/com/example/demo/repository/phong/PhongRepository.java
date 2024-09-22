package com.example.demo.repository.phong;

import com.example.demo.entity.phong.Phong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongRepository extends JpaRepository<Phong, Integer> {
    Page<Phong> findAllByTen(String tenSearch, Pageable pageable);

}
