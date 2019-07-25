import React, { MouseEvent } from 'react';
import './cart.css'
import { ICartProp } from './ICart.prop';
class Cart extends React.Component<ICartProp> {
    onCartClick(event: MouseEvent<HTMLDivElement>): void {
        alert("You have " + this.props.cartCount + " item(s) in your cart!");
    }

    constructor(props: ICartProp) {
        super(props);
        this.onCartClick= this.onCartClick.bind(this);
    }
    // onCartClick = (event: MouseEvent<HTMLDivElement>) =>
    //     alert("You have " + this.props.cartCount + " item(s) in your cart!");

    render = () => (
        <div>
            <i className="shopping cart icon"></i>
            <div onClick={this.onCartClick} className="floating ui red tiny label">{this.props.cartCount}</div>
        </div>
    );
}

export default Cart;