$(document).ready(function () {
    $("#hide").click(function () {
        $("p").hide();
    });

    $("#show").click(function () {
        $("p").show()
    });
    var i = 0;
    $("#start").click(function () {
        i += 20;
        var div = $("div");
        div.animate({left: i + 10});
        div.animate({fontSize: i + 10});

    });

    $("*").keyup(function (e) {
        if(e.keyCode == 13) {
            $("p").hide();
        }
        else if (e.keyCode == 32){
            $("p").show();
        }

    })
});
