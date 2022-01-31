import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http'

import { AppComponent } from './app.component';
import { TdfDemoComponent } from './tdf-demo/tdf-demo.component';
import { MdfDemoComponent } from './mdf-demo/mdf-demo.component';
import { FetchEmployeesComponent } from './fetch-employees/fetch-employees.component';
import { FectemployeeComponent } from './fectemployee/fectemployee.component';
import { StoreemployeeComponent } from './storeemployee/storeemployee.component';
import { RouterModule, Routes } from '@angular/router';
import { SuccessComponent } from './success/success.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { SettingsComponent } from './settings/settings.component';
import { ProfileComponent } from './profile/profile.component';
import { EmpGuardsGuard } from './emp-guards.guard';


let routeConfig : Routes=[
  {path:'', component: FetchEmployeesComponent},
  {path:'loadAll', component: FetchEmployeesComponent},
  {path:'loadById', component: FectemployeeComponent},
  {path:'tdf', component: TdfDemoComponent},
  {path:'mdf', component: MdfDemoComponent},
  {path:'success/:un', component: SuccessComponent,canActivate:[EmpGuardsGuard], children:[
    {path:'', component: DashboardComponent  },{path:'dashboard', component:DashboardComponent},
    {path:'settings',component:SettingsComponent}, {path:'profile', component:ProfileComponent}]
  }]

@NgModule({
  declarations: [
    AppComponent,
    TdfDemoComponent,
    MdfDemoComponent,
    FetchEmployeesComponent,
    FectemployeeComponent,
    StoreemployeeComponent,
    SuccessComponent,
    DashboardComponent,
    SettingsComponent,
    ProfileComponent
  ],
  imports: [
    BrowserModule, FormsModule, ReactiveFormsModule, HttpClientModule,
    RouterModule.forRoot(routeConfig)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
