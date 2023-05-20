package com.example.ret3.Controller;

import com.example.ret3.Service.GamaService;
import com.example.ret3.Model.Gama;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Gama")
public class GamaController {
    @Autowired
    private GamaService gamaService;

    @GetMapping("/all")   // ->>>>  localhost..../api/Gama/all
    public List<Gama> getAll(){
        return gamaService.getAll();
    }

    @GetMapping("/{id}")    // ->>>>  localhost..../api/Gama/12
    public Optional<Gama> getGama(@PathVariable int id){
        return gamaService.getGama(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Gama save(@RequestBody Gama gama){
        return gamaService.save(gama);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Gama update(@RequestBody Gama gama) {
        return gamaService.update(gama);
    }

    @DeleteMapping("/{id}")    // -----> localhost...../api/Gama/12
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable int id) {
        return gamaService.delete(id);
    }
}
