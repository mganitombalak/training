import React,{Component} from 'react';
import { Navbar,Nav,NavItem,NavDropdown,MenuItem } from 'react-bootstrap';
import {IndexLinkContainer} from 'react-router-bootstrap'

class TopMenu extends Component{

    render(){
        return(
            <Navbar>
            <Navbar.Header>
                <Navbar.Brand>
                <a href="/">KKB</a>
                </Navbar.Brand>
            </Navbar.Header>
            <Nav>
                <IndexLinkContainer to="/"><NavItem eventKey={1}>Dashboard</NavItem></IndexLinkContainer>
                <IndexLinkContainer to="/accounts"><NavItem eventKey={2}>Accounts</NavItem></IndexLinkContainer>
                <IndexLinkContainer to="/naces"><NavItem eventKey={3}>Nace</NavItem></IndexLinkContainer>
                <NavDropdown eventKey={4} title="Other" id="basic-nav-dropdown">
                <MenuItem eventKey={4.1}>Action</MenuItem>
                <MenuItem eventKey={4.2}>Another action</MenuItem>
                <MenuItem eventKey={4.3}>Something else here</MenuItem>
                <MenuItem divider />
                <MenuItem eventKey={4.4}>Separated link</MenuItem>
                </NavDropdown>
            </Nav>
            </Navbar>
        )
    }
}
export default TopMenu