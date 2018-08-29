import * as React from 'react'
import { IMenuItem } from '../../common/IMenuItem';

export class LinkItem extends React.Component<IMenuItem,null>{
    render(){
        return (<a className={"nav-link" + (this.props.CustomClass==undefined?'':' ' + this.props.CustomClass )} 
        href={this.props.Url}>{this.props.text}</a>);
    }
}