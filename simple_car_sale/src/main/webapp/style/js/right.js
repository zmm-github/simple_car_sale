$(function () {
    $(".lab").click(function () {
        $(this).parent(".h3").siblings(".slide").slideToggle();
        if ($(this).parent(".h3").parent().height() != 32) {
            $(this).css("background", "url(style/img/slidebuttons.png) right center");
        } else {
            $(this).css("background", "url(style/img/slidebuttons.png) left center");
        }
    });

    $("#rightMove").click(function() {
        $(".moveBox").animate({
            left: "-160px"
        }, "fast");
    });
    $("#leftMove").click(function() {
        $(".moveBox").animate({
            left: "0px"
        }, "fast");
    });
    $("#content>.bottom>.bottom-content>.page>.fixBox>.moveBox>a").click(function(){
        $(this).addClass("active").siblings("a").removeClass("active");
    });

    var status = $(".status");
    for (var i = 0; i < status.length; i++) {
        if ("未处理" == status[i].innerText){
            status[i].innerHTML = "<span style='color: red'>未处理</span>";
        }
    }
});