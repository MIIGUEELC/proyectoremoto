<html>
<body>
    <table>
        <thead>
            <tr>
                
                <th>Nombre</th>
                <th>Continente</th>
                <th>Poblaci�n</th
                <th>A�o de independencia</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="pais" items="${paises}">
                <tr>
                    <td>${pais.name}</td>
                    <td>${pais.continent}</td>
                   
                    <td>${pais.population}</td>
                    <td>${pais.indepyear}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
