<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>



<s:form id="fetchstudentdetails" theme="simple">
	<table id="allignment" border="1">
		<tr>
			<td><s:label>Search:<s:textfield type="text"
						name="searchValue" id="searchValue" />
				</s:label></td>
			<td><s:label>Search By <s:select name="searchBy"
						size="1" id="searchBy" list="searchByList"></s:select>
				</s:label></td>
			<td><label> <s:submit name="search2" id="search2"
						value="Search" action="search" /></label></td>
		</tr>
	</table>

	<div id="tablenav">
		<table id="results">
			<tr id="heading" bgcolor="grey">
				<th>Select</th>
				<th>Serial No.</th>
				<th>Registration ID</th>
				<th>Student ID</th>
				<th>Name</th>
				<th>Address</th>
			</tr>

			<s:iterator value="studentData" id="studentData">
				<tr>
					<td><input type="radio" id="radioButton" name="radioButton"
						onclick="check(this.checked,<s:property value="rowNumber" />, '<s:property value="regId" />', '<s:property value="studentId" />', '<s:property value="name" />', '<s:property value="address" />');" />
					</td>
					<td><s:property value="rowNumber" /></td>
					<td><s:property value="regId" /></td>
					<td><s:property value="studentId" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="address" /></td>
				</tr>
			</s:iterator>

		</table>
	</div>
	<div id="pageNavPosition"></div>
	<div id="hiddendiv" style="display: none;">
			<s:textfield id="hiddenregid" name="hiddenregid"></s:textfield>
		</div>
		<%-- <s:submit id="show" value="show"></s:submit> --%>
		<input type="button" value="show" id="show">
</s:form>

<s:div id="searchRes">
	<span class="searchResDiV" style="display: none">&nbsp;</span>
</s:div>



