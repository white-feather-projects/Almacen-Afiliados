'use strict';

$(window).on('load', function() {
    function notify(message, type) {
        $.growl( {
            message: message
        }
        , {
            type:type, allow_dismiss:false, label:'Cancel', className:'btn-xs btn-inverse', placement: {
                from: 'bottom', align: 'right'
            }
            , delay:2500, animate: {
                enter: 'animated fadeInRight', exit: 'animated fadeOutRight'
            }
            , offset: {
                x: 30, y: 30
            }
        }
        );
    }
    ;
    notify('Bievenido a la Creación de Almacenes', 'inverse');
});
$(document).ready(function() {
    
    function notify(from, align, icon, type, animIn, animOut) {
        $.growl( {
            icon: icon, title: ' Error en el Registro: ', message: 'Debes Llenar todos los Campos vacios', url: ''
        }
        , {
            element:'body', type:type, allow_dismiss:true, placement: {
                from: from, align: align
            }
            , offset: {
                x: 30, y: 30
            }
            , spacing:10, z_index:999999, delay:2500, timer:1000, url_target:'_blank', mouse_over:false, animate: {
                enter: animIn, exit: animOut
            }
            , icon_type:'class', template:'<div data-growl="container" class="alert" role="alert">'+ '<button type="button" class="close" data-growl="dismiss">'+ '<span aria-hidden="true">&times;</span>'+ '<span class="sr-only">Close</span>'+ '</button>'+ '<span data-growl="icon"></span>'+ '<span data-growl="title"></span>'+ '<span data-growl="message"></span>'+ '<a href="#" data-growl="url"></a>'+ '</div>'
        }
        );
    };
    
    var ver2 = $('#verificar2');
    var input = $('#txtDesc_almacen');
    ver2.click(function(){
        if(input.val().length < 1){
            var nFrom=$(this).attr('data-from');
            var nAlign=$(this).attr('data-align');
            var nIcons=$(this).attr('data-icon');
            var nType='warning'
            var nAnimIn=$(this).attr('data-animation-in');
            var nAnimOut=$(this).attr('data-animation-out');
            notify(nFrom, nAlign, nIcons, nType, nAnimIn, nAnimOut);
        }
    });
    
});