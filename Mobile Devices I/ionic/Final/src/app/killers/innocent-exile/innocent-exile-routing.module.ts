import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { InnocentExilePage } from './innocent-exile.page';

const routes: Routes = [
  {
    path: '',
    component: InnocentExilePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class InnocentExilePageRoutingModule {}
