import React from 'react';
import ReactDOM from 'react-dom';
class Hello extends HTMLElement {
    connectedCallback() {
      const mountPoint = document.createElement('span');
      this.attachShadow({ mode: 'open' }).appendChild(mountPoint);
      const name = this.getAttribute('name');
      ReactDOM.render(<p>Hello {name}</p>, mountPoint);
    }
}
customElements.define('hello-comp', Hello);

// yarn add @webcomponents/webcomponentsjs