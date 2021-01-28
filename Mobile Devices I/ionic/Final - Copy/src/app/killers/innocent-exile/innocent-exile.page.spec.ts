import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { InnocentExilePage } from './innocent-exile.page';

describe('InnocentExilePage', () => {
  let component: InnocentExilePage;
  let fixture: ComponentFixture<InnocentExilePage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InnocentExilePage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(InnocentExilePage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
