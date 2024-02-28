function IsPositive(number){
    if(number > 0) {
        return true;
    } else {
        return false;
    }
}


function checkNumber(numberToBeVerified){
    if(IsPositive(numberToBeVerified)){
        console.log("s-a introsdus o valoare pozitiva")
    }
    else {
        console.log('s-a introdus o valoare negativa')
    }
}


function divideNumbers(x,y){
    if (y === 0) {
        console.log("Operate impossibile, impartitorul este 0");
    } else {
        return x/y;
    }
    return null;
    }

function add(a, b = 0, c = 0){
    return a+b+c;
}

// params as list on js
function multiplication(a,b){
    console.log(arguments)
    if(arguments.length > 2){
    return a * b * arguments[2] * arguments[3];
} else {
    return a * b;
    }
}

var nr = 100;
checkNumber(nr);
checkNumber(-12);
var a = divideNumbers(3,0);
console.log(a);

// optional params
console.log(add(2));
console.log(add(2,3,4));

// params as list on js
console.log(multiplication(1,2,3,4));

// function expresion
const addiction = function (a, b){
    const sum = a + b;
        return sum
};

console.log(addiction(2, 3));

// arrow function - one line function - cea mai scurta metoda de a scrie o functie
const addArrowFunction = (a, b) => a + b;

console.log("Arrow functions: " + addArrowFunction(9, 3));

// callback function
function onlyPositive(a, b, functionName){
    if(IsPositive(a) && IsPositive(b)) {
        return functionName(a,b);
    } else {
        return null;
    }
}

console.log("Callback function(add)" + onlyPositive(2, 3, add));
console.log("Callback multiplication(add)" + onlyPositive(2, 3 , multiplication));

// AsyncFunctions - functiile asincrone executa operatii in background, de exemplu sa se execute doua call-uri la api in acelasi timp

// arrays 
console.log("Arrays:")
const animals = ["cat", "dog", "lion", "parrot"];
const mixedlist = [1, 2, 3, "dog", "cat"];

console.log(animals[2]);
console.log("Nunmers of animals: " + animals.length);

animals.push("mouse");
console.log(animals);
animals.pop("dog");
console.log(animals);
animals.splice(1, 0);
animals.pop("dog");
console.log(animals);
animals.splice(0, 1, "test")
console.log(animals);
animals.splice(2,3);
console.log(animals);

// iteration over arrays
console.log("Iterate over list with while: ")
let i = 0;
while (i < mixedlist.length){
    const elem = mixedlist[i]
    console.log("1elemnt value: " + elem + "type of elem: " + typeof elem)
    i++;
}

console.log("Iterate over list with for: ")
for(let i = 0; i <= mixedlist.length; i++) {
    const elem = mixedlist[i]
    console.log("2elemnt value: " + elem + "type of elem: " + typeof elem);
}

// iterate with foreach
for (const animal of animals) {
    console.log(animal);
}

// iterate list over do while 
console.log("Iterate over list with do while:  ")
i = 0;
do
{
    const elem = mixedlist[i]
    console.log("3elemnt value: " + elem + "type of elem: " + typeof elem);
    i++;
    console.log(i);
}
while (i < mixedlist.length);