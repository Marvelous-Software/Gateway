import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { PeiceofmindPageRoutingModule } from './peiceofmind-routing.module';

import { PeiceofmindPage } from './peiceofmind.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    PeiceofmindPageRoutingModule
  ],
  declarations: [PeiceofmindPage]
})
export class PeiceofmindPageModule {}
