import React from 'react';
import './profile.css'
import { IProfileProp } from './IProfile.prop';
class Profile extends React.Component<IProfileProp> {

    render=()=>(
        <i className="user circle outline icon"></i>
    );
}

export default Profile;