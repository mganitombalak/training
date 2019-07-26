import { ICarouselState } from "./ICarousel.state";
import LoadCarsDataAction from "./action-creators";
import { LOAD_PRODUCT_DATA } from "./actions";
import { ProductService } from "../../services/product-service";
import { IProductModel } from "../../models/IProductModel";

const initialState: ICarouselState = {
    data: {} as Array<IProductModel>
}

export function carouselReducer(state = initialState, action: LoadCarsDataAction): ICarouselState {
    switch (action.type) {
        case LOAD_PRODUCT_DATA:
            let result: Array<IProductModel>=[];
            let service = new ProductService();
            service.read().then(r => result = r)
            return { data: result };
            break;
        default:
            return state;
    }
}