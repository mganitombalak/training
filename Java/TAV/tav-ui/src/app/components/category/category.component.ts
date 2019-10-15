import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ICategory } from 'src/app/models/ICategory';


@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {
  model: Array<ICategory>;
  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
    this.httpClient.get('http://localhost:8080/category')
      .subscribe(data => {
        this.model = data as ICategory[];
      });
  }

  onDeleteCliecked(id: number) {
    this.httpClient.delete('http://localhost:8080/category/' + id)
      .subscribe(() => this.httpClient.get('http://localhost:8080/category')
      .subscribe(data => {
        this.model = data as ICategory[];
      }));
  }
}
