// 添加学生时，页面加载阶段，输入框左侧提示内容靠右
$(function () {
    $("#tab tr").each(function () {
        $(this).find("td:eq(0)").css("text-align", "right");
    });
});
//检查学生的学号是否可以使用
function checkByStuNo() {
    var stuNo=$("#stuNo").val();
    $.ajax({
        url:"/findByStuNo",
        data:"stuNo="+stuNo,
        success:function (data) {
            if(data.status){
                $("#sub").removeAttr("disabled");
                $("#stuNoMsg").html("该学号可以使用");
            }else {
                $("#sub").attr("disabled","true");
                $("#stuNoMsg").html("该学号已经被使用");
            }
        }
    })
}