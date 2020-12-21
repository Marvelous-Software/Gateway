import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DrifterPage } from './drifter.page';

const routes: Routes = [
  {
    path: '',
    component: DrifterPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class DrifterPageRoutingModule {}
