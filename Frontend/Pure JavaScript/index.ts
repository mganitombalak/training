class Customer {
    constructor(varName: string, varSurname: string) {
        this.name = varName;
        this.surname = varSurname;
    }
    name: string;
    surname: string;
}


function onLoad() {
    var myobj: Customer = new Customer("Mehmet Gani", "Tombalak");
    console.log(myobj.name);
}