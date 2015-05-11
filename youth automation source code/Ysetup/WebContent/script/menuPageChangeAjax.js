$(document).ready(function() {

	// if submit button is clicked
	$('a.menulink').click(function() {

		// Get the data from all the fields
		var link=encodeURI($(this).attr("id"));
		//alert(link);
		var dataString = 'reqPage='+link;
		$.ajax({
			type : "POST",
			url : "./flowControlAction.action",
			data : dataString,

			success : function(result) {

				// alert("I am in success function"+result);

				var div = $('div.maincontainerdiv');
				div.html(result);
				div.show('slow');
				//$("div.maincontainerdiv").replaceWith($('div.maincontainerdiv', $(result)));
				

			}
		});

		return false;
	});
	
});
