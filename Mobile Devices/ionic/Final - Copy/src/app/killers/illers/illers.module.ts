import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { IllersPageRoutingModule } from './illers-routing.module';

import { IllersPage } from './illers.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    IllersPageRoutingModule
  ],
  declarations: [IllersPage]
})
export class IllersPageModule {}
