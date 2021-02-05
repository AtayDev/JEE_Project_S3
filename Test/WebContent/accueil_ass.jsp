<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil Association</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style_sans_slider.css">
</head>
<body>
	<div class="container">
		<div class="header">
			<img class="logo" src="images/logoHero.png" alt="logo">
			<nav>
				<ul class="nav_links">
					<li><a href="hey.create_demande_ass">Créer Une Demande</a></li>
					<li><a href="hey.consult_demande_ass">Consulter Mes Demandes</a></li>
				</ul>
			</nav>
			<a class="contact" href="#"><button>Sign Out</button></a>
		</div>

		<div class="content"> <p>Vous êtes ${ sessionScope.ass_name } ${ sessionScope.ass_id } !</p></div>
		<div class="footer">Footer</div>
	</div>	
</body>
</html>