import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from '@angular/router';
import {TodoListComponent} from './todo-list/todo-list.component';
import {TodoDetailComponent} from './todo-detail/todo-detail.component';
import {TodoUpdateComponent} from './todo-update/todo-update.component';

const routes: Routes = [
  {path: '', redirectTo: 'todo-list', pathMatch: 'full'},
  {path: '',
    children: [
      {path: '', component: TodoListComponent},
      {path: 'detail/:id', component: TodoDetailComponent},
      {path: 'update/:id', component: TodoUpdateComponent},
    ]
  }
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ]
})
export class TodoRoutingModule { }
