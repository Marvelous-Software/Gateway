import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { PeiceofmindPage } from './peiceofmind.page';

const routes: Routes = [
  {
    path: '',
    component: PeiceofmindPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class PeiceofmindPageRoutingModule {}
