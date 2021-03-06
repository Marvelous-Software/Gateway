import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {


  constructor(private route: Router) {}

  showTestForm() {
    this.route.navigate(['/test-form_original/42']);
  }

  showInClassForm() {
    this.route.navigate(['/form-in-class']);
  }

}

