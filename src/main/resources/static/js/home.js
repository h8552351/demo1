

$(function(){
    // 后面－200 是为了检测内容模块到了离窗口上边距200距离时，导航显示该模块名称
    var pro_top = $("#pro").offset().top-150;
    var news_top = $("#news").offset().top-150;
    var ser_top = $("#ser").offset().top-150;
    var con_top = $("#con").offset().top-150;
    var job_top = $("#job").offset().top-150;
    // alert(news_top);
    $(window).scroll(function(){
        var scroH = $(this).scrollTop();
        // alert(scroH)
        if(scroH>=job_top){
            set_cur(".job");
        }else if(scroH>=con_top){
            set_cur(".con");
        }else if(scroH>=ser_top){
            set_cur(".ser");
        }else if(scroH>=news_top){
            set_cur(".news");
        }else if(scroH>=pro_top){
            set_cur(".pro");
        }
    });
    $(".nav li a").click(function() {
        var el = $(this).attr('class').substring(0,4);
        $('html, body').animate({
            // 这里“-200”是为了让模块显示离窗口上边距200px的距离
            scrollTop: $("#"+el).offset().top-150
        },{
            easing: 'easeOutSine',
            duration: 1000,//这里的300时表示模块内容滚动的速度
            complete:function(){
            }
        });
    });
});

function set_cur(n){
    if($(".nav a").hasClass("cur")){
        $(".nav a").removeClass("cur");
    }
    $(".nav a"+n).addClass("cur");
}



