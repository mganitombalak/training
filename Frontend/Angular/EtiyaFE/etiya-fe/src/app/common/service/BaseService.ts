import { GlobalSettingsService } from "../../services/global-settings.service";

export class BaseService<T> {

  protected controller:string;

  constructor(protected globalSettings: GlobalSettingsService) { }

  getAll(): void {
    console.log(
      this.globalSettings.ApiBaseURL + 
      " entities request " + 
      this.controller);
  }
  getById(Id: number) {
    console.log("entity getbyid request");
  }
  deleteById(Id: number) {
    console.log("entity deletebyid request");
  }
  add(entity: T) {
    console.log("entity add request");
  }
  update(entity: T) {
    console.log("entity update request");
  }
}