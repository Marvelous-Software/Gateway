import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { PurgatoryPage } from './purgatory.page';

describe('PurgatoryPage', () => {
  let component: PurgatoryPage;
  let fixture: ComponentFixture<PurgatoryPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PurgatoryPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(PurgatoryPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
