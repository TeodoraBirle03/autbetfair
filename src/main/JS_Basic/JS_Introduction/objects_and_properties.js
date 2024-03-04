// avem un obiect, cu mai multe proprietati(elev, nume, etc) si valorile acestora;
var elev = {
    nume : "Popescu",
    prenume : "Ion",
    medie : 9.85,
};

console.log("Nume: " + elev.nume + "Prenume" + elev["prenume"]);
console.log(elev.medie);

// nested objectes
const myHonda = {
    color : "red",
    wheels : 4,
    engine : {
        cylinder : 4,
        size : 2.0,
        fuel : "gas"
    },
};

console.log(myHonda.engine.cylinder);

// setting new values
myHonda.color = "green";
console.log("New color of Honda is: " + myHonda.color);

myHonda.engine.fuel = "gas/gpl";
console.log(myHonda.engine.fuel);

// new class, adding methods
const book = {
    author : "Ion Creanga",
    title: "Amintiri din copilarie",

    getTitle: function() {
        return this.title;
    },
    // Java
    getAuthor(){
        return this.author;
    }
};

console.log(book.title);
console.log(book.getTitle());
console.log(book.getAuthor());

// delete object property
delete book.author;
console.log("author" in book);

// add property
book.nameAuthor = "Ion Creanga"
console.log(book.nameAuthor);

//  constructors
function Person(name, age, sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
}

// instantiate objects
const person1 = new Person("Vasile", 12, "male");
const person2 = new Person("Ioana", 25, "female");

console.log(person1);

// add methods to a defined class
Person.prototype.displayname = function() {
    return this.name;
}

console.log(person2.displayname());

// another way to create methods to a defined class
const manager = {
    name: "Karina",
    age: 50,
    job: "Engineer",
};

const internalWorker = {
    name : "Marian",
    age: 21,
    job: "internal tester",
}

function sayHello() {
    console.log("My name is: " + this.name);
}

// add method to objects
manager.sayHello = sayHello;
internalWorker.sayHello = sayHello;

manager.sayHello();
internalWorker.sayHello();



