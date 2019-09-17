import { Component, OnInit } from '@angular/core';
import { RouterModule, Routes, Router,ActivatedRoute } from '@angular/router';
import { PacienteService } from './paciente.service';



const routes: Routes = [
  { path: 'routePath', component: Component },
  { path: '**', pathMatch:'full', redirectTo: 'routePath' }
];

export const appRouting = RouterModule.forRoot(routes);
@Component({
  selector: 'app-expediente',
  templateUrl: './expediente.component.html',
  styleUrls: ['./expediente.component.css']
})
export class ExpedienteComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
