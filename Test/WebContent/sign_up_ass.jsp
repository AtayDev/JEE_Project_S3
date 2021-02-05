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
					<li><a href="hey.register_dona">Espace Donneur</a></li>
					<li><a href="hey.sign_up_ass">Espace Association</a></li>
					<li><a href="#">About</a></li>
				</ul>
			</nav>
			<a class="contact" href="#"><button>Contact</button></a>
	</div>
	
 
	<div class="content">
		<div class="sign-up-form">	
			<form  action="Yes.sign_up_ass" method="post">
			    <h1>Sign Up Association</h1>
				<input type="text" name="nom" class="input-box" placeholder="Nom"><br>
				<input type="text" name="email" class="input-box" placeholder="Email"><br>
				<input type="text" name="password" class="input-box" placeholder="Password"><br>
				<input type="text" name="telephone" class="input-box" placeholder="Telephone"><br>
				<input type="text" name="adresse" class="input-box" placeholder="Adresse"><br>
				<input type="text" name="description" class="input-box" placeholder="Description"><br>
				<input type="text" name="image" class="input-box" placeholder="Image"><br>
				<input type="text" name="rib" class="input-box" placeholder="Rib"><br>
				<button type="submit" class="signup-btn" class="input-box">Sign Up</button>
				<hr>
				<p>Vous avez deja un compte?</p>
				<a href="hey.login_ass" class="se-connecter">Sign In</a>
							
			</form> 
		</div>
		<%-- <center>Vous avez deja un compte:<a href="hey.login_ass">Se connecter</a></center> --%>
	</div>
		
	<div class="footer">Footer</div>
</div>
</body>
</html>