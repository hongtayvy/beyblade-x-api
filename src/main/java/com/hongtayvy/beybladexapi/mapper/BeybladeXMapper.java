package com.hongtayvy.beybladexapi.mapper;

import com.hongtayvy.beybladexapi.dto.PartDTO;
import com.hongtayvy.beybladexapi.entity.PartEntity;
import com.hongtayvy.beybladexapi.model.Part;

public class BeybladeXMapper {
    public Part toPart(PartEntity partEntity){
        return new Part(
                partEntity.getName(),
                partEntity.getPartType(),
                partEntity.getBrand(),
                partEntity.getType(),
                partEntity.getSpin(),
                partEntity.getAttack(),
                partEntity.getDefense(),
                partEntity.getStamina(),
                partEntity.getEndurance(),
                partEntity.getDash(),
                partEntity.getBurstResistance(),
                partEntity.getWeight(),
                partEntity.getHeight(),
                partEntity.getWidth()
        );
    }
    
    public PartDTO toPartDTO(Part part){
        return new PartDTO(
                part.getName(),
                part.getPartType(),
                part.getBrand(),
                part.getType(),
                part.getSpin(),
                part.getAttack(),
                part.getDefense(),
                part.getStamina(),
                part.getEndurance(),
                part.getDash(),
                part.getBurstResistance(),
                part.getWeight(),
                part.getHeight(),
                part.getWidth()
        );
    }
}
