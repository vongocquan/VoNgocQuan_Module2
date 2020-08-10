import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from '@angular/router';
import {DsTuComponent} from './ds-tu/ds-tu.component';
import {TraCuuComponent} from './tra-cuu/tra-cuu.component';

const routes: Routes = [
  {path: '', redirectTo: 'ds-tu', pathMatch: 'prefix'},
  {path: '',
  children: [
    {path: '', component: DsTuComponent},
    {path: 'tra-cuu/:id', component: TraCuuComponent}
  ]}
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
  RouterModule.forRoot(routes)
  ]
})
export class TuDienRoutingModule { }
