import { Component , OnInit} from '@angular/core';
import { BooksService } from './books.service';
import { Book } from './book';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  output
  book : Book[]
  totalPage
  page: number = 1;
  limit: number = 3;
  constructor(
    private  bookService: BooksService) {

     }
 
   getPage(page){
      var items: number[] = [];
      for(var i = 1; i <= page; i++){
         items.push(i);
      }
      return items;
    }
    

  getBooksFromService(page, limit) {
    this.bookService.getBooks(page, limit).subscribe((data) =>{
    this.output = data
    this.book = this.output.listResult
    this.page = this.output.page
    this.totalPage = this.output.totalPage
     } )
  }
  ngOnInit(){
    this.getBooksFromService(this.page, this.limit);
  }
  
}
