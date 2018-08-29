import {
  ACTION_POPULATE,
  TYPE_NACES
} from '../../common/actions'
const initialState = {
  count: 0,
  nacesData: []
}
export default (state = initialState, action) => {
  if (action.dataType === TYPE_NACES) {
    switch (action.type) {
      case ACTION_POPULATE:
        return {
          count: action.data.length,
          nacesData: action.data
        }
      default:
        return state;
    }
  }
  return state;
}