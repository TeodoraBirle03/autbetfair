console.log("Hello JavaScript");

/* declaration 
of varaibles - function scope */
var x;
x = "ana are mere;"
console.log(x)

x = 1234;
console.log(x);

// declaration of constant
const a = "ana are mere";
// a=1245; - cannot update content of constnt


// let declaration - se foloseste inafara functiilor, e mai nou, preferabil de folosit
let y = "test let";
console.log(y);

y = 789;
console.log(y);

// types of variables
// numbers
let n = 22;
let b =  22.345678;
let h = 22e9;
// numar in binar mai jos;
let m = 0b11;
let k = 0x10;

console.log(n, b, h, m, k);

// variabile string
var fisrtsName = "Florin";
var lastname = "Popescu";
console.log(fisrtsName+ " "+lastname);

// boolean
var isRaining = true;
var isHaveMoneyIntoAccount = false;

if (isRaining) {
    console.log("Take an umbrella!")
}

// type of operators
// aritmetic operators + - * / 
console.log("Arithmetic operators")
console.log(2+3);
console.log(2-1);
console.log(4*4);
console.log(4/3);
// restul impartirii %
console.log(4%3); 

var nr = 10;
var isEven = !(nr%2 === 0); //daca un numar este par
console.log(isEven);
console.log(!isEven); // ! negatia expresiei

// comparators
console.log(2 == '2'); //compara doar valoarea, facandu-le pe ambele string-uri
console.log (2 === '2'); // compara si tipul variabile si valoarea acesteia, preferabil de folosit;
console.log(2>3);
console.log(5<=5);
console.log(2>=4);

console.log(3 != '3');

// logic operators
console.log("Logic operators");
console.log(true || false);

console.log(false && true);


// typeof
console.log("Type Of: ")
var ana;
var nr1 = 0/0;
console.log(typeof a, typeof isEven, typeof fisrtsName, typeof k, typeof ana, typeof nr1);
console.log(nr1, typeof nr1);

const maxNumber = Math.pow(10, 10000000000);
console.log(maxNumber, typeof maxNumber);
console.log(Math.log(0)); // - infinit, ca in matematica
console.log(-1/0);

var elem = null;
console.log(typeof elem);

// ternary operators = operatori ternari, prima data se face compararea, apoi atribuirea
var age = 10;
var canDrive = age >=18;
var canDriveMessage = canDrive ? 'can drive' : 'cannot drive'; // one line if, este si in Java

console.log(canDriveMessage)


// structurile de control
// if if - else  if - elseif - else if(if) - else
if (canDrive === true) {
    console.log("User can drive");
} else {
    console.log("User cannot drive");
}

// switch
const one = true;

switch (one) {
    case '1':
        console.log("One is string");
        break;
    case true:
        console.log("one is boolean true");
        break;
    case 1:
        console.log("One si number");
        break;
    default:
        console.log("Undefined type");
        break;
}

// console.log working with variables
const num1 = 6;
const num2 = 5;
console.log(`${num1 } is ${num1 > num2 ? 'greater' : 'smaller'} than ${num2}`);
console.log(num1 + " is " + (num1 > num2 ? 'greater' : 'smaller')+ " than "+ num2);