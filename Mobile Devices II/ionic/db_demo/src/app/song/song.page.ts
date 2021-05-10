import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from "@angular/forms";
import { DbService } from './../services/db.service'
import { ActivatedRoute, Router } from "@angular/router";

//npm install @ionic-native/sqlite
//ionic cordova plugin add cordova-sqlite-storage
//npm i @ionic-native/core

//npm install @ionic-native/sqlite-porter
//ionic cordova plugin add uk.co.workingedge.cordova.plugin.sqliteporter

//ng g class services/song
//ng generate service services/db

//create platform
//ionic cordova platform add ios
//ionic cordova platform add android
//ionic cordova platform add windows

//build platform
//ionic cordova build ios
//ionic cordova build android
//ionic cordova build windows

//launch
//ionic cordova run ios -l
//ionic cordova run android -l
//ionic cordova run windows -l

//extras
//npm i -g cordova-res
//ionic cordova resources android --force
//npm run build
//npx cap sync
//npx cap open android
//npx cap add android
//ionic cap sync
//
@Component({
  selector: 'app-song',
  templateUrl: './song.page.html',
  styleUrls: ['./song.page.scss'],
})
export class SongPage implements OnInit {
  editForm: FormGroup;
  id: any;

  constructor(
    private db: DbService,
    private router: Router,
    public formBuilder: FormBuilder,
    private actRoute: ActivatedRoute
  ) {
    this.id = this.actRoute.snapshot.paramMap.get('id');

    this.db.getSong(this.id).then(res => {
      this.editForm.setValue({
        artist_name: res['artist_name'],
        song_name: res['song_name']
      })
    })
  }

  ngOnInit() {
    this.editForm = this.formBuilder.group({
      artist_name: [''],
      song_name: ['']
    })
  }

  saveForm(){
    this.db.updateSong(this.id, this.editForm.value)
    .then( (res) => {
      console.log(res)
      this.router.navigate(['/home']);
    })
  }

}
