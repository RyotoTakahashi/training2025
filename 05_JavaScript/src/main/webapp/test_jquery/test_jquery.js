// 
$(document).ready(function () {
    $(".menu").hover(
        function () {
            $(this).css("background-color", "white")
            $(this).css("color", "blue");
            $(this).find(".sub").fadeIn(1000);
        },
        function () {
            $(this).css("background-color", "forestgreen")
            $(this).css("color", "white");
            $(this).find(".sub").fadeOut(500)
            ;
        }
    );
});

$(document).ready(function () {
    $(".sub li").hover(
        function () {
            $(this).css("background-color", "white")
            $(this).css("color", "blue");
        },
        function () {
            $(this).css("background-color", "forestgreen")
            $(this).css("color", "white");
        }
    );
});

var current_case = 1
const picture_amount = 5
function Picture_changer() {
    const picture_title = ["駅", "重文", "運河", "交差点", "坂"];
    const picture_path = "test_jquery/img/img";
    const imagePath = picture_path + current_case + ".jpg";

    $("#image_data img").fadeOut(500, function () {
        $(this).attr("src", imagePath).fadeIn(500);
        $(".titles").text(picture_title[current_case]);
    });
}

Picture_changer();

setInterval(function () {
    current_case = (current_case + 1) % picture_amount;
    Picture_changer();
}, 5000);
