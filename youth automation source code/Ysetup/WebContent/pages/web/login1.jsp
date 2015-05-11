<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<sj:head jqueryui="true" jquerytheme="showcase" customBasepath="themes" />
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Login</title>

<link href="css/login-box.css" rel="stylesheet" type="text/css" />
</head>

<body
	style="background-image: url('images/background-image.PNG'); background-repeat: repeat;">


	<div style="padding-top: 10%; padding-left: 30%;">


		<div id="login-box">

			<H2>Login</H2>
			<br /> Please Enter your Credentials to access the Application <br />
			<br />

			<s:form id="loginForm" action="actionLogin" theme="simple"	validate="false">

				<s:if test="hasActionErrors()">
					<div class="ui-widget actionError">
						<span style="float: left; margin-right: 0.3em;"
							class="ui-icon ui-icon-alert"></span> <span> Please Enter
							Valid User ID/Password </span>
					</div>
				</s:if>


				<div id="login-box-name" style="margin-top: 20px;">Username:</div>
				<div id="login-box-field" style="margin-top: 20px;">
					<s:textfield id="loginuser" name="loginUser.userName" cssClass="form-login" title="Username"		size="30" maxlength="2048" />
				</div>
				<div id="login-box-name">Password:</div>
				<div id="login-box-field">
					<s:password name="loginUser.pass"  cssClass="form-login" title="Password" size="30" maxlength="2048" />
				</div>
				<br />
				<span class="login-box-options"> <input type="checkbox"
					name="1" value="1" /> Remember Me <a href="#"
					style="margin-left: 30px;">Forgot password?</a></span>
				<br />
				<br />
				<input type="submit" value="   "	style="background-position: center; background-image: url('images/login-btn.png'); font-size: 30px; background-color: transparent; color: white; border: none; background-repeat: no-repeat; float: right;"></input>
			</s:form>
		</div>
	</div>
</body>
</html>
