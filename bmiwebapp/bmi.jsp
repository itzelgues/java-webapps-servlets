 <!DOCTYPE html>
     <html lang="en">
         <head>
             <meta charset="UTF-8" />
             <title>"Testing"></title>
         </head> 
<body>
<H1> Calculate your Body Mass Index </H1>
 <form name="bmiForm" action="bmiServlet" method="POST">
    <table>
        <tr>
            <td>Your Weight (kg) :</td>
            <td><input type="text" name="weight"/></td>
        </tr>
        <tr>
            <td>Your Height (m) :</td>
            <td><input type="text" name="height"/></td>
        </tr>
        <th><input type="submit" value="Submit" name="find"/></th>
        <th><input type="reset" value="Reset" name="reset" /></th>
    </table>
  </body>

</html>
