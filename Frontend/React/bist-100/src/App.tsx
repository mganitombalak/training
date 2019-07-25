import React from 'react';
import './App.css';
import Header from './components/header/header';
import Footer from './components/footer/footer';
import Carousel from './components/carousel/carousel';

class App extends React.Component {
  render = () => (
    <div className="ui container" >
      <Header
       cartProp={{cartCount:3,cartTotal:63.43}}
       profile={{loggedUserId:1,loggedUserName:"Gani"}} />
      <Carousel UserName="Gani"/>
      <Carousel UserName="Suleyman"/>
      <Footer />
    </div>
  );
}

export default App;
