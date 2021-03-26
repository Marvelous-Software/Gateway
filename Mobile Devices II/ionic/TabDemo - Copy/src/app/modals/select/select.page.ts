import { Component, OnInit } from '@angular/core';
import { ModalController, NavParams } from "@ionic/angular"

@Component({
  selector: 'app-select',
  templateUrl: './select.page.html',
  styleUrls: ['./select.page.scss'],
})
export class SelectPage implements OnInit {

  mId: number;


  constructor(private modalController: ModalController,
              private navParams: NavParams) {

            
  }

  ngOnInit() {

    this.mId = this.navParams.data.paramID;

  }

  async dispose() {

    await this.modalController.dismiss();

  }
}
