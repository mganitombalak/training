import React from 'react';
import ReactDOM from 'react-dom';
import { shallow } from 'enzyme';
import AccountsTable from './index';
import { Provider } from 'react-redux';
import { createStore } from 'redux'
describe('<AccountsTable/>',()=>{
  it('should be rendered without crashing (Enzyme)', () => {
    shallow(<AccountsTable/>);
  });

  it('should not have props',()=>{
      const  topMenu = shallow(<AccountsTable/>);
      expect(topMenu.props().length === undefined).toBe(true);
  });

  fit('has a table component',()=>{
      const reducer = (state={count:0,accountsData:[]},action) =>{
        switch(action.type)
        {
          case ACTION_PLUS:
          return {count:state.count+1}
          case ACTION_MINUS:
          return {count:state.count-1}
          case ACTION_POPULATE:
          return {
            count:action.data.length,
            accountsData:action.data
          }
          default:
          return state;
        }
      };
      const  testStore= createStore(reducer);
      const accountTable = shallow(<Provider store={testStore}><AccountsTable/></Provider>);
      expect(accountTable.contains('Table')).toBe(true);
  });

})