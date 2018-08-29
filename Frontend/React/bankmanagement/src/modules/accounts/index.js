import React,{Component} from 'react';
import AccountsTable from './accountsTable'

class Accounts extends Component{
    render(){
        return (
        <AccountsTable {...this.props}/>
      )
    }
}
export default Accounts