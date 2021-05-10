import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Weather } from '../models/weather';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';

import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class WeatherService {

  constructor(private http: HttpClient) { }

  base_path = 'http://api.openweathermap.org/data/2.5/weather?q=west%20haven&units=imperial&appid=fb49131d5f027d55cbc474c117a4f458';
  custom_path_pre = 'http://api.openweathermap.org/data/2.5/weather?q=';
  custom_path_post = '&units=imperial&appid=fb49131d5f027d55cbc474c117a4f458';

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
    
    // Get weather
    getWeather(): Observable<Weather> {
      return this.http
      .get<Weather>(this.base_path)
      .pipe(
        map( data => new Weather().deserialize(data)),
        retry(2),
        catchError(this.handleError)
        )
    }
    getWeatherCustom(City: string): Observable<Weather> {
      return this.http
      .get<Weather>(this.custom_path_pre + City + this.custom_path_post)
      .pipe(
        map( data => new Weather().deserialize(data)),
        retry(2),
        catchError(this.handleError)
        )
    }

}
