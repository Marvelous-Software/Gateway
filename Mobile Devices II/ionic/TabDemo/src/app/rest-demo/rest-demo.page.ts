import { Component, OnInit } from '@angular/core';
import { ApirestService} from '../services/apirest.service';
import { ChuckJoke } from '../models/chuck-joke';


@Component({
  selector: 'app-rest-demo',
  templateUrl: './rest-demo.page.html',
  styleUrls: ['./rest-demo.page.scss'],
})
export class RestDemoPage implements OnInit {

  categories: string[];
  joke: ChuckJoke;
  jokeSport: ChuckJoke;

  constructor(
    public apirestservice: ApirestService) {
    
      this.joke = new ChuckJoke();
      this.jokeSport = new ChuckJoke();
   }

  ngOnInit() {
  }

  getCategories(){
    this.apirestservice.getList().subscribe (response => {
      console.log(response)
      this.categories = response
    } 
    )
  }

  getJoke(){
    this.apirestservice.getJoke().subscribe (response => {
      console.log(response)
      this.joke = response
    } 
    )
  }
  
  getJokeFromCategory(category: string){
    this.apirestservice.getJokeFromCategory(category).subscribe (response => {
      console.log(response)
      this.joke = response
    } 
    )
  }
  getSportJoke(){
    this.apirestservice.getJoke().subscribe (response => {
      console.log(response)
      this.jokeSport = response
    } 
    )
  }

}
