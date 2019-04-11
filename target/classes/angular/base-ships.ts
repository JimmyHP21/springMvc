class Spacecraft {

    constructor (public propulsor: string) {

    }

    jumpIntoHyperSpace(){
        console.log(`Entering hypespace with ${this.propulsor}`);
    }

    goToHome(casa:string){
        console.log(`Go to home ${casa}`);
    }
}

interface ContainerShip{

    cargoContainer?: number;

}

export {Spacecraft, ContainerShip};