import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { DrifterPage } from './drifter.page';

describe('DrifterPage', () => {
  let component: DrifterPage;
  let fixture: ComponentFixture<DrifterPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DrifterPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(DrifterPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
