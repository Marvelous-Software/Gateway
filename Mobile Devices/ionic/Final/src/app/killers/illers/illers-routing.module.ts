import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { IllersPage } from './illers.page';

const routes: Routes = [
  {
    path: '',
    component: IllersPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class IllersPageRoutingModule {}
