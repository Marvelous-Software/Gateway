import { Component, OnInit } from '@angular/core';
import { ModalController } from '@ionic/angular';
import { SelectPage } from '../modals/select/select.page'

@Component({
  selector: 'app-aboutus',
  templateUrl: './aboutus.page.html',
  styleUrls: ['./aboutus.page.scss'],
})
export class AboutusPage implements OnInit {

  dataReturned: any;


  constructor(public modalController: ModalController) { }

  ngOnInit() {
  }

  async openModal() {
     const modal = await this.modalController.create({ 
        component: SelectPage, componentProps: { "paramID": 231, 
                                                 "paramTitle": "Test Title" } });
     modal.onDidDismiss().then((dataReturned) => { if (dataReturned !== null) { this.dataReturned = dataReturned.data; alert('Modal Sent Data :'+ dataReturned); } }); return await modal.present(); } }
 

