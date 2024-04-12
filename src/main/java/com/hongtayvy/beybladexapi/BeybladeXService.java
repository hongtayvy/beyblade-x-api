package com.hongtayvy.beybladexapi;

import com.hongtayvy.beybladexapi.dto.PartDTO;
import com.hongtayvy.beybladexapi.entity.PartEntity;
import com.hongtayvy.beybladexapi.mapper.BeybladeXMapper;
import com.hongtayvy.beybladexapi.model.Part;
import com.hongtayvy.beybladexapi.model.PartType;
import com.hongtayvy.beybladexapi.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BeybladeXService {
    @Autowired
    PartRepository partRepository;

    private final BeybladeXMapper beybladeXMapper = new BeybladeXMapper();

    public Mono<PartDTO> getPartType(PartType partType){
        PartEntity partEntity = partRepository.findByPartType(partType.getPartType());
        Part part = beybladeXMapper.toPart(partEntity);
        PartDTO partDTO = beybladeXMapper.toPartDTO(part);
        return Mono.just(partDTO);
    }
}
