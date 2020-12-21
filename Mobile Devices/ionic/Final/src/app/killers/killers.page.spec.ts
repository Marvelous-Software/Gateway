import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { KillersPage } from './killers.page';

describe('KillersPage', () => {
  let component: KillersPage;
  let fixture: ComponentFixture<KillersPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KillersPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(KillersPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
