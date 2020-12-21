import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { WrathchildPageRoutingModule } from './wrathchild-routing.module';

import { WrathchildPage } from './wrathchild.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    WrathchildPageRoutingModule
  ],
  declarations: [WrathchildPage]
})
export class WrathchildPageModule {}
