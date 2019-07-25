import React from 'react';
import faker from 'faker/locale/tr';
import { ICarouselProp } from './ICarousel.prop';
class Carousel extends React.Component<ICarouselProp>{

    render =()=>(
        <a className="ui card" href="http://www.dog.com">
  <div className="content">
    <div className="header">{faker.name.firstName()}</div>
    <div className="meta">
      <span className="category">{faker.name.lastName()}</span>
    </div>
    <div className="description">
      <p>{faker.company.companyName()}</p>
    </div>
  </div>
  <div className="extra content">
    <div className="right floated author">
      <img className="ui avatar image" src={faker.image.avatar()}/> 
      {this.props.UserName}
    </div>
  </div>
</a>
    );
}

export default Carousel;