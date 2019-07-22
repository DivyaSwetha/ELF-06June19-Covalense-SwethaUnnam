

function startTimer(duration, display) {
    var timer = duration, minutes, seconds;
    setInterval(function () {
        minutes = parseInt(timer / 60, 10);
        seconds = parseInt(timer % 60, 10);

        minutes = minutes < 10 ? "0" + minutes : minutes;
        seconds = seconds < 10 ? "0" + seconds : seconds;

        display.textContent = minutes + ":" + seconds;

        if (++timer==t*60) {
            timer = 00,00;
        }
    }, 1000);
}

var startTime = function () {
    var t=document.getElementById("utime").value;
    var newMinutes = 00,
        display = document.querySelector('#time');
    startTimer(newMinutes, display);
};