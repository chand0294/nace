package com.example.demo.service.nace;

import com.example.demo.entity.nace.Nace;
import com.example.demo.respository.nace.NaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NaceServiceImpl implements NaceService{

    @Autowired
    NaceRepository naceRepository;

    @Override
    public List<Nace> findAll() {
        return naceRepository.findAll();
    }

    @Override
    public Optional<Nace> findByOrder(Long order) {
        return naceRepository.findById(order);
    }


}
