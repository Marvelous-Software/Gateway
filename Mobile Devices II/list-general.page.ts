import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-general',
  templateUrl: './list-general.page.html',
  styleUrls: ['./list-general.page.scss'],
})
export class ListGeneralPage implements OnInit {

  fruits: string[]

  constructor() { 
    this.fruits = ["apple", "orange", "pineapple", "mango"];
  }

  ngOnInit() {
  }

}


//echo "# mobile_app_competition-Marvelous-Software" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/GWCCMS/mobile_app_competition-Marvelous-Software.git
//git push -u origin main


//<ion-list padding *ngFor="let item of items; let i = index">
//<ion-item (click)="showDate(i)">{{ i }}</ion-item>
//</ion-list>