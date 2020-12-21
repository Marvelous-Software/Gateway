import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { KillersPage } from './killers.page';

const routes: Routes = [
  {
    path: '',
    component: KillersPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class KillersPageRoutingModule {}
