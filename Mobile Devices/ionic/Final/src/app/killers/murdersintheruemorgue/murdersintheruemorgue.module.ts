import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { MurdersintheruemorguePageRoutingModule } from './murdersintheruemorgue-routing.module';

import { MurdersintheruemorguePage } from './murdersintheruemorgue.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    MurdersintheruemorguePageRoutingModule
  ],
  declarations: [MurdersintheruemorguePage]
})
export class MurdersintheruemorguePageModule {}
