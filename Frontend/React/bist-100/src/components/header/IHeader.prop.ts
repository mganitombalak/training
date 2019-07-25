import { ICartProp } from "./components/cart/ICart.prop";
import { IProfileProp } from "./components/profile/IProfile.prop";

export interface IHeaderProp {
    profile: IProfileProp;
    cartProp: ICartProp;
}