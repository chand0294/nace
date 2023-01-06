package com.example.demo.service.nace;

import com.example.demo.entity.nace.Nace;

import java.util.List;
import java.util.Optional;

public interface NaceService {

    List<Nace> findAll();

    Optional<Nace> findByOrder(Long order);
}
