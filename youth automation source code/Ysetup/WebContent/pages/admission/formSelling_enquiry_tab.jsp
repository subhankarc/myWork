<%@ taglib prefix="s" uri="/struts-tags"%>

<span class="msgdiv" style="display: none">&nbsp;</span>


<s:div csStyle="padding-left: 20 px; width: 67%; text-align: center;">



	<s:form id="formValidate" action="formsellingsave" theme="simple">

		<table style="width: 100%;border:10px;border-color: red;">

			<tr>
				<td nowrap="nowrap"><s:label value="Candidate Name :"></s:label> <span
					style="color: red">*</span></td>
				<td><s:textfield maxlength="30" size="30" name="candidateName" /></td>
				<td>&nbsp;</td>
			</tr>

			<tr>
				<td><s:label value="Contact	Number:" /><span
					style="color: red">*</span></td>
				<td><s:textfield maxlength="12" size="30" name="contactNo" /></td>

			</tr>

			<tr>
				<td><s:label value="Related With:" /></td>
				<td><s:select list="relationMasterList" name="relateWith"
						listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option" id="related_with" size="1">

					</s:select></td>

			</tr>
			<tr>
				<td><s:label value="Location:" /></td>
				<td><s:select list="locationMasterList" name="location"
						listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option" id="location_id" size="1">

					</s:select></td>

			</tr>
			<tr>
				<td><s:label value="Qualification:" /></td>
				<td><s:select list="qualificationMasterList"
						name="qualification" listKey="key" listValue="value"
						headerKey="-1" headerValue="Choose Option" id="qualification_id"
						size="1">

					</s:select></td>

			</tr>
			<tr>
				<td><s:label value="Course Type:" /></td>
				<td><s:select list="courseTypeMasterList" name="courseTypeId"
						listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option" id="courseTypeId_id" size="1">

					</s:select></td>

			</tr>

			<tr>
				<td><s:label value="Stream:" /></td>
				<td><s:select list="streamMasterList" name="streamId"
						listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option" id="streamId_id" size="1">

					</s:select></td>

			</tr>

			<tr>
				<td><s:label value="Student	Type:" /></td>
				<td><s:select list="studentTypMasterList" name="studentType"
						listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option" id="studentType_id" size="1">

					</s:select></td>

			</tr>
			<tr>
				<td><s:label value="Session:" /></td>
				<td><s:select list="studentSessionMasterList" name="sessionId"
						listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option" id="sessionId_id" size="1">

					</s:select></td>

			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td width="52%" align="center" colspan="2" nowrap="nowrap"><span
					class="enquerySubmitdiv"> <input type="button"
						value="Generate Token Number"
						class="ui-button ui-widget ui-state-default ui-corner-al"
						id="enquerySubmit"></span> <span class="proceed_nextbtndiv"
					style="display: none"> <input type="button"
						value="Proceed Next"
						class="ui-button ui-widget ui-state-default ui-corner-all"
						id="proceed_nextbtn" />
				</span> <s:reset value="Reset"
						cssClass="ui-button ui-widget ui-state-default ui-corner-all" /></td>
			</tr>
			


		</table>
	</s:form>
</s:div>
