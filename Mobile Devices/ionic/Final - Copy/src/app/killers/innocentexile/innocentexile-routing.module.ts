import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { InnocentexilePage } from './innocentexile.page';

const routes: Routes = [
  {
    path: '',
    component: InnocentexilePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class InnocentexilePageRoutingModule {}
