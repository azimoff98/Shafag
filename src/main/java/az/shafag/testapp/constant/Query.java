package az.shafag.testapp.constant;

public class Query {
    public static final String FILTER_QUERY = "select jsonb_agg(distinct jsonb_build_object('id',c.id,'name',c.name,'label',c.\"label\")::text) \"city\" from advertisement ad\n" +
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
            "inner join models m on v.model_id = m.id;\n" +
            "\n" +
            "select * from advertisement;\n" +
            "\n" +
            "select * from models;\n" +
            "\n" +
            "select * from body_type;\n" +
            "\n" +
            "select * from cities;\n" +
            "select \n" +
            "jsonb_agg(distinct jsonb_build_object('id',c.id,'name',c.name,'label',c.\"label\")::text) \"city\",\n" +
            "jsonb_agg(distinct jsonb_build_object('id',b.id,'name',b.name,'label',b.\"label\")::text) \"body\",\n" +
            "jsonb_agg(distinct jsonb_build_object('id',col.id,'name',col.name,'label',col.\"label\")::text) \"colors\" \n" +
            "from cities c,body_type b,color col;";
}
