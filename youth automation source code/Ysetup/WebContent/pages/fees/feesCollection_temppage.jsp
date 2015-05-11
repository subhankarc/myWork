<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<div>
	<div id="tablenav3">
		<table id="results3">
			<tr id="heading" bgcolor="grey">
				<th>Row Number</th>
				<th>Scsp ID</th>
				<th>SCS ID</th>
				<th>PAYMENT TYPE</th>
				<th>AMOUNT</th>
				<th>Payable Date</th>
				<th>TRANSACTION DATE</th>
				<th>Fine</th>
				<th>PAYMENT SEQ NO</th>
				<th>VALID FROM</th>
				<th>VALID TO</th>
				<th>TRANSACTION ID</th>
				<th>Received By</th>
				<th>Bill No.</th>

			</tr>

			<s:iterator value="feesDetails" id="feesDetails">
				<tr>
					<td><s:property value="rowNumber" /></td>
					<td><s:property value="scspId" /></td>
					<td><s:property value="scsId" /></td>
					<td><s:property value="paymentType" /></td>
					<td><s:property value="amount" /></td>
					<td><s:property value="payableDate" /></td>
					<td><s:property value="transactionDate" /></td>
					<td><s:property value="fine" /></td>
					<td><s:property value="paymentSeqNo" /></td>
					<td><s:property value="validFrom" /></td>
					<td><s:property value="validTo" /></td>
					<td><s:property value="transactionId" /></td>
					<td><s:property value="receivedBy" /></td>
					<td><s:property value="billNo" /></td>
				</tr>
			</s:iterator>

		</table>
	</div>
	<div id="pageNavPosition3"></div>
</div>

<div>
	<div id="tablenav2">
		<table id="results2">
			<tr id="heading" bgcolor="grey">
				<th>Row Number</th>
				<th>Scsp ID</th>
				<th>SCS ID</th>
				<th>PAYMENT TYPE</th>
				<th>AMOUNT</th>
				<th>Payable Date</th>
				<th>TRANSACTION DATE</th>
				<th>Fine</th>
				<th>PAYMENT SEQ NO</th>
				<th>VALID FROM</th>
				<th>VALID TO</th>
				<th>TRANSACTION ID</th>
				<th>Received By</th>
				<th>Bill No.</th>
				<th>Pay Fee</th>
			</tr>

			<s:iterator value="dueDetails" id="dueDetails">
				<tr>
					<td><s:property value="rowNumber" /></td>
					<td><s:property value="scspId" /></td>
					<td><s:property value="scsId" /></td>
					<td><s:property value="paymentType" /></td>
					<td><s:property value="amount" /></td>
					<td><s:property value="payableDateInDateFormat" /></td>
					<td><s:property value="transactionDate" /></td>
					<td><s:property value="fineInInteger" /></td>
					<td><s:property value="paymentSeqNo" /></td>
					<td><s:property value="validFrom" /></td>
					<td><s:property value="validTo" /></td>
					<td><s:property value="transactionId" /></td>
					<td><s:property value="receivedBy" /></td>
					<td><s:property value="billNo" /></td>
					<td><input type="checkbox" id="checkbox" name="checkbox"
						onclick="add(this.checked, '<s:property value="amount" />', '<s:property value="rowNumber" />', '<s:property value="fineInInteger" />');" />
					</td>
				</tr>
			</s:iterator>

		</table>
	</div>
	<div id="pageNavPosition2"></div>
	<s:form>
	<s:hidden id="hiddenregistrationid" name="hiddenregistrationid" />
	<s:textfield id="pay" name="pay" value="0" readonly="true"/>
	<s:hidden id="selectedRow" name="selectedRow" />
	<%-- <s:hidden id="dueDetails" name="dueDetails" /> --%>
	<s:submit action="payfees" value="Pay" name="payfees" id="payfees"/>
	</s:form>
</div>