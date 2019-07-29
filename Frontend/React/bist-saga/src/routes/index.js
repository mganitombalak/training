import React from 'react';
import {Switch,Route} from 'react-router-dom'
import Dashboard from "../components/dashboard";
import CarsContainer from "../components/cars";
const Routes=[
    {
        path:"/",
        exact:true,
        component:()=><Dashboard/>

    },
    {
        path:"/cars",
        exact:true,
        component:()=><CarsContainer/>
    }
]

export default ()=>(
     <Switch>
         {
             Routes.map((route,index)=>
             <Route 
             key={index} 
             path={route.path}
             exact={route.exact}
             component={route.component} />)
         }
     </Switch>
)