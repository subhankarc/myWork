<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<div>

	<s:form id="formDetailedAdmission" theme="simple">
		<table id="ad" width="100%"  cellpadding="3"		cellspacing="0">
			
			<tr>
				<td bgcolor="#CCCCCC"><label class="cf_label"
					style="width: 260px;">Form No:</label>&nbsp;&nbsp;<s:textfield
						name="formNoSearch" /></td>
				<td width="70%" align="center" bgcolor="#CCCCCC"><s:submit
						value="Search" name="Search" action="detailadmissionloaddata" /></td>
			</tr>

			<tr>
				<td bgcolor="#CBEAF3"><label class="cf_label"
					style="width: 260px;">Form No : <span style="color: red">*</span></label></td>
				<td bgcolor="#CBEAF3"><s:textfield
						cssClass="cf_inputbox required" maxlength="250" size="30"
						id="text_1" name="formNo" /></td>
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
						maxlength="12" size="30" id="text_2" name="primaryContactNo" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Student
						ID : <span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_3" name="studentId" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Course
						Type: <span
						style="color: #b61a1d; font-weight: normal; font-size: 11px; font-style: italic; width: 62%;"></span>
				</label></td>
				<td><s:select list="courseTypeMasterList" name="courseType"
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
						name="stream" listKey="key" listValue="value" headerKey="-1"
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
						name="session" listKey="key" listValue="value" headerKey="-1"
						headerValue="Choose Option"
						cssClass="cf_inputbox validate-selection" id="sessionId" size="1">

					</s:select></td>
			</tr>

			<hr></hr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Guardian
						:<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_8" name="guardian" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Relation
						with Guardian:<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_9" name="relationWith" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Address
						:<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_10" name="address" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Pin
						Code :<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_11" name="pin" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Secondary
						Contact Number :<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_12" name="secondaryContactNo" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Email
						ID :<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_13" name="email" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Date
						of Birth:<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_14" name="dob" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Photo
						:<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_15" name="photo" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Last
						Education :<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_16" name="lastEducation" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Year
						of Passing:<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_17" name="yearOfPassing" /></td>
			</tr>

			<tr>
				<td><label class="cf_label" style="width: 260px;">Institution
						:<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_18" name="institution" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Marks
						:<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_2" name="marks" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Computer
						Skills :<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_2" name="computerSkills" /></td>
			</tr>
			<tr>
				<td><label class="cf_label" style="width: 260px;">Computer
						Institution :<span style="color: red">*</span>
				</label></td>
				<td><s:textfield cssClass="cf_inputbox required contact no."
						maxlength="12" size="30" id="text_2" name="computerInstitution" /></td>
			</tr>

			<tr>
				<td align="right"><s:submit value="Save"
						name="Detail_Admission" action="detailAdmission" /></td>
			</tr>

		</table>
	</s:form>
</div>