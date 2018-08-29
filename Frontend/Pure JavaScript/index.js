var Customer = /** @class */ (function () {
    function Customer(varName, varSurname) {
        this.name = varName;
        this.surname = varSurname;
    }
    return Customer;
}());
function onLoad() {
    var myobj = new Customer("Mehmet Gani", "Tombalak");
    console.log(myobj.name);
}
