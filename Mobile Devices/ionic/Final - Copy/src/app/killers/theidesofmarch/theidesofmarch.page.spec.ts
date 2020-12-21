import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { TheidesofmarchPage } from './theidesofmarch.page';

describe('TheidesofmarchPage', () => {
  let component: TheidesofmarchPage;
  let fixture: ComponentFixture<TheidesofmarchPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TheidesofmarchPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(TheidesofmarchPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
