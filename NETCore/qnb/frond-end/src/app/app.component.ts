import { Component, OnInit, OnDestroy } from '@angular/core';
import { ICategory } from './ICategory';
import { ServiceService } from './service.service';
import { Observable, Subscription } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit, OnDestroy {

  constructor(private service: ServiceService) { }
  model: Array<ICategory>;
  private serviceResult: Subscription
  ngOnInit(): void {
    this.serviceResult = this.service.getCategories().subscribe(d => this.model = d);
  }

  ngOnDestroy(): void {
    this.serviceResult.unsubscribe();
  }
}
