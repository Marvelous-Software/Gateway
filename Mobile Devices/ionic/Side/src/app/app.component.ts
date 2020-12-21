import { Component, OnInit } from '@angular/core';

import { Platform } from '@ionic/angular';
import { SplashScreen } from '@ionic-native/splash-screen/ngx';
import { StatusBar } from '@ionic-native/status-bar/ngx';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.scss']
})
export class AppComponent implements OnInit {
  public selectedIndex = 0;
  public appPages = [
    {
      title: 'Images',
      url: '/folder/Images',
      icon: 'mail'
    },
    {
      title: 'Text',
      url: '/folder/Text',
      icon: 'paper-plane'
    },
    {
      title: 'Form',
      url: '/folder/Form',
      icon: 'heart'
    },
  ];

  constructor(
    private platform: Platform,
    private splashScreen: SplashScreen,
    private statusBar: StatusBar,
    private route: Router
  ) {
    this.initializeApp();
  }

  initializeApp() {
    this.platform.ready().then(() => {
      this.statusBar.styleDefault();
      this.splashScreen.hide();
    });
  }

  ngOnInit() {
    const path = window.location.pathname.split('folder/')[1];
    if (path !== undefined) {
      this.selectedIndex = this.appPages.findIndex(page => page.title.toLowerCase() === path.toLowerCase());
    }
  }

  showPage(which) {
    console.log("SHOW " + which);
    switch(which) { 
      case "Images": { 
        this.route.navigateByUrl('images');
        break; 
      } 
      case "Text": { 
        //statements; 
        break; 
     } 
     case "Form": { 
      //statements; 
      break; 
   } 
  default: { 
         //statements; 
         break; 
      } 
   }     
  }
}
