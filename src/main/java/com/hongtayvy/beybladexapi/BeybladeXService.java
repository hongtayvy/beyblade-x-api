package com.hongtayvy.beybladexapi;

import com.hongtayvy.beybladexapi.model.Beyblade;
import com.hongtayvy.beybladexapi.model.Bit;
import com.hongtayvy.beybladexapi.model.Blade;
import com.hongtayvy.beybladexapi.model.Ratchet;
import com.hongtayvy.beybladexapi.repository.BeybladeRepository;
import com.hongtayvy.beybladexapi.repository.BitRepository;
import com.hongtayvy.beybladexapi.repository.BladeRepository;
import com.hongtayvy.beybladexapi.repository.RatchetRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class BeybladeXService {
    private final BeybladeRepository beybladeRepository;
    private final BladeRepository bladeRepository;
    private final RatchetRepository ratchetRepository;
    private final BitRepository bitRepository;

    public BeybladeXService(BeybladeRepository beybladeRepository, BladeRepository bladeRepository,
                            RatchetRepository ratchetRepository, BitRepository bitRepository){
        this.beybladeRepository = beybladeRepository;
        this.bladeRepository = bladeRepository;
        this.ratchetRepository = ratchetRepository;
        this.bitRepository = bitRepository;
    }

    private static <T> ResponseEntity<T> findById(JpaRepository<T, Long> repo, Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public List<Beyblade> beybladeFindAll(){
        return beybladeRepository.findAll();
    }

    public ResponseEntity<Beyblade> beybladeFindById(Long id){
        return findById(beybladeRepository, id);
    }

    public List<Blade> bladeFindAll(){
        return bladeRepository.findAll();
    }

    public ResponseEntity<Blade> bladeFindById(Long id){
        return findById(bladeRepository, id);
    }

    public List<Ratchet> ratchetFindAll(){
        return ratchetRepository.findAll();
    }

    public ResponseEntity<Ratchet> ratchetFindById(Long id){
        return findById(ratchetRepository, id);
    }

    public List<Bit> bitFindAll(){
        return bitRepository.findAll();
    }

    public ResponseEntity<Bit> bitFindById(Long id){
        return findById(bitRepository, id);
    }



}
