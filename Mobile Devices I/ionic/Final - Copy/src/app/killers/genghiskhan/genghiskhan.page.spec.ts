import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { GenghiskhanPage } from './genghiskhan.page';

describe('GenghiskhanPage', () => {
  let component: GenghiskhanPage;
  let fixture: ComponentFixture<GenghiskhanPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GenghiskhanPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(GenghiskhanPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
