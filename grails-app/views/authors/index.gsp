<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="site"/>
    <title>Book Store Books</title>
</head>

<body>
<h1> AUTHORS </h1>
<ul>
    <g:each in="${authorList}">
        <li>${it["author"]}</li>
    </g:each>

    <g:each in="${bkList}">
        <li> ${it.title} by ${it.author} </li>
    </g:each>
</ul>
</body>
</html>
</html>