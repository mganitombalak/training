import React, { MouseEvent } from 'react';
import './cart.css'
import { ICartProp } from './ICart.prop';
import { ICartState } from './ICart.state';
import { Link } from 'react-router-dom';
class Cart extends React.Component<ICartProp, ICartState> {
    // onCartClick(event: MouseEvent<HTMLDivElement>): void {
    //     alert("You have " + this.props.cartCount + " item(s) in your cart!");
    // }

    constructor(props: ICartProp) {
        super(props);
        // this.onCartClick = this.onCartClick.bind(this);
        this.state = { count: 0 };

    }
    onCartClick = (event: MouseEvent<HTMLDivElement>) =>
        this.setState({ count: this.state.count + 1 });
    // alert("You have " + this.props.cartCount + " item(s) in your cart!");

    render = () => (
        <Link to="/cart">
            <i className="shopping cart icon"></i>
            <div onClick={this.onCartClick} 
            className="floating ui red tiny label">{this.state.count}</div>
        </Link>
    );

    componentDidMount(){
        console.log("Cart did mount");
    }

    componentDidUpdate(){
        console.log("Cart did update");
    }

    componentWillUnmount(){
        console.log("Cart will unmount");
    }
}

export default Cart;