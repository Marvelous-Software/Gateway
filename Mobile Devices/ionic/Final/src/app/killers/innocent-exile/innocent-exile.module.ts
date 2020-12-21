import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { InnocentExilePageRoutingModule } from './innocent-exile-routing.module';

import { InnocentExilePage } from './innocent-exile.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    InnocentExilePageRoutingModule
  ],
  declarations: [InnocentExilePage]
})
export class InnocentExilePageModule {}
