// console.log("Hello world");
// var person = {
//     name: "Gani",
//     surname: "Tombalak",
//     getFullName:function(){return this.name +" "+ this.surname }
// };
// console.log(person.name);
// console.log(person.surname);
// console.log(person.getFullName());
// var person2 = person;
// console.log(person2.name);
// console.log(person2.surname);

var person = function (firstName, surName) {
    this.name = firstName;
    this.surname = surName;
};

var p = new person("Gani", "Tombalak");
// p.name="Gani";
// p.surname="Tombalak";
p.getFullName = function () {
    return this.name + " " + this.surname;
};
console.log(p.name);
console.log(p.surname);
console.log(p.getFullName());
var p2 = new person("Eda", "Dinckan");
// p2.name="Eda";
// p2.surname="Dinckan";
console.log(p2.name);
console.log(p2.surname);