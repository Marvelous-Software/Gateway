import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { TheidesofmarchPageRoutingModule } from './theidesofmarch-routing.module';

import { TheidesofmarchPage } from './theidesofmarch.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    TheidesofmarchPageRoutingModule
  ],
  declarations: [TheidesofmarchPage]
})
export class TheidesofmarchPageModule {}
