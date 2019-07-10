'use strict'

$(document).ready(function(){
	
	
	$(".pro1").click(function(){
		
		let current_progress = 0;
		let interval = setInterval(function() {
			current_progress += 10;
		    $(".dn1")
		    .css("width", current_progress + "%")
		    .attr("aria-valuenow", current_progress)
		    .text(current_progress + "% Llena");
		    if (current_progress >= 100){
		    	clearInterval(interval);
		    	clearInterval(interval);
		    	$(".dn1")
			    .css("width", current_progress + "%")
			    .attr("aria-valuenow", current_progress)
			    .text("Llena");
		    }
		}, 500);
		  		
	});
	
	$(".pro2").click(function(){
		
		let current_progress = 0;
		let interval = setInterval(function() {
			current_progress += 10;
		    $(".dn2")
		    .css("width", current_progress + "%")
		    .attr("aria-valuenow", current_progress)
		    .text(current_progress + "% Llena");
		    if (current_progress >= 100){
		    	current_progress = 0;
		    	clearInterval(interval);
		    	$(".dn2")
			    .css("width", "100%")
			    .attr("aria-valuenow", current_progress)
			    .text("Llena");
		    }
		    	
		}, 500);
		  		
	});	
	
});