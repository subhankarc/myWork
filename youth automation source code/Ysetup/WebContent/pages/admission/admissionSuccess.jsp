<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<s:div>
	<table style="width: 100%;">
		<tr>
			<td><s:if test="hasActionErrors()">
					<div class="ui-widget actionError">
						<div style="padding: 0.3em 0.7em; margin-top: 10px;"
							class="ui-state-error ui-corner-all">

							<p>
								<span style="float: left; margin-right: 0.3em;"
									class="ui-icon ui-icon-alert"></span> <span>Error occure
									during sava operation</span>
							</p>
						</div>
					</div>
					<s:div>&nbsp;</s:div>
				</s:if> <s:if test="hasActionMessages()">
					<div class="ui-widget actionMessage">
						<div style="padding: 0.3em 0.7em; margin-top: 10px;"
							class="ui-state-highlight ui-corner-all">
							<p>
								<span style="float: left; margin-right: 0.3em;"
									class="ui-icon ui-icon-info"></span> <span>data saved
									successfully</span>
							</p>
						</div>
					</div>

				</s:if></td>
		</tr>

	</table>
</s:div>
