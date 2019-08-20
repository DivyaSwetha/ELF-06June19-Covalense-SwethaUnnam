import React from 'react'



export class Login extends React.Component{
            constructor(props){
                super(props)
            }

render(){
    return (
            
              <div className="card text-white bg-dark" style={{maxWidth: '20rem',marginTop:'10rem',marginLeft:'45rem'}}>
        <div className="card-header" style={{fontSize:25}}>Library Management System</div>
        <div className="card-body">
         
          <form>
          <div className="form-group">
        <label htmlFor="sel1">Login as:</label>
        <select className="form-control" id="sel1">
          <option>User</option>
          <option>Librarian</option>
          <option>Admin</option>
        </select>
      </div>
        <div className="form-group">
          <label htmlFor="exampleInputEmail1">Id</label>
          <input type="email" className="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter your library ID" />
        </div>
        <div className="form-group">
          <label htmlFor="exampleInputPassword1">Password</label>
          <input type="password" className="form-control" id="exampleInputPassword1" placeholder="Password" />
        </div>
       
        <button type="submit" className="btn btn-primary">Submit</button>
      </form>
        </div>
      </div>


    );
}



}


export default Login;