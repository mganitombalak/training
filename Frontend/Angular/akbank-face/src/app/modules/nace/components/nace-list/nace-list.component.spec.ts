import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NaceListComponent } from './nace-list.component';

describe('NaceListComponent', () => {
  let component: NaceListComponent;
  let fixture: ComponentFixture<NaceListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NaceListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NaceListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
