package com.hongtayvy.beybladexapi;

import com.hongtayvy.beybladexapi.model.*;
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

    // --- Beyblades ---

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

    // --- Blades (Basic + Unique Line) ---

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
    public ResponseEntity<Blade> getBlade(@PathVariable Long id) {
        return beybladeXService.bladeFindById(id);
    }

    // --- Ratchets ---

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
    public ResponseEntity<Ratchet> getRatchet(@PathVariable Long id) {
        return beybladeXService.ratchetFindById(id);
    }

    // --- Bits ---

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
    public ResponseEntity<Bit> getBit(@PathVariable Long id) {
        return beybladeXService.bitFindById(id);
    }

    // --- Lock Chips (Custom Line) ---

    @Operation(summary = "Get all Lock Chips")
    @GetMapping("/lock-chips")
    public List<LockChip> getAllLockChips() {
        return beybladeXService.lockChipFindAll();
    }

    @Operation(summary = "Get a Lock Chip by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lock Chip found"),
            @ApiResponse(responseCode = "404", description = "Lock Chip not found")
    })
    @GetMapping("/lock-chips/{id}")
    public ResponseEntity<LockChip> getLockChip(@PathVariable Long id) {
        return beybladeXService.lockChipFindById(id);
    }

    // --- Metal Blades (Custom Line) ---

    @Operation(summary = "Get all Metal Blades")
    @GetMapping("/metal-blades")
    public List<MetalBlade> getAllMetalBlades() {
        return beybladeXService.metalBladeFindAll();
    }

    @Operation(summary = "Get a Metal Blade by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Metal Blade found"),
            @ApiResponse(responseCode = "404", description = "Metal Blade not found")
    })
    @GetMapping("/metal-blades/{id}")
    public ResponseEntity<MetalBlade> getMetalBlade(@PathVariable Long id) {
        return beybladeXService.metalBladeFindById(id);
    }

    // --- Over Blades (Custom Line) ---

    @Operation(summary = "Get all Over Blades")
    @GetMapping("/over-blades")
    public List<OverBlade> getAllOverBlades() {
        return beybladeXService.overBladeFindAll();
    }

    @Operation(summary = "Get an Over Blade by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Over Blade found"),
            @ApiResponse(responseCode = "404", description = "Over Blade not found")
    })
    @GetMapping("/over-blades/{id}")
    public ResponseEntity<OverBlade> getOverBlade(@PathVariable Long id) {
        return beybladeXService.overBladeFindById(id);
    }

    // --- Main Blades (Custom Line) ---

    @Operation(summary = "Get all Main Blades")
    @GetMapping("/main-blades")
    public List<MainBlade> getAllMainBlades() {
        return beybladeXService.mainBladeFindAll();
    }

    @Operation(summary = "Get a Main Blade by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Main Blade found"),
            @ApiResponse(responseCode = "404", description = "Main Blade not found")
    })
    @GetMapping("/main-blades/{id}")
    public ResponseEntity<MainBlade> getMainBlade(@PathVariable Long id) {
        return beybladeXService.mainBladeFindById(id);
    }

    // --- Assist Blades (Custom Line) ---

    @Operation(summary = "Get all Assist Blades")
    @GetMapping("/assist-blades")
    public List<AssistBlade> getAllAssistBlades() {
        return beybladeXService.assistBladeFindAll();
    }

    @Operation(summary = "Get an Assist Blade by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Assist Blade found"),
            @ApiResponse(responseCode = "404", description = "Assist Blade not found")
    })
    @GetMapping("/assist-blades/{id}")
    public ResponseEntity<AssistBlade> getAssistBlade(@PathVariable Long id) {
        return beybladeXService.assistBladeFindById(id);
    }

    // --- Ratchet-Integrated Blades (Unique Line) ---

    @Operation(summary = "Get all Ratchet-Integrated Blades")
    @GetMapping("/ratchet-integrated-blades")
    public List<RatchetIntegratedBlade> getAllRatchetIntegratedBlades() {
        return beybladeXService.ratchetIntegratedBladeFindAll();
    }

    @Operation(summary = "Get a Ratchet-Integrated Blade by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ratchet-Integrated Blade found"),
            @ApiResponse(responseCode = "404", description = "Ratchet-Integrated Blade not found")
    })
    @GetMapping("/ratchet-integrated-blades/{id}")
    public ResponseEntity<RatchetIntegratedBlade> getRatchetIntegratedBlade(@PathVariable Long id) {
        return beybladeXService.ratchetIntegratedBladeFindById(id);
    }

    // --- Ratchet-Integrated Bits (Custom Line) ---

    @Operation(summary = "Get all Ratchet-Integrated Bits")
    @GetMapping("/ratchet-integrated-bits")
    public List<RatchetIntegratedBit> getAllRatchetIntegratedBits() {
        return beybladeXService.ratchetIntegratedBitFindAll();
    }

    @Operation(summary = "Get a Ratchet-Integrated Bit by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ratchet-Integrated Bit found"),
            @ApiResponse(responseCode = "404", description = "Ratchet-Integrated Bit not found")
    })
    @GetMapping("/ratchet-integrated-bits/{id}")
    public ResponseEntity<RatchetIntegratedBit> getRatchetIntegratedBit(@PathVariable Long id) {
        return beybladeXService.ratchetIntegratedBitFindById(id);
    }
}
