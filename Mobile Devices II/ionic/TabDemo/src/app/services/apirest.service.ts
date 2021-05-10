import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { ChuckJoke } from '../models/chuck-joke';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})

export class ApirestService {
  // API path
  base_path = 'https://api.chucknorris.io/jokes/random';
  category_list = 'https://api.chucknorris.io/jokes/categories';
  sport_path = 'https://api.chucknorris.io/jokes/random?category=sport';
  category_path = 'https://api.chucknorris.io/jokes/random?category=';


  constructor(private http: HttpClient) { }

  // Http Options
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  // Handle API errors
  handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error.message);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong,
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }
    // return an observable with a user-facing error message
    return throwError(
      'Something bad happened; please try again later.');
  };

  // Get Chuck Norris categories
  getList(): Observable<string[]> {
    return this.http
      .get<string[]>(this.category_list)
      .pipe(
        retry(2),
        catchError(this.handleError)
      )
  }

  // Get Chuck Norris joke for a specific category
  getJokeFromCategory(category: string): Observable<ChuckJoke> {
    return this.http
      .get<ChuckJoke>(this.category_path + category)
      .pipe(
        retry(2),
        catchError(this.handleError)
      )
  }


  // Get Chuck Norris joke
  getJoke(): Observable<ChuckJoke> {
    return this.http
      .get<ChuckJoke>(this.base_path)
      .pipe(
        retry(2),
        catchError(this.handleError)
      )
  }

  // Get Chuck Norris sport joke
  getSportJoke(): Observable<ChuckJoke> {
    return this.http
      .get<ChuckJoke>(this.sport_path)
      .pipe(
        retry(2),
        catchError(this.handleError)
      )
  }

}