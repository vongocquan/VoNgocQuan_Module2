import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {formatNumber} from '@angular/common';
import {TodoServiceService} from '../todo-service.service';
import {Todo} from '../todo';

@Component({
  selector: 'app-todo-detail',
  templateUrl: './todo-detail.component.html',
  styleUrls: ['./todo-detail.component.css']
})
export class TodoDetailComponent implements OnInit {
  id: number;
  todo: Todo = new Todo();
  constructor(private activatedRoute: ActivatedRoute, private todoServiceService: TodoServiceService) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = Number(paramMap.get('id'));

    });
    this.todoServiceService.findById(this.id).subscribe(
      next => {
        this.todo = next;
      }, error => {
        this.todo = new Todo();
      }
    );
  }

}
