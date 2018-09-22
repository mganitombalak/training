import { Component, OnInit } from '@angular/core';
import { NaceService } from '../../services/nace.service';
import { INaceModel } from '../../../../common/entity/INaceModel';
import { ReturnResult } from '../../../../common/entity/ReturnResult';

@Component({
  selector: 'app-nace',
  templateUrl: './nace.component.html',
  styleUrls: ['./nace.component.css']
})
export class NaceComponent implements OnInit {
  constructor(private naceService: NaceService) { }
  Model: ReturnResult<INaceModel>;
  ngOnInit() {
    this.naceService.Read().subscribe(
      (result:ReturnResult<INaceModel>) =>{
        this.Model=result;
      },
      e=>console.log(e)
    );
  }

}
