<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">

  <h4><b>Congratulations....successfully inserted new data </b></h4>
  
  <table class="table table-hover">
   
    <thead>
      <tr>
        <th>EmployeeId</th>
        <th>EmployeeName</th>
        <th>Password</th>
        <th>Email</th>
        <th>salary</th>
     
      </tr>
    </thead>
    <tbody>
      <tr>
      <td>${employeeDTO.employeeId}</td>
        <td>${employeeDTO.employeeName}</td>
        <td>${employeeDTO.password}</td>
        <td>${employeeDTO.emailId}</td>
        <td>${employeeDTO.salary}</td>
        
      </tr>
      
    </tbody>
  </table>
</div>

</body>
</html>
