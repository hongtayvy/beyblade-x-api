package com.hongtayvy.beybladexapi;

import com.hongtayvy.beybladexapi.model.*;
import com.hongtayvy.beybladexapi.repository.*;
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
    private final LockChipRepository lockChipRepository;
    private final MetalBladeRepository metalBladeRepository;
    private final OverBladeRepository overBladeRepository;
    private final MainBladeRepository mainBladeRepository;
    private final AssistBladeRepository assistBladeRepository;
    private final RatchetIntegratedBladeRepository ratchetIntegratedBladeRepository;
    private final RatchetIntegratedBitRepository ratchetIntegratedBitRepository;

    public BeybladeXService(BeybladeRepository beybladeRepository, BladeRepository bladeRepository,
                            RatchetRepository ratchetRepository, BitRepository bitRepository,
                            LockChipRepository lockChipRepository, MetalBladeRepository metalBladeRepository,
                            OverBladeRepository overBladeRepository, MainBladeRepository mainBladeRepository,
                            AssistBladeRepository assistBladeRepository,
                            RatchetIntegratedBladeRepository ratchetIntegratedBladeRepository,
                            RatchetIntegratedBitRepository ratchetIntegratedBitRepository) {
        this.beybladeRepository = beybladeRepository;
        this.bladeRepository = bladeRepository;
        this.ratchetRepository = ratchetRepository;
        this.bitRepository = bitRepository;
        this.lockChipRepository = lockChipRepository;
        this.metalBladeRepository = metalBladeRepository;
        this.overBladeRepository = overBladeRepository;
        this.mainBladeRepository = mainBladeRepository;
        this.assistBladeRepository = assistBladeRepository;
        this.ratchetIntegratedBladeRepository = ratchetIntegratedBladeRepository;
        this.ratchetIntegratedBitRepository = ratchetIntegratedBitRepository;
    }

    private static <T> ResponseEntity<T> findById(JpaRepository<T, Long> repo, Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public List<Beyblade> beybladeFindAll() { return beybladeRepository.findAll(); }
    public ResponseEntity<Beyblade> beybladeFindById(Long id) { return findById(beybladeRepository, id); }

    public List<Blade> bladeFindAll() { return bladeRepository.findAll(); }
    public ResponseEntity<Blade> bladeFindById(Long id) { return findById(bladeRepository, id); }

    public List<Ratchet> ratchetFindAll() { return ratchetRepository.findAll(); }
    public ResponseEntity<Ratchet> ratchetFindById(Long id) { return findById(ratchetRepository, id); }

    public List<Bit> bitFindAll() { return bitRepository.findAll(); }
    public ResponseEntity<Bit> bitFindById(Long id) { return findById(bitRepository, id); }

    public List<LockChip> lockChipFindAll() { return lockChipRepository.findAll(); }
    public ResponseEntity<LockChip> lockChipFindById(Long id) { return findById(lockChipRepository, id); }

    public List<MetalBlade> metalBladeFindAll() { return metalBladeRepository.findAll(); }
    public ResponseEntity<MetalBlade> metalBladeFindById(Long id) { return findById(metalBladeRepository, id); }

    public List<OverBlade> overBladeFindAll() { return overBladeRepository.findAll(); }
    public ResponseEntity<OverBlade> overBladeFindById(Long id) { return findById(overBladeRepository, id); }

    public List<MainBlade> mainBladeFindAll() { return mainBladeRepository.findAll(); }
    public ResponseEntity<MainBlade> mainBladeFindById(Long id) { return findById(mainBladeRepository, id); }

    public List<AssistBlade> assistBladeFindAll() { return assistBladeRepository.findAll(); }
    public ResponseEntity<AssistBlade> assistBladeFindById(Long id) { return findById(assistBladeRepository, id); }

    public List<RatchetIntegratedBlade> ratchetIntegratedBladeFindAll() { return ratchetIntegratedBladeRepository.findAll(); }
    public ResponseEntity<RatchetIntegratedBlade> ratchetIntegratedBladeFindById(Long id) { return findById(ratchetIntegratedBladeRepository, id); }

    public List<RatchetIntegratedBit> ratchetIntegratedBitFindAll() { return ratchetIntegratedBitRepository.findAll(); }
    public ResponseEntity<RatchetIntegratedBit> ratchetIntegratedBitFindById(Long id) { return findById(ratchetIntegratedBitRepository, id); }
}
