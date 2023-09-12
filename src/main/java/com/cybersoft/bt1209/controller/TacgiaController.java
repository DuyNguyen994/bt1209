package com.cybersoft.bt1209.controller;

import com.cybersoft.bt1209.entity.BaivietEntity;
import com.cybersoft.bt1209.entity.TacgiaEntity;
import com.cybersoft.bt1209.repository.TacgiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tacgia")
public class TacgiaController {
    @Autowired
    TacgiaRepository tacgiaRepository;
    @GetMapping("")
    public ResponseEntity<?> getTacgia(){
        List<TacgiaEntity> listTacgia = tacgiaRepository.findAll();
        
        return new ResponseEntity<>(listTacgia, HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> addTacgia(){
        TacgiaEntity tacgiaEntity = new TacgiaEntity();
        tacgiaEntity.setTentacgia("D Tring");
        tacgiaEntity.setHoten("Trịnh Văn D");
        tacgiaEntity.setGioitinh("Nữ");
        tacgiaRepository.save(tacgiaEntity);

        return new ResponseEntity<>("đã thêm",HttpStatus.OK);
    }
    @DeleteMapping("")
    public ResponseEntity<?> delTacgia(@RequestParam int id){

        tacgiaRepository.deleteById(id);

        return new ResponseEntity<>("xóa thành công",HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<?> updateTacgia(){
        TacgiaEntity tacgiaEntity = new TacgiaEntity();
        tacgiaEntity.setId(2);
        tacgiaEntity.setGioitinh("Nu");
        tacgiaRepository.save(tacgiaEntity);
        return new ResponseEntity<>("update thanh cong",HttpStatus.OK);
    }

}
