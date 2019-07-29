import { TYPE_CARS ,ACTION_SET_DATA} from "../../../actions";

const initialData = {
    cars: []
}
export default (state = initialData, action) => {
    if (action.objectType == TYPE_CARS) {
        switch (action.type) {
            case ACTION_SET_DATA:
                return { cars: action.actionData }
            default:
                return state;
        }
    }
    return state;
}