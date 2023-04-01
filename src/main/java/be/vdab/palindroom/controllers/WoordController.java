package be.vdab.palindroom.controllers;

import be.vdab.palindroom.services.WoordService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("woorden")
class WoordController {
    private final WoordService woordService;

    WoordController(WoordService woordService) {
        this.woordService = woordService;
    }
    @GetMapping("{woord}/isPalindroom")
    @Operation(summary = "is dit woord een palindroom")
    boolean isPalindroom(@PathVariable String woord) {
        return woordService.isPalindroom(woord);
    }
}
