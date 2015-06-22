<!DOCTYPE html>
<html>
<head>
    <title>Fruit Picker - Freemarker and Spark Style</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>


<form action="/favorite_fruit" method="post">
    <p>whats your favorite fruit?</p>
    <!-- fruit is not defined here, its an array of fruits that will be passed to this tempate via a map from code-->
<#list  fruits as fruit>
    <p>
        <input type="radio" name="fruit" value="${fruit}">
    ${fruit}
        </input>

    </p>
</#list>
    <input type="submit" value="submit"/>


</form>
</body>

</html>
