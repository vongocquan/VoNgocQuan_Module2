import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {TodoServiceService} from '../todo-service.service';
import {Todo} from '../todo';

@Component({
  selector: 'app-todo-update',
  templateUrl: './todo-update.component.html',
  styleUrls: ['./todo-update.component.css']
})
export class TodoUpdateComponent implements OnInit {
  id: number;
  formTodo: FormGroup;
  toDo: Todo;
  todoList: Todo[];
  constructor(private activatedRoute: ActivatedRoute, private todoServiceService: TodoServiceService, private fb: FormBuilder,
              private router: Router) { }
  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = Number(paramMap.get('id'));
    });
    this.todoServiceService.findById(this.id).subscribe(
      next => {
        this.toDo = next;
        this.formTodo.patchValue({title: this.toDo.title});
        this.formTodo.patchValue({body: this.toDo.body});
      }, error => {
        this.toDo = new Todo();
      }
    );
    this.formTodo = this.fb.group({
      title: ['', [Validators.required, Validators.minLength(10)]],
      body: ['', [Validators.required, Validators.minLength(10)]]
    });
  }
  updateTodo(): void{
    this.toDo = Object.assign({}, this.formTodo.value);
    this.toDo.id = this.id;
    this.todoServiceService.update(this.toDo).subscribe(
      next => {
      }, error => {
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
    this.router.navigateByUrl('/');
  }
}
