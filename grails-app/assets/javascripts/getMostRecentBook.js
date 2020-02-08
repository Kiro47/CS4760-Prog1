$(document).ready( function(){
    console.log("In doc ready: getMostRecentBook");
    $('#mostRecentBook').load("/prog1/home/getMostRecentBook")
    $('#recentBookLink').click(function(){
        $('#mostRecentBook').load(this.href); return false;
    });
});