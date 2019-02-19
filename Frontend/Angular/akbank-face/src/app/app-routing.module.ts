import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: 'index', pathMatch: 'full' },
  {
    path: 'nace',
    loadChildren: './modules/nace/nace.module#NaceModule'
  },
  {
    path: 'customer',
    loadChildren: './modules/customer/customer.module#CustomerModule'
  },
  {
    path: 'credits',
    loadChildren: './modules/credits/credits.module#CreditsModule'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
