import {
  ACTION_POPULATE,
  TYPE_ACCOUNTS
} from '../../common/actions'
const initials = {
  count: 0,
  accountsData: []
}

export default (state = initials, action) => {
  if (action.dataType === TYPE_ACCOUNTS) {
    switch (action.type) {
      case ACTION_POPULATE:
        return {
          count: action.data.length,
          accountsData: action.data
        }
      default:
        return state;
    }
  }
  return state;
}