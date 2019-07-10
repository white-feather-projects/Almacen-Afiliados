'use strict'

$(document).ready(function () {
		//Basic alert
		
			document.querySelector('.sweet-1').onclick = function(){
				swal("Sesion Incorrecta!", "Inexistente")
			};
	/*		
			document.querySelector('.sweet-2').onblur = function(){
				swal("Estamos Trabajando!", "Gestión de Solicitudes")
			};
		*/	
			
			document.querySelector('.sweet-3').onclick = function(){
				swal("Estamos Trabajando!", "Gestión de Clientes")
			};
			//success message
			document.querySelector('.alert-success-msg').onclick = function(){
				swal("Good job!", "You clicked the button!", "success");
			};
		
		
				$('#openBtn').on('click',function () {
					$('#myModal').modal({
						show: true
					})
				});
		
				$(document).on('show.bs.modal', '.modal', function (event) {
					var zIndex = 1040 + (10 * $('.modal:visible').length);
					$(this).css('z-index', zIndex);
					setTimeout(function() {
						$('.modal-backdrop').not('.modal-stack').css('z-index', zIndex - 1).addClass('modal-stack');
					}, 0);
				});
			});