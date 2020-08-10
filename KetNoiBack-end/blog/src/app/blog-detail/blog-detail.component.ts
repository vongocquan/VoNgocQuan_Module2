import { Component, OnInit } from '@angular/core';
import {PostService} from '../post.service';
import {ActivatedRoute, Route} from '@angular/router';
import {IPost} from '../post';

@Component({
  selector: 'app-blog-detail',
  templateUrl: './blog-detail.component.html',
  styleUrls: ['./blog-detail.component.css']
})
export class BlogDetailComponent implements OnInit {

  constructor(private postService: PostService, private activatedRoute: ActivatedRoute) { }
  post: IPost;
  ngOnInit(): void {
    const id = +this.activatedRoute.snapshot.paramMap.get('id');
    this.postService.getPostById(id).subscribe(
      next => (this.post = next),
      error => {
        console.log(error);
        this.post = null;
      }
    );
  }

}
