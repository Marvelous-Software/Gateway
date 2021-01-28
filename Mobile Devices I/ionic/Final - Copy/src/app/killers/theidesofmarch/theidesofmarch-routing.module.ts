import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { TheidesofmarchPage } from './theidesofmarch.page';

const routes: Routes = [
  {
    path: '',
    component: TheidesofmarchPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class TheidesofmarchPageRoutingModule {}
