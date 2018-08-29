
import * as React from 'react';
import { TopMenuProps } from '../../Props/TopMenuProps';

export interface ILocalState {
    brandName: string
}

export class TopMenu extends React.Component<TopMenuProps, ILocalState>
{
    constructor(props: TopMenuProps, state: ILocalState) {
        super(props, state);
        this.state = { brandName: this.props.brandItemText };
        this.onChangeName = this.onChangeName.bind(this);
    }
    render() {
        return (<nav className="navbar navbar-expand-lg navbar-light bg-light">
            <a className="navbar-brand" href="#">{this.state.brandName}</a>
            <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span className="navbar-toggler-icon"></span>
            </button>
            <div className="collapse navbar-collapse" id="navbarSupportedContent">
                <ul className="navbar-nav mr-auto">
                    {this.props.menuItems.map((m, i) => {
                        return (
                            <li key={i.toString()} className={"nav-item" + (m.CustomClass == undefined ? '' : ' ' + m.CustomClass)}>
                                <a className="nav-link" href={m.Url}>{m.text}</a>
                            </li>
                        )
                    })}
                </ul>
            </div>
            <button onClick={this.onChangeName}>Change name</button>
        </nav>);
    }
    
    onChangeName = () => {
        console.log("button clicked.");
        this.setState((s,p) => {
            console.log("previous:" + s.brandName);
        });
    }
}