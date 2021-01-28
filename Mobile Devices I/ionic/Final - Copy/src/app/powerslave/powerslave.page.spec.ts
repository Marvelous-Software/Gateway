import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { PowerslavePage } from './powerslave.page';

describe('PowerslavePage', () => {
  let component: PowerslavePage;
  let fixture: ComponentFixture<PowerslavePage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PowerslavePage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(PowerslavePage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
