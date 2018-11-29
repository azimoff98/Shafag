$(document).ready(function () {
    getCities();
    getBrands();
    getModels();
    getBodyType();
    getColor();
    getdiferentials();
    getgearboxes();
    getFuel();
    getdiferentialsAdmin();
    getBodyTypeA();
    getgearboxTypeA();
    getbrandsA();
    getmodelsA();
    getcolorsA();
    getusersA();
    getFuelsA();

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

    var e = document.getElementById("allCities");
    var strUser = e.options[e.selectedIndex].value;

    console.log(strUser);

    var e1 = document.getElementById("allCities");
    var strUser1 = e1.options[e1.selectedIndex].text;

    console.log(strUser1)


    var list = d;
    var s = '';
    var i=1;
    list.forEach(function (city) {
        s = s.concat('<option value=" '+ i +'" class="majors">' + city.name + '</option>');
        i++;
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
    var i = 1;
    list.forEach(function (brand) {

        s = s.concat('<option value=" '+ i +'" class="majors">' + brand.name + '</option>');
        i++;
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
   // console.log(d);
    var list = d;
    var s = '';
    var i = 1;
    list.forEach(function (model) {
        s = s.concat('<option value=" '+ i +'" class="majors">'  + model.name + '</option>');
        i++;
    });
    //s = '<div class="dropdown-menu">'.concat(s).concat('</div>');

    //console.log(s);

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
    var i = 1;
    list.forEach(function (bodytype) {
        s = s.concat('<option value=" '+ i +'" class="majors">' + bodytype.name + '</option>');
        i++;
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
    var i = 1;
    list.forEach(function (color) {
        s = s.concat('<option value=" '+ i +'" class="majors">' + color.name + '</option>');
        i++;
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
    var i = 1;
    list.forEach(function (diferentials) {
        s = s.concat('<option value=" '+ i +'" class="majors">' + diferentials.name + '</option>');
        i++;
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
    var i = 1;
    list.forEach(function (gearboxes) {
        s = s.concat('<option value=" '+ i +'" class="majors">' + gearboxes.name + '</option>');
        i++;
    });
    //s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
   // console.log(s);
    $('#allGearboxes').append(s);
}

//------------------------------------------------------------------------



var getFuel = function () {
    var url = urls.getAllFuelTypeUrl;
    utility.get(url, fuel_callback);
}

var fuel_callback = function (d) {
    //console.log(d);
    var list = d;
    var s = '';
    var i = 0;
    list.forEach(function (fuel) {

        s = s.concat('<option value=" '+ i +'" class="majors">' + fuel.name + '</option>');
        i++;
    });
    // s = '<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">'.concat(s).concat('</div>');
    //console.log(s);
    $('#allFuel').append(s);
}

//------------------------------------------------------------------------

// FOR ADMIN PANEL

//------------------------------------------------------------------------

var getdiferentialsAdmin = function () {
    var url = urls.getAlDiferentialsUrl;
    utility.get(url, diferentials_callbackA);
}


var diferentials_callbackA = function (d) {
    // console.log(d);
    var list = d;

    var s = '';
    list.forEach(function (diferentials) {

        s = s.concat('<a href="#" class="list-group-item list-group-item-action ">' + diferentials.name +
            '  <span class="pull-right"> <span class="btn btn-xs btn-default" id="" onclick="alert(\'Action2 -> Edit\');"> ' +
            ' <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> </span> ' +
            ' <span class="btn btn-xs btn-default" onclick="remove(' +"'" + urls.getAlDiferentialsUrl + "'"+ ' , ' + diferentials.id + '); ">'+
            ' <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> </span>  </span> </a>'


        );
    });


    s = s + '<a href="#"  data-toggle="modal" data-target="#myModal" class="list-group-item list-group-item-action active"><p style="margin-left: 40%">\n' +
        '                            Əlavə ET </p></a>';

    $('#differentials').append(s);
};

//---------------------------------------------------------

function remove(ur, id ) {
var urls = ur + "/" + id;
console.log(urls);

    $.ajax({
        url:urls,
        method: "DELETE",
        success: location.reload(),
        error: function(){
            window.confirm('Silindi');
        },
        dataType: 'json',
        contentType: 'application/json',

    })
}

function add() {

    var url = urls.getAlDiferentialsUrl;

    var input = $("#input").val();

    var data = {
        name: input
    }

    $.ajax({
        url:url,
        method: "POST",
        data: JSON.stringify(data),
        success: location.reload(),
        error: function(){
            alert('Əlavə edildi');
        },
        dataType: 'json',
        contentType: 'application/json',

    })

}


//BODY TYPE
//---------------------------------------------------------------

var getBodyTypeA = function () {
    var url = urls.getAllBodyTypesUrl;
    utility.get(url, bodyType_callbackA);
}

var bodyType_callbackA = function (d) {
    // console.log(d);
    var list = d;

    var s = '';
    list.forEach(function (bodyType) {

        s = s.concat('<a href="#" class="list-group-item list-group-item-action ">' + bodyType.name +
            '  <span class="pull-right"> <span class="btn btn-xs btn-default" id="" onclick="alert(\'Action2 -> Edit\');"> ' +
            ' <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> </span> ' +
            ' <span class="btn btn-xs btn-default" onclick="remove(' +"'" + urls.getAllBodyTypesUrl + "'"+ ' , ' + bodyType.id + '); ">'+
            ' <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> </span>  </span> </a>'


        );
    });


    s = s + '<a href="#"  data-toggle="modal" data-target="#myModal" class="list-group-item list-group-item-action active"><p style="margin-left: 40%">\n' +
        '                            Əlavə ET </p></a>';

    $('#bodyType').append(s);
};


function add() {

    var url = urls.getAllBodyTypesUrl;

    var input = $("#input1").val();

    var data = {
        name: input
    }

    $.ajax({
        url:url,
        method: "POST",
        data: JSON.stringify(data),
        success: location.reload(),
        error: function(){
            alert('Əlavə edildi');
        },
        dataType: 'json',
        contentType: 'application/json',

    })

}

//GEARBOX
//------------------------------------------------


var getgearboxTypeA = function () {
    var url = urls.getAllGearboxesUrl;
    utility.get(url, gearbox_callbackA);
}

var gearbox_callbackA = function (d) {
    // console.log(d);
    var list = d;

    var s = '';
    list.forEach(function (gearbox) {

        s = s.concat('<a href="#" class="list-group-item list-group-item-action ">' + gearbox.name +
            '  <span class="pull-right"> <span class="btn btn-xs btn-default" id="" onclick="alert(\'Action2 -> Edit\');"> ' +
            ' <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> </span> ' +
            ' <span class="btn btn-xs btn-default" onclick="remove(' +"'" + urls.getAllGearboxesUrl + "'"+ ' , ' + gearbox.id + '); ">'+
            ' <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> </span>  </span> </a>'


        );
    });


    s = s + '<a href="#"  data-toggle="modal" data-target="#myModal" class="list-group-item list-group-item-action active"><p style="margin-left: 40%">\n' +
        '                            Əlavə ET </p></a>';

    $('#gearbox').append(s);
};


function add() {

    var url = urls.getAllGearboxesUrl;

    var input = $("#input2").val();

    var data = {
        name: input
    }

    $.ajax({
        url:url,
        method: "POST",
        data: JSON.stringify(data),
        success: location.reload(),
        error: function(){
            alert('Əlavə edildi');
        },
        dataType: 'json',
        contentType: 'application/json',

    })

}

//BRANDS
//-----------------------------------------


var getbrandsA = function () {
    var url = urls.getAllBrandsUrl;
    utility.get(url, brands_callbackA);
}

var brands_callbackA = function (d) {
    // console.log(d);
    var list = d;

    var s = '';
    list.forEach(function (brands) {

        s = s.concat('<a href="#" class="list-group-item list-group-item-action ">' + brands.name +
            '  <span class="pull-right"> <span class="btn btn-xs btn-default" id="" onclick="alert(\'Action2 -> Edit\');"> ' +
            ' <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> </span> ' +
            ' <span class="btn btn-xs btn-default" onclick="remove(' +"'" + urls.getAllBrandsUrl + "'"+ ' , ' + brands.id + '); ">'+
            ' <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> </span>  </span> </a>'


        );
    });


    s = s + '<a href="#"  data-toggle="modal" data-target="#myModal" class="list-group-item list-group-item-action active"><p style="margin-left: 40%">\n' +
        '                            Əlavə ET </p></a>';

    $('#brands').append(s);
};


function add() {

    var url = urls.getAllBrandsUrl;

    var input = $("#input4").val();

    var data = {
        name: input
    }

    $.ajax({
        url: url,
        method: "POST",
        data: JSON.stringify(data),
        success: location.reload(),
        error: function () {
            alert('Əlavə edildi');
        },
        dataType: 'json',
        contentType: 'application/json',

    })
}


//MODELS
//----------------------------------------------------


var getmodelsA = function () {
    var url = urls.getAllModelsUrl;
    utility.get(url, models_callbackA);
}

var models_callbackA = function (d) {
    // console.log(d);
    var list = d;

    var s = '';
    list.forEach(function (brands) {

        s = s.concat('<a href="#" class="list-group-item list-group-item-action ">' + brands.name +
            '  <span class="pull-right"> <span class="btn btn-xs btn-default" id="" onclick="alert(\'Action2 -> Edit\');"> ' +
            ' <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> </span> ' +
            ' <span class="btn btn-xs btn-default" onclick="remove(' +"'" + urls.getAllBrandsUrl + "'"+ ' , ' + brands.id + '); ">'+
            ' <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> </span>  </span> </a>'


        );
    });


    s = s + '<a href="#"  data-toggle="modal" data-target="#myModal" class="list-group-item list-group-item-action active"><p style="margin-left: 40%">\n' +
        '                            Əlavə ET </p></a>';

    $('#models').append(s);
};


function add() {

    var url = urls.getAllModelsUrl;

    var input = $("#input5").val();

    var data = {
        name: input
    }

    $.ajax({
        url: url,
        method: "POST",
        data: JSON.stringify(data),
        success: location.reload(),
        error: function () {
            alert('Əlavə edildi');
        },
        dataType: 'json',
        contentType: 'application/json',

    })
}



//COLORS
//------------------------------------------


var getcolorsA = function () {
    var url = urls.getAllColorsUrl;
    utility.get(url, colors_callbackA);
}

var colors_callbackA = function (d) {
    // console.log(d);
    var list = d;

    var s = '';
    list.forEach(function (brands) {

        s = s.concat('<a href="#" class="list-group-item list-group-item-action ">' + brands.name +
            '  <span class="pull-right"> <span class="btn btn-xs btn-default" id="" onclick="alert(\'Action2 -> Edit\');"> ' +
            ' <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> </span> ' +
            ' <span class="btn btn-xs btn-default" onclick="remove(' +"'" + urls.getAllColorsUrl + "'"+ ' , ' + brands.id + '); ">'+
            ' <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> </span>  </span> </a>'


        );
    });


    s = s + '<a href="#"  data-toggle="modal" data-target="#myModal" class="list-group-item list-group-item-action active"><p style="margin-left: 40%">\n' +
        '                            Əlavə ET </p></a>';

    $('#colors').append(s);
};


function add() {

    var url = urls.getAllColorsUrl;

    var input = $("#input6").val();

    var data = {
        name: input
    }

    $.ajax({
        url: url,
        method: "POST",
        data: JSON.stringify(data),
        success: location.reload(),
        error: function () {
            alert('Əlavə edildi');
        },
        dataType: 'json',
        contentType: 'application/json',

    })
}



//USERS
//------------------------------------------------


var getusersA = function () {
    var url = urls.getAllUsersUrl;
    utility.get(url, users_callbackA);
}

var users_callbackA = function (d) {
    // console.log(d);
    var list = d;

    var s = '';
    list.forEach(function (brands) {

        s = s.concat('<a href="#" class="list-group-item list-group-item-action ">' + brands.name +
            '  <span class="pull-right"> <span class="btn btn-xs btn-default" id="" onclick="alert(\'Action2 -> Edit\');"> ' +
            ' <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> </span> ' +
            ' <span class="btn btn-xs btn-default" onclick="remove(' +"'" + urls.getAllColorsUrl + "'"+ ' , ' + brands.id + '); ">'+
            ' <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> </span>  </span> </a>'


        );
    });


    s = s + '<a href="#"  data-toggle="modal" data-target="#myModal" class="list-group-item list-group-item-action active"><p style="margin-left: 40%">\n' +
        '                            Əlavə ET </p></a>';

    $('#users').append(s);
};


function add() {

    var url = urls.getAllUsersUrl;

    var input = $("#input7").val();

    var data = {
        name: input
    }

    $.ajax({
        url: url,
        method: "POST",
        data: JSON.stringify(data),
        success: location.reload(),
        error: function () {
            alert('Əlavə edildi');
        },
        dataType: 'json',
        contentType: 'application/json',

    })
}

//DIFFERENTIALS
//---------------------------------------------



var getFuelsA = function () {
    var url = urls.getAllFuelTypeUrl;
    utility.get(url, fuels_callbackA);
}

var fuels_callbackA = function (d) {
    // console.log(d);
    var list = d;

    var s = '';
    list.forEach(function (brands) {

        s = s.concat('<a href="#" class="list-group-item list-group-item-action ">' + brands.name +
            '  <span class="pull-right"> <span class="btn btn-xs btn-default" id="" onclick="alert(\'Action2 -> Edit\');"> ' +
            ' <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> </span> ' +
            ' <span class="btn btn-xs btn-default" onclick="remove(' +"'" + urls.getAllColorsUrl + "'"+ ' , ' + brands.id + '); ">'+
            ' <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> </span>  </span> </a>'


        );
    });


    s = s + '<a href="#"  data-toggle="modal" data-target="#myModal" class="list-group-item list-group-item-action active"><p style="margin-left: 40%">\n' +
        '                            Əlavə ET </p></a>';

    $('#fuels').append(s);
};


function add() {

    var url = urls.getAllFuelTypeUrl;

    var input = $("#input9").val();

    var data = {
        name: input
    }

    $.ajax({
        url: url,
        method: "POST",
        data: JSON.stringify(data),
        success: location.reload(),
        error: function () {
            alert('Əlavə edildi');
        },
        dataType: 'json',
        contentType: 'application/json',

    })
}


//CAR DETAILE
//---------------------------------------------








// var buildSearchDto = function () {
//     var searchDto = {};
//     searchDto.limit = 2;
//     searchDto.page = 1;
//     return searchDto;
// }