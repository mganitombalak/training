import React from 'react';
import { CartItem } from './components/cart-item/cart-item';

export class Cart extends React.Component {
    render = () => (<div className="ui items">
        {Array.from(Array(5).keys()).map(i => <CartItem key={i} />)}
    </div>)
}