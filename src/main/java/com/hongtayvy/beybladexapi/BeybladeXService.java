package com.hongtayvy.beybladexapi;

import com.hongtayvy.beybladexapi.model.Beyblade;
import com.hongtayvy.beybladexapi.model.Bit;
import com.hongtayvy.beybladexapi.model.Blade;
import com.hongtayvy.beybladexapi.model.Ratchet;
import com.hongtayvy.beybladexapi.repository.BeybladeRepository;
import com.hongtayvy.beybladexapi.repository.BitRepository;
import com.hongtayvy.beybladexapi.repository.BladeRepository;
import com.hongtayvy.beybladexapi.repository.RatchetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeybladeXService {
    private final BeybladeRepository beybladeRepo;
    private final BladeRepository bladeRepo;
    private final RatchetRepository ratchetRepo;
    private final BitRepository bitRepo;

    @Autowired
    public BeybladeXService(BeybladeRepository beybladeRepo, BladeRepository bladeRepo,
                            RatchetRepository ratchetRepo, BitRepository bitRepo){
        this.beybladeRepo = beybladeRepo;
        this.bladeRepo = bladeRepo;
        this.ratchetRepo = ratchetRepo;
        this.bitRepo = bitRepo;
    }

    public List<Beyblade> beybladeFindAll(){
        return beybladeRepo.findAll();
    }

    public ResponseEntity<Beyblade> beybladeFindById(Long id){
        return beybladeRepo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public List<Blade> bladeFindAll(){
        return bladeRepo.findAll();
    }

    public List<Ratchet> ratchetFindAll(){
        return ratchetRepo.findAll();
    }

    public List<Bit> bitFindAll(){
        return bitRepo.findAll();
    }



}
