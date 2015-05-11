<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<div>
   <s:label name="reg" id="reg"/>
   <s:label name="stdId" id="stdId"/>
   <s:label name="receivedBy" id="receivedBy"/>
	<div id="tablenav3">
		<table id="results3">
			<tr id="heading" bgcolor="grey">
				<th>Serial Number</th>
				<th>Transaction ID</th>
				<th>PAYMENT TYPE</th>
				<th>AMOUNT</th>
				<th>Pay Date</th>
				<th>Bill No.</th>
				<th>Payment Sequence No</th>
			</tr>

			<s:iterator value="paidDetails" id="paidDetails">
				<tr>
					<td><s:property value="serialNo" /></td>
					<td><s:property value="transactionId" /></td>
					<td><s:property value="paymentType" /></td>
					<td><s:property value="amount" /></td>
					<td><s:property value="date" /></td>
					<td><s:property value="billNo" /></td>
					<td><s:property value="paymentSeqNo" /></td>
				</tr>
			</s:iterator>

		</table>
	</div>
	<div id="pageNavPosition3"></div>
</div>

