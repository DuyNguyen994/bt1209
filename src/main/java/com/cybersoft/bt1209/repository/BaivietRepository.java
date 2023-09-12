package com.cybersoft.bt1209.repository;

import com.cybersoft.bt1209.entity.BaivietEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface BaivietRepository extends JpaRepository<BaivietEntity, Integer> {



}

