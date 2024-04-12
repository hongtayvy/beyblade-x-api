package com.hongtayvy.beybladexapi.repository;

import com.hongtayvy.beybladexapi.entity.PartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartRepository extends JpaRepository<PartEntity, Integer> {
    PartEntity findByPartType(String partType);
}
