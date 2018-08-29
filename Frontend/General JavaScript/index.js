// function makeIterator(arrayObj){
//     var nextIndex=0;

//     return {
//         next:function(){
//             return nextIndex<arrayObj.length?
//             {value:arrayObj[nextIndex++],done:false} :
//             {done:true}
//         }
//     }
// }
// // var myArray=['Mehmet','Gani','Tombalak','Istanbul'];
// // var myIterator= makeIterator(myArray);
// // console.log(myIterator.next().value);
// // console.log(myIterator.next().value);
// // console.log(myIterator.next().done);
// // console.log(myIterator.next().value);
// // console.log(myIterator.next().value);
// // console.log(myIterator.next().done);

// function* IdGenerator(){
// var id=0;
//     while(true)
//         yield id++
// }

// var generator=IdGenerator();
// console.log(generator.next().value);
// console.log(generator.next().value);
// console.log(generator.next().value);
// console.log(generator.next().value);

// function* Iterate(){
//         yield*[1,2,3,4,5,6,7,8];
//     }


//     function* fibonacci() {
//         var fn1 = 0;
//         var fn2 = 1;
//         while (true) {  
//           var current = fn1;
//           fn1 = fn2;
//           fn2 = current + fn1;
//           var reset = yield current;
//           if (reset) {
//               fn1 = 0;
//               fn2 = 1;
//           }
//         }
//       }

//       var fibo = fibonacci();
//       console.log(fibo.next().value);

// function OldFashioned(successF,failF)
// {
//     console.log("Working");
//    if(Math.random()>0.5)
//     {
//         successF("Op is completed successfully");
//     } else {
//         failF("Op is failed");
//     }
// }
// function OperationSuccessful(result){
//     console.log(result);
// }
// function OperationFailed(result){
//     console.log(result);
// }
// OldFashioned(OperationSuccessful,OperationFailed);

function NewFashioned()
{
    return new Promise((resolve,reject)=>{
        console.log('promise working');
        if(Math.random()>0.5){
            resolve({status:true,message:"Success"});
        } else {
            reject({status:false,message:"Failed"});
        }
    });
}
let myPromise = NewFashioned();
myPromise.then(console.log).catch(console.log);










