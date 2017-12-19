// 编辑学生时，页面加载阶段，输入框左侧提示内容靠右
$(function () {
    $("#tab tr").each(function () {
        $(this).find("td:eq(0)").css("text-align", "right");
    });
});