package com.example.demo.controller.nace;

import com.example.demo.entity.nace.Nace;
import com.example.demo.service.nace.NaceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nace")
public class NaceController {

    @Autowired
    NaceServiceImpl naceService;

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Nace>> findAll() {
        List<Nace> naceRecords = naceService.findAll();
        return ResponseEntity.ok(naceRecords);
    }


    @GetMapping(path = "/{order}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Nace>> getNaceDetails(@PathVariable long order) {
        Optional<Nace> naceRecord = naceService.findByOrder(order);
        if (naceRecord.isPresent()){
            return ResponseEntity.ok(naceRecord);
        }
//        return ResponseEntity.ok("No record found for given order");
        return ResponseEntity.ok(Optional.empty());
    }

    @PostMapping
    public ResponseEntity<Nace> saveNaceDetails( @RequestBody Nace nace) {
        Nace naceRecord = naceService.saveNaceDetails(nace);
        return ResponseEntity.ok(naceRecord);
    }


}
