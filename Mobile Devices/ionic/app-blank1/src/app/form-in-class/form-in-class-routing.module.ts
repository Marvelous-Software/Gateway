import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { FormInClassPage } from './form-in-class.page';

const routes: Routes = [
  {
    path: '',
    component: FormInClassPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class FormInClassPageRoutingModule {}
