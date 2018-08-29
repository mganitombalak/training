import React, { Component } from 'react';
import TableRow from '../../../sharedComponents/tableRow'
import { Table } from 'react-bootstrap';
import './accountsTable.css'
import { connect } from 'react-redux';
import {loadData,TYPE_ACCOUNTS,populateData} from '../../common/actions'

class AccountsTable extends Component {
    constructor(props){
        super(props);
        this.deleteData=this.deleteData.bind(this);
    }
    
    loadComponentData = () => {
        this.props.dispatch(loadData(TYPE_ACCOUNTS));
    }

    deleteData(Id){
        var newData= Object.assign([],this.props.accountsData);
        var filteredData=newData.filter(obj=> obj.id!==Id);
        this.props.dispatch(populateData(filteredData,TYPE_ACCOUNTS));
    }

    render() {
        return (<div>
            <h3>Accounts</h3>
            <button onClick={this.loadComponentData}>Load Page Data</button>
            <Table striped bordered condensed hover>
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Name</th>
                        <th>Title</th>
                        <th>Danger Level</th>
                        <th>Provience</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    {this.props.accountsData.map((item, index) => {
                        return (
                            <TableRow 
                            key={index} 
                            index={index} 
                            {...item} 
                            startColIndex={2}
                            endColIndex={6}
                            onItemDelete={this.deleteData}/>
                        )
                    })}
                </tbody>
            </Table>
            <span>{this.props.count} data item has been loaded.</span>
        </div>)
    }
}

function mapStateToProps({accounts}) {
    return {
        count: accounts.count,
        accountsData:accounts.accountsData
    }
}

export default connect(mapStateToProps)(AccountsTable);