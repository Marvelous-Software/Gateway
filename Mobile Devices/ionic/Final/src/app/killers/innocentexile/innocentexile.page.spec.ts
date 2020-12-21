import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { InnocentexilePage } from './innocentexile.page';

describe('InnocentexilePage', () => {
  let component: InnocentexilePage;
  let fixture: ComponentFixture<InnocentexilePage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InnocentexilePage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(InnocentexilePage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
