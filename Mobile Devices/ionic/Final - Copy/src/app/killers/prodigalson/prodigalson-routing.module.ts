import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ProdigalsonPage } from './prodigalson.page';

const routes: Routes = [
  {
    path: '',
    component: ProdigalsonPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ProdigalsonPageRoutingModule {}
