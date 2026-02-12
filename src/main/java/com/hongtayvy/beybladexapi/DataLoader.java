package com.hongtayvy.beybladexapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hongtayvy.beybladexapi.model.Beyblade;
import com.hongtayvy.beybladexapi.repository.BeybladeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final BeybladeRepository beybladeRepository;

    public DataLoader(BeybladeRepository beybladeRepository) {
        this.beybladeRepository = beybladeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (beybladeRepository.count() == 0) {
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Beyblade>> typeReference = new TypeReference<>() {};
            InputStream inputStream = new ClassPathResource("bey_model.json").getInputStream();
            List<Beyblade> beyblades = mapper.readValue(inputStream, typeReference);
            beybladeRepository.saveAll(beyblades);
            System.out.println("✅ Loaded Beyblade data from JSON.");
        } else {
            System.out.println("ℹ️ Beyblade data already exists. Skipping load.");
        }
    }
}
