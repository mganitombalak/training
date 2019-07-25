import React from 'react';
import faker from 'faker/locale/tr';
import { IProductModel } from '../../../models/IProductModel';
class CarouselItem extends React.Component<IProductModel> {
    render = () => (
        <div className="card">
            <div className="image"><img src={faker.image.transport()}/></div>
            <div className="content">
                <div className="header">{this.props.brand}</div>
                <div className="meta"><a>{this.props.model}</a></div>
                <div className="description">
                    {this.props.enginePower} HP
                </div>
            </div>
            <div className="extra content">
                <span className="right floated">Model in {this.props.modelYear}</span>
                <span><i className="user icon"></i>75 Likes</span>
            </div>
        </div>
            );
    }
    
export default CarouselItem;