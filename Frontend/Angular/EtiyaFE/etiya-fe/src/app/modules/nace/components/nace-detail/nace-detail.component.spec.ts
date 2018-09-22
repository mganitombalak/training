import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NaceDetailComponent } from './nace-detail.component';

describe('NaceDetailComponent', () => {
  let component: NaceDetailComponent;
  let fixture: ComponentFixture<NaceDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NaceDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NaceDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
