<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>
<body>

    <div class="navbar navbar-default navbar-static-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
<<<<<<< Updated upstream
                <a class="navbar-brand" href="/${grails.util.Metadata.current.getApplicationName()}/">
                    <div class="navbar-brand title-name">Book Store</div>
<!--
                <a class="navbar-brand" href="/#">
		            <asset:image src="grails.svg" alt="Grails Logo"/>
-->
                </a>
                <sec:ifLoggedIn><li><a href="#"><sec:username/></a></li></sec:ifLoggedIn>
                <li>
                    <sec:ifLoggedIn><g:link controller="Logout">log out</g:link></sec:ifLoggedIn>
                    <sec:ifNotLoggedIn><g:link controller="login" action="auth">Login</g:link></sec:ifNotLoggedIn>
                </li>
            </div>
            <div class="navbar-collapse collapse" aria-expanded="false" style="height: 0.8px;">
                <ul class="nav navbar-nav navbar-right">
                    <g:pageProperty name="page.nav" />
                </ul>
            </div>
        </div>
    </div>

    <g:layoutBody/>

    <div class="footer" role="contentinfo"></div>

    <div id="spinner" class="spinner" style="display:none;">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>

    <asset:javascript src="application.js"/>

</body>
</html>
