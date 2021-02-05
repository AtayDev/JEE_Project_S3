<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up Association</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style_sans_slider.css">
</head>
<body>

 <div class="container">
	 <div class="header">
		<img class="logo" src="images/logoHero.png" alt="logo">
			<nav>
				<ul class="nav_links">
					<li><a href="">Créer Une Demande</a></li>
					<li><a href="hey.create_demande_ass">Consulter Mes Demandes</a></li>
					<li><a href="#">About</a></li>
				</ul>
			</nav>
			<a class="contact" href="#"><button>Contact</button></a>
	</div>
	
 
	<div class="content" >
		<div class="demande-form">	
			<form  action="Yes.create_demande_ass" method="post" enctype="multipart/form-data">
			    <h1>Demandez de l'aide dans vos projets</h1>
				<input type="text" name="titre" class="input-box" placeholder="Titre de votre projet"><br>
				<input type="text" name="ville" class="input-box" placeholder="Ville ou se situe le projet "><br>
				<input type="text" name="description" class="input-box" placeholder="Décrire Votre projet"><br>
				<input type="text" name="date_debut" class="input-box" placeholder="Date de comencement du projet(format DD/MM/YYYY)"><br>
				<input type="text" name="date_fin" class="input-box" placeholder="Date du fin du projet(format DD/MM/YYYY)"><br>
				<input type="file" name="file" class="input-box"><br>
				<input type="text" name="dem_statut" class="input-box" placeholder="Statut de votre projet(Bas-Normal-Urgent)"><br>
				<input type="text" name="dem_type" class="input-box" placeholder="Type de Votre Projet(Financement ou Benevolat?)"><br>
				<input type="text" name="montant_but" class="input-box" placeholder="Montant visé (type Financement)"><br>
				<input type="text" name="nbBenevoles_but" class="input-box" placeholder="Nombre visé des volontaires (type Benevolat)"><br>
				<input type="text" name="heure_debut" class="input-box" placeholder="Heure de debut de l'evenement(type Financement)"><br>
				<input type="text" name="adresse_benevolat" class="input-box" placeholder="Adresse du deroulement de projet(type Benevolat)"><br>
				<button type="submit" class="signup-btn" class="input-box">Publier</button>
				
							
			</form> 
		</div>
		
	</div>
		
	<div class="footer">Footer</div>
</div>
</body>
</html>