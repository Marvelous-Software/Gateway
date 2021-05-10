import { Component, OnInit } from '@angular/core';
import { WeatherService} from '../services/weather.service';
import { Weather } from '../models/weather';

//fb49131d5f027d55cbc474c117a4f458
//6bc76d5b1d4e44e45c77ee5b1e20ce68

@Component({
  selector: 'app-weather',
  templateUrl: './weather.page.html',
  styleUrls: ['./weather.page.scss'],
})
export class WeatherPage implements OnInit {

  weatherData: Weather
  inputCity: string = "West Haven";

  constructor(
    public apiWeatherService: WeatherService) {

      this.weatherData = new Weather()

     }

  ngOnInit() {
  }

  getWeather(){
    this.apiWeatherService.getWeatherCustom(this.inputCity).subscribe (response => {
      console.log(response)
      this.weatherData = response
    } 
    )
  }

}
