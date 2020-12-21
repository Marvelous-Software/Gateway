import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { MurdersintheruemorguePage } from './murdersintheruemorgue.page';

describe('MurdersintheruemorguePage', () => {
  let component: MurdersintheruemorguePage;
  let fixture: ComponentFixture<MurdersintheruemorguePage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MurdersintheruemorguePage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(MurdersintheruemorguePage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
