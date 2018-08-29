import React, { Component } from 'react';
import TableRow from '../../../sharedComponents/tableRow'
import { Table } from 'react-bootstrap';
import { connect } from 'react-redux';
import {loadData,populateData, TYPE_NACES} from '../../common/actions'

class NacesTable extends Component {
    constructor(props){
        super(props);
        this.deleteData=this.deleteData.bind(this);
    }
    
    loadComponentData = () => {
        this.props.dispatch(loadData(TYPE_NACES));
    }

    deleteData(Id){
        var newData= Object.assign([],this.props.componentData);
        var filteredData=newData.filter(obj=> obj.id!==Id);
        this.props.dispatch(populateData(filteredData,TYPE_NACES));
    }

    render() {
        return (<div>
            <h3>Naces</h3>
            <button onClick={this.loadComponentData}>Load Page Data</button>
            <Table striped bordered condensed hover>
            <thead>
                    <tr>
                        <th>#</th>
                        <th>Code</th>
                        <th>Description</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    {this.props.componentData.map((item, index) => {
                        return (
                            <TableRow 
                            key={index} 
                            index={index} 
                            {...item} 
                            startColIndex={1}
                            endColIndex={3}
                            onItemDelete={this.deleteData}/>
                        )
                    })}
                </tbody>
            </Table>
            <span>{this.props.count} data item has been loaded.</span>
        </div>)
    }
}

function mapStateToProps({naces}) {
    return {
        count:naces.count,
        componentData:naces.nacesData
    }
}

export default connect(mapStateToProps)(NacesTable);