import React from 'react';
import './footer.css'
export default class Footer extends React.Component {
    render = () => (
        <div className="ui center aligned container">
            <div className="ui stackable inverted divided grid">
                <div className="three wide column">
                    <h4 className="ui inverted header">Group 1</h4>
                    <div className="ui inverted link list">
                        <a href="#" className="item">Link One</a>
                        <a href="#" className="item">Link Two</a>
                        <a href="#" className="item">Link Three</a>
                        <a href="#" className="item">Link Four</a>
                    </div>
                </div>
                <div className="three wide column">
                    <h4 className="ui inverted header">Group 2</h4>
                    <div className="ui inverted link list">
                        <a href="#" className="item">Link One</a>
                        <a href="#" className="item">Link Two</a>
                        <a href="#" className="item">Link Three</a>
                        <a href="#" className="item">Link Four</a>
                    </div>
                </div>
                <div className="three wide column">
                    <h4 className="ui inverted header">Group 3</h4>
                    <div className="ui inverted link list">
                        <a href="#" className="item">Link One</a>
                        <a href="#" className="item">Link Two</a>
                        <a href="#" className="item">Link Three</a>
                        <a href="#" className="item">Link Four</a>
                    </div>
                </div>
                <div className="seven wide column">
                    <h4 className="ui inverted header">Footer Header</h4>
                    <p>Extra space for a call to action inside the footer that could help re-engage users.</p>
                </div>
            </div>
            <div className="ui inverted section divider"></div>
            <img src="data:image/png;base64,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" className="ui centered mini image" />
            <div className="ui horizontal inverted small divided link list">
                <a className="item" href="#">Site Map</a>
                <a className="item" href="#">Contact Us</a>
                <a className="item" href="#">Terms and Conditions</a>
                <a className="item" href="#">Privacy Policy</a>
            </div>
        </div>
    );
}