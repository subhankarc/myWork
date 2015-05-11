<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>



<s:form id="fetchstudentdetails" theme="simple">
	<table id="allignment" border="1">
		<tr>
			<td><s:label>Year:</s:label></td>
			<td><s:select list="yearList" name="year" listKey="key"
					listValue="value" headerKey="-1" headerValue="Choose Year"
					cssClass="cf_inputbox validate-selection" id="year" size="1">
				</s:select></td>

			<td><s:label>Session:</s:label></td>
			<td><s:select list="studentSessionMasterList" name="sessionId"
					listKey="key" listValue="value" headerKey="-1"
					headerValue="Choose Session"
					cssClass="cf_inputbox validate-selection" id="sessionId" size="1">
				</s:select></td>
			<td><s:label>Status:</s:label></td>
			<td><s:select list="statusList" name="statusId" listKey="key"
					listValue="value" headerKey="-1" headerValue="Choose Status"
					cssClass="cf_inputbox validate-selection" id="statusId" size="1">
				</s:select></td>
		</tr>
		<tr>
			<td><s:label>Course:</s:label></td>
			<td><s:select list="courseTypeMasterList" name="courseTypeId"
					listKey="key" listValue="value" headerKey="-1"
					headerValue="Choose Course"
					cssClass="cf_inputbox validate-selection" id="courseTypeId"
					size="1">
				</s:select></td>
			<td><s:label>Stream:</s:label></td>
			<td><s:select list="streamMasterList" name="streamId"
					listKey="key" listValue="value" headerKey="-1"
					headerValue="Choose Stream"
					cssClass="cf_inputbox validate-selection" id="streamId" size="1">
				</s:select></td>

			<td><label> <s:submit name="search" id="search"
						value="Search" action="callmanagementsearch" /></label></td>
		</tr>
	</table>

	<div id="tablenav">
		<table id="results">
			<tr id="heading" bgcolor="grey">
				<th>Select</th>
				<th>Enquiry ID</th>
				<th>Candidate Name</th>
				<th>Contact No</th>
				<th>Course</th>
				<th>Stream</th>
				<th>Session</th>
				<th>Year</th>
				<th>Student Type</th>
				<th>Location</th>
				<th>status</th>
				<th>call_count</th>
				<th>call_nextdate</th>
				<th>receptionist_id</th>
				<th>last_call_date</th>
			</tr>

			<s:iterator value="studentData" id="studentData">
				<tr>
					<td><input type="radio" id="radioButton" name="radioButton"
						onclick="populate('<s:property value="enquiryId" />');" /></td>
					<td><s:property value="enquiryId" /></td>
					<td><s:property value="name" /></td>
					<s:hidden value="relateWith" />
					<td><s:property value="contactNo" /></td>
					<td><s:property value="course" /></td>
					<td><s:property value="stream" /></td>
					<td><s:property value="sessionName" /></td>
					<td><s:property value="year" /></td>
					<td><s:property value="studentType" /></td>
					<s:hidden value="qualification" />
					<td><s:property value="location" /></td>
					<s:hidden value="enquiryDate" />
					<s:hidden value="receptionistIdEnq" />
					<s:hidden value="formNo" />
					<s:hidden value="sellingDate" />
					<s:hidden value="receptionistIdSelling" />
					<td><s:property value="status" /></td>
					<td><s:property value="callcount" /></td>
					<s:hidden value="callUpdate" />
					<td><s:property value="callNextDate" /></td>
					<td><s:property value="receptionistIdLastCaller" /></td>
					<td><s:property value="lastCallerDate" /></td>
				</tr>
			</s:iterator>

		</table>
		<s:hidden id="hiddenEnqId" name="hiddenEnqId" />
		<input type="button" value="show" id="show">
	</div>
	<div id="pageNavPosition"></div>
</s:form>

<s:div id="searchRes">
	<span class="searchResDiV" style="display: none">&nbsp;</span>
</s:div>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/script/paging.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/script/callManagementAjax.js"></script>
<script type="text/javascript">
	var pager = new Pager('results', 3);
	pager.init();
	pager.showPageNav('pager', 'pageNavPosition');
	pager.showPage(1);
</script>
<script>
	function populate(enqId) {
		document.getElementById("hiddenEnqId").value = enqId;
	}
</script>

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


