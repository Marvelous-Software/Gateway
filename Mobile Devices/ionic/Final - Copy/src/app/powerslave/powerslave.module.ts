import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { PowerslavePageRoutingModule } from './powerslave-routing.module';

import { PowerslavePage } from './powerslave.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    PowerslavePageRoutingModule
  ],
  declarations: [PowerslavePage]
})
export class PowerslavePageModule {}
