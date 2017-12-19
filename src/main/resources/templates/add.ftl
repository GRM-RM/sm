<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <base href="<%=basePath%>">
    <title>添加学生</title>
    <link rel="stylesheet" href="/css/add.css" type="text/css">

    <script type="text/javascript" src="/js/jquery-3.2.1.js"></script>
</head>

<body>


<form method="post" action="/add">
    <table id="tab">
        <tr>
            <td><span id="beforeStuName">*</span>姓名：</td>
            <td>
                <input type="text" name="stuName" required="required" maxlength="20"
                       <#if (student ?? )>value="${student.stuName?ifExists}"</#if>>
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
                <input type="text" name="stuNo" pattern="^[0-9]*$" placeholder="请输入数字" id="stuNo"
                       onblur="checkByStuNo()"
                       <#if (student ?? )>value="${student.stuNo?ifExists?c}"</#if>>
                <span id="stuNoMsg"></span>
            </td>
        </tr>

        <tr>
            <td>班级：</td>
            <td>
                <input type="text" name="stuClass" maxlength="20"
                       <#if (student ?? )>value="${student.stuClass?ifExists}"</#if>>
            </td>
        </tr>

        <tr>
            <td>身份证：</td>
            <td>
                <input type="text" name="stuIdcard" placeholder="请输入18位身份证号"
                       <#if (student ?? )>value="${student.stuIdcard?ifExists}"</#if>
                       pattern="^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$">
            </td>
        </tr>

        <tr>
            <td>电话：</td>
            <td>
                <input type="text" name="stuTelephone" <#if (student ?? )>value="${student.stuTelephone?ifExists}"</#if>
                       pattern="^[\d;]+$"><span
                    id="stuTelephoneMsg">${stuTelephoneMsg?ifExists}</span>
            </td>
        </tr>
        <tr>
            <td>邮箱：</td>
            <td>
                <input type="text" name="stuEmail" pattern="^[\d;a-zA-Z.@]+$"
                       <#if (student ?? )>value="${student.stuEmail?ifExists}"</#if>><span
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
                <textarea name="stuDescription"><#if (student ?? )>${student.stuDescription?ifExists}</#if></textarea>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="保存" title="点击完成学生信息的添加保存。" id="sub">
            </td>
            <td>
                <input type="reset" value="重置" title="点击重置学生信息。">
            </td>
        </tr>
    </table>
</form>
<script type="text/javascript" src="/js/add.js"></script>
</body>

</html>
