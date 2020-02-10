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

<!-- Simple get location -->
<p style="margin-top:20px"><button onclick="geoFindMe()" >Show my location</button></p>
<div id="latlong-out"></div>
<div id="mapid" style="height: 400px; width: 400px;"></div>

<asset:javascript src="geoloc.js"/>
<link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css"
      integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ=="
      crossorigin=""/>
<!-- Make sure you put this AFTER Leaflet's CSS -->
<script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js"
        integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og=="
        crossorigin=""></script>
<p>Under construction</p>
<p>
    <g:link controller="controllerList">Go to ControllerList</g:link>
</p>

</body>
</html>
