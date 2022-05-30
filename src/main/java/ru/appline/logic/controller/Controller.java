package ru.appline.logic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.appline.logic.CompasModel;

import java.util.Map;

@RestController
public class Controller {
    private static final CompasModel model = CompasModel.getInstance();

    @PostMapping(value = "/sendDegrees", consumes = "application/json")
    public void sendDegrees(@RequestBody String compas, String diapason) {
        model.sendDegrees(diapason, compas);
    }

    @GetMapping(value = "/getAll", produces = "application/json")
    public Map<String, String> getAll() {
        return model.getAll();
    }

    @GetMapping(value = "/getSide", consumes = "application/json", produces = "application/json")
    public void getSide(double degree) {
        model.getSide(degree);
    }
}
