import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { GenghiskhanPage } from './genghiskhan.page';

const routes: Routes = [
  {
    path: '',
    component: GenghiskhanPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class GenghiskhanPageRoutingModule {}
