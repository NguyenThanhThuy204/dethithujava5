package com.example.demo.repository.phong;

import com.example.demo.entity.phong.Phong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface PhongRepository extends JpaRepository<Phong, Integer> {
    //    @Query("from Phong where tenp like %:keyword%")
//    List<Phong> findByKeyword(@Param("keyword") String keyword);
    @Query("from Phong where tenp like %:keyword%")
    List<Phong> findByKeyword(@Param("keyword") String keyword);

}
