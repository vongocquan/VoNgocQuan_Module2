import { Component, OnInit } from '@angular/core';
import {TodoServiceService} from '../todo-service.service';
import {Todo} from '../todo';
import {error} from '@angular/compiler/src/util';
import {Router} from '@angular/router';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})
export class TodoListComponent implements OnInit {
  todoList: Todo[];
  todo: Todo;
  formTodo: FormGroup;
  constructor(private todoServiceService: TodoServiceService, private router: Router, private fb: FormBuilder) {
    todoServiceService.findAll().subscribe(
      next => {
        this.todoList = next;
        // tslint:disable-next-line:no-shadowed-variable
      }, error => {
        this.todoList = new Array();
      }
    );
  }

  ngOnInit(): void {
    this.formTodo = this.fb.group({
      title: ['', [Validators.required, Validators.minLength(10)]],
      body: ['', [Validators.required, Validators.minLength(10)]],
    });
  }
  // tslint:disable-next-line:typedef
  delete(id: number){
    if (confirm('bạn chắc chắn muốn xóa' + id)){
      this.todoServiceService.delete(id).subscribe(
        next => {
        }, error1 => {
        }, () => {
          this.todoServiceService.findAll().subscribe(
            next => {
              this.todoList = next;
            }, error1 => {
              this.todoList = new Array();
            },
          );
        }
      );
    }
  }
  update(id: number): void{
    this.router.navigateByUrl('update/' + id);
  }
  createTodo(): void{
    this.todo = Object.assign({}, this.formTodo.value);
    this.todoServiceService.create(this.todo).subscribe(
      next => {},
      error1 => {},
      () => {
        this.todoServiceService.findAll().subscribe(
          next => {
            this.todoList = next;
          }, error1 => {
            this.todoList = new Array();
          }
        );
      }
    );
  }
}
