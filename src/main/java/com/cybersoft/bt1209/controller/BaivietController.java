package com.cybersoft.bt1209.controller;

import com.cybersoft.bt1209.entity.BaivietEntity;
import com.cybersoft.bt1209.entity.TacgiaEntity;
import com.cybersoft.bt1209.repository.BaivietRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/baiviet")
public class BaivietController {
    @Autowired
    BaivietRepository baivietRepository;
    @GetMapping("")
    public ResponseEntity<?> getBaiviet(){
        List<BaivietEntity> listBaiViet = baivietRepository.findAll();
        return new ResponseEntity<>(listBaiViet, HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> addBaiviet(){
        BaivietEntity baivietEntity = new BaivietEntity();
        baivietEntity.setTieude("Khoa Học");
        baivietEntity.setNoidung("động vật hoang dã");
        baivietEntity.setIdTacgia(1);
        baivietRepository.save(baivietEntity);

        return new ResponseEntity<>("đã thêm",HttpStatus.OK);
    }
    @DeleteMapping("")
    public ResponseEntity<?> delBaiviet(@RequestParam int id){
        baivietRepository.deleteById(id);

        return new ResponseEntity<>("xóa thành công",HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<?> updateBaiViet(){
        BaivietEntity baivietEntity = new BaivietEntity();
        baivietEntity.setTieude("Nau an");
        baivietEntity.setId(6);baivietEntity.setNoidung("Com gao luc");
        baivietEntity.setIdTacgia(3);
        baivietRepository.save(baivietEntity);

        return new ResponseEntity<>("update thanh cong",HttpStatus.OK);
    }
}
