<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="site"/>
    <title>Book Store Books</title>
</head>

<body>
<h1> BOOKS </h1>
<ul>
    <g:each in="${bkList}">
        <g:if test="${it?.cover}">
            <li>
                ${it.title} by ${it.author} <img src="/prog1/book/showCover/${it.id}" alt="" class="img-thumbnail">
            </li>
        </g:if>
        <g:else>
            <li>
                ${it.title} by ${it.author}
            </li>
        </g:else>
    </g:each>
</ul>
</body>
</html>
</html>