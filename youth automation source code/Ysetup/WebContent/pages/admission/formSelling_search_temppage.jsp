<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<div class="ui-jqgrid ui-widget ui-widget-content ui-corner-all"
	id="gbox_searchtablea" dir="ltr" style="width: 100%;">
	<div class="ui-jqgrid-view" id="gview_searchtable"
		style="width: 100%;">
		<div
			class="ui-jqgrid-titlebar ui-widget-header ui-corner-top ui-helper-clearfix">
			<span class="ui-jqgrid-title">&nbsp;&nbsp;&nbsp;Form Enquery Search Result
			<br/>
			</span>
		</div>
		<div style="width: 100%;" class="ui-state-default ui-jqgrid-hdiv">
			<div class="ui-jqgrid-hbox">
				<table cellspacing="0" cellpadding="0" border="0"
					aria-labelledby="gbox_searchtablea" role="grid"
					style="width: 100%;" class="ui-jqgrid-htable">
					<thead>
						<tr role="rowheader" class="ui-jqgrid-labels">
							<th class="ui-state-default ui-th-column ui-th-ltr"	role="columnheader" style="width: 10%;">
								<span	class="ui-jqgrid-resize ui-jqgrid-resize-ltr" style="cursor: col-resize;">&nbsp;</span>
								<div id="jqgh_customerstablea_customernumber"	class="ui-jqgrid-sortable">	Select
								</div>
							</th>
							<th class="ui-state-default ui-th-column ui-th-ltr"
								role="columnheader" id="customerstablea_customername"
								style="width: 20%"><span
								class="ui-jqgrid-resize ui-jqgrid-resize-ltr"
								style="cursor: col-resize;">&nbsp;</span>
								<div id="jqgh_customerstablea_customername"
									class="ui-jqgrid-sortable">
									Student Name
								</div></th>
							<th class="ui-state-default ui-th-column ui-th-ltr"
								role="columnheader" id="customerstablea_country"
								style="width: 20%;"><span
								class="ui-jqgrid-resize ui-jqgrid-resize-ltr"
								style="cursor: col-resize;">&nbsp;</span>
								<div id="jqgh_customerstablea_country"
									class="ui-jqgrid-sortable">
									Course Type
								</div></th>
							<th class="ui-state-default ui-th-column ui-th-ltr"
								role="columnheader" id="customerstablea_city"
								style="width: 20%"><span
								class="ui-jqgrid-resize ui-jqgrid-resize-ltr"
								style="cursor: col-resize;">&nbsp;</span>
								<div id="jqgh_customerstablea_city" class="ui-jqgrid-sortable">
									Student Type
								</div>
							</th>
							<th class="ui-state-default ui-th-column ui-th-ltr"
								role="columnheader" id="customerstablea_creditlimit"
								style="width: 20%;"><span
								class="ui-jqgrid-resize ui-jqgrid-resize-ltr"
								style="cursor: col-resize;">&nbsp;</span>
								<div id="jqgh_customerstablea_creditlimit"
									class="ui-jqgrid-sortable">
									Session
								</div>
							</th>
							<th class="ui-state-default ui-th-column ui-th-ltr"
								role="columnheader"
								id="customerstablea_salesemployee.employeenumber"
								style="width: 10%"><span
								class="ui-jqgrid-resize ui-jqgrid-resize-ltr"
								style="cursor: col-resize;">&nbsp;</span>
								<div id="jqgh_customerstablea_salesemployee.employeenumber"
									class="ui-jqgrid-sortable">
									Location
								</div></th>
						</tr>
					</thead>
				</table>
			</div>
		</div>
		<div class="ui-jqgrid-bdiv" style="height: auto; width: 100%;">
			<div style="position: relative;">
				<div></div>
				<table cellspacing="0" cellpadding="0" border="0"
					class="ui-jqgrid-btable ui-droppable" id="customerstablea"
					tabindex="1" role="grid" aria-multiselectable="false"
					aria-labelledby="gbox_customerstablea" style="width: 100%;">
					<tbody>
						<tr style="height: auto;" role="row" class="jqgfirstrow">
							<td style="height: 0px; width: 10%;" role="gridcell"></td>
							<td style="height: 0px; width: 20%;" role="gridcell"></td>
							<td style="height: 0px; width: 20%;" role="gridcell"></td>
							<td style="height: 0px; width: 20%;" role="gridcell"></td>
							<td style="height: 0px; width: 20%;" role="gridcell"></td>
							<td style="height: 0px; width: 10%;" role="gridcell"></td>
						</tr>
						
						<tr class="ui-widget-content jqgrow ui-row-ltr ui-draggable"
							tabindex="-1" id="131" role="row" style="position: relative;">
							<td aria-describedby="customerstablea_customernumber" title="131"
								style="" role="gridcell">131</td>
							<td aria-describedby="customerstablea_customername"
								title="Land of Toys Inc." style="" role="gridcell">Land of
								Toys Inc.</td>
							<td aria-describedby="customerstablea_country" title="USA"
								style="" role="gridcell">USA</td>
							<td aria-describedby="customerstablea_city" title="NYC" style=""
								role="gridcell">NYC</td>
							<td aria-describedby="customerstablea_creditlimit" title="114900"
								style="text-align: right;" role="gridcell">114900</td>
							<td
								aria-describedby="customerstablea_salesemployee.employeenumber"
								title="1323" style="text-align: center;" role="gridcell">1323</td>
						</tr>
						<tr
							class="ui-widget-content jqgrow ui-row-ltr ui-priority-secondary ui-draggable"
							tabindex="-1" id="141" role="row" style="position: relative;">
							<td aria-describedby="customerstablea_customernumber" title="141"
								style="" role="gridcell">141</td>
							<td aria-describedby="customerstablea_customername"
								title="Euro+ Shopping Channel" style="" role="gridcell">Euro+
								Shopping Channel</td>
							<td aria-describedby="customerstablea_country" title="Spain"
								style="" role="gridcell">Spain</td>
							<td aria-describedby="customerstablea_city" title="Madrid"
								style="" role="gridcell">Madrid</td>
							<td aria-describedby="customerstablea_creditlimit" title="227600"
								style="text-align: right;" role="gridcell">227600</td>
							<td
								aria-describedby="customerstablea_salesemployee.employeenumber"
								title="1370" style="text-align: center;" role="gridcell">1370</td>
						</tr>
						<tr class="ui-widget-content jqgrow ui-row-ltr ui-draggable"
							tabindex="-1" id="144" role="row" style="position: relative;">
							<td aria-describedby="customerstablea_customernumber" title="144"
								style="" role="gridcell">144</td>
							<td aria-describedby="customerstablea_customername"
								title="Volvo Model Replicas, Co" style="" role="gridcell">Volvo
								Model Replicas, Co</td>
							<td aria-describedby="customerstablea_country" title="Sweden"
								style="" role="gridcell">Sweden</td>
							<td aria-describedby="customerstablea_city" title="Luleå"
								style="" role="gridcell">Luleå</td>
							<td aria-describedby="customerstablea_creditlimit" title="53100"
								style="text-align: right;" role="gridcell">53100</td>
							<td
								aria-describedby="customerstablea_salesemployee.employeenumber"
								title="1504" style="text-align: center;" role="gridcell">1504</td>
						</tr>
						<tr
							class="ui-widget-content jqgrow ui-row-ltr ui-priority-secondary ui-draggable"
							tabindex="-1" id="145" role="row" style="position: relative;">
							<td aria-describedby="customerstablea_customernumber" title="145"
								style="" role="gridcell">145</td>
							<td aria-describedby="customerstablea_customername"
								title="Danish Wholesale Imports" style="" role="gridcell">Danish
								Wholesale Imports</td>
							<td aria-describedby="customerstablea_country" title="Denmark"
								style="" role="gridcell">Denmark</td>
							<td aria-describedby="customerstablea_city" title="Kobenhavn"
								style="" role="gridcell">Kobenhavn</td>
							<td aria-describedby="customerstablea_creditlimit" title="83400"
								style="text-align: right;" role="gridcell">83400</td>
							<td
								aria-describedby="customerstablea_salesemployee.employeenumber"
								title="1401" style="text-align: center;" role="gridcell">1401</td>
						</tr>
						<tr class="ui-widget-content jqgrow ui-row-ltr ui-draggable"
							tabindex="-1" id="146" role="row" style="position: relative;">
							<td aria-describedby="customerstablea_customernumber" title="146"
								style="" role="gridcell">146</td>
							<td aria-describedby="customerstablea_customername"
								title="Saveley &amp; Henriot, Co." style="" role="gridcell">Saveley
								&amp; Henriot, Co.</td>
							<td aria-describedby="customerstablea_country" title="France"
								style="" role="gridcell">France</td>
							<td aria-describedby="customerstablea_city" title="Lyon" style=""
								role="gridcell">Lyon</td>
							<td aria-describedby="customerstablea_creditlimit" title="123900"
								style="text-align: right;" role="gridcell">123900</td>
							<td
								aria-describedby="customerstablea_salesemployee.employeenumber"
								title="1337" style="text-align: center;" role="gridcell">1337</td>
						</tr>
						<tr
							class="ui-widget-content jqgrow ui-row-ltr ui-priority-secondary ui-draggable"
							tabindex="-1" id="148" role="row" style="position: relative;">
							<td aria-describedby="customerstablea_customernumber" title="148"
								style="" role="gridcell">148</td>
							<td aria-describedby="customerstablea_customername"
								title="Dragon Souveniers, Ltd." style="" role="gridcell">Dragon
								Souveniers, Ltd.</td>
							<td aria-describedby="customerstablea_country" title="Singapore"
								style="" role="gridcell">Singapore</td>
							<td aria-describedby="customerstablea_city" title="Singapore"
								style="" role="gridcell">Singapore</td>
							<td aria-describedby="customerstablea_creditlimit" title="103800"
								style="text-align: right;" role="gridcell">103800</td>
							<td
								aria-describedby="customerstablea_salesemployee.employeenumber"
								title="1621" style="text-align: center;" role="gridcell">1621</td>
						</tr>
						<tr class="ui-widget-content jqgrow ui-row-ltr ui-draggable"
							tabindex="-1" id="151" role="row" style="position: relative;">
							<td aria-describedby="customerstablea_customernumber" title="151"
								style="" role="gridcell">151</td>
							<td aria-describedby="customerstablea_customername"
								title="Muscle Machine Inc" style="" role="gridcell">Muscle
								Machine Inc</td>
							<td aria-describedby="customerstablea_country" title="USA"
								style="" role="gridcell">USA</td>
							<td aria-describedby="customerstablea_city" title="NYC" style=""
								role="gridcell">NYC</td>
							<td aria-describedby="customerstablea_creditlimit" title="138500"
								style="text-align: right;" role="gridcell">138500</td>
							<td
								aria-describedby="customerstablea_salesemployee.employeenumber"
								title="1286" style="text-align: center;" role="gridcell">1286</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div id="rs_mcustomerstablea" class="ui-jqgrid-resize-mark">&nbsp;</div>
	<div id="customerstablea_pager" style="width: 100%;"
		class="ui-state-default ui-jqgrid-pager ui-corner-bottom" dir="ltr">
		<div role="group" class="ui-pager-control"
			id="pg_customerstablea_pager">
			<table cellspacing="0" cellpadding="0" border="0" role="row"
				style="width: 100%; table-layout: fixed; height: 100%;"
				class="ui-pg-table">
				<tbody>
					<tr>
						<td align="left" id="customerstablea_pager_left"></td>
						<td align="center" style="white-space: pre; width: 30%;"
							id="customerstablea_pager_center"><table cellspacing="0"
								cellpadding="0" border="0" class="ui-pg-table"
								style="table-layout: auto;">
								
							</table></td>
						<td align="right" id="customerstablea_pager_right"><div
								class="ui-paging-info" style="text-align: right;" dir="ltr">View
								1 - 15 of 32</div></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>
