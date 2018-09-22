import { Component, OnInit } from '@angular/core';
import { NaceService } from '../../services/nace.service';
import { INaceModel } from '../../../../common/entity/INaceModel';
import { ReturnResult } from '../../../../common/entity/ReturnResult';
import { ModalContentComponent } from '../../../../common/entity/ModalContentComponent';
import { NaceDetailComponent } from '../nace-detail/nace-detail.component';

@Component({
  selector: 'app-nace',
  templateUrl: './nace.component.html',
  styleUrls: ['./nace.component.css']
})
export class NaceComponent implements OnInit {
  constructor(private naceService: NaceService) { }
  Model: ReturnResult<INaceModel>;
  ModalTitle: string;
  ModalType: ModalContentComponent;
  ngOnInit() {
    this.naceService.Read().subscribe(
      (result: ReturnResult<INaceModel>) => {
        this.Model = result;
      },
      e => console.log(e),
      () => console.log("completed")
    );
    this.ModalTitle = "Nace Ekle";
  }

  onEdit(item: INaceModel) {
    this.ModalTitle="Nace Guncelle";
    this.ModalType = new ModalContentComponent(NaceDetailComponent, null);
  }

}
