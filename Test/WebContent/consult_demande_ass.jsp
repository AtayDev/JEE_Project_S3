<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style_sans_slider.css">
<meta charset="UTF-8">
<title>Mes Demandes</title>
</head>
<body>
	<div class="container" >
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

		<div class="content" > 
			<table class="table-demandes">
					<tr>
						
						<th>ID<th>Titre<th>Ville<th>Description<th>Date Debut<th>Date Fin<th>Statut<th>Type<th>Montant Visé<th>Montant Accumulé<th>nbBenevoles Visé<th>nbBenevoles Accumulé<th>Heure Debut<th>Adresse Benevolat<th>Rating<th>Image<th>
						
					</tr>
			<c:forEach items="${demandesList}" var="d">
					
					<tr>
						<td>${d.dem_id}</td>
						<td>${d.dem_titre}</td>
						<td>${d.dem_ville}</td>
						<td>${d.dem_description}</td>
						<td>${d.date_debut}</td>
						<td>${d.date_fin}</td>
						<td>${d.dem_statut}</td>
						<td>${d.dem_type}</td>
						<td>${d.montant_but}</td>
						<td>${d.montant_vrai}</td>
						<td>${d.nbBenevoles_but}</td>
						<td>${d.nbBenevoles_vrai}</td>
						<td>${d.heure_debut}</td>
						<td>${d.rating}</td>
						<td><img src="${d.filename}" width="200" height="200"></td>
						
					</tr>
					
				</c:forEach>
			</table>
		
		</div>
		
		<div class="footer">Footer</div>
	</div>	

</body>
</html>