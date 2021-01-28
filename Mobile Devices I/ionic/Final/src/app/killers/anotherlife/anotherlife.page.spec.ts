import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { AnotherlifePage } from './anotherlife.page';

describe('AnotherlifePage', () => {
  let component: AnotherlifePage;
  let fixture: ComponentFixture<AnotherlifePage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AnotherlifePage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(AnotherlifePage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
