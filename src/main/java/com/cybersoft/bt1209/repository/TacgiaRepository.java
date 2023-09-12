package com.cybersoft.bt1209.repository;

import com.cybersoft.bt1209.entity.TacgiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacgiaRepository extends JpaRepository<TacgiaEntity, Integer> {
}
