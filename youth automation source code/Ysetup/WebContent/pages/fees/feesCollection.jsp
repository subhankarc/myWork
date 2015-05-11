<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ page isELIgnored="false"%>
<sj:head jqueryui="true" jquerytheme="showcase" customBasepath="themes" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"[]>
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US"
	xml:lang="en">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Welcome</title>
<meta name="description" content="Description" />
<meta name="keywords" content="Keywords" />

<link rel="stylesheet" href="css/style.css" type="text/css"
	media="screen" />
<style type="text/css">
.pg-normal {
	color: black;
	font-weight: normal;
	text-decoration: none;
	cursor: pointer;
}

.pg-selected {
	color: black;
	font-weight: bold;
	text-decoration: underline;
	cursor: pointer;
}

.odd {
	background-color: #EEF7FD;
}

.even {
	background-color: #C6E4F9;
}

.selected {
	background-color: pink;
}
</style>


<script type="text/javascript">
	function check(blnchecked, current_row, regid, studentid, name, address) {
		if (blnchecked) {
			alternate("results");
			document.getElementById("results").getElementsByTagName("tr")[current_row].className = "selected";
			//document.getElementById("showDetails").style.display = "";
			document.getElementById("hiddenregid").value = regid;
} else {
			//document.getElementById("showDetails").style.display = "none";
		}
	}
</script>

<script type="text/javascript">
	function add(check, amount, rowNumber, fine) {
		//alert("amount");
			var value = document.getElementById("pay").value;
			if(check){
			document.getElementById("pay").value = parseFloat(amount) + parseFloat(fine) + parseFloat(value);
			}else{
				document.getElementById("pay").value = parseFloat(value) - parseFloat(amount) - parseFloat(fine);
			}
		var selectedRow = document.getElementById("selectedRow").value;
		var temptext;
		if(check){
			if(selectedRow.length>0)
			    tempText = selectedRow + "-" + rowNumber;
			else
				tempText = rowNumber;
		}
		else{			
				tempText = selectedRow;
				tempText = tempText.replace(rowNumber + "-","");
				tempText = tempText.replace("-" + rowNumber,"");
				if(document.getElementById("pay").value=="0"){
					tempText="";
				}				
		}		
		document.getElementById("selectedRow").value=tempText;			
	}
</script>
<script type="text/javascript">
	function alternate(tableName) {
		var table = document.getElementById(tableName);
		var rows = table.getElementsByTagName("tr");
		var i = 1;
		for (i = 1; i < rows.length; i++) {
			if (i % 2 == 0) {
				rows[i].className = "odd";
			} else {
				rows[i].className = "even";
			}
		}

	}
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/paging.js"></script>
<script src="<%=request.getContextPath()%>/script/feesAjax.js"
	type="text/javascript"></script>

</head>
<body onload="alternate('results')">

	<div id="art-main">
		<div class="art-sheet">
			<div class="art-sheet-tl"></div>
			<div class="art-sheet-tr"></div>
			<div class="art-sheet-bl"></div>
			<div class="art-sheet-br"></div>
			<div class="art-sheet-tc"></div>
			<div class="art-sheet-bc"></div>
			<div class="art-sheet-cl"></div>
			<div class="art-sheet-cr"></div>
			<div class="art-sheet-cc"></div>
			<div class="art-sheet-body">
				<div class="art-header">
					<%@include file="/pages/common/header.jsp"%>
				</div>
				<div class="cleared reset-box"></div>
				<div class="art-nav">
					<div class="art-nav-l"></div>
					<div class="art-nav-r"></div>
				</div>
				<div class="cleared reset-box"></div>
				<div class="art-content-layout">
					<div class="art-content-layout-row">
						<!--Side menu Start Here-->
						<div class="art-layout-cell art-sidebar1">
							<!-- varticle left menu start-->
							<div class="art-vmenublock">
								<div class="art-vmenublock-tl"></div>
								<div class="art-vmenublock-tr"></div>
								<div class="art-vmenublock-bl"></div>
								<div class="art-vmenublock-br"></div>
								<div class="art-vmenublock-tc"></div>
								<div class="art-vmenublock-bc"></div>
								<div class="art-vmenublock-cl"></div>
								<div class="art-vmenublock-cr"></div>
								<div class="art-vmenublock-cc"></div>
								<div class="art-vmenublock-body">
									<div class="art-vmenublockcontent">
										<div class="art-vmenublockcontent-body">
											<%@include file="/pages/common/menu.jsp"%>

											<div class="cleared"></div>
										</div>
									</div>
									<div class="cleared"></div>
								</div>
							</div>
							<!-- varticle left menu end-->

							<div class="cleared"></div>
						</div>
						<!--Side menu end Here-->
						<!--main body area start--->
						<div class="art-layout-cell art-content">
							<div class="art-post">
								<div class="art-post-body">

									<sj:tabbedpanel id="mytabs" animate="true" collapsible="false"
										useSelectedTabCookie="true">
										<sj:tab id="tab1" target="tone" label="Fees Collection" />
										<div id="tone">
											<%@include file="/pages/fees/feesCollection_tab.jsp"%>

										</div>

									</sj:tabbedpanel>
								</div>
							</div>

							<div class="cleared"></div>
						</div>
						<!--main body area end--->

					</div>
				</div>
				<div class="cleared"></div>
				<div class="art-footer">
					<%@include file="/pages/common/footer.jsp"%>
				</div>
				<div class="cleared"></div>
			</div>
		</div>
		<div class="cleared"></div>

	</div>
	<script type="text/javascript">
		var pager = new Pager('results', 3);
		pager.init();
		pager.showPageNav('pager', 'pageNavPosition');
		pager.showPage(1);

		/* var pager2 = new Pager('results2', 3);
		pager2.init();
		pager2.showPageNav('pager', 'pageNavPosition2');
		pager2.showPage(1); */
	</script>
</body>
</html>
