import React, { Component } from 'react';
import { connect } from 'react-redux';
import { loadDataActionCreator, TYPE_CARS } from '../../actions';
import CarItem from './components/car-item';

class CarsContainer extends Component {
    constructor(props) {
        super(props);
    }

    // onBtnClick = () =>
    //     this.props.dispatch(loadDataActionCreator(TYPE_CARS));
    render() {
        return (
            <div className="ui link cards">
                {/* <button onClick={this.onBtnClick}>Load Data</button> */}
                {this.props.cars.map((c, i) => <CarItem key={i} {...c} />)}
            </div>);
    }

    componentDidMount = () => this.props.dispatch(loadDataActionCreator(TYPE_CARS));
}

const mapStateToProps = (state) => {
    return { cars: state.cars }
}

export default connect(mapStateToProps)(CarsContainer);