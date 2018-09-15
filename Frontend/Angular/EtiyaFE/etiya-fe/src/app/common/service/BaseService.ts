import { GlobalSettingsService } from '../../services/global-settings.service';

export class BaseService<T> {

  protected controller: string;

  constructor(protected globalSettings: GlobalSettingsService) { }

  getAll(type: number): Array<any> {

    if (type === 1) {
      return [
        { id: 1, name: 'Etiya', title: 'Etiya Corp' },
        { id: 2, name: 'AerotiveLabs', title: 'AerotiveLabs Corp' },
        { id: 3, name: 'Arcelik', title: 'Arcelik Corp' },
        { id: 4, name: 'Aselsan', title: 'Aselsan Corp' },
      ];
    } else if (type === 2) {
      return [
        { code: '234', name: 'A Corp' },
        { code: '345', name: 'B Corp' },
        { code: '252', name: 'C Corp' },
        { code: '678', name: 'D Corp' },
      ];
    }
  }
  getById(Id: number) {
    console.log('entity getbyid request');
  }
  deleteById(Id: number) {
    console.log('entity deletebyid request');
  }
  add(entity: T) {
    console.log('entity add request');
  }
  update(entity: T) {
    console.log('entity update request');
  }
}
