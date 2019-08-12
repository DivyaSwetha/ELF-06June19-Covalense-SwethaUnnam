import React, { Component } from 'react'
import Axios from 'axios';

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
    
    render() {
        return (
            <div>
                <form onSubmit={this.postData} style={{marginTop:50,marginLeft:200,marginRight:200}}>
                        <div className="row">
                            <div className="col">
                            <input type="text" onChange={(event)=>{this.setState({name:event.target.value})}} value={this.state.name} className="form-control" placeholder="Name"/>
                            </div>
                            <div className="col">
                            <input type="mail" onChange={(event)=>{this.setState({email:event.target.value})}} value={this.state.email} className="form-control" placeholder="Email"/>
                            </div>
                        </div>
                        <br/>
                        <div className="row">
                            <div className="col">
                            <input type="number" onChange={(event)=>{this.setState({phoneno:event.target.value})}} value={this.state.phoneno} className="form-control" placeholder="Phone number"/>
                            </div>
                            <div className="col">
                            <input type="password" onChange={(event)=>{this.setState({password:event.target.value})}} value={this.state.password} className="form-control" placeholder="Password"/>
                            </div>
                        </div><br/>
                        <button type="submit" className="btn btn-success" style={{marginLeft:565}}>Create</button>
                 </form>
            </div>
        )
    }
};

export default CreateAccount
