import * as React from 'react';
import { TopMenu } from './components/header/topMenu';

export class AppComponent extends React.Component<null, null>
{
    render() {
        return (<TopMenu brandItemText="KKB"
            menuItems={[
                { CustomClass: undefined, text: 'Reports', Url: './reports.html' },
                { CustomClass: undefined, text: 'Samples', Url: './samples.html' },
                { CustomClass: undefined, text: 'Standarts', Url: './standarts.html' },
                { CustomClass: 'disabled', text: 'Tests', Url: './tests.html' }
            ]}
        />
        );
    }
}