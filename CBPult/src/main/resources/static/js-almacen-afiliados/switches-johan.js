'use strict'

$(document).ready(function(){
	
	var red_switches = $('.js-switch-red');
	var blue_switches = $('.js-switch-blue');
	var green_switches = $('.js-switch-green');
	
	
	Array.prototype.forEach.call(red_switches, (item, i)=>{
		var actual_switch = new Switchery(item, {
			color: '#fc2d2d'
		});
	});
	
	Array.prototype.forEach.call(blue_switches, (item, i)=>{
		var actual_switch = new Switchery(item, {
			color: '#025df0'
		});
	});
	
	Array.prototype.forEach.call(green_switches, (item, i)=>{
		var actual_switch = new Switchery(item, {
			color: '#0a8a25'
		});
	});
	
});