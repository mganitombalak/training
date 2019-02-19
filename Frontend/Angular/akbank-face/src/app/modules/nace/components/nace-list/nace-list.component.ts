import { Component, OnInit } from '@angular/core';
import { NaceService } from '../../services/nace.service';
import { INaceModel } from 'src/app/models/INaceModel';
import { NaceDetailsComponent } from '../nace-details/nace-details.component';
import { ModalContent } from 'src/app/common/ModelContent';

@Component({
  selector: 'app-nace-list',
  templateUrl: './nace-list.component.html',
  styleUrls: ['./nace-list.component.css']
})
export class NaceListComponent implements OnInit {

  constructor(private naceService: NaceService) { }

  DataModel: Array<INaceModel>;
  ModalTitle: string;
  ModelContent: ModalContent;
  ngOnInit() {
    this.DataModel = this.naceService.readAll(1);
  }

  onEdit(item: INaceModel): void {
    this.ModelContent = new ModalContent(NaceDetailsComponent, item);
    this.ModalTitle = "Update item named " + item.code;
  }
}
