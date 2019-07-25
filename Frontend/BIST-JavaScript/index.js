var Person = /** @class */ (function () {
    function Person() {
    }
    Person.prototype.getFullName = function () {
        return this.adi + " " + this.soyadi;
    };
    return Person;
}());
var g = new Person();
g.adi = "Gani";
g.soyadi = "Tombalak";
console.log(g.adi + " " + g.soyadi);
