import React from 'react';
import faker from 'faker/locale/tr';
import { ICarouselProp } from './ICarousel.prop';
import CarouselItem from './carousel-item/carousel-item';
class Carousel extends React.Component<ICarouselProp>{

    render =()=>(
      <div className="ui link cards">
        <CarouselItem/>
        <CarouselItem/>
        <CarouselItem/>
        <CarouselItem/>
        <CarouselItem/>
      </div>
    );
}

export default Carousel;