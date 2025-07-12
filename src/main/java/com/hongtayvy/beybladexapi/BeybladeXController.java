package com.hongtayvy.beybladexapi;

import com.hongtayvy.beybladexapi.model.Beyblade;
import com.hongtayvy.beybladexapi.model.Bit;
import com.hongtayvy.beybladexapi.model.Blade;
import com.hongtayvy.beybladexapi.model.Ratchet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/beybladex")
public class BeybladeXController {
    private final BeybladeXService beybladeXService;

    @Autowired
    public BeybladeXController(BeybladeXService beybladeXService) {
        this.beybladeXService = beybladeXService;
    }

    @GetMapping("/beyblades")
    public List<Beyblade> getAllBeyblades() {
        return beybladeXService.beybladeFindAll();
    }

    @GetMapping("/beyblades/{id}")
    public ResponseEntity<Beyblade> getBeyblade(@PathVariable Long id) {
        return beybladeXService.beybladeFindById(id);
    }

    @GetMapping("/blades")
    public List<Blade> getAllBlades() {
        return beybladeXService.bladeFindAll();
    }

    @GetMapping("/ratchets")
    public List<Ratchet> getAllRatchets() {
        return beybladeXService.ratchetFindAll();
    }

    @GetMapping("/bits")
    public List<Bit> getAllBits() {
        return beybladeXService.bitFindAll();
    }
}