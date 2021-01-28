import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { PurgatoryPageRoutingModule } from './purgatory-routing.module';

import { PurgatoryPage } from './purgatory.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    PurgatoryPageRoutingModule
  ],
  declarations: [PurgatoryPage]
})
export class PurgatoryPageModule {}
