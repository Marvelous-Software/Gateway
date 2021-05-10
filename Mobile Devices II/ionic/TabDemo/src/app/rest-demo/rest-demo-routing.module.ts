import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { RestDemoPage } from './rest-demo.page';

const routes: Routes = [
  {
    path: '',
    component: RestDemoPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class RestDemoPageRoutingModule {}
