import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Observable, from } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class BooksService {
  private url="https://hung-java-spring.herokuapp.com/api/books"


  getBooks(page, limit) {
    if (page) {
      this.url += "?page=" + page
    } 
    if(limit) {
      this.url += "&limit=" + limit
    }
    
    return this.http.get(this.url)
  }

  constructor(
    private http:HttpClient ) { }
}
