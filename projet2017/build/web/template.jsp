<%-- 
    Document   : template
    Created on : 26 mai 2017, 18:59:52
    Author     : deptinfo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Ne pas oublier cette ligne sinon tous les tags de la JSTL seront ignorés ! -->  
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${param.title}</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900|Quicksand:400,700|Questrial" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/ressources/default.css" rel="stylesheet" type="text/css" media="all" />
        <link href="${pageContext.request.contextPath}/ressources/fonts.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <div id="page-wrapper">
            <div id="page" class="container">
                <div class="title">
                    <h2>Journée Nationale MIAGE</h2>
                </div>
                <!-- Message qui s'affiche lorsque la page est appelé avec un paramètre http message -->  
                <c:if test="${!empty param['message']}">  
                    <h2>Reçu message : ${param.message}</h2>  
                </c:if> 


                <jsp:include page="${param.content}.jsp"/>
                <p></div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>