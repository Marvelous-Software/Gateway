var today = new Date();
var currentDay = new Date().getUTCDay(); //Day 1-7
var currentYear = new Date().getFullYear();
//currentDate = new Date(this.today.getFullYear() + "-" + (this.today.getMonth() + 1) + "-02");//1st day current month
var numbersDaysInCurrentMonth = new Date(today.getFullYear(), today.getMonth() + 1, 0).getDate();
var numbersDaysInPriorMonth = new Date(today.getFullYear(), today.getMonth(), 0).getDate();
var currentMonth = today.getMonth() + 1; //getMonth retuens 0-11 but the date constructor requires 1-12
var firstDate = new Date(today.getFullYear(), today.getMonth(), 1); //1st day current month
var firstDay = firstDate.getDay(); //0-6
var r;
var days = 0;
var daysInWeek = 0;
var week = [];
var month = [];
console.log("Month enter: firstDay = " + firstDay);
console.log("Month enter: numbersDaysInCurrentMonth = " + numbersDaysInCurrentMonth);
for (r = 0; r < firstDay; r++) {
    daysInWeek++;
    console.log("r = " + r);
    week.push(numbersDaysInPriorMonth - firstDay + r + 1); //days are 0-6 to offset we need 1-7
}
console.log("Month mid: week = " + week);
while (days < numbersDaysInCurrentMonth) {
    days++;
    daysInWeek++;
    week.push(days);
    if (daysInWeek == 7) {
        daysInWeek = 0;
        month.push(week);
        week = [];
    }
}
days = 0;
while (daysInWeek < 7) {
    days++;
    daysInWeek++;
    week.push(days);
}
month.push(week);
console.log(month);
