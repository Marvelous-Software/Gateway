import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { KillersPageRoutingModule } from './killers-routing.module';

import { KillersPage } from './killers.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    KillersPageRoutingModule
  ],
  declarations: [KillersPage]
})
export class KillersPageModule {}
