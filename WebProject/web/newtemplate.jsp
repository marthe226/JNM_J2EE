<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by TEMPLATED
http://templated.co
Released for free under the Creative Commons Attribution License

Name       : PlainDisplay 
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20140309

-->
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>${param.title}</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <link href="http://fonts.googleapis.com/css?family=Varela" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/ressources/default.css" rel="stylesheet" type="text/css" media="all" />
        <link href="${pageContext.request.contextPath}/ressources/fonts.css" rel="stylesheet" type="text/css" media="all" />

        <!--[if IE 6]><link href="default_ie6.css" rel="stylesheet" type="text/css" /><![endif]-->

    </head>
    <body>
        <div id="wrapper">
            <jsp:include page="header.jsp"/>

            <div id="extra" class="container">
                <div class="title">
                    <h2>${param.title}</h2>
                    <span class="byline">${param.description}</span> </div>

                <jsp:include page="${param.content}.jsp"/>
            </div>

        </div>
        <jsp:include page="footer.jsp"/>




    </body>
</html>