<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>New Ninja</title>
</head>
<body>
    <h1>New Ninja</h1>
        <form:form class="center" action="/ninja/new" method="post" modelAttribute="ninja">
        <p>
            <form:label path="dojo">Dojo: </form:label>
            <form:select path="dojo">
   			    		<c:forEach items="${dojo}" var="dojo">
   			    			<form:option value="${dojo}"><c:out value="${dojo.name}"/></form:option>
		    			</c:forEach>
 			</form:select>
        </p>
        <p>
            <form:label path="firstName">FirstName: </form:label>
            <form:input  path="firstName"/>
        </p>
        <p>
            <form:label path="lastName">lastName: </form:label>
            <form:input  path="lastName"/>
        </p>
        <p>
            <form:label path="age">Age: </form:label>
            <form:input  path="age"/>
        </p>
        
    <input type="submit" value="Create"/>
</form:form>    
</body>
</html>