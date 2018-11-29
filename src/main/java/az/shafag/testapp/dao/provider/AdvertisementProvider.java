package az.shafag.testapp.dao.provider;

import az.shafag.testapp.dto.IdDTO;
import az.shafag.testapp.dto.SearchDTO;

import java.util.Objects;

public class AdvertisementProvider {
    public String getAdvertisementsByFilter(SearchDTO searchDTO){

        String s = "select ad.* from advertisement ad\n" +
                "inner join currency cur on ad.currency_id = cur.id\n" +
                "inner join cities c on ad.city_id = c.id\n" +
                "inner join owners o on ad.owner_id = o.id\n" +
                "inner join shafag_users u  on ad.applier_id = u.id\n" +
                "inner join vehicle v on ad.vehicle_id = v.id\n" +
                "inner join body_type b on v.body_type_id = b.id\n" +
                "inner join brands br on v.brand_id = br.id\n" +
                "inner join color col on v.color_id = col.id\n" +
                "inner join differential d on v.differential_id = d.id\n" +
                "inner join fuel_type f on v.fuel_type_id = f.id\n" +
                "inner join gearbox g on v.gearbox_id = g.id\n" +
                "inner join models m on v.model_id = m.id \n" +
                "where ad.is_active=1 and cur.is_active =1 and c.is_active =1 and o.is_active =1 and u.is_active =1 and b.is_active =1 and br.is_active =1\n" +
                "and col.is_active =1 and d.is_active =1 and f.is_active =1 and g.is_active =1 and m.is_active =1 "
                .concat(buildCondition(searchDTO));
        System.out.println(s);
        return s;
    }

    private String buildCondition(SearchDTO searchDTO){
        StringBuilder s = new StringBuilder();
        IdDTO temp;
        if (Objects.nonNull(searchDTO)) {
            if ((temp = searchDTO.getApplier()) != null && temp.getId() != null) s.append(" and u.id=#{applier.id}");
            if ((temp = searchDTO.getBodyType()) != null && temp.getId() != null) s.append(" and b.id=#{bodyType.id}");
            if ((temp = searchDTO.getBrand()) != null && temp.getId() != null) s.append(" and br.id=#{brand.id}");
            if ((temp = searchDTO.getCity()) != null && temp.getId() != null) s.append(" and c.id=#{city.id}");
            if ((temp = searchDTO.getColor()) != null && temp.getId() != null) s.append(" and col.id=#{color.id}");
            if ((temp = searchDTO.getCurrency()) != null && temp.getId() != null)
                s.append(" and cur.id=#{currency.id}");
            if ((temp = searchDTO.getDifferential()) != null && temp.getId() != null)
                s.append(" and d.id=#{differential.id}");
            if ((temp = searchDTO.getFuelType()) != null && temp.getId() != null) s.append(" and f.id=#{fuelType.id}");
            if ((temp = searchDTO.getGearBox()) != null && temp.getId() != null) s.append(" and g.id=#{gearBox.id}");
            if ((temp = searchDTO.getModel()) != null && temp.getId() != null) s.append(" and m.id=#{model.id}");
            if ((temp = searchDTO.getOwner()) != null && temp.getId() != null) s.append(" and o.id=#{owner.id}");
            if (searchDTO.getEngineVolumeFrom() != null) s.append(" and v.engine>= #{engineVolumeFrom}");
            if (searchDTO.getEngineVolumeTo() != null) s.append(" and v.engine<= #{engineVolumeTo}");
            if (searchDTO.getPriceFrom() != null) s.append(" and v.price>= #{priceFrom}");
            if (searchDTO.getPriceTo() != null) s.append(" and v.price<= #{priceTo}");
            if (searchDTO.getYearFrom() != null) s.append(" and v.year>= #{yearFrom}");
            if (searchDTO.getYearTo() != null) s.append(" and v.year<= #{yearTo}");
            if (searchDTO.getMillageFrom() != null) s.append(" and v.millage>= #{millageFrom}");
            if (searchDTO.getMillageTo() != null) s.append(" and v.millage<= #{millageTo}");
        }
        return s.toString();
    }
}
