import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { PowerslavePage } from './powerslave.page';

const routes: Routes = [
  {
    path: '',
    component: PowerslavePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class PowerslavePageRoutingModule {}
