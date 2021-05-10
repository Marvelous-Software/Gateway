import { Component } from '@angular/core';

import { Media } from '@ionic-native/media/ngx'

//ionic cordova plugin add cordova-plugin-media
//npm install @ionic-native/media
//npm install @ionic-native/core

//to run in browser
//npm i -g native-run
//ionic cordova run browser 

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  song: any
  duration: any

  constructor(private media: Media) {

    this.song = this.media.create("../assets/music/Beetlejuice.mp3");
    /*this.song.setVolume(0.0);
    this.song.play();
    while (this.song.getDuration() == -1) {}
    this.duration = this.song.getDuration();
    this.song.stop();*/

  }

  play() {
    
    this.song.play();

  }

  pause() {
    
    this.song.pause();

  }

}
