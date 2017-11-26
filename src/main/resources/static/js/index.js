

$(document).ready(function () {

    $('.but').click(function () {
        alert("========");
        $.ajax({
            url: '/query',
            type: 'post',
            data: '',
            dataType: 'json',
            success : function (data) {
                alert("00000000000");
                var a = data[1].name;
                    alert(a)
                console.debug(data)
                $.each(data, function(i,item){
                    alert(item.num+","+item.name);
                });
            }
        })


    })


})
















