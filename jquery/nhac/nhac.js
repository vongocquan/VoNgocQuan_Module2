
    function play(link) {
        var player = $("#jquery_jplayer_1");

        player.jPlayer({
            ready: function () {
                $(this).jPlayer("setMedia", {
                    mp3: link

                });
                $(this).jPlayer("play", 0);
            },
            swfPath: "/js",
            supplied: "mp3",

        });
        player.jPlayer("setMedia", {
            mp3: link,
        });
        player.jPlayer("play", 0);
    }
    $(document).ready(function () {
        $("#player").hide();


        $(".play").click(function () {
            $("#player").show();
            $("#panel").show();
            $("#a").style.height = "400px"
        });

        $("#flip").click(function(){
            $("#panel").slideToggle("slow");
        });

    });


