//�ǂݍ��ݎ��ɕ����̐F��ς���
$(function () {
    $("#change_color").css("color", "blue");
});

//�N���b�N���ꂽ�Ƃ��ɕ����̐F��ς���
$(function () {
    $("#expand").on("click",function () {
        $(this).next().toggleClass("hidden")
    })
})

//�{�^���z�o�[���ɃA�j���[�V������ݒ�
$(function () {
    $("#change_button").hover( function () {
        $(this).animate({
            "height": "27px",
            "width": "86px"
        }, 200);
    },
        function () {
            $(this).animate({
                "height": "21px",
                "width": "66.41px"
            }, 200);
        });
});
