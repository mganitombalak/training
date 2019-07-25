import React, { MouseEvent, Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component<{ value: string }> {
  handleClick(event: MouseEvent) {
    event.preventDefault();
    alert(event.currentTarget.tagName);
  }
  render = () => (
    <div className="App" onClick={this.handleClick}>
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.tsx</code> and save to reload.
          { this.props.value }
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer" >
          Learn React
        </a>
      </header>
    </div>
  );

}

export default App;
