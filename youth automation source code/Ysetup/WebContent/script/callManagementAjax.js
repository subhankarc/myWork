$(document).ready(function() {

	// if submit button is clicked
	$('#show').click(function() {
		// Get the data from all the fields
		var hiddenEnqId = $('input[name=hiddenEnqId]');
		var dataString = 'hiddenEnqId=' + hiddenEnqId.val();
		$.ajax({
			type : "POST",
			url : "./fetchstudentdetails.action",
			data : dataString,
			success : function(result) {
				var div = $('span.searchResDiV');
				div.html(result);
				div.show('slow');
			}
		});
	});

});
