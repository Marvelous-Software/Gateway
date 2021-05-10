import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouteReuseStrategy } from '@angular/router';

import { IonicModule, IonicRouteStrategy } from '@ionic/angular';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

//Geolocation
import { Geolocation } from '@ionic-native/geolocation/ngx';
import { NativeGeocoder} from '@ionic-native/native-geocoder/ngx';

//Storage
import { IonicStorageModule } from '@ionic/storage-angular';

//For rest api
import { HttpClientModule } from '@angular/common/http';

//Native audio
import { NativeAudio } from '@ionic-native/native-audio/ngx'

@NgModule({
  declarations: [AppComponent],
  entryComponents: [],
  imports: [BrowserModule, IonicModule.forRoot(), AppRoutingModule,
    IonicStorageModule.forRoot(),
    HttpClientModule],

  providers: [Geolocation, NativeGeocoder, NativeAudio,
    { provide: RouteReuseStrategy, useClass: IonicRouteStrategy }],
  bootstrap: [AppComponent],
})
export class AppModule {}

//export class TestFormPage implements OnInit {
