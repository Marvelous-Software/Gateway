import { LazyRoute } from '@angular/compiler';
import { Component } from '@angular/core';

import { Geolocation } from '@ionic-native/geolocation/ngx';
import { NativeGeocoder, NativeGeocoderResult } from '@ionic-native/native-geocoder/ngx';

//Storage
import { Storage } from '@ionic/storage-angular';
//npm install cordova-plugin-geolocation
//npm install @ionic-native/geolocation
//npm install @ionic-native/core
/*
npm run build
npx cap sync
npx cap open android
npx cap add android
ionic cap sync
*/
//npm install @ionic-native/native-geocoder
//npm install cordova-plugin-nativegeocoder



@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss']
})


export class Tab1Page {

  lat: any;
  long: any;
  address: any = "N/A";

  constructor(private storage: Storage,
    private geolocation: Geolocation,
    private geocoder: NativeGeocoder) { }

  ngOnInit() {

    this.storage.create();

  }

  async doGet() {

    await console.log(this.storage.get('user'));

  }

  async doSet() {

    console.log("Setting");
    await this.storage.set('user', 'Chuck Norris');

  }
  async getPosition() {
    await this.geolocation.getCurrentPosition(
      {
        enableHighAccuracy: true,
        timeout: 20000,
        maximumAge: 0
      }
    ).then((resp) => {
      this.lat = resp.coords.latitude;
      this.long = resp.coords.longitude;
      this.getAddress(this.lat, this.long);
    }).catch((error) => {
      console.log('Error getting location', error);
    });
  }

  getAddress(lattitude, longtitude) {

    this.geocoder.reverseGeocode(
      lattitude,
      longtitude,
      { useLocale: true, maxResults: 5 }
    ).then((res: NativeGeocoderResult[]) => {
      this.address = res[0].locality
    }
    )
  }
}