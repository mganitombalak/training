import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './components/appRoot/app.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import {AppRoutingModule} from './app-routing.module';
import { GlobalSettingsService } from './services/global-settings.service';
@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [GlobalSettingsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
