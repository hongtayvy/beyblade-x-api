package com.hongtayvy.beybladexapi;

import com.hongtayvy.beybladexapi.dto.PartDTO;
import com.hongtayvy.beybladexapi.model.Part;
import com.hongtayvy.beybladexapi.model.PartType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/beybladex")
public class BeybladeXController {
    private final BeybladeXService beyBladeXService;

    @Autowired
    public BeybladeXController(BeybladeXService beyBladeXService){
        this.beyBladeXService = beyBladeXService;
    }
    private final BeybladeXHelper beybladeXHelper = new BeybladeXHelper();

    @GetMapping
    public PartDTO getByPartType(
            @RequestParam(name = "part-type") String partType
    ) {
        PartType sanitizedPartType = beybladeXHelper.parameterHelper(partType);
        return beyBladeXService.getPartType(sanitizedPartType);
    }
}
