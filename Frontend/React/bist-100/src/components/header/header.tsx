import React from 'react';
import './header.css'
import Cart from './components/cart/cart';
import Profile from './components/profile/profile';
import { IHeaderProp } from './IHeader.prop';
class Header extends React.Component<IHeaderProp> {

    render = () => (
        <div className="ui pointing menu">
            <a className="active item">Home</a>
            <a className="item">Messages</a>
            <a className="item">Friends</a>
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
        </div>);
}

export default Header;