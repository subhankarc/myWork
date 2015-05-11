<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
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
<!--[if IE 6]><link rel="stylesheet" href="css/style.ie6.css" type="text/css" media="screen" /><![endif]-->
<!--[if IE 7]><link rel="stylesheet" href="css/style.ie7.css" type="text/css" media="screen" /><![endif]-->

<script src="<%=request.getContextPath()%>/script/enquiryAjax.js"
	type="text/javascript"></script>

</head>
<body>
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
										<sj:tab id="tab1" target="tone" label="Detail Admission" />
										<div id="tone">
											<%@include file="/pages/admission/detailAdmission_tab.jsp"%>

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

</body>
</html>
