import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { PeiceofmindPage } from './peiceofmind.page';

describe('PeiceofmindPage', () => {
  let component: PeiceofmindPage;
  let fixture: ComponentFixture<PeiceofmindPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PeiceofmindPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(PeiceofmindPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
