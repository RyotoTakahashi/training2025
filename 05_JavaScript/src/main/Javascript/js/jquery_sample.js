// JavaScript source code
$(function () {
    $("button").on("click", function () {
        let text = $("input").val();

        $.ajax({
            url: "https://a-force-node-red.mybluemix.net/watson",
            type: "GET",
            dataType: "text",
            data: { tweet: text }
        })
            .done(function (data) {
                $("#display_area").append(data);
            })
            .fail(function () {
                window.alert("Ajax 処理失敗")
            });
    });
});