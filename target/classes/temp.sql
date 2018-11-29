select ad.* from advertisement ad
inner join currency cur on ad.currency_id = cur.id
inner join cities c on ad.city_id = c.id
inner join owners o on ad.owner_id = o.id
inner join shafag_users u  on ad.applier_id = u.id
inner join vehicle v on ad.vehicle_id = v.id
inner join body_type b on v.body_type_id = b.id
inner join brands br on v.brand_id = br.id
inner join color col on v.color_id = col.id
inner join differential d on v.differential_id = d.id
inner join fuel_type f on v.fuel_type_id = f.id
inner join gearbox g on v.gearbox_id = g.id
inner join models m on v.model_id = m.id
where ad.is_active=1 and cur.is_active =1 and c.is_active =1 and o.is_active =1 and u.is_active =1 and b.is_active =1 and br.is_active =1
and col.is_active =1 and d.is_active =1 and f.is_active =1 and g.is_active =1 and m.is_active =1