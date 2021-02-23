
/* 存放自己做的函數 */


/* 把小數點取整數 */
var mathInt = function(x) {
    if (x < 0){
        x = ((x * 10) - (Math.floor((x * 10) % 10))) / 10;
    } else {
        x = ((x * 10) - (Math.ceil((x * 10) % 10))) / 10;
    }
    return x;
}