import * as React from "react"
import { HelloProps } from "../../Props/HelloProps";


export class Hello extends React.Component<HelloProps,null>{
    render(){
        return <h1>{this.props.helloMessage} {this.props.name}</h1>
    }
}