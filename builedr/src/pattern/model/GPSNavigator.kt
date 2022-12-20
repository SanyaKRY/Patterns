package pattern.model

class GPSNavigator {
    var router: String
        private set

    constructor() {
        router = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London"
    }

    constructor(manualRoute: String) {
        router = manualRoute
    }
}