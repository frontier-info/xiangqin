<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>相亲-登录</title>
</head>

<style>
body {
	background-color: whitesmoke;
}
</style>

<body>

	<div class="row">

		<div class="col-md-3"></div>
		<div class="col-md-6">
			<!--   引入导航栏 -->
			<%@include file="../common/header.jsp"%>
		</div>
		<div class="col-md-3"></div>

	</div>
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">用户主页</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-8">

							<h2>
								<font face="verdana"><font size="6" color="black">请您填入个人信息

								
							</h2>
							<h3>
								<font size="3" color="pink">💛金凤玉露一相逢，便胜却人间无数。💛 
							</h3>
							<hr />

							<form:form modelAttribute="s002002Form"
								action="/xiangqin/ui/s002002" method="post">

								<div>
									<p>
										<label for="uname">用户名:</label> <input type="text"
											name="uname">
									</p>
								</div>

								<div>
									<p>
										<label for="uname">性别：</label> <input type="radio" name="sex"
											value="0"><label for="sex">女</label> <input
											type="radio" name="sex" value="1" checked="checked"><label
											for="sex">男</label>
									</p>
								</div>

								<div>
									<p>
										<label for="start">出生年月日:</label> <input type="date"
											name="birthDate" value="2000-01-01" min="1923-01-01"
											max="2002-01-01">
									</p>
								</div>

								<div>
									<p>
										<label for="lang">出生地:</label> <select name="birthPlace"
											id="lang">
											<option value="select">--请选择--</option>
											<option value="安徽省">安徽省</option>
											<option value="北京市">北京市</option>
											<option value="重庆市">重庆市</option>
											<option value="福建省">福建省</option>
											<option value="甘肃省">甘肃省</option>
											<option value="广东省">广东省</option>
											<option value="广西壮族自治区">广西壮族自治区</option>
											<option value="贵州省">贵州省</option>
											<option value="海南省">海南省</option>
											<option value="河北省">河北省</option>
											<option value="河南省">河南省</option>
											<option value="黑龙江省">黑龙江省</option>
											<option value="湖北省">湖北省</option>
											<option value="湖南省">湖南省</option>
											<option value="吉林省">吉林省</option>
											<option value="江苏省">江苏省</option>
											<option value="江西省">江西省</option>
											<option value="辽宁省">辽宁省</option>
											<option value="内蒙古自治区">内蒙古自治区</option>
											<option value="宁夏回族自治区">宁夏回族自治区</option>
											<option value="青海省">青海省</option>
											<option value="山东省">山东省</option>
											<option value="山西省">山西省</option>
											<option value="陕西省">陕西省</option>
											<option value="上海市">上海市</option>
											<option value="四川省">四川省</option>
											<option value="天津市">天津市</option>
											<option value="西藏自治区">西藏自治区</option>
											<option value="新疆维吾尔自治区">新疆维吾尔自治区</option>
											<option value="香港特别行政区">香港特别行政区</option>
											<option value="云南省">云南省</option>
											<option value="日本">日本</option>
											<option value="美国">美国</option>
											<option value="英国">英国</option>
											<option value="台湾">台湾</option>
											<option value="欧洲-其他">欧洲-其他</option>
											<option value="亚洲-其他">亚洲-其他</option>
											<option value="非洲-其他">非洲-其他</option>
											<option value="北美洲-其他">北美洲-其他</option>
											<option value="南美洲-其他">南美洲-其他</option>
											<option value="大洋洲-其他">大洋洲-其他</option>
											<option value="南极-其他">南极-其他</option>
										</select> <span> 请选择地区</span>
									</p>
								</div>
								<div>
									<p>
									<h4>
										<font size="3" color="pink">住所： 
									</h4>
									<label> <span>都道府県</span> <select name="address"
										autocomplete="shipping address-level1">
											<option value="北海道">北海道</option>
											<option value="青森県">青森県</option>
											<option value="宮城県">宮城県</option>
											<option value="秋田県">秋田県</option>
											<option value="山形県">山形県</option>
											<option value="福島県">福島県</option>
											<option value="茨城県">茨城県</option>
											<option value="栃木県">栃木県</option>
											<option value="群馬県">群馬県</option>
											<option value="埼玉県">埼玉県</option>
											<option value="東京都">東京都</option>
											<option value="神奈川県">神奈川県</option>
											<option value="新潟県">新潟県</option>
											<option value="富山県">富山県</option>
											<option value="石川県">石川県</option>
											<option value="福井県">福井県</option>
											<option value="山梨県">山梨県</option>
											<option value="長野県">長野県</option>
											<option value="岐阜県">岐阜県</option>
											<option value="静岡県">静岡県</option>
											<option value="愛知県">愛知県</option>
											<option value="三重県">三重県</option>
											<option value="滋賀県">滋賀県</option>
											<option value="京都府">京都府</option>
											<option value="大阪府">大阪府</option>
											<option value="兵庫県">兵庫県</option>
											<option value="奈良県">奈良県</option>
											<option value="和歌山県">和歌山県</option>
											<option value="鳥取県">鳥取県</option>
											<option value="島根県">島根県</option>
											<option value="岡山県">岡山県</option>
											<option value="広島県">広島県</option>
											<option value="山口県">山口県</option>
											<option value="東徳島県">東徳島県</option>
											<option value="香川県">香川県</option>
											<option value="愛媛県">愛媛県</option>
											<option value="高知県">高知県</option>
											<option value="福岡県">福岡県</option>
											<option value="佐賀県">佐賀県</option>
											<option value="長崎県">長崎県</option>
											<option value="熊本県">熊本県</option>
											<option value="大分県">大分県</option>
											<option value="宮崎県">宮崎県</option>
											<option value="鹿児島県">鹿児島県</option>
											<option value="沖縄県">沖縄県</option>
									</select>
									</label>
									</p>
								</div>

								<div>
									<p>
										<label for="profession">职业:</label> <input type="text"
											name="profession">
									</p>
								</div>

								<div>
									<p>
										<label for="interest">兴趣:</label> <input type="text"
											name="interest">
									</p>
								</div>

								<div>
									<p>
										<label for="uheight">身高:</label> <select name="uheight"
											class="input_list">
											<option label="--请选择--" value="0">--请选择--</option>
											<option label="130" value="130">130</option>
											<option label="131" value="131">131</option>
											<option label="132" value="132">132</option>
											<option label="133" value="133">133</option>
											<option label="134" value="134">134</option>
											<option label="135" value="135">135</option>
											<option label="136" value="136">136</option>
											<option label="137" value="137">137</option>
											<option label="138" value="138">138</option>
											<option label="139" value="139">139</option>
											<option label="140" value="140">140</option>
											<option label="141" value="141">141</option>
											<option label="142" value="142">142</option>
											<option label="143" value="143">143</option>
											<option label="144" value="144">144</option>
											<option label="145" value="145">145</option>
											<option label="146" value="146">146</option>
											<option label="147" value="147">147</option>
											<option label="148" value="148">148</option>
											<option label="149" value="149">149</option>
											<option label="150" value="150">150</option>
											<option label="151" value="151">151</option>
											<option label="152" value="152">152</option>
											<option label="153" value="153">153</option>
											<option label="154" value="154">154</option>
											<option label="155" value="155">155</option>
											<option label="156" value="156">156</option>
											<option label="157" value="157">157</option>
											<option label="158" value="158">158</option>
											<option label="159" value="159">159</option>
											<option label="160" value="160">160</option>
											<option label="161" value="161">161</option>
											<option label="162" value="162">162</option>
											<option label="163" value="163">163</option>
											<option label="164" value="164">164</option>
											<option label="165" value="165">165</option>
											<option label="166" value="166">166</option>
											<option label="167" value="167">167</option>
											<option label="168" value="168">168</option>
											<option label="169" value="169">169</option>
											<option label="170" value="170" selected="selected">170</option>
											<option label="171" value="171">171</option>
											<option label="172" value="172">172</option>
											<option label="173" value="173">173</option>
											<option label="174" value="174">174</option>
											<option label="175" value="175">175</option>
											<option label="176" value="176">176</option>
											<option label="177" value="177">177</option>
											<option label="178" value="178">178</option>
											<option label="179" value="179">179</option>
											<option label="180" value="180">180</option>
											<option label="181" value="181">181</option>
											<option label="182" value="182">182</option>
											<option label="183" value="183">183</option>
											<option label="184" value="184">184</option>
											<option label="185" value="185">185</option>
											<option label="186" value="186">186</option>
											<option label="187" value="187">187</option>
											<option label="188" value="188">188</option>
											<option label="189" value="189">189</option>
											<option label="190" value="190">190</option>
											<option label="191" value="191">191</option>
											<option label="192" value="192">192</option>
											<option label="193" value="193">193</option>
											<option label="194" value="194">194</option>
											<option label="195" value="195">195</option>
											<option label="196" value="196">196</option>
											<option label="197" value="197">197</option>
											<option label="198" value="198">198</option>
											<option label="199" value="199">199</option>
											<option label="200" value="200">200</option>
											<option label="201" value="201">201</option>
											<option label="202" value="202">202</option>
											<option label="203" value="203">203</option>
											<option label="204" value="204">204</option>
											<option label="205" value="205">205</option>
											<option label="206" value="206">206</option>
											<option label="207" value="207">207</option>
											<option label="208" value="208">208</option>
											<option label="209" value="209">209</option>
											<option label="210" value="210">210</option>
											<option label="211" value="211">211</option>
											<option label="212" value="212">212</option>
											<option label="213" value="213">213</option>
											<option label="214" value="214">214</option>
											<option label="215" value="215">215</option>
											<option label="216" value="216">216</option>
											<option label="217" value="217">217</option>
											<option label="218" value="218">218</option>
											<option label="219" value="219">219</option>
											<option label="220" value="220">220</option>
											<option label="221" value="221">221</option>
											<option label="222" value="222">222</option>
											<option label="223" value="223">223</option>
											<option label="224" value="224">224</option>
											<option label="225" value="225">225</option>
											<option label="226" value="226">226</option>

										</select>
									</p>

								</div>

								<div>
									<p>
										<label for="uweight">体重:</label> <input type="text"
											name="uweight">
									</p>
								</div>

								<div>
									<p>
										<label for="introduce">自我介绍:</label>

										<textarea class="dubai" name="introduce" rows="13"
											onblur="check_note_input(this);countWorkNums(1);"
											onkeyup="countWorkNums(1);"
											onfocus="click_note_input(this);clearText(this);countWorkNums(1);">填写自我介绍更有利于被关注哦！勤劳的虫儿有鸟吃！</textarea>
									<div class="reg_tip">
										请输入5-1000字 已输入<span id="wordNums1">0</span>字
										（为保证您的信息安全，请勿透漏自己的姓名<br> 与联系方式）
									</div>
									</p>
								</div>


								<div>
									<p>
										<label for="uimages">上传照片:</label> <input type="text"
											id="uimages" name="uimages">
									</p>
								</div>


								<div>
									<p>
										<label for="identification_photo">上传照片:</label> <input
											type="text" id="identification_photo"
											name="identification_photo">
									</p>
								</div>
								<input type="file">
								<div class="avator">
									<img src="./avator.jpg" alt="">

								</div>

								<input type="submit" value="上传">


								<div>
									<input type="reset" value="信息重置">
								</div>
								<input type="submit" name="b" value="提交个人信息">



							</form:form>
						</div>
						<div class="col-md-2"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--   引入版权信息栏 -->
	<%@include file="../common/footer.jsp"%>

</body>
</html>
