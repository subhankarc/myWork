$(document).ready(
		function() {

			// if submit button is clicked
			$('#enquerySubmit').click(
					function() {

						// Get the data from all the fields
						var candidateName = $('input[name=candidateName]');
						var contactNo = $('input[name=contactNo]');
						var relateWith = $('select[name=relateWith]');
						var location = $('select[name=location]');
						var qualification = $('select[name=qualification]');
						var streamId = $('select[name=streamId]');
						var studentType = $('select[name=studentType]');
						var sessionId = $('select[name=sessionId]');

						var dataString = 'candidateName=' + candidateName.val()
								+ '&contactNo=' + contactNo.val()
								+ '&relateWith=' + relateWith.val()
								+ '&location=' + location.val()
								+ '&qualification=' + qualification.val()
								+ '&courseTypeId=' + relateWith.val()
								+ '&streamId=' + streamId.val()
								+ '&studentType=' + studentType.val()
								+ '&sessionId=' + sessionId.val();
						// alert (dataString);return false;
						// alert("I am in success function" + dataString);
						$.ajax({
							type : "POST",
							url : "./formsellingsave.action",
							data : dataString,

							success : function(result) {

								// alert("I am in success function"+result);

								var div = $('span.msgdiv');
								div.html(result);
								div.show('slow');
								$('#formValidate').get(0).reset();
								$('span.proceed_nextbtndiv').show();
								$('span.enquerySubmitdiv').hide();
							}
						});

						return false;
					});

			$('#proceed_nextbtn').click(function() {
				$("#mytabs").tabs('select', 1);
			});
			
			$('#enquerySearchSubmit').click(function() {
				var keyword = $('input[name=keyword]');
				var keywordCategory = $("#searchBy");
				var dataString = 'keyword=' + keyword.val()
				+ '&keywordCategory=' + keywordCategory.val();
				//alert(dataString);
				
				$.ajax({
					type : "POST",
					url : "./searchSellFormAction.action",
					data : dataString,

					success : function(result) {

						//alert("I am in success function"+result);
						var div = $('span.searchResDiV');
						div.html(result);
						div.show('slow');
					}
				});

				return false;
				
			});
		});
