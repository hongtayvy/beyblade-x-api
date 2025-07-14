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
    private final BeybladeRepository beybladeRepository;
    private final BladeRepository bladeRepository;
    private final RatchetRepository ratchetRepository;
    private final BitRepository bitRepository;

    @Autowired
    public BeybladeXService(BeybladeRepository beybladeRepository, BladeRepository bladeRepository,
                            RatchetRepository ratchetRepository, BitRepository bitRepository){
        this.beybladeRepository = beybladeRepository;
        this.bladeRepository = bladeRepository;
        this.ratchetRepository = ratchetRepository;
        this.bitRepository = bitRepository;
    }

    public List<Beyblade> beybladeFindAll(){
        return beybladeRepository.findAll();
    }

    public ResponseEntity<Beyblade> beybladeFindById(Long id){
        return beybladeRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public List<Blade> bladeFindAll(){
        return bladeRepository.findAll();
    }

    public ResponseEntity<Blade> bladeFindById(Long id){
        return bladeRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public List<Ratchet> ratchetFindAll(){
        return ratchetRepository.findAll();
    }

    public ResponseEntity<Ratchet> ratchetFindById(Long id){
        return ratchetRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public List<Bit> bitFindAll(){
        return bitRepository.findAll();
    }

    public ResponseEntity<Bit> bitFindById(Long id){
        return bitRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }



}
