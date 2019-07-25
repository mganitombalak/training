import React from 'react';
import faker from 'faker/locale/tr';
import { ICarouselProp } from './ICarousel.prop';
import CarouselItem from './carousel-item/carousel-item';
import { ProductService } from '../../services/product-service';
import { ICarouselState } from './ICarousel.state';
import { IProductModel } from '../../models/IProductModel';

class Carousel extends React.Component<ICarouselProp, ICarouselState>{

  constructor(props: ICarouselProp) {
    super(props);
    this.state = { data: [] as Array<IProductModel> };
  }

  render = () => (
    <div className="ui link cards">
      {this.state.data.map(p =>
        <CarouselItem
          key={p.id}
          id={p.id}
          brand={p.brand}
          enginePower={p.enginePower}
          model={p.model}
          modelYear={p.modelYear} />)}
    </div>
  );

  componentDidMount() {
    let ps = new ProductService();
    ps.read().then(r => {
      this.setState({ data: r });
      console.log(r);
    })
      .catch(e => console.log(e));
  }
}

export default Carousel;