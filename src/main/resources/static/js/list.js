// 查找数据 obj1为查找的页码，obj2为总页数
function sel(obj1, obj2) {
    var pageNum = parseInt(obj1);
    var pages = parseInt(obj2);

    if (pageNum < 1) {
        alert("已经到首页了");
        return;
    }
    if (pageNum > pages) {
        alert("已经到最后一页了");
        return;
    }
    $("#pageNum").val(pageNum);
    $("#findByPage").submit();
}

// 点击重置按钮将所有已经填写的内容清空
function re() {
    $("#stuName").val("");
    $("#stuClass").val("");
    $("#stuNo").val("");
    $("#exact").removeAttr("checked");
}

//设置鼠标移动到某一行时，该行高亮
$(function () {
    $("#tab tr").each(function () {
        $(this).attr("onmouseover", "changeto('yellow')");
        $(this).attr("onmouseout", "changeback('')");
    });
    $("#tr1").removeAttr("onmouseover").removeAttr("onmouseout");
});

//设置该行高亮
function changeto(highlightcolor) {
    source = event.srcElement
    if (source.tagName == "TABLE")
        return;
    while (source.tagName != "TR")
        source = source.parentElement
    if (source.style.backgroundColor != highlightcolor && source.id != "ignore")
        source.style.backgroundColor = highlightcolor
}

//设置该行为原来的颜色
function changeback(originalcolor) {
    if (event.fromElement.contains(event.toElement) || source.contains(event.toElement) || source.id == "ignore")
        return
    if (event.toElement != source)
        source.style.backgroundColor = originalcolor
}

//删除某一行记录 obj1为学生id，obj2为页码
function del(obj1, obj2) {
    if (confirm('确定删除吗')) {
        window.location.href = "/delByStuId?stuId=" + obj1 + "&pageNum=" + obj2;
    }
}

// 检查首页上一页下一页尾页是否可用
function checkNum(obj) {
    if (obj < 1) {
        alert("aaaa");
        return false;
    }
}