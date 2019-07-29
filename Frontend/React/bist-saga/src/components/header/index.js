import React,{Component} from 'react';
import {NavLink} from 'react-router-dom';
class  Header extends Component{
    render(){
        return (<div className="ui pointing menu">
        <div className="ui container">
            <NavLink to="/" exact className="header item"><img className="logo" src="https://www.borsaistanbul.com/images/default-source/kurumsal/borsa_istanbul_logo_yatay.png?sfvrsn=4" /></NavLink>
            <NavLink activeClassName="active" exact to="/cars" className="item">Cars Module</NavLink>
        </div>
    </div>);
    }
}

export default Header;