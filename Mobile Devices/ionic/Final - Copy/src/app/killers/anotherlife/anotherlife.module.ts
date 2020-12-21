import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { AnotherlifePageRoutingModule } from './anotherlife-routing.module';

import { AnotherlifePage } from './anotherlife.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    AnotherlifePageRoutingModule
  ],
  declarations: [AnotherlifePage]
})
export class AnotherlifePageModule {}
