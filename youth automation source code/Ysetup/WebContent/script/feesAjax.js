$(document).ready(function() {

	// if submit button is clicked
	$('#show').click(function() {
		// Get the data from all the fields
		var hiddenregid = $('input[name=hiddenregid]');
		var dataString = 'hiddenregid=' + hiddenregid.val();
		$.ajax({
			type : "POST",
			url : "./fetchfeesdetails.action",
			data : dataString,
			success : function(result) {
				var div = $('span.searchResDiV');
				div.html(result);
				div.show('slow');
			}
		});
	});

});
