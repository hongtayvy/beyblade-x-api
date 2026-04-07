package com.hongtayvy.beybladexapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hongtayvy.beybladexapi.model.*;
import com.hongtayvy.beybladexapi.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

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

    public DataLoader(BeybladeRepository beybladeRepository, BladeRepository bladeRepository,
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

    @Override
    public void run(String... args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        if (bladeRepository.count() == 0) {
            InputStream inputStream = new ClassPathResource("blade.json").getInputStream();
            List<Blade> blades = mapper.readValue(inputStream, new TypeReference<>() {});
            bladeRepository.saveAll(blades);
            System.out.println("Loaded " + blades.size() + " blades from blade.json");
        }

        if (ratchetRepository.count() == 0) {
            InputStream inputStream = new ClassPathResource("ratchet.json").getInputStream();
            List<Ratchet> ratchets = mapper.readValue(inputStream, new TypeReference<>() {});
            ratchetRepository.saveAll(ratchets);
            System.out.println("Loaded " + ratchets.size() + " ratchets from ratchet.json");
        }

        if (bitRepository.count() == 0) {
            InputStream inputStream = new ClassPathResource("bit.json").getInputStream();
            List<Bit> bits = mapper.readValue(inputStream, new TypeReference<>() {});
            bitRepository.saveAll(bits);
            System.out.println("Loaded " + bits.size() + " bits from bit.json");
        }

        if (beybladeRepository.count() == 0) {
            InputStream inputStream = new ClassPathResource("bey_model.json").getInputStream();
            List<Beyblade> beyblades = mapper.readValue(inputStream, new TypeReference<>() {});
            beybladeRepository.saveAll(beyblades);
            System.out.println("Loaded Beyblade data from bey_model.json");
        }

        if (lockChipRepository.count() == 0) {
            InputStream inputStream = new ClassPathResource("lock_chip.json").getInputStream();
            List<LockChip> lockChips = mapper.readValue(inputStream, new TypeReference<>() {});
            lockChipRepository.saveAll(lockChips);
            System.out.println("Loaded " + lockChips.size() + " lock chips from lock_chip.json");
        }

        if (metalBladeRepository.count() == 0) {
            InputStream inputStream = new ClassPathResource("metal_blade.json").getInputStream();
            List<MetalBlade> metalBlades = mapper.readValue(inputStream, new TypeReference<>() {});
            metalBladeRepository.saveAll(metalBlades);
            System.out.println("Loaded " + metalBlades.size() + " metal blades from metal_blade.json");
        }

        if (overBladeRepository.count() == 0) {
            InputStream inputStream = new ClassPathResource("over_blade.json").getInputStream();
            List<OverBlade> overBlades = mapper.readValue(inputStream, new TypeReference<>() {});
            overBladeRepository.saveAll(overBlades);
            System.out.println("Loaded " + overBlades.size() + " over blades from over_blade.json");
        }

        if (mainBladeRepository.count() == 0) {
            InputStream inputStream = new ClassPathResource("main_blade.json").getInputStream();
            List<MainBlade> mainBlades = mapper.readValue(inputStream, new TypeReference<>() {});
            mainBladeRepository.saveAll(mainBlades);
            System.out.println("Loaded " + mainBlades.size() + " main blades from main_blade.json");
        }

        if (assistBladeRepository.count() == 0) {
            InputStream inputStream = new ClassPathResource("assist_blade.json").getInputStream();
            List<AssistBlade> assistBlades = mapper.readValue(inputStream, new TypeReference<>() {});
            assistBladeRepository.saveAll(assistBlades);
            System.out.println("Loaded " + assistBlades.size() + " assist blades from assist_blade.json");
        }

        if (ratchetIntegratedBladeRepository.count() == 0) {
            InputStream inputStream = new ClassPathResource("ratchet_integrated_blade.json").getInputStream();
            List<RatchetIntegratedBlade> riBlades = mapper.readValue(inputStream, new TypeReference<>() {});
            ratchetIntegratedBladeRepository.saveAll(riBlades);
            System.out.println("Loaded " + riBlades.size() + " ratchet-integrated blades from ratchet_integrated_blade.json");
        }

        if (ratchetIntegratedBitRepository.count() == 0) {
            InputStream inputStream = new ClassPathResource("ratchet_integrated_bit.json").getInputStream();
            List<RatchetIntegratedBit> riBits = mapper.readValue(inputStream, new TypeReference<>() {});
            ratchetIntegratedBitRepository.saveAll(riBits);
            System.out.println("Loaded " + riBits.size() + " ratchet-integrated bits from ratchet_integrated_bit.json");
        }
    }
}
