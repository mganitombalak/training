import React from 'react';
import faker from 'faker/locale/tr';
import { ICarouselProp } from './ICarousel.prop';
import CarouselItem from './carousel-item/carousel-item';
import { ProductService } from '../../services/product-service';
import { ICarouselState } from './ICarousel.state';

class Carousel extends React.Component<ICarouselProp, ICarouselState>{

  constructor(props: ICarouselProp) {
    super(props);
    this.state={data:[]};
  }
  render = () => (
    <div className="ui link cards">
      <CarouselItem />
      <CarouselItem />
      <CarouselItem />
      <CarouselItem />
      <CarouselItem />
    </div>
  );

  componentDidMount() {
    let ps = new ProductService();
    ps.read().then(r => this.setState({data:r}))
      .catch(e => console.log(e));
  }
}

export default Carousel;