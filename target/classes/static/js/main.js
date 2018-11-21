$(document).ready(function () {
    getCities();
    getBrands();
    getModels();
    getBodyType();
    getColor();
    getdiferentials();
    getgearboxes();
})

// var def_callback = function (d) {
//     console.log(d);
// }
//
// var getAll =  function() {
//     var url = urls.getAllAdvertisementsByFilterUrl;
//     var searchDto = buildSearchDto();
//     console.log(JSON.stringify(searchDto));
//     utility.post(url,searchDto,def_callback);
// }

var getCities = function () {
    var url = urls.getAllCitiesUrl;
    utility.get(url, city_callback);
}

var city_callback = function (d) {
    // console.log(d);
    var list = d;
    var s = '';
    list.forEach(function (city) {
        s = s.concat('<option class="majors">' + city.name + '</option>');
    })
    //s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
    console.log(s);
    $('#allCities').append(s);
}
//--------------------------------------------------------

var getBrands = function () {
    var url = urls.getAllBrandsUrl;
    utility.get(url, brand_callback);
}

var brand_callback = function (d) {
    //console.log(d);
    var list = d;
    var s = '';
    list.forEach(function (brand) {

        s = s.concat('<option class="majors">' + brand.name + '</option>');
    });
    // s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
    //console.log(s);
    $('#allBrandsDropdown').append(s);
}

//-------------------------------------------


var getModels = function () {
    var url = urls.getAllModelsUrl;
    utility.get(url, model_callback);
}

var model_callback = function (d) {
    console.log(d);
    var list = d;
    var s = '';
    list.forEach(function (model) {
        s = s.concat('<option class="majors">'  + model.name + '</option>');
    });
    //s = '<div class="dropdown-menu">'.concat(s).concat('</div>');

    console.log(s);

    $('#allModels').append(s);
}
//---------------------------------------------------------



var getBodyType = function () {
    var url = urls.getAllBodyTypesUrl;
    utility.get(url, bodyType_callback);
}

var bodyType_callback = function (d) {
   // console.log(d);
    var list = d;
    var s = '';
    list.forEach(function (bodytype) {
        s = s.concat('<option class="majors">' + bodytype.name + '</option>');
    })
    //s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
  //  console.log(s);
    $('#allBodyType').append(s);
}

//----------------------------------------------------------------


var getColor = function () {
    var url = urls.getAllColorsUrl;
    utility.get(url, color_callback);
}

var color_callback = function (d) {
   // console.log(d);
    var list = d;
    var s = '';
    list.forEach(function (color) {
        s = s.concat('<option class="majors">' + color.name + '</option>');
    })
    //s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
   // console.log(s);
    $('#allColors').append(s);
}



//----------------------------------------------

var getdiferentials = function () {
    var url = urls.getAlDiferentialsUrl;
    utility.get(url, diferentials_callback);
}


var diferentials_callback = function (d) {
   // console.log(d);
    var list = d;
    var s = '';
    list.forEach(function (diferentials) {
        s = s.concat('<option class="majors">' + diferentials.name + '</option>');
    });
    //s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
   // console.log(s);
    $('#allDiferentials').append(s);
}


//----------------------------------------------

var getgearboxes = function () {
    var url = urls.getAllGearboxesUrl;
    utility.get(url, gearboxes_callback);
}


var gearboxes_callback = function (d) {
   // console.log(d);
    var list = d;
    var s = '';
    list.forEach(function (gearboxes) {
        s = s.concat('<option class="majors">' + gearboxes.name + '</option>');
    });
    //s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
   // console.log(s);
    $('#allGearboxes').append(s);
}

//------------------------------------------------------------------------


//
// var getDiferential = function () {
//     var url = urls.getAllBrandsUrl;
//     utility.get(url, brand_callback);
// }
//
// var diferential_callback = function (d) {
//     //console.log(d);
//     var list = d;
//     var s = '';
//     list.forEach(function (diferential) {
//
//         s = s.concat('<option class="majors">' + diferential.name + '</option>');
//     });
//     // s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
//     //console.log(s);
//     $('#allBrandsDropdown').append(s);
// }
//


















// var buildSearchDto = function () {
//     var searchDto = {};
//     searchDto.limit = 2;
//     searchDto.page = 1;
//     return searchDto;
// }