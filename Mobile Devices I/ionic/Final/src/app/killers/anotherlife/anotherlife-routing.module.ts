import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AnotherlifePage } from './anotherlife.page';

const routes: Routes = [
  {
    path: '',
    component: AnotherlifePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AnotherlifePageRoutingModule {}
