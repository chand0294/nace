package com.example.demo.respository.nace;

import com.example.demo.entity.nace.Nace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaceRepository extends JpaRepository<Nace,Long> {
}
