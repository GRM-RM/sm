<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <base href="<%=basePath%>">
    <title>学生列表</title>
    <link rel="stylesheet" href="/css/list.css" type="text/css">
    <script type="text/javascript" src="/js/jquery-3.2.1.js"></script>
</head>

<body>

<form method="post" action="findByPage" id="findByPage">
    姓名：<input type="text" name="stuName" id="stuName" value="${selectDto.stuName?ifExists}" />
    班级：<input type="text" name="stuClass" id="stuClass" value="${selectDto.stuClass?ifExists}"/>
    学号：<input type="text" name="stuNo" id="stuNo" value="${selectDto.stuNo?ifExists}"/>
    <input type="text" name="pageNum" hidden value="1" id="pageNum" aria-valuemax="${selectDto.pageNum?ifExists}"/>
    <input type="checkbox" name="exact" value="1" id="exact" ${(selectDto.exact ?? && selectDto.exact==1)?string("checked","")}/>是否精确查询
    <input type="submit" value="查询" title="勾选精确查询,进行精确查询。否则进行模糊查询。"/>
    <input type="button" value="重置" onclick="re()" title="点击清除查询条件。"/>
</form>
<table border="1" id="tab">
    <tr id="tr1">
        <th>序号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>状态</th>
        <th>学号</th>
        <th>班级</th>
        <th>身份证</th>
        <th>电话</th>
        <th>邮箱</th>
        <th>操作</th>
    </tr>
    <tr>
        <td colspan="10" id="increase"><a href="add.html">增加</a></td>
    </tr>

    <#list page.list! as stu>
    <tr>
        <td>${stu.stuId?ifExists}</td>
        <td title="${stu.stuDescription?ifExists}" id="stuNameTd">${stu.stuName?ifExists}</td>
        <td style="color: ${(stu.stuSex ?? && stu.stuSex==1)?string("blue","女生")}">${(stu.stuSex ?? && stu.stuSex==1)?string("男生","女生")}</td>
        <#if (stu.stuStatus==0)>
            <td class="stuStatus">未注册</td>
        <#elseIf (stu.stuStatus==1)>
            <td>已注册</td>
        <#elseIf (stu.stuStatus==-1)>
            <td class="stuStatus">休学</td>
        </#if>

        <td>${stu.stuNo?ifExists?c}</td>
        <td>${stu.stuClass?ifExists}</td>
        <td>${stu.stuIdcard?ifExists}</td>
        <td>${stu.stuTelephone?ifExists}</td>
        <td><a href="${stu.stuEmail?ifExists}">${stu.stuEmail?ifExists}</a></td>
        <td><a href="/edit?stuId=${stu.stuId?ifExists}">修改</a> <a href="javascript:del('${stu.stuId?ifExists}','${page.pageNum?ifExists}')">删除</a>
        </td>
    </tr>
    </#list>

    <tr>
        <td colspan="10" id="last">
            第 ${page.pageNum?ifExists} 页 共 ${page.pages?ifExists} 页 ${page.total?ifExists} 条记录
            <a href="javascript:sel('1','${page.pages?ifExists}')" ${(page.pages==0)?string("onclick='return false'","")}>首页</a>
            <a href="javascript:sel('${page.pageNum-1?ifExists}','${page.pages?ifExists}')" ${(page.pages==0)?string("onclick='return false'","")}>上一页</a>
            <a href="javascript:sel('${page.pageNum+1?ifExists}','${page.pages?ifExists}')" ${(page.pages==0)?string("onclick='return false'","")}>下一页</a>
            <a href="javascript:sel('${page.pages?ifExists}','${page.pages?ifExists}')" ${(page.pages==0)?string("onclick='return false'","")}>尾页</a>
        </td>
    </tr>
</table>

${msg?ifExists}
<script type="text/javascript" src="/js/list.js"></script>
</body>

</html>
