import * as React from "react"
import * as ReactDOM from "react-dom"
import { AppComponent } from "./AppComponent";
import { IMenuItem } from "./common/IMenuItem";

window.onload = () => {

    const myObject: React.SFC<IMenuItem> = (props) => {
        return <h1>Hello, {props.text}</h1>;
    }
    ReactDOM.render(<AppComponent />, document.querySelector('#reactContainer'));
}