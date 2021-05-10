import { Component } from '@angular/core';

import { NativeAudio } from '@ionic-native/native-audio/ngx'

// Native audio
//https://ionicframework.com/docs/native/native-audio
//
//npm install cordova-plugin-nativeaudio
//npm install @ionic-native/native-audio
//ionic cap sync
//
//import { NativeAudio } from '@ionic-native/native-audio/ngx'

//npm install cordova-plugin-nativeaudio
//npm install @ionic-native/native-audio
//ionic cap sync

//npx cap copy android


//https://github.com/twinssbc/Ionic2-Calendar#readme
//
//https://devdactic.com/ionic-5-calendar-modal/

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})
export class Tab2Page {

  constructor(private nativeAudio: NativeAudio) {

    //this.nativeAudio.preloadComplex('ThemeSong', 'assets/music/Beetlejuice.mp3', 1, 1, 0).then(onSuccess, onError);
    this.nativeAudio.preloadComplex('ThemeSong', 'assets/music/Beetlejuice.mp3', 1, 1, 0).then(function(){
      console.log("audio loaded")
    }, function( err ){
      console.log( "no audio " + err )
    });
  }

  onSuccess(){

    console.log("Success")

  }
  onError(){

    console.log("Error")

  }
  play(){

    var audioFile = new Audio("../../assets/music/Beetlejuice.mp3")
    audioFile.play()

  }
  
  playNative(){

    this.nativeAudio.play('ThemeSong').then(function(){
      console.log("song playing")
    }, function( err ){
      console.log( "unable to play " + err )
    });

  }

  stopNative(){

    this.nativeAudio.stop('ThemeSong')

  }
}
