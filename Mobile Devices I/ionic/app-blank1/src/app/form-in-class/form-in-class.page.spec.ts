import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { FormInClassPage } from './form-in-class.page';

describe('FormInClassPage', () => {
  let component: FormInClassPage;
  let fixture: ComponentFixture<FormInClassPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormInClassPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(FormInClassPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
