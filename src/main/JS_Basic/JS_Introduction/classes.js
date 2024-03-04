class Car {
    // static variables, sunt elemente

    static baseStaticField 

    // private values;
    #model;
    #engineSize;

    // constructor
    // constructor(make, model, year) {
    //     this.make = make;
    //     this.model = model;
    //     this.year = year;
    // } 

    constructor(make, model, year, engineSize) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.#engineSize = engineSize;
    } 
    
    getModel() {
        return this.model;
    }

    #starEngine() {
        console.log("Start engine");
    }

    getEngineSize() {
        return this.#engineSize;
    }

    setEngineSize(newSize) {
        return this.#engineSize = newSize;
    }

    start() {
        this.#starEngine();
        console.log("Enter to shift 1"); 
        console.log("Car started"); 
    }

    static baseStaticMethod(){
        return "I am a static method"
    }

}

// inheritance
class Truk extends Car {

    //overwritting
    start() {
        console.log("Start truk");
        super.startEngine();
    }

    // "overloading" nu exista in JS, poti folosi un overwritting verificand numarul de parametrii
    start(shift) {
        if (arguments.length > 0) {
        console.log("Start truk with shift: " + shift);
    } else
        this.console.log("Start truk");
    }
}

const myCar = new Car("Dacia", "Logan", 2023, 1.0);
const myBMW = new Car("BMW", "XS", 2020, 2.0);
console.log("modelul noii masini, 2020: " + myCar.getModel());

myCar.color = "red";
console.log(myCar.color);
console.log(myBMW.color);

console.log(myBMW.model);

myCar.startEngine;
console.log(myCar.getEngineSize());
myCar.setEngineSize(3.5);
console.log(myCar.getEngineSize());
myCar.start();

myCar.baseStaticField = "Change this field";
console.log(myCar.baseStaticField);
console.log(myBMW.baseStaticField);
console.log(Car.baseStaticField);
console.log(Car.baseStaticMethod());

const myTruck = new Truk("Man", "X66", 2020, 5.5);
myTruck.start();
myTruck.start(5);
console.log(myTruck.getEngineSize);