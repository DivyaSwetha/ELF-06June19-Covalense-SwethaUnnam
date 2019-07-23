<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Employee Information</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/style1.css">

</head>
<body>
   
      
  <div class="container mx-auto mt-4 signup-content">
    <p class="h3" style="margin-left: 40%">Employee Information</p>
    <hr>
    <div><span style="color: red">
    <%=request.getParameter("msg") %>
    ${param.msg}
    </span></div>
    
<form   name="myform" method="post" action="/emp/insert" onsubmit="return validateform()">
    <div class="row">
      <div class="col">
            <label for="exampleInputEmail1">Id</label>
        <input type="text" name="id" class="form-control" placeholder="Employee Id">
      </div>
      <div class="col">
        <label for="exampleInputEmail1">Name</label>
    <input type="text" name="name" class="form-control" placeholder="Enter Name">
      </div>
    </div>
    <div class="row">
      <div class="col">
            <label for="exampleInputEmail1">Password</label>
        <input type="text" name="password" class="form-control" placeholder="Enter password...">
      </div>
      <div class="col">
        <label for="exampleInputEmail1">Confirm Pasword</label>
    <input type="text" name="cpassword" class="form-control" placeholder="Confirm Password...">
      </div>
    </div>
    <div class="row">
      <div class="col">
        <label for="exampleInputEmail1">Account Number</label>
    <input type="text" name="accountNumber" class="form-control" placeholder="Account Number">
  </div>
     
      <div class="col">
            <label for="exampleInputEmail1">Email Id</label>
        <input type="text" name="email" class="form-control" placeholder="Email Id">
      </div>
    </div>
    <div class="row">
      <div class="col">
            <label for="exampleInputEmail1">Age</label>
        <input type="text" name="age" class="form-control" placeholder="Age">
      </div>
      <div class="col">
            <label for="exampleInputEmail1">Designation</label>
        <input type="text" name="designation" class="form-control" placeholder="Designation">
    </div>
    </div>
    <div class="row">
            <div class="col">
                    <label for="inputGender">Gender</label>
                    <select id="inputGender" name="gender" class="form-control">
                      <option selected>--select one--</option>
                <option value="male">male</option>
                <option value="female">female</option>
                <option value="other">other</option>
            </select>
            </div>
            <div class="col">
                    <label for="exampleInputEmail1">Date of Birth</label>
                <input type="date" name="dob" class="form-control" placeholder="dd-mm-yyyy">
            </div>
      </div>
    <div class="row">
            <div class="col">
                  <label for="exampleInputEmail1">Salary</label>
              <input type="text" name="salary" class="form-control" placeholder="Salary">
            </div>
            <div class="col">
                  <label for="exampleInputEmail1">Department Id</label>
              <input type="text" name="departmentId" class="form-control" placeholder="Department Id">
          </div>
          </div>
          <div class="row">
                <div class="col">
                      <label for="exampleInputEmail1">Phone Number</label>
                  <input type="text" name="phone" class="form-control" placeholder="Phone Number">
                </div>
                <div class="col">
                      <label for="exampleInputEmail1">Manager Id</label>
                  <input type="text" name="managerId" class="form-control" placeholder="Manager Id">
              </div>
              </div>
              <div class="row">
                 
                    <div class="col-6">
                        <label for="exampleInputEmail1">Joining Date</label>
                      <input type="date" name="joiningDate" class="form-control" placeholder="Joining Date">
                    </div>
                    <div class="col-3">
                      <br>
                        <button class="form-submit" type="submit"class="form-control"> Submit</button>

                    </div ><div class="col-3">
                      <br>
                        <button class="form-submit" type="reset" class="form-control"  >reset</button>
                    </div>
                    
                  </div>     
  </form>
</div>
</body>
</html>