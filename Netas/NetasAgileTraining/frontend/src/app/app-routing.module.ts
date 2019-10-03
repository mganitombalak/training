import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';


const routes: Routes = [
  { path: '', component: DashboardComponent },
  {
    path: 'category',
    loadChildren: './modules/category/category.module#CategoryModule'
  },
  {
    path: 'subcategory',
    loadChildren: './modules/sub-category/sub-category.module#SubCategoryModule'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
