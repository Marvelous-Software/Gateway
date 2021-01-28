import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { GenghiskhanPageRoutingModule } from './genghiskhan-routing.module';

import { GenghiskhanPage } from './genghiskhan.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    GenghiskhanPageRoutingModule
  ],
  declarations: [GenghiskhanPage]
})
export class GenghiskhanPageModule {}
