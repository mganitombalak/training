import { LOAD_PRODUCT_DATA } from "./actions";
import { IProductModel } from "../../models/IProductModel";

export default interface LoadCarsDataAction{
    type:typeof LOAD_PRODUCT_DATA,
    data:Array<IProductModel>
}