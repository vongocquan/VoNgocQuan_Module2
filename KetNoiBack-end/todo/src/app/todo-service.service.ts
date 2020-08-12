import {Injectable} from '@angular/core';
import {Todo} from './todo';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TodoServiceService {
  API_URL = 'http://localhost:3000/todoList';
  toDoList: Todo[];
  constructor(private httpClient: HttpClient) { }
  findAll(): Observable<Todo[]>{
    return this.httpClient.get<Todo[]>(this.API_URL);
  }
  findById(id: number): Observable<Todo>{
    return this.httpClient.get<Todo>(this.API_URL + '/' + id);
  }
  delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.API_URL + '/' + id);
  }
  update(todo: Todo): Observable<void>{
    return this.httpClient.patch<void>(this.API_URL + '/' + todo.id, todo);
  }
  create(todo: Todo): Observable<void>{
    return this.httpClient.post<void>(this.API_URL, todo);
  }
}
