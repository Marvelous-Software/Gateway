import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { WrathchildPage } from './wrathchild.page';

describe('WrathchildPage', () => {
  let component: WrathchildPage;
  let fixture: ComponentFixture<WrathchildPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WrathchildPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(WrathchildPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
