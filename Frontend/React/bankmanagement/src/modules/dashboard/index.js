import React, { Component } from 'react';
import Counter from '../../sharedComponents/counterWithErr'
import '../../sharedComponents/helloWebComponent/hellowc'
import ErrWrapper from '../../sharedComponents/errorBoundary'

class Dashboard extends Component {
  render() {
    return (
      <div>
        <h3>Dashboard</h3>
        <hello-comp name="USER NAME" />
        <ErrWrapper>
          <Counter />
          <Counter />
        </ErrWrapper>
        <br />
        <p>
          Lorem ipsum dolor sit amet,consectetur adipiscing elit. Sed pharetra ac magna eget condimentum.
          Vestibulum ac ante ac nibh vestibulum fermentum. Aliquam eu mattis velit, et porta nisi. Aenean
          eu elementum ex, hendrerit molestie dui. In hac habitasse platea dictumst. Suspendisse tincidunt
          augue nibh, nec vehicula odio volutpat ut. Ut vel ultrices velit. Donec imperdiet sagittis nisl,
          a consequat turpis tincidunt et. Duis ut eros nec ligula maximus tincidunt sit amet in purus.
          Morbi nec nulla vulputate, aliquet velit vel, auctor augue. Aliquam sit amet congue sapien, in
          finibus augue.

          Suspendisse vulputate quam id diam malesuada, nec cursus velit vehicula. Proin ullamcorper quis
          risus sed pellentesque. Pellentesque pellentesque, velit et eleifend auctor, nunc est tincidunt
          sapien, auctor lobortis risus libero id purus. Mauris efficitur tortor massa, nec posuere tortor
          malesuada eget. Sed condimentum leo quis odio pretium gravida. Duis vulputate pretium orci at
          blandit. Integer lacinia, mauris ut commodo laoreet, felis lorem ornare augue, vel scelerisque
          massa nulla tempus orci.

          Aliquam erat volutpat. Aenean felis mauris, varius nec sollicitudin vitae, tincidunt quis metus.
          Praesent imperdiet, nisi eget eleifend condimentum, velit ipsum auctor orci, ut aliquet ex odio
          non lacus. Praesent in tellus pellentesque, laoreet quam sit amet, sollicitudin ipsum. Sed sit
          amet porttitor mi, quis maximus nisi. Integer laoreet sed lorem in pharetra. Duis cursus et erat
          nec aliquam. Pellentesque porttitor metus enim, et euismod dui venenatis id. Vestibulum pellentesque,
          dui eget laoreet pellentesque, nisl ante vulputate enim, a viverra orci ante sed odio. Pellentesque
          accumsan tellus et dui egestas, quis gravida quam pulvinar. Integer feugiat mi varius nisl
          pellentesque viverra. Aenean sollicitudin ac nulla ac facilisis. Aenean semper velit nulla,
          ut tristique erat pulvinar eget.
        </p>
      </div>)
  }
}

export default Dashboard