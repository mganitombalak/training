import { Component, OnInit } from '@angular/core';
import { NaceService } from '../../services/nace.service';

@Component({
  selector: 'app-nace',
  templateUrl: './nace.component.html',
  styleUrls: ['./nace.component.css']
})
export class NaceComponent implements OnInit {
  constructor(private naceService:NaceService) { }

  ngOnInit() {
    this.naceService.getAll();
  }

}
