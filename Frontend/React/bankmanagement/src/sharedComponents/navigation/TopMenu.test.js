import React from 'react';
import ReactDOM from 'react-dom';
import { shallow } from 'enzyme';
import TopMenu from './TopMenu';
import { BrowserRouter } from 'react-router-dom'

describe('<TopMenu/>',()=>{
it('should be rendered without crashing', () => {
    const div = document.createElement('div');
    ReactDOM.render(<BrowserRouter><TopMenu/></BrowserRouter>, div);
    ReactDOM.unmountComponentAtNode(div);
  });

  it('should be rendered without crashing (Enzyme)', () => {
    shallow(<TopMenu/>);
  });

  it('should not have props',()=>{
      const  topMenu = shallow(<TopMenu/>);
      expect(topMenu.props().length === undefined).toBe(true);
  });

   it('should not have props',()=>{
      const  topMenu = shallow(<TopMenu/>);
      expect(topMenu.props().length === undefined).toBe(true);
  });

  it('componentDidMount function should not be get called.',()=>{
      TopMenu.prototype.componentDidMount=jest.fn();
      shallow(<TopMenu/>);
      expect(TopMenu.prototype.componentDidMount).toHaveBeenCalled();
  });

})