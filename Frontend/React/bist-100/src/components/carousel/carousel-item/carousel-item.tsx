import React from 'react';
import faker from 'faker/locale/tr';
class CarouselItem extends React.Component {
    render = () => (
        <div className="card">
            <div className="image"><img src={faker.image.food()}/></div>
            <div className="content">
                <div className="header">{faker.name.firstName()+" "+faker.name.lastName()}</div>
                <div className="meta"><a>Friends</a></div>
                <div className="description">{faker.lorem.paragraph()}</div>
            </div>
            <div className="extra content">
                <span className="right floated">Joined in {faker.date.past().getFullYear()}</span>
                <span><i className="user icon"></i>75 Friends</span>
            </div>
        </div>
            );
    }
    
export default CarouselItem;