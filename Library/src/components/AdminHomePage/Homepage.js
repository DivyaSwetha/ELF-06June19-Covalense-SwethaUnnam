import React from 'react'

export class AdminHome extends React.Component{
    render(){
        return (
                    <div>

                            
      <nav className="navbar navbar-expand-lg bg-dark">
        <a className="navbar-brand" href="#"  style={{color:"whitesmoke"}}>LMS</a>
        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span className="navbar-toggler-icon" />
        </button>
        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav mr-auto">
            <li className="nav-item active">
              <a className="nav-link" href="#"  style={{color:"whitesmoke"}}>Home <span className="sr-only">(current)</span></a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="#"  style={{color:"whitesmoke"}}>Logout</a>
            </li>
            <li className="nav-item dropdown">
              <a className="nav-link dropdown-toggle"  style={{color:"whitesmoke"}} href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Users
              </a>
              <div className="dropdown-menu"  style={{color:"whitesmoke"}} aria-labelledby="navbarDropdown">
                <a className="dropdown-item" href="#">Add User</a>
                <a className="dropdown-item" href="#">Delete User</a>
                <a className="dropdown-item" href="#">Edit User</a>
              </div>
            </li>
         
          </ul>
          <form className="form-inline my-2 my-lg-0">
            <input className="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" />
            <button className="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
          </form>
        </div>
      </nav>
      <div>    
          <span> 
       <table className="table table-striped col-md-6 col-md-offset-3" style={{marginTop:'5rem',maxWidth:'20rem'}}>
        <thead>
          <tr>
            <th scope="col" colSpan={3}>Librarian Details</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <th scope="row">Name</th>
            <td>Mark</td>
          </tr>
          <tr>
            <th scope="row">Id</th>
            <td>11</td>
          </tr>
          <tr>
            <th scope="row">Phone no.</th>
            <td>9090909090</td>
          </tr>
        </tbody>
      </table>
      </span>
      <span>
      <table className="table table-striped col-md-3" style={{marginTop:'5rem',maxWidth:'20rem'}}>
        <thead>
          <tr>
            <th scope="col" colSpan={3}>Library Details</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <th scope="row">Total Books</th>
            <td>100000</td>
          </tr>
          <tr>
            <th scope="row">Total books rented</th>
            <td>25000</td>
          </tr>
         
        </tbody>
      </table>
      </span>
</div>

                    </div>



        );
    }
}


export default AdminHome;