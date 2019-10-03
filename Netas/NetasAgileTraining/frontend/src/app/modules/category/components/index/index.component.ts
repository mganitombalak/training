import { Component, OnInit } from '@angular/core';
import { CategoryService } from '../../services/category.service';
import { IBaseResponse } from 'src/commons/interface/IBaseResponse';

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent implements OnInit {
  model: Array<IBaseResponse>;
  constructor(private categoryService: CategoryService) { }

  ngOnInit() {
    this.categoryService.find().subscribe(d => this.model = d);
  }

}
