// let adi ="gani";
// var soyadi="tombalak";

// var person = {
//     adi: "gani",
//     soyadi: "tombalak"
// };

var person = function (name,surname) {
    this.adi = name;
    this.soyadi = surname;
    this.getFullname=()=> this.adi + " " + this.soyadi;
};

var s = new person("Suleyman","Ozdemirci");
var g = new person("Gani","Tombalak");
person.prototype.getPrefixedFullName=()=> "Mr."+ this.adi + " " + this.soyadi;

console.log(s.adi);
console.log(s.soyadi);
console.log(s.getFullname());
console.log(s.getPrefixedFullName());

console.log(g.adi);
console.log(g.soyadi);
console.log(g.getFullname());
console.log(g.getPrefixedFullName());

console.log(person.prototype);
console.log(0.2+0.1);
console.log((0.2+0.1)==0.3);