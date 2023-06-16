$(function () {
    $("#sidebar>ul>li>a").click(function () {
        $(this).stop();
        $(this).siblings("ul").slideToggle("slow");
        $(this).parent("li").siblings().children("ul").slideUp();
        console.log($(this))
        $(this).css("opacity", "1").parent("li").siblings().children("a").css("opacity", "0.6");
    })
});
