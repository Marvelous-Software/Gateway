import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { KillersPage } from './killers.page';

const routes: Routes = [
  {
    path: '',
    component: KillersPage
  },
  {
    path: 'theidesofmarch',
    loadChildren: () => import('./theidesofmarch/theidesofmarch.module').then( m => m.TheidesofmarchPageModule)
  },
  {
    path: 'wrathchild',
    loadChildren: () => import('./wrathchild/wrathchild.module').then( m => m.WrathchildPageModule)
  },
  {
    path: 'murdersintheruemorgue',
    loadChildren: () => import('./murdersintheruemorgue/murdersintheruemorgue.module').then( m => m.MurdersintheruemorguePageModule)
  },
  {
    path: 'anotherlife',
    loadChildren: () => import('./anotherlife/anotherlife.module').then( m => m.AnotherlifePageModule)
  },
  {
    path: 'genghiskhan',
    loadChildren: () => import('./genghiskhan/genghiskhan.module').then( m => m.GenghiskhanPageModule)
  },
  {
    path: 'innocent-exile',
    loadChildren: () => import('./innocent-exile/innocent-exile.module').then( m => m.InnocentExilePageModule)
  },
  {
    path: 'illers',
    loadChildren: () => import('./illers/illers.module').then( m => m.IllersPageModule)
  },
  {
    path: 'prodigalson',
    loadChildren: () => import('./prodigalson/prodigalson.module').then( m => m.ProdigalsonPageModule)
  },
  {
    path: 'purgatory',
    loadChildren: () => import('./purgatory/purgatory.module').then( m => m.PurgatoryPageModule)
  },
  {
    path: 'drifter',
    loadChildren: () => import('./drifter/drifter.module').then( m => m.DrifterPageModule)
  },
  {
    path: 'killers',
    loadChildren: () => import('./killers/killers.module').then( m => m.KillersPageModule)
  },
  {
    path: 'innocentexile',
    loadChildren: () => import('./innocentexile/innocentexile.module').then( m => m.InnocentexilePageModule)
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class KillersPageRoutingModule {}
