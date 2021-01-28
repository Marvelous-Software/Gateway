import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { WrathchildPage } from './wrathchild.page';

const routes: Routes = [
  {
    path: '',
    component: WrathchildPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class WrathchildPageRoutingModule {}
