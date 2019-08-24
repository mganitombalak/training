let bodyParser = require("body-parser");
let express = require("express");
let os = require('os');
const app = express();
app.use(bodyParser.json());
app.use(
  bodyParser.urlencoded({
    extended: true
  })
);     
let data = [
  {id: 1,firstName: "Gani",lastName: "Tombalak"},
  {id: 2,firstName: "Ahmet",lastName: "Semiz"}
];

let roles = [
  {id: 1,name: "Admin"},
  {id: 2,name: "Siradan Kullanici",}
];
app.get("/users", (req, res, next) => {
    res.json({s:os.hostname(),d:data});
});
app.get("/role", (req, res, next) => {
    res.json({s:os.hostname(),d:roles});  
});
app.get("/users/:userId", (req, res) => {
  return res.send(
    res.json({s:os.hostname(),d:data.filter(u => u.id === parseInt(req.params.userId))})
  );
});
app.get("/roles/:roleId", (req, res) => {
  return res.send(
    res.json({s:os.hostname(),d:data.filter(u => u.id === parseInt(req.params.roleId))})
  );
});
app.post("/users", (req, res) => {
  data.push(req.body);
  return res.status(200).send("");
});

app.listen(5000, () => {
  console.log("Server running on port 5000");
});
