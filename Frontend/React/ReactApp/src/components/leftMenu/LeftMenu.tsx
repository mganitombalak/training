import * as React from 'react';

import { LeftMenuProps } from '../../Props/LeftMenuProps'
import { LinkItem } from './LinkItem'

export class LeftMenu extends React.Component<LeftMenuProps, null>
{
    render() {
        let items = this.props.menuItems.map((l, i) => {
            <LinkItem
                key={i.toString()}
                text={l.text}
                Url="#"
                CustomClass={l.CustomClass} />
        });
        return (
            <nav className="nav flex-column">
                {items}
            </nav>);
    }
}