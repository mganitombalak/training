import React from 'react';
import './header.css'
import Cart from './components/cart/cart';
import Profile from './components/profile/profile';
import { IHeaderProp } from './IHeader.prop';
import { Link, NavLink } from 'react-router-dom';
class Header extends React.Component<IHeaderProp> {

    render = () => (
        <div className="ui pointing menu">
            <div className="ui container">
                <NavLink to="/" exact className="header item"><img className="logo" src="https://www.borsaistanbul.com/images/default-source/kurumsal/borsa_istanbul_logo_yatay.png?sfvrsn=4" /></NavLink>
                <NavLink activeClassName="active" exact to="/testo" className="item">Testo</NavLink>
                <div className="ui simple dropdown item">Dropdown <i className="dropdown icon"></i>
                    <div className="menu">
                        <a className="item" href="#">Link Item</a>
                        <a className="item" href="#">Link Item</a>
                        <div className="divider"></div>
                        <div className="header">Header Item</div>
                        <div className="item">
                            <i className="dropdown icon"></i>Sub Menu
                            <div className="menu">
                                <a className="item" href="#">Link Item</a>
                                <a className="item" href="#">Link Item</a>
                            </div>
                        </div>
                        <a className="item" href="#">Link Item</a>
                    </div>
                </div>
                <div className="right menu">
                    <div className="item">
                        <Cart
                            cartCount={this.props.cartProp.cartCount}
                            cartTotal={this.props.cartProp.cartTotal} />
                    </div>
                    <div className="item">
                        <Profile
                            loggedUserId={this.props.profile.loggedUserId}
                            loggedUserName={this.props.profile.loggedUserName} />
                    </div>
                </div>
            </div>
        </div>);
}

export default Header;