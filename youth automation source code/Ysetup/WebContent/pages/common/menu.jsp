<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<sj:accordion id="accordion" autoHeight="false">
	<sj:accordionItem title="Admission">
		<table width="100%" border="0" cellpadding="0" cellspacing="0">

			<tr>
				<td width="20%"><img src="images/icon_report.png" width="20"
					height="20"></td>
				<td><s:url action="flowControlAction.action" var="urlTag">
						<s:param name="reqPage">page1</s:param>

					</s:url> <a href="<s:property value="#urlTag" />">Enquery/Form Issue</a></td>
			</tr>
			<tr>
				<td><img src="images/trainingCheckStateIcon.png" width="20"
					height="20"></td>
				<td><s:url action="flowControlAction.action" var="urlTag">
						<s:param name="reqPage">page2</s:param>

					</s:url> <a href="<s:property value="#urlTag" />" id="page2"
					class="menulink">Quick Admission</a></td>
			</tr>
			<tr>
				<td><img src="images/icon_report.png" width="20" height="20"></td>
				<td><s:url action="flowControlAction.action" var="urlTag">
						<s:param name="reqPage">page3</s:param>

					</s:url> <a href="<s:property value="#urlTag" />" id="page3"
					class="menulink">Detail Admission</a></td>
			</tr>
		</table>


	</sj:accordionItem>
	<sj:accordionItem title="Fees Collection">
		<table width="100%" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td width="20%"><img src="images/icon_report.png" width="20"
					height="20"></td>
				<td><s:url action="flowControlAction.action" var="urlTag">
						<s:param name="reqPage">page4</s:param>

					</s:url> <a href="<s:property value="#urlTag" />" id="page4"
					class="menulink">Fees Collection</a></td>
			</tr>
			<tr>
				<td><img src="images/trainingCheckStateIcon.png" width="20"
					height="20"></td>
				<td>Search</td>
			</tr>
			<tr>
				<td><img src="images/icon_report.png" width="20" height="20"></td>
				<td>Fees Report</td>
			</tr>
		</table>
	</sj:accordionItem>
	<sj:accordionItem title="Transaction Management">
		<table width="100%" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td width="20%"><img src="images/icon_report.png" width="20"
					height="20"></td>
				<td><s:url action="flowControlAction.action" var="urlTag">
						<s:param name="reqPage">page5</s:param>

					</s:url> <a href="<s:property value="#urlTag" />" id="page5"
					class="menulink">Call Management</a></td>
			</tr>
			<tr>
				<td><img src="images/trainingCheckStateIcon.png" width="20"
					height="20"></td>
				<td>Transaction Report</td>
			</tr>

		</table>
	</sj:accordionItem>


</sj:accordion>
