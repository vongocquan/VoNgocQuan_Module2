$(document).ready(function () {
    $( "#draggable" ).draggable();
    $( "#droppable" ).droppable({
        drop: function( event, ui ) {
            $( this )
                .find( "p" )
                .html( "Dropped!" );
        }
    });

    $( function() {
        $( "#resizable" ).resizable();
    } );
});
