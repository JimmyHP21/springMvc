"use strict";
exports.__esModule = true;
var Spacecraft = /** @class */ (function () {
    function Spacecraft(propulsor) {
        this.propulsor = propulsor;
    }
    Spacecraft.prototype.jumpIntoHyperSpace = function () {
        console.log("Entering hypespace with " + this.propulsor);
    };
    Spacecraft.prototype.goToHome = function (casa) {
        console.log("Go to home " + casa);
    };
    return Spacecraft;
}());
exports.Spacecraft = Spacecraft;
