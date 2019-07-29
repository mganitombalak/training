import React,{Component} from 'react';

class CarItem extends  Component {
    render(){
        return (<div className="card">
        <div className="image"><img src={this.props.image}/></div>
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
    </div>);
    }
}

export default CarItem;