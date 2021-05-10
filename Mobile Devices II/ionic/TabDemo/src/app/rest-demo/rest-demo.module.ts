import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { RestDemoPageRoutingModule } from './rest-demo-routing.module';

import { RestDemoPage } from './rest-demo.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    RestDemoPageRoutingModule
  ],
  declarations: [RestDemoPage]
})
export class RestDemoPageModule {}
