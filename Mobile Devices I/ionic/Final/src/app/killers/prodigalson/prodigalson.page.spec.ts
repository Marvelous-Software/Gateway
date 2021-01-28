import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { ProdigalsonPage } from './prodigalson.page';

describe('ProdigalsonPage', () => {
  let component: ProdigalsonPage;
  let fixture: ComponentFixture<ProdigalsonPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProdigalsonPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(ProdigalsonPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
