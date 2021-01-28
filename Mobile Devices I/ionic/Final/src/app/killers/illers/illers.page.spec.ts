import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { IllersPage } from './illers.page';

describe('IllersPage', () => {
  let component: IllersPage;
  let fixture: ComponentFixture<IllersPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IllersPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(IllersPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
