import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-killers',
  templateUrl: './killers.page.html',
  styleUrls: ['./killers.page.scss'],
})
export class KillersPage implements OnInit {

  constructor(private route: Router) { }

  ngOnInit() {
  }

  showTheIdesofMarch() {
    console.log("theidesofmarch");
    this.route.navigate(['/theidesofmarch']);
  }
}
