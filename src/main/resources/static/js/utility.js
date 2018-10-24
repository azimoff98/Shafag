var utility = new function () {

    this.post = function (url, data, cb) {
        $.ajax({
            type: "POST",
            url: url,
            data: JSON.stringify(data),
            success: cb,
            dataType: 'json',
            contentType: 'application/json',
        });
    }

    this.get = function (url, cb) {
        $.ajax({
            type: "GET",
            url: url,
            success: cb,
            dataType: 'json',
            contentType: 'application/json',
        });
    }
}