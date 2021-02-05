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
			<form  action="Yes.register_dona" method="post">
			    <h1>Sign Up Donnateur</h1>
			    <input type="text" name="email" class="input-box" placeholder="Email"><br>
				<input type="text" name="fname" class="input-box" placeholder="Nom"><br>
				<input type="text" name="lname" class="input-box" placeholder="Prénom"><br>
				<input type="text" name="password" class="input-box" placeholder="Password"><br>
				<input type="text" name="telephone" class="input-box" placeholder="Telephone"><br>
				<button type="submit" class="signup-btn" class="input-box">Sign Up</button>
				<hr>
				<p>Vous avez deja un compte?</p>
				<a href="hey.auth_dona" class="se-connecter">Sign In</a>
							
			</form> 
		</div>
		
	</div>
		
	<div class="footer">Footer</div>
</div>
</body>
</html>