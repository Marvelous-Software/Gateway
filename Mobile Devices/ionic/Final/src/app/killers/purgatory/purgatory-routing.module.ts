import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { PurgatoryPage } from './purgatory.page';

const routes: Routes = [
  {
    path: '',
    component: PurgatoryPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class PurgatoryPageRoutingModule {}
