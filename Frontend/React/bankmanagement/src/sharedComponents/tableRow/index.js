import React from 'react';

const TableRow = (props) => (
  <tr key={props.id}>
    <td>{props.index + 1}</td>
    {Object.keys(props).slice(props.startColIndex, props.endColIndex).map((col, index) => (
      <td key={"gentd-" + index}>{props[col]}</td>
    ))}
    <td><button onClick={() => props.onItemDelete(props.id)}>Delete</button></td>
  </tr>
)
export default TableRow