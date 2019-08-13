import React, { Component } from 'react'
import Axios from 'axios';

/* const required = (value) => {
    if (!value.toString().trim().length) {
      // We can return string or jsx as the 'error' prop for the validated Component
      return 'require';
    }
  }; */

export class CreateAccount extends Component {
    constructor(props){
        super(props)
            this.state={
                name:'',
                email:'',
                phoneno:'',
                password:''
            }
        this.postData=this.postData.bind(this);
    }

   
    postData(event){
        event.preventDefault();
        this.state.validation();
        console.log('post Data',this.state);
        let accountDate=this.state;
        Axios.post('https://emp-application-34844.firebaseio.com/accounts.json',accountDate).then((response)=>{console.log('Response oobject',Response);
        this.setState({
            name:'',
            email:'',
            phoneno:'',
            password:''
        })}).catch((error)=>{console.log('Error',error)});

    }  

    validation(){
        const regExp=/^[a-zA-Z]$/;
        const name=this.state.name;
        if(!regExp.test(name)){
            alert('Name should not be empty')
            return false;

        }else{
            return true;
        }

        /* const mailEx=/^[a-zA-Z0-9]+.com$/;
        const email=this.email;
        if(!mailEx.test(email)){
            alert('Enter correct mail id');
            document.getElementById('email').focus();
            return false;
        }else{
            return true;
        }

        const phoneno=this.phoneno;
        if(phoneno.length>10&&phoneno.length<=10){
            alert('enter correct 10-digits phone number');
            document.getElementById('phone').focus();
            return false;
        }else{
            return true;
        }

        const passExp=/^[a-zA-Z]$/;
        const password=this.password;
        if(!passExp.test(password)){
            alert('password shoule not be empty');
            document.getElementById('password').focus();
            return false;

        }else{
            return true;
        } */
    }
    
    render() {
        return (
            <div>
                <form onSubmit={this.postData} style={{marginTop:50,marginLeft:200,marginRight:200}}>
                        <div className="row">
                            <div className="col">
                            <input type="text" id='name' onChange={(event)=>{this.setState({name:event.target.value})}} value={this.state.name} className="form-control" placeholder="Name"/>
                            </div>
                            <div className="col">
                            <input type="mail" id='email' onChange={(event)=>{this.setState({email:event.target.value})}} value={this.state.email} className="form-control" placeholder="Email"/>
                            </div>
                        </div>
                        <br/>
                        <div className="row">
                            <div className="col">
                            <input type="number" id='phone' onChange={(event)=>{this.setState({phoneno:event.target.value})}} value={this.state.phoneno} className="form-control" placeholder="Phone number"/>
                            </div>
                            <div className="col">
                            <input type="password" id='password' onChange={(event)=>{this.setState({password:event.target.value})}} value={this.state.password} className="form-control" placeholder="Password"/>
                            </div>
                        </div><br/>
                        <button type="submit" className="btn btn-success" style={{marginLeft:565}}>Create</button>
                 </form>
            </div>
        )
    }
};

export default CreateAccount
