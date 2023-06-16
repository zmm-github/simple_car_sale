$(function() {
    $(".lab").click(function() {
        $(this).parent(".h3").siblings(".slide").slideToggle();
        if($(this).parent(".h3").parent().height() != 32) {
            $(this).css("background", "url('/SSM04/style/img/slidebuttons.png') right center");
        } else {
            $(this).css("background", "url('/SSM04/style/img/slidebuttons.png') left center");
        }
    });
});