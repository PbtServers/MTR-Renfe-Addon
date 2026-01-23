const PIDSCustomUtil = {
    _blinkToggle: false,
    _lastBlinkTime: 0,

    getETAText(arrival, arrivedText) {
        let willArriveIn = arrival - Date.now();
        let willArriveInSec = Math.floor(willArriveIn/1000);
        if(willArriveInSec <= 0) {
            let baseText = arrivedText ? arrivedText : "Estacionado";
            let now = Date.now();
            if (now - this._lastBlinkTime > 800) {
                this._blinkToggle = !this._blinkToggle;
                this._lastBlinkTime = now;
            }

            // Alternar entre texto visible y en blanco
            return this._blinkToggle ? baseText : "";
            //return arrivedText ? arrivedText : "Estacionado";
        } else if(willArriveIn <= 60000) {
            return `${willArriveInSec} sec`;
        } else if(willArriveIn <= 120000) { // Less than 2 mins, use non-plural form
            return `${Math.floor(willArriveInSec/60)} min`;
        } else {
             return `${Math.floor(willArriveInSec/60)} mins`;
         }
    },
    formatTime(inGameTime, padZero) {
        let timeNow = inGameTime + 6000;
        let hrs = (timeNow / 1000) % 24;
        let mins = (hrs - Math.floor(hrs)) * 60;

        if(padZero) {
            return `${Math.floor(hrs).toString().padStart(2, '0')}:${(Math.floor(mins % 60)).toString().padStart(2, '0')}`;
        } else {
            return `${Math.floor(hrs).toString()}:${(Math.floor(mins % 60)).toString().toString().padStart(2, '0')}`;
        }
    },
    getCarText(len) {
        if(len <= 1) {
            return `${len}-car`;
        } else {
            return `${len}-cars`;
        }
    },
    formatDateTime(d) {
        return `${d.getHours().toString().padStart(2, '0')}:${d.getMinutes().toString().padStart(2, '0')}`;
    }
}