import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { DrifterPageRoutingModule } from './drifter-routing.module';

import { DrifterPage } from './drifter.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    DrifterPageRoutingModule
  ],
  declarations: [DrifterPage]
})
export class DrifterPageModule {}
