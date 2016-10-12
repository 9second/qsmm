<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取数据</title>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript">
        function selectJson()
        {
            $.ajax({
                url:"http://localhost:8080/user/list.do",
                contentType: "application/json; charset=utf-8",
                dataType:"json", //返回的数据类型,text 或者 json数据，建议为json
                type:"post", //传参方式，get 或post
                data:JSON.stringify({

                }),
                //传过去的参数，格式为 变量名：变量值
                success: function (data) { //若Ajax处理成功后的回调函数，text是返回的页面信息
                    //console.log("this is success! data:" + data, ",status=" + status);
                    var jsonText = JSON.stringify(data)
                    document.write(jsonText);
                },
                error: function (request, status, message) {  //若Ajax处理失败后回调函数，msg是返回的错误信息
                    console.log(request);
                    console.log("this is error! request:" + request + ",status:" + status + ",message:" + message);
                    var errrorText = request.responseText;
                    var errrorText = eval('(' + errrorText + ')');
                    console.log(errrorText[0]["message"]);
                }
            });
        }
        function deleteUser()
        {
            $.ajax({
                url:"http://localhost:8080/user/deleteUser.do",
                contentType: "application/json; charset=utf-8",
                dataType:"json", //返回的数据类型,text 或者 json数据，建议为json
                type:"post", //传参方式，get 或post
                data:JSON.stringify({
                    "id":"5"
                }),
                //传过去的参数，格式为 变量名：变量值
                success: function (data) { //若Ajax处理成功后的回调函数，text是返回的页面信息
                    //console.log("this is success! data:" + data, ",status=" + status);
                    if(data==1){
                        alert("删除成功")
                    }
                    if (data==0){
                        alert("删除失败")
                    }
                },
                error: function (request, status, message) {  //若Ajax处理失败后回调函数，msg是返回的错误信息
                    console.log(request);
                    console.log("this is error! request:" + request + ",status:" + status + ",message:" + message);
                    var errrorText = request.responseText;
                    var errrorText = eval('(' + errrorText + ')');
                    console.log(errrorText[0]["message"]);
                }
            });
        }
    </script>
</head>
<body>
<input type="button"value="查询所有用户信息" onclick="selectJson()"/>
<input type="button"value="删除用户" onclick="deleteUser()"/>
</body>
</html>
