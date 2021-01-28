import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { InnocentexilePageRoutingModule } from './innocentexile-routing.module';

import { InnocentexilePage } from './innocentexile.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    InnocentexilePageRoutingModule
  ],
  declarations: [InnocentexilePage]
})
export class InnocentexilePageModule {}
