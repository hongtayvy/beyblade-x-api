package com.hongtayvy.beybladexapi;

import com.hongtayvy.beybladexapi.model.Beyblade;
import com.hongtayvy.beybladexapi.model.Bit;
import com.hongtayvy.beybladexapi.model.Blade;
import com.hongtayvy.beybladexapi.model.Ratchet;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/beybladex", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Beyblade X", description = "API for Beyblade X parts and combinations")
public class BeybladeXController {

    private final BeybladeXService beybladeXService;

    public BeybladeXController(BeybladeXService beybladeXService) {
        this.beybladeXService = beybladeXService;
    }

    @Operation(summary = "Get all Beyblades")
    @GetMapping("/beyblades")
    public List<Beyblade> getAllBeyblades() {
        return beybladeXService.beybladeFindAll();
    }

    @Operation(summary = "Get a Beyblade by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Beyblade found"),
            @ApiResponse(responseCode = "404", description = "Beyblade not found")
    })
    @GetMapping("/beyblades/{id}")
    public ResponseEntity<Beyblade> getBeyblade(@PathVariable Long id) {
        return beybladeXService.beybladeFindById(id);
    }

    @Operation(summary = "Get all Blades")
    @GetMapping("/blades")
    public List<Blade> getAllBlades() {
        return beybladeXService.bladeFindAll();
    }

    @Operation(summary = "Get a Blade by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Blade found"),
            @ApiResponse(responseCode = "404", description = "Blade not found")
    })
    @GetMapping("/blades/{id}")
    public ResponseEntity<Blade> getBlade(@PathVariable Long id){
        return beybladeXService.bladeFindById(id);
    }

    @Operation(summary = "Get all Ratchets")
    @GetMapping("/ratchets")
    public List<Ratchet> getAllRatchets() {
        return beybladeXService.ratchetFindAll();
    }

    @Operation(summary = "Get a Ratchet by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ratchet found"),
            @ApiResponse(responseCode = "404", description = "Ratchet not found")
    })
    @GetMapping("/ratchets/{id}")
    public ResponseEntity<Ratchet> getRatchet(@PathVariable Long id){
        return beybladeXService.ratchetFindById(id);
    }

    @Operation(summary = "Get all Bits")
    @GetMapping("/bits")
    public List<Bit> getAllBits() {
        return beybladeXService.bitFindAll();
    }

    @Operation(summary = "Get a Bit by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Bit found"),
            @ApiResponse(responseCode = "404", description = "Bit not found")
    })
    @GetMapping("/bits/{id}")
    public ResponseEntity<Bit> getBit(@PathVariable Long id){
        return beybladeXService.bitFindById(id);
    }
}