import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    loadChildren: () => import('./tabs/tabs.module').then(m => m.TabsPageModule)
  },
  {
    path: 'killers',
    loadChildren: () => import('./killers/killers.module').then( m => m.KillersPageModule)
  },
  {
    path: 'peiceofmind',
    loadChildren: () => import('./peiceofmind/peiceofmind.module').then( m => m.PeiceofmindPageModule)
  },
  {
    path: 'powerslave',
    loadChildren: () => import('./powerslave/powerslave.module').then( m => m.PowerslavePageModule)
  },
  {
    path: 'signup',
    loadChildren: () => import('./signup/signup.module').then( m => m.SignupPageModule)
  }
];
@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {}