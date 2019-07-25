import React from 'react';
import { MemoryRouter, Route, Link } from 'react-router-dom';
import './App.css';
import Header from './components/header/header';
import Footer from './components/footer/footer';
import Carousel from './components/carousel/carousel';
import Testo from './components/testo/testo';


// const pageOne = () => (
//   <div>Dashboard <br />
//     <Link to="/p2">Page Two</Link>
//   </div>);
// const pageTwo = () => (<div>Page Two <br /></div>);

class App extends React.Component {
  render = () => (
    <div className="ui container" >
      {/* 
      <Carousel UserName="Gani"/>
      <Footer /> */}
      <MemoryRouter>
        <Header
          cartProp={{ cartCount: 3, cartTotal: 63.43 }}
          profile={{ loggedUserId: 1, loggedUserName: "Gani" }} />
        <Route path="/" exact component={Carousel} />
        <Route path="/testo" component={Testo} />
      </MemoryRouter>

    </div>
  );
}

export default App;
