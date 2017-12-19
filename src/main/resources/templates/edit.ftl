<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <base href="<%=basePath%>">
    <title>编辑学生</title>
    <link rel="stylesheet" href="/css/edit.css" type="text/css">

    <script type="text/javascript" src="/js/jquery-3.2.1.js"></script>
</head>

<body>
<form method="post" action="/doUpdate">
    <table id="tab">
        <tr hidden>
            <td colspan="2">
                <input type="text" name="stuId" value="${student.stuId}">
            </td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td>
                <input type="text" name="stuName" required="required" value="${student.stuName}" maxlength="20">
            </td>
        </tr>
        <tr>
            <td>性别：</td>
            <td>
                <input type="radio" name="stuSex"
                       value="1" ${(student ?? && student.stuSex ?? && student.stuSex==1)?string("checked","")}>男
                <input type="radio" name="stuSex"
                       value="0" ${(student ?? && student.stuSex ?? && student.stuSex==0)?string("checked","")}>女
            </td>
        </tr>
        <tr>
            <td>学号：</td>
            <td>
                <input type="text" name="stuNo" value="${student.stuNo?ifExists?c}" pattern="^[0-9]*$" placeholder="请输入数字"
                       readonly>
            </td>
        </tr>
        <tr>
            <td>班级：</td>
            <td>
                <input type="text" name="stuClass" value="${student.stuClass?ifExists}" maxlength="20">
            </td>
        </tr>
        <tr>
            <td>身份证：</td>
            <td>
                <input type="text" name="stuIdcard" value="${student.stuIdcard?ifExists}" placeholder="请输入18位身份证号"
                       pattern="^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$">
            </td>
        </tr>
        <tr>
            <td>电话：</td>
            <td>
                <input type="text" name="stuTelephone" value="${student.stuTelephone?ifExists}" pattern="^[\d;]+$"><span
                    id="stuTelephoneMsg">${stuTelephoneMsg?ifExists}</span>
            </td>
        </tr>
        <tr>
            <td>邮箱：</td>
            <td>
                <input type="text" name="stuEmail" value="${student.stuEmail?ifExists}" pattern="^[\d;a-zA-Z.@]+$"><span
                    id="stuEmailMsg">${stuEmailMsg?ifExists}</span>
            </td>
        </tr>
        <tr>
            <td>状态：</td>
            <td>
                <select name="stuStatus">
                    <option value="0" ${(student ?? && student.stuStatus ?? && student.stuStatus==0)?string("selected","")}>
                        未注册
                    </option>
                    <option value="1" ${(student ?? && student.stuStatus ?? && student.stuStatus==0)?string("selected","")}>
                        已注册
                    </option>
                    <option value="-1" ${(student ?? && student.stuStatus ?? && student.stuStatus==0)?string("selected","")}>
                        休学
                    </option>
                </select>
            </td>
        </tr>
        <tr>
            <td>简介：</td>
            <td>
                <textarea name="stuDescription">${student.stuDescription?ifExists}</textarea>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="保存" title="点击完成学生信息的修改保存。">
            </td>
            <td>
                <input type="reset" value="重置" title="点击对修改的信息重置。">
            </td>
        </tr>
    </table>
</form>
<script type="text/javascript" src="/js/edit.js"></script>
</body>

</html>
