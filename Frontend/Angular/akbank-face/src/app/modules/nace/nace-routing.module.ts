import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NaceListComponent } from './components/nace-list/nace-list.component';

const routes: Routes = [
  { path: '', component: NaceListComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class NaceRoutingModule { }
