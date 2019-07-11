'use strict'

$(document).ready(function(){
	
	var red_switches = $('.js-switch-red');
	var blue_switches = $('.js-switch-blue');
	var green_switches = $('.js-switch-green');
	
	
	Array.prototype.forEach.call(red_switches, (item, i)=>{
		var actual_switch = new Switchery(item, {
			color: '#dc3545'
		});
	});
	
	Array.prototype.forEach.call(blue_switches, (item, i)=>{
		var actual_switch = new Switchery(item, {
			color: '#17a2b8'
		});
	});
	
	Array.prototype.forEach.call(green_switches, (item, i)=>{
		var actual_switch = new Switchery(item, {
			color: '#20c997'
		});
	});
	
});