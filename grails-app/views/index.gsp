<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="site"/>
    <title>Book Store Home</title>
</head>

<body>
<div class="jumbotron jumb-margin">
    <div class="container">
        <h1 class="text-center">Book Store</h1>
    </div>
</div>
<!-- Simple Ajax link to show time -->
<g:link controller="home" action="showTime" elementId="timeLink">Show the time!</g:link>
<div id="time"> time </div>

<g:link controller="home" action="getMostRecentBook" elementId="recentBookLink">Most Recent Book</g:link>
<div id="mostRecentBook">Most recent book placeholder</div>

<p>Under construction</p>
<p>
    <g:link controller="controllerList">Go to ControllerList</g:link>
</p>

</body>
</html>
