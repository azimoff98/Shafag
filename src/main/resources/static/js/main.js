$(document).ready(function () {
    getCities();
    getBrands();
    getModels();
    getBodyType();
    getColor();
    getdiferentials();
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
    console.log(d);
    var list = d;
    var s = '';
    list.forEach(function (city) {
        s = s.concat('<a class="dropdown-item" href="#">' + city.name + '</a>');
    })
    s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
    console.log(s);
    $('#allCitiesDropDown').append(s);
}
//--------------------------------------------------------

var getBrands = function () {
    var url = urls.getAllBrandsUrl;
    utility.get(url, brand_callback);
}

var brand_callback = function (d) {
    console.log(d);
    var list = d;
    var s = '';
    list.forEach(function (brand) {
        s = s.concat('<a class="dropdown-item" href="#">' + brand.name + '</a>');
    })
    s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
    console.log(s);
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
        s = s.concat('<a class="dropdown-item" href="#">' + model.name + '</a>');
    })
    s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
    console.log(s);
    $('#allModels').append(s);
}
//---------------------------------------------------------



var getBodyType = function () {
    var url = urls.getAllBodyTypesUrl;
    utility.get(url, bodyType_callback);
}

var bodyType_callback = function (d) {
    console.log(d);
    var list = d;
    var s = '';
    list.forEach(function (bodytype) {
        s = s.concat('<a class="dropdown-item" href="#">' + bodytype.name + '</a>');
    })
    s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
    console.log(s);
    $('#allbodytype').append(s);
}

//----------------------------------------------------------------


var getColor = function () {
    var url = urls.getAllColorsUrl;
    utility.get(url, color_callback);
}

var color_callback = function (d) {
    console.log(d);
    var list = d;
    var s = '';
    list.forEach(function (color) {
        s = s.concat('<a class="dropdown-item" href="#">' + color.name + '</a>');
    })
    s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
    console.log(s);
    $('#allcolor').append(s);
}



//----------------------------------------------

var getdiferentials = function () {
    var url = urls.getAlDiferentialsUrl;
    utility.get(url, diferentials_callback);
}


var diferentials_callback = function (d) {
    console.log(d);
    var list = d;
    var s = '';
    list.forEach(function (diferentials) {
        s = s.concat('<a class="dropdown-item" href="#">' + diferentials.name + '</a>');
    })
    s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
    console.log(s);
    $('#alldiferentials').append(s);
}





















// var buildSearchDto = function () {
//     var searchDto = {};
//     searchDto.limit = 2;
//     searchDto.page = 1;
//     return searchDto;
// }