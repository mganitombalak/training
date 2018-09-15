var Car = function (model, brand, year) {
    this.model = model,
    this.year = year,
    this.brand = brand,
    this.calistir = () => console.log(this.model+ " Car is running")
};
var c = new Car("P90", "Tesla", 2018);
// c.calistir=()=>console.log("Car is running");
console.log(c.brand);
console.log(c.model);
console.log(c.year);
c.calistir();
var c2 = new Car("Fiat", "Murat124", 1972);
console.log(c2.brand);
console.log(c2.model);
console.log(c2.year);
c2.calistir();
Car.prototype.dur=()=>{
    var self=this;
    console.log(self);
    console.log(this.model+ " Car is stopped");
};
c.dur();
c2.dur();