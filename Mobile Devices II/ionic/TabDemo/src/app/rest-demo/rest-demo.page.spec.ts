import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { RestDemoPage } from './rest-demo.page';

describe('RestDemoPage', () => {
  let component: RestDemoPage;
  let fixture: ComponentFixture<RestDemoPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RestDemoPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(RestDemoPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
