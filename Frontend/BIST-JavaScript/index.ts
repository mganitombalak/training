interface BirthDay {
    day: number;
    year: number;
    month: number;
    age: number;
}
interface IPerson {

    adi: string | number;
    soyadi: string;
    birthDay: BirthDay;
}
// class Person implements IPerson {

//     adi: string;
//     soyadi: string;
//     getFullName(): string {
//         return this.adi + " " + this.soyadi;
//     }
// }

class Greeter {
    sayHello(person: IPerson): string {
        return "Hello " + person.adi + " " + person.soyadi;
    }
}

// var g = new Person();
// g.adi = "Gani";
// g.soyadi = "Tombalak"

var greeter = new Greeter();
var helloConfigParams = {
    adi: 1,
    soyadi: "Tombalak",
    birthDay: { day: 5, month: 5, year: 1900, age: 40 }
};
greeter.sayHello(helloConfigParams);