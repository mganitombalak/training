import React from 'react';
import faker from 'faker/locale/tr';
import { ICarouselProp } from './ICarousel.prop';
import CarouselItem from './carousel-item/carousel-item';
import { ProductService } from '../../services/product-service';
import { ICarouselState } from './ICarousel.state';
import { IProductModel } from '../../models/IProductModel';
import { connect } from 'react-redux';
import { LOAD_PRODUCT_DATA } from './actions';

class Carousel extends React.Component<ICarouselProp, ICarouselState>{
  constructor(props: ICarouselProp) {
    super(props);
    this.state = {} as ICarouselState;
  }

  render = () => (
    // <div className="ui link cards">
    //   {this.state.data.map(p =>
    //     <CarouselItem
    //       key={p.id}
    //       id={p.id}
    //       brand={p.brand}
    //       enginePower={p.enginePower}
    //       model={p.model}
    //       modelYear={p.modelYear} />)}
    // </div>
    <div></div>
  );

  componentDidMount() {
  }
}

const mapStateToProps = (state: ICarouselState, props: ICarouselProp) => {
  return { data: state.data };
}

export default connect(mapStateToProps,{})(Carousel);