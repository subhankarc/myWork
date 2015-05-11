<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form id="formValidatxxe" action="formsellingsave" theme="simple">

	<s:div>
		<table>
			<tr>
				<td><s:label value="KeyWord:">&nbsp;</s:label></td>
				<td><sj:textfield name="keyword" size="25" />&nbsp;</td>
				<td>Search By:</td>
				<td>&nbsp;<s:select
						list="#{'1':'Candidate Name', '2':'Contact	Number', '3':'Location', '4':'Session'}"
						name="searchBy" headerKey="-1" headerValue="Choose Option"
						id="searchBy" size="1">

					</s:select></td>
				<td>&nbsp;&nbsp;<input type="button" value="Search"
					class="ui-button ui-widget ui-state-default ui-corner-al"
					id="enquerySearchSubmit"></td>
			</tr>
		</table>
	</s:div>
	<s:div>&nbsp;</s:div>
	<s:div id="searchRes">
		<span class="searchResDiV" style="display: none">&nbsp;</span>
	</s:div>
	<s:div>&nbsp;</s:div>
	<s:div>
		<table>

			<tr>
				<td><s:label value="Candidate Name :"></s:label> <span
					style="color: red">*</span></td>
				<td><sj:textfield maxlength="30" size="30" name="candidateName" /></td>
				<td>&nbsp;</td>
			</tr>

			<tr>
				<td><s:label value="Contact	Number:" /><span
					style="color: red">*</span></td>
				<td><sj:textfield maxlength="12" size="25" name="contactNo" /></td>
				<td>&nbsp;</td>
			</tr>

			<tr>
				<td><s:label value="Related With:" /></td>
				<td><s:select list="relationMasterList" name="relateWith"
						listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option" id="related_with" size="1">

					</s:select></td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><s:label value="Location:" /></td>
				<td><s:select list="locationMasterList" name="location"
						listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option" id="location_id" size="1">

					</s:select></td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><s:label value="Qualification:" /></td>
				<td><s:select list="qualificationMasterList"
						name="qualification" listKey="key" listValue="value"
						headerKey="-1" headerValue="Choose Option" id="qualification_id"
						size="1">

					</s:select></td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><s:label value="Course Type:" /></td>
				<td><s:select list="courseTypeMasterList" name="courseTypeId"
						listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option" id="courseTypeId_id" size="1">

					</s:select></td>
				<td>&nbsp;</td>
			</tr>

			<tr>
				<td><s:label value="Stream:" /></td>
				<td><s:select list="streamMasterList" name="streamId"
						listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option" id="streamId_id" size="1">

					</s:select></td>
				<td>&nbsp;</td>
			</tr>

			<tr>
				<td><s:label value="Student	Type:" /></td>
				<td><s:select list="studentTypMasterList" name="studentType"
						listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option" id="studentType_id" size="1">

					</s:select></td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><s:label value="Session:" /></td>
				<td><s:select list="studentSessionMasterList" name="sessionId"
						listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option" id="sessionId_id" size="1">

					</s:select></td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td width="52%" align="right"><sj:submit targets="formResult"
						value="Generate Token Number" indicator="indicator" button="true" /></td>
				<td align="center"><sj:submit value="Sell Form" button="true"
						name="action:formselling"></sj:submit></td>
						
				<td>&nbsp;</td>
			</tr>


		</table>
	</s:div>
</s:form>
