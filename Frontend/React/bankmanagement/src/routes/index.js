import React from 'react';
import {Route,Switch} from 'react-router-dom';
import Dashboard from '../modules/dashboard';
import Accounts from '../modules/accounts';
import Naces from '../modules/naces';

const routes=[
    {
        path:"/",
        exact:true,
        component:()=> <Dashboard/>
    },
    {
        path:"/accounts",
        exact:true,
        component:()=> <Accounts/>
    },
    {
        path:"/naces",
        exact:true,
        component:()=> <Naces/>
    }
]

export default ()=>(
     <Switch>
         {routes.map((route,index)=>(
             <Route 
                key={index}
                path={route.path}
                exact={route.exact}
                component={route.component}
            />
         ))}
     </Switch>
)