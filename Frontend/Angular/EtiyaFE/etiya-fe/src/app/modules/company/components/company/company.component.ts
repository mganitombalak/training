import { Component, OnInit } from '@angular/core';
import { CompanyService } from '../../services/company.service';
import { ICompanyModel } from '../../../../common/entity/ICompanyModel';

@Component({
  selector: 'app-company',
  templateUrl: './company.component.html',
  styleUrls: ['./company.component.css']
})
export class CompanyComponent implements OnInit {
  Model: Array<ICompanyModel>;
  constructor(public companyService: CompanyService) { }
  ngOnInit() {
    
  }
  onEdit(name:string) {
    console.log(name + " edited.");
  }
  onDelete(name:string) {
    console.log(name + " deleted.");
  }

}
