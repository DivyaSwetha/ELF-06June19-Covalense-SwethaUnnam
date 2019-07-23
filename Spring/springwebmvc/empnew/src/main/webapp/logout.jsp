<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Employee Training</title>
</head>

<body>
    <div class="container"  style="width:1000px">
    <div class="col-md-4   mx-auto card mt-4 offset-12"  >
        <div class="card-body justify-content-center">
            <h4 class="text-center border-bottom">Employee Training</h4><br><br>
				<span style="color: blue"><%=request.getParameter("logout") %></H1></span>
            <form action="./login">
                <div class="form-group">
                        <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                  <span class="input-group-text">ID</span>
                                </div>
                                <input type="text" name="id" class="form-control" placeholder="Enter Employee ID">
                              </div>
                
                              <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                      <span class="input-group-text">Course ID</span>
                                    </div>
                                    <input type="password" name="password" class="form-control" placeholder="Enter Password">
                                  </div>
                    <div class="row justify-content-center">

                        <div><button  type="submit"class="form-control btn btn-outline-secondary col-sm"> Submit</button></div>
                        <div><button type="reset" class="form-control btn btn-outline-success col-sm">reset</button></div>

                    </div>
                     
                      
                            
            </form><br><br>
            <div class="row justify-content-center">

                <div><a class="form-control  col-sm" href="">SignUp</a></div>
                <div><a class="form-control  col-sm" href="">Forgot password?</a></div>

            </div>


        </div>
    </div>

</div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>

</html>