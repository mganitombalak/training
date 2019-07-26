import React from 'react';
import { Route, BrowserRouter } from 'react-router-dom';
import './App.css';
import Header from './components/header/header';
import Footer from './components/footer/footer';
import Carousel from './components/carousel/carousel';
import Testo from './components/testo/testo';
import { Cart } from './modules/cart/cart';
import { createStore } from 'redux';
import { carouselReducer } from './components/carousel/carousel-reducer';
import { Provider } from 'react-redux';

const store = createStore(carouselReducer);

// const pageOne = () => (
//   <div>Dashboard <br />
//     <Link to="/p2">Page Two</Link>
//   </div>);
// const pageTwo = () => (<div>Page Two <br /></div>);

class App extends React.Component {
  render = () => (
    <div>
      <BrowserRouter>
        <Header
          cartProp={{ cartCount: 3, cartTotal: 63.43 }}
          profile={{ loggedUserId: 1, loggedUserName: "Gani" }} />
        <div className="ui main container">
          <Provider store={store}>
            <Route path="/" exact component={Carousel} />
            <Route path="/cart" component={Cart} />
            <Route path="/testo" component={Testo} />
          </Provider>
        </div>
      </BrowserRouter>
      <div className="ui inverted vertical footer segment">
        <Footer />
      </div>
    </div>
  );
}

export default App;
