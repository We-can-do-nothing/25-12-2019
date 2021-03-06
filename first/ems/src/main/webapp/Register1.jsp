<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login Form Widget  Responsive Widget Template :: w3layouts</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="User Login Form Widget Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<!--google fonts-->
<link href='//fonts.googleapis.com/css?family=Oswald' rel='stylesheet' type='text/css'>
<script src="js/jquery-2.1.4.min.js"></script>
</head>
<body>		
					
					<h3>Sign up form</h3>						
				</div>
				<div class="modal-body modal-spa">
					<div class="login-form">			
						<form action=""${pageContext.request.contextPath }/RegisterServlet?cmd=register"" method="post" id="signup">
						<ol>
						<li>
								<input type="text" id="name" name="nickname" placeholder="Username or Phone number" title="Name" required />
								
							</li>
							<li>
								<input type="text" id="name" name="password" placeholder="password" title="Name" required />
								
							</li>
							<li>
								<input type="email" id="email" name="password" placeholder="ensure password" title="Please enter a valid email" required />
								<p class="validation01">
									<span class="invalid">Please enter a valid email address e.g. <a class="__cf_email__" href="/cdn-cgi/l/email-protection" data-cfemail="17656e767957726f767a677b723974787a">[email&#160;protected]</a><script data-cfhash='f9e31' type="text/javascript">/* <![CDATA[ */!function(t,e,r,n,c,a,p){try{t=document.currentScript||function(){for(t=document.getElementsByTagName('script'),e=t.length;e--;)if(t[e].getAttribute('data-cfhash'))return t[e]}();if(t&&(c=t.previousSibling)){p=t.parentNode;if(a=c.getAttribute('data-cfemail')){for(e='',r='0x'+a.substr(0,2)|0,n=2;a.length-n;n+=2)e+='%'+('0'+('0x'+a.substr(n,2)^r).toString(16)).slice(-2);p.replaceChild(document.createTextNode(decodeURIComponent(e)),c)}p.removeChild(t)}}catch(u){}}()/* ]]> */</script></span>
									<span class="valid">Thank you for entering a valid email</span>
								</p>
							</li>
							<li>
								<input type="tel" id="tel" name="gender" pattern="\d{10}" placeholder="gender" required />
								<p class="validation01">
									<span class="invalid">No spaces or brackets e.g. 0534907286</span>
									<span class="valid">That's what we wanted!</span>
								</p>
							</li>
							<li>
								<input type="password" class="lock" name="salary" title="Minimum 8 characters, one number, one uppercase and one lowercase letter" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*" placeholder="salary" id="password1" required />
								<p class="validation01">
									<span class="invalid">Minimum 8 characters, one number, one uppercase letter and one lowercase letter</span>
									<span class="valid">Your password meets our requirements, thank you.</span>
								</p>
							</li>
						
							</ol>
							<div class="signin-rit">
								<span class="checkbox1">
									 <label class="checkbox"><input type="checkbox" name="checkbox" checked="">I agree to <a class="pp" href="#"> Terms</a> and <a class="pp" href="#"> Privacy Policy</a></label>
								</span>
								<div class="clear"> </div>
							</div>
							<input type="submit" value="Sign Up">
						</form>	
						<!-- script for password confirmation -->
						<script type="text/javascript">
							window.onload = function () {
								document.getElementById("password1").onchange = validatePassword;
								document.getElementById("password2").onchange = validatePassword;
							}
							function validatePassword(){
							var pass2=document.getElementById("password2").value;
							var pass1=document.getElementById("password1").value;
							if(pass1!=pass2)
								document.getElementById("password2").setCustomValidity("Passwords Don't Match");
							else
							document.getElementById("password2").setCustomValidity('');	 
							//empty string means no validation error
							}
						</script>
						<!-- //script for password confirmation -->
																											
						</div>									
					</div>
				</div>
			</div>
			<div class="clear"></div>
			<p class="footer">© 2016 User Login Form Widget. All Rights Reserved | Design by <a href="http://w3layouts.com/"> W3layouts</a></p>
			</div>	
			
</body>
</html>