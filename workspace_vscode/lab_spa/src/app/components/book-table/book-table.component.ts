import { Component } from '@angular/core';
import { AlertService } from 'src/app/services/alert.service';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  styleUrls: ['./book-table.component.scss']
})

export class BookTableComponent {
books: any;
  constructor(
    private service : BookService,
    private alertService: AlertService
){}

  ngOnInit():void{
    this.service.findAll().subscribe(
      {next: (data) => this.books = data, error: (err) => {
        const tit = 'Erro buscando livros';
        const msg = err.message;
        this.alertService.error(tit, msg);
       //console.error(err);
        }
      }
    )
  }
}
