package com.example.demo.repository.datphong;

import com.example.demo.entity.datphong.DatPhong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatPhongRepository extends JpaRepository<DatPhong, Integer> {
    //    @Query("from DatPhong where mdp like %:keyword%")
    @Query("from DatPhong where mdp like %:keyword%")
    List<DatPhong> findByKeyword(@Param("keyword") String keyword);
}
