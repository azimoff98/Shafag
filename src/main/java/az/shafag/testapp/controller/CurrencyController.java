package az.shafag.testapp.controller;

import az.shafag.testapp.dto.CurrencyDTO;
import az.shafag.testapp.model.Currency;
import az.shafag.testapp.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @PostMapping
    public void save(@RequestBody Currency currency){
        currencyService.save(currency);
    }

    @GetMapping("/all")
    public Set<CurrencyDTO> getAll(){
        return currencyService.getAll();
    }

    @GetMapping("/{id}")
    public CurrencyDTO getById(@PathVariable Long id){
        return currencyService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        currencyService.delete(id);
    }
}
