package az.shafag.testapp.service;

import az.shafag.testapp.annotation.ServiceMethod;
import az.shafag.testapp.dao.mapper.AdvertisementMapper;
import az.shafag.testapp.dao.repository.AdvertisementRepository;
import az.shafag.testapp.dto.AdvertisementDTO;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.model.Advertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.*;

@Service(ADVERTISEMENT)
public class AdvertisementService extends AbstractService<AdvertisementDTO, Advertisement, Long> {


    @Autowired
    private AdvertisementRepository repository;
    @Autowired
    private AdvertisementMapper mapper;


    @Override
    public void save(Advertisement advertisement) {
        if(!Objects.isNull(advertisement)
                && !Objects.isNull(advertisement.getPrice())
                && !Objects.isNull(advertisement.getCity())
                && !Objects.isNull(advertisement.getCurrency())
                && !Objects.isNull(advertisement.getOwner())
                && !Objects.isNull(advertisement.getUser())
                && !Objects.isNull(advertisement.getVehicle())){

            repository.save(advertisement);
        }
    }

    @Override
    public AdvertisementDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<AdvertisementDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<AdvertisementDTO> getAll(SearchDTO searchDTO) {
        return mapper.getAllActive();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }

}
