$(document).ready(function() {
    $.ajax({
        url: "http://192.168.99.100:8080/WebSeriesList/1"
    }).then(function(data) {
       $('.greeting-id').append(data.id);
       $('.greeting-content').append(data.Name);
       $('.greeting-content').append(data.Desc);
    });
});