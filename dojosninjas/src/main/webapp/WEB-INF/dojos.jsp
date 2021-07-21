<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Dojo Page</title>
</head>
<body>
    <div class="container">
        <h1><c:out value="${dojo.name}"/> Ninjas</h1>
        <table class="table table-dark table-striped">
            <thead>
                <tr>
                    <th>FirstName</th>
                    <th>lastName</th>
                    <th>Age</th>
                </tr>
            </thead>
            <tbody>
               <c:forEach items="${dojo.ninjas}" var="ninja">
                    <tr>
                        <td><c:out value="${ninja.firstName}"/></td>
				        <td><c:out value="${ninja.lastName}"/></td>
				        <td><c:out value="${ninja.age}"/></td>
                    </tr>
                </c:forEach>
            </tbody>

        </table>
    </div>
</body>
</html>