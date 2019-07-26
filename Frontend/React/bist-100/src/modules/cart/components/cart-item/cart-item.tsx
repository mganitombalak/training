import React from 'react';
import faker from 'faker/locale/tr'
export class CartItem extends React.Component {
    render = () => (
        <div className="item">
            <div className="ui small image"><img src={faker.image.fashion()} /></div>
            <div className="content">
                <div className="header">{faker.commerce.productName()}</div>
                <div className="meta">
                    <span className="price">${faker.commerce.price()}</span>
                    <span className="stay">Avaliable for 1 Month</span>
                </div>
                <div className="description">
                    <p>{faker.lorem.paragraphs(2)}</p>
                </div>
            </div>
        </div>
    )
}