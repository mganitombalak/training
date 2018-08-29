import React from 'react';
import ReactDom from 'react-dom';

import App from './App'

xdescribe('<App/> component',()=>{
    it('should be rendered without errors',()=>{
        const reactContainer = document.createElement('div');
        ReactDom.render(<App/>,reactContainer);
        ReactDom.unmountComponentAtNode(reactContainer);
    });
    it('should contain one element', () => {
        const div = document.createElement('div');
        ReactDOM.render(<App/> , div);
        expect(div.children.length===1).toBe(1);
        ReactDOM.unmountComponentAtNode(div);
      });
});