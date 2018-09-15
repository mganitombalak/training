var x = 10;
console.log(x);
function test() {
    if (x > 20) {
        var x = 50;
    }
    console.log(x);
}
console.log(x);
test();