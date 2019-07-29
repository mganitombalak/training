import { ICarouselState } from "./ICarousel.state";
import LoadCarsDataAction from "./action-creators";
import { LOAD_PRODUCT_DATA } from "./actions";
import { IProductModel } from "../../models/IProductModel";

const initialState: ICarouselState = {
    data: {} as Array<IProductModel>
}

export function carouselReducer(state = initialState, action: LoadCarsDataAction): ICarouselState {
    switch (action.type) {
        case LOAD_PRODUCT_DATA:
            return {...state, data: action.data };
            break;
        default:
            return state;
    }
}