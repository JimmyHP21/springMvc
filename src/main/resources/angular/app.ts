import {Spacecraft, ContainerShip} from "./base-ships";
import {MilleniumFalcon} from "./starfighter";

import * as _ from 'lodash';

console.log(_.pad("TypeScript Examples",40,"="));


let ship = new Spacecraft('hyperdrive');
ship.jumpIntoHyperSpace();
ship.goToHome('Terra');

let falcon = new MilleniumFalcon();
falcon.jumpIntoHyperSpace();

let goodForTheJob = (ship: ContainerShip) => ship.cargoContainer > 2;
console.log(`Is Falcon good for the job? ${goodForTheJob(falcon) ? 'YES' : 'NO'}`);