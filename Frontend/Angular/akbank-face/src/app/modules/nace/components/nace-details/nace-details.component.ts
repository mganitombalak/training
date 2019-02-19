import { Component, OnInit } from '@angular/core';
import { IModalComponent } from 'src/app/common/IModalComponent';
import { INaceModel } from 'src/app/models/INaceModel';

@Component({
  selector: 'app-nace-details',
  templateUrl: './nace-details.component.html',
  styleUrls: ['./nace-details.component.css']
})
export class NaceDetailsComponent implements OnInit, IModalComponent {

  Model: INaceModel;

  Bind(data: any) {
    this.Model = data;
  }

  constructor() { }

  ngOnInit() {
  }

  onSubmit(): void {
    console.log("form has been submitted.");
  }

}
