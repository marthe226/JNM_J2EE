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
	<div id="header-wrapper">
	<div id="header" class="container">
		<div id="logo">
			<h1><a href="#"></a></h1>
		</div>
		<div id="menu">
			<ul>
				<li class="current_page_item"><a href="ServletUser?action=listerLesUtilisateurs" accesskey="1" title="">Homepage</a></li>
                                 <li><a href="Select_category.jsp">Inscription</a></li>                          
                                 <li><a href="connect.jsp">Connexion</a></li>
                                 <li><a href="#">Deconnection</a>
			</ul>
		</div>
	</div>
	</div>

	<div id="extra" class="container">
		<div class="title">
			<h2>${param.title}</h2>
			<span class="byline">${param.description}</span> </div>
	
		     <jsp:include page="${param.content}.jsp"/>
	</div>
	
</div>
<div id="copyright" class="container">
       <p> <a href="http://miage.unice.fr/">Miage HOME</a> |<a href="https://github.com/marthe226/web-session-JEE">GitHub of the project</a> |<a href="http://miageprojet2.unice.fr/Intranet_de_Michel_Buffa/M1_Miage_2014-2015_Technologies_Web/TP2_Technologies_Web_M1_Miage_2014-2015">Web page of this TP</a>  
	<li>Copyright (c) 2020-2020  Miage Nice | Design by <a href="http://templated.co" rel="nofollow">TEMPLATED</a>.</li>
        <li> TP by BEN HAMOUDA Rihab & IDANI P. Marthe !  </li> </p>
    </div>  
</div>

                        
                
</body>
</html>