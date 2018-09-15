import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
const routes: Routes = [
    { path: '', redirectTo: 'index', pathMatch: 'full' },
    {
        path: 'company',
        loadChildren: './modules/company/company.module#CompanyModule'
    }
];
@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule { }