import { Component, OnInit } from '@angular/core';

//Angular 2, 4 and upcoming latest TypeScript HTML Snippets
//Angular Language Service
//Angular Snippets (Version 11)


@Component({
  selector: 'app-templates',
  templateUrl: './templates.page.html',
  styleUrls: ['./templates.page.scss'],
})
export class TemplatesPage implements OnInit {

  testId = 3

  ingredients = {
    ing1: "water",
    ing2: "salt",
    ing3: "pasta"
  }

  paste_sauce = [
    { is: 1, name: "meatballs"},
    { is: 2, name: "pesto"},
    { is: 3, name: "red sauce"},
    { is: 4, name: "red beets"}
  ]
  constructor() { }

  ngOnInit() {
  }

}
