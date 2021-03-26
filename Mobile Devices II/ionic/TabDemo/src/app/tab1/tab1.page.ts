import { Component } from '@angular/core';

//Storage
import { Storage } from '@ionic/storage-angular';

@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss']
})
export class Tab1Page {

  constructor(private storage:Storage) {}

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

  
}
