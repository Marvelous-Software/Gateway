import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { ProdigalsonPageRoutingModule } from './prodigalson-routing.module';

import { ProdigalsonPage } from './prodigalson.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ProdigalsonPageRoutingModule
  ],
  declarations: [ProdigalsonPage]
})
export class ProdigalsonPageModule {}
