
/* Declared Functions Globals Systems*/
function addTagsGlobal(varGlobal){
    $("head").append('<meta http-equiv="Content-Type" content="text/html; charset='+varGlobal.Charset+'"></meta>');
    $("head").append('<title>'+varGlobal.Title+'</title>');
    $("head").append('<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">');
    $("head").append('<meta http-equiv="X-UA-Compatible" content="IE=edge">');
    $("head").append('<meta name="description" content="'+varGlobal.Description+'">');
    $("head").append('<meta name="keywords" content="'+varGlobal.Keywords+'">');
    $("head").append('<meta name="author" content="'+varGlobal.Author+'"></meta>');
    $("head").append('<link rel="icon" href="'+varGlobal.Author+'" type="image/x-icon"></link>');
}
function addLinksCSS(varList){
    varList.forEach(function(value){
        $("head").append('<link rel="stylesheet" type="text/css" href="'+value+'">');
    });
}
function addLinksJS(varList){
    varList.forEach(function(value){
        $("js").append('<script type="text/javascript" src="'+value+'"></script>');
    });
}

        
        
        