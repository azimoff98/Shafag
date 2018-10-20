package az.shafag.testapp.service;


import az.shafag.testapp.dao.mapper.CurrencyMapper;
import az.shafag.testapp.dao.repository.CurrencyRepository;
import az.shafag.testapp.dto.CurrencyDTO;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.exception.ShafagException;
import az.shafag.testapp.model.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.*;

@Service(CURRENCY)
public class CurrencyService extends AbstractService<CurrencyDTO, Currency, Long>{


    @Autowired
    private CurrencyRepository repository;
    @Autowired
    private CurrencyMapper mapper;


    @Override
    public void save(Currency currency) {
        try{
            if(!Objects.isNull(currency) && !Objects.isNull(currency.getName())){
                repository.save(currency);
            }else{
                throw new ShafagException("currency cannot be added");
            }
        }catch (ShafagException e){
            e.getMessage();
        }

    }

    @Override
    public CurrencyDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<CurrencyDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<CurrencyDTO> getAll(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
