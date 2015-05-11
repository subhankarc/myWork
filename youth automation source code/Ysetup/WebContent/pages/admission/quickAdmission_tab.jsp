<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<div
	style="padding-left: 20 px; padding: 15px; width: 67%; text-align: center;">

	<s:form id="formQuickAdmission" theme="simple">
		<table id="ad" width="67%" align="center" cellpadding="3"
			cellspacing="0">
			<tr>
				<td bgcolor="#FEDD98" colspan="2" align="center"></td>
			</tr>
			<tr>
				<td bgcolor="#CCCCCC"><label class="cf_label"
					style="width: 260px;">Form No:</label>&nbsp;&nbsp;<s:textfield
						name="formNo" /></td>
				<td width="70%" align="center" bgcolor="#CCCCCC"><s:submit
						value="Search" name="Search" action="quickadmissionloaddata" /></td>
			</tr>


			<tr>
				<td bgcolor="#CBEAF3"><label class="cf_label"
					style="width: 260px;">Candidate Name : <span
						style="color: red">*</span></label></td>
				<td bgcolor="#CBEAF3"><s:textfield
						cssClass="cf_inputbox required" maxlength="250" size="30"
						id="text_1" name="candidateName" /></td>
			</tr>

			<tr>
				<td><label class="cf_label" style="width: 260px;">Contact
						Number:<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_2" name="contactNo" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Course
						Type: <span
						style="color: #b61a1d; font-weight: normal; font-size: 11px; font-style: italic; width: 62%;"></span>
				</label></td>
				<td><s:select list="courseTypeMasterList" name="courseTypeId"
						listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option"
						cssClass="cf_inputbox validate-selection" id="courseTypeId"
						size="1">

					</s:select></td>
			</tr>
			<tr>
				<td bgcolor="#CBEAF3"><label class="cf_label"
					style="width: 260px;">Stream: <span
						style="color: #b61a1d; font-weight: normal; font-size: 11px; font-style: italic; width: 62%;"></span></label>
				</td>
				<td bgcolor="#CBEAF3"><s:select list="streamMasterList"
						name="streamId" listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option"
						cssClass="cf_inputbox validate-selection" id="streamId" size="1">

					</s:select></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Student
						Type: <span
						style="color: #b61a1d; font-weight: normal; font-size: 11px; font-style: italic; width: 62%;"></span>
				</label></td>
				<td><s:select list="studentTypMasterList" name="studentType"
						listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option"
						cssClass="cf_inputbox validate-selection" id="studentType"
						size="1">

					</s:select></td>
			</tr>
			<tr>
				<td bgcolor="#CBEAF3"><label class="cf_label"
					style="width: 260px;">Session: <span
						style="color: #b61a1d; font-weight: normal; font-size: 11px; font-style: italic; width: 62%;"></span></label>
				</td>
				<td bgcolor="#CBEAF3"><s:select list="studentSessionMasterList"
						name="sessionId" listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option"
						cssClass="cf_inputbox validate-selection" id="sessionId" size="1">

					</s:select></td>
			</tr>

			<tr>

				<td align="right" colspan="2">&nbsp;</td>
			</tr>

			<tr>
				<td align="right"><s:submit value="Quick Admission"
						name="Quick_Admission" action="quickAdmission" /></td>
			</tr>

		</table>
	</s:form>
</div>
