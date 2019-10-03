import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CategoryRoutingModule } from './category-routing.module';
import { IndexComponent } from './components/index/index.component';
import { CategoryService } from './services/category.service';


@NgModule({
  declarations: [IndexComponent],
  imports: [
    CommonModule,
    CategoryRoutingModule
  ],
  providers: [CategoryService]
})
export class CategoryModule { }
