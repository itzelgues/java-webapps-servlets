<html>
    <head>
        <title>Student Record</title>
    </head>
    <body>
    <% 
        if (request.getAttribute("studentRecord") != null) {
    %>
 
    <h1>Student Record</h1>
    <div>ID: ${studentRecord.getId()} </div>
    <div>ID: ${studentRecord.getFirstName()} </div>
    <div>ID: ${studentRecord.getLastName()} </div>
        
    <% 
        } else { 
    %>
 
    <h1>No student record found.</h1>
         
    <% } %>	
    </body>
</html>
