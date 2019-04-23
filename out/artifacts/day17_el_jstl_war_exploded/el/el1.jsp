<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${ 3 > 4}

    \${ 3 > 4}

<%

    //String str = "abc";
    String str = "";
    request.setAttribute("str", str);

    List list = new ArrayList();
    request.setAttribute("list", list);
%>
<br>
${empty str}
<br>
${not empty str}

    <br>
${not empty list}
</body>
</html>
