$(document).ready(function () {

    $.ajax({
        type: "GET",
        url: "https://spring-student-api.herokuapp.com/info?apiKey=eaf118ab-babf-43ed-a788-b66d2f0ca00c",
        dataType: "json",
        success: function (result) {
            console.log(result);
            a(result);

        },

    });
});

function a(result) {
    let rows = "";
    $.each(result, function (i, result) {
        rows +=
            "<tr>" +
            "<td>" + result.id + "</td>" +
            "<td>" + result.fullName + "</td>" +
            "<td>" + result.gender + "</td>" +
            "<td>" + result.birthDate + "</td>" +
            "<td>" + result.phoneNumber + "</td>" +
            "</tr>"

    });
    document.getElementById("rows").innerHTML = rows;
}
