<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Random Quote</title>
</head>
<body>
<ul id="menu">
    <li>
        <g:remoteLink action="ajaxRandom" update="quote">
            Next Quote
        </g:remoteLink>
    </li>
    <li>
        <g:link action="index">
            Admin
        </g:link>
    </li>
</ul>
<div id="quote">
    <q>${quote.content}</q>
    <p>${quote.author}</p>
</div>
</body>
</html>