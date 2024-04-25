package com.hongtayvy.beybladexapi;

import com.hongtayvy.beybladexapi.dto.PartDTO;
import com.hongtayvy.beybladexapi.entity.PartEntity;
import com.hongtayvy.beybladexapi.exception.BeybladeXExceptionEnum;
import com.hongtayvy.beybladexapi.exception.BeybladeXNotFoundException;
import com.hongtayvy.beybladexapi.mapper.BeybladeXMapper;
import com.hongtayvy.beybladexapi.model.Part;
import com.hongtayvy.beybladexapi.model.PartType;
import com.hongtayvy.beybladexapi.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BeybladeXService {
    private final PartRepository partRepository;

    @Autowired
    public BeybladeXService(PartRepository partRepository){
        this.partRepository = partRepository;
    }

    private final BeybladeXMapper beybladeXMapper = new BeybladeXMapper();

    public PartDTO getPartType(PartType partType){
        PartEntity partEntity = partRepository.findByPartType(partType.getPartType());
        if(partEntity != null){
            return beybladeXMapper.toPartDTO(
                    beybladeXMapper.toPart(partEntity)
            );
        } else {
            throw new BeybladeXNotFoundException(BeybladeXExceptionEnum.DATABASE_NOT_FOUND.getErrorMessage());
        }

    }
}
