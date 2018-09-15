import { Component, OnInit } from '@angular/core';
import { NaceService } from '../../services/nace.service';
import { INaceModel } from '../../../../common/entity/INaceModel';

@Component({
  selector: 'app-nace',
  templateUrl: './nace.component.html',
  styleUrls: ['./nace.component.css']
})
export class NaceComponent implements OnInit {
  constructor(private naceService: NaceService) { }
  Model: INaceModel[];
  ngOnInit() {
    this.Model = this.naceService.getAll(2);
  }

}
