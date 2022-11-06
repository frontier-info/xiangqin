	<%@ page language="java" contentType="text/html; charset=utf-8"
		pageEncoding="utf-8"%>
	<!DOCTYPE html>
	<html>
	 <head>
	  <%@ include file="../common/include_script.jsp"%>
	  <%@ include file="../common/include_css.jsp"%>
	  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	  <title>相亲-检索条件设定</title>
	</head>
	<body>
	<form:form modelAttribute="s002003Form" action="/xiangqin/ui/s002003" method="post">
	<table border="0" cellpadding="4" cellspacing="0" width="100%" '="">
	<tbody>
	   <tr>
		<td class="title5">相亲信息</td>
		<td align="right"> </td>
       </tr>
       <tr>
        <td align="right">性别：</td>
        <td>
         <input type="radio" name="sex" value="女" ><label for="girl">女</label>
         <input type="radio" name="sex" value="男"  checked="checked"><label for="boy">男</label>
	     </td>
	    </tr>
		<tr><td align="right">年龄：</td>
		<td>
		<select name="ageFrom">
	<option value="0"></option>
	<option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option><option value="32">32</option><option value="33">33</option><option value="34">34</option><option value="35">35</option><option value="36">36</option><option value="37">37</option><option value="38">38</option><option value="39">39</option><option value="40">40</option><option value="41">41</option><option value="42">42</option><option value="43">43</option><option value="44">44</option><option value="45">45</option><option value="46">46</option><option value="47">47</option><option value="48">48</option><option value="49">49</option><option value="50">50</option><option value="51">51</option><option value="52">52</option><option value="53">53</option><option value="54">54</option><option value="55">55</option><option value="56">56</option><option value="57">57</option><option value="58">58</option><option value="59">59</option><option value="60">60</option><option value="61">61</option><option value="62">62</option><option value="63">63</option><option value="64">64</option><option value="65">65</option><option value="66">66</option><option value="67">67</option><option value="68">68</option><option value="69">69</option><option value="70">70</option><option value="71">71</option><option value="72">72</option><option value="73">73</option><option value="74">74</option><option value="75">75</option><option value="76">76</option><option value="77">77</option><option value="78">78</option><option value="79">79</option><option value="80">80</option></select> 到
	
	<select name="ageTo">
	<option value="0"></option>
	<option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option><option value="32">32</option><option value="33">33</option><option value="34">34</option><option value="35">35</option><option value="36">36</option><option value="37">37</option><option value="38">38</option><option value="39">39</option><option value="40">40</option><option value="41">41</option><option value="42">42</option><option value="43">43</option><option value="44">44</option><option value="45">45</option><option value="46">46</option><option value="47">47</option><option value="48">48</option><option value="49">49</option><option value="50">50</option><option value="51">51</option><option value="52">52</option><option value="53">53</option><option value="54">54</option><option value="55">55</option><option value="56">56</option><option value="57">57</option><option value="58">58</option><option value="59">59</option><option value="60">60</option><option value="61">61</option><option value="62">62</option><option value="63">63</option><option value="64">64</option><option value="65">65</option><option value="66">66</option><option value="67">67</option><option value="68">68</option><option value="69">69</option><option value="70">70</option><option value="71">71</option><option value="72">72</option><option value="73">73</option><option value="74">74</option><option value="75">75</option><option value="76">76</option><option value="77">77</option><option value="78">78</option><option value="79">79</option><option value="80">80</option></select>
	</td></tr>
		<tr><td align="right" nowrap="">籍贯：</td><td>
	
      <select name="birthPlace" id="lang">
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
      </select>
	<input name="city" value="9117" type="hidden">
	</td></tr>
	<tr><td align="right" nowrap="">现住址：</td><td>
	<select name="address" autocomplete="shipping address-level1">
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
    </td></tr>
		<tr><td align="right">身高：</td>
		<td nowrap=""><select name="uheightFrom">
	<option value="0"></option>
	<option value="150">150</option><option value="151">151</option><option value="152">152</option><option value="153">153</option><option value="154">154</option><option value="155">155</option><option value="156">156</option><option value="157">157</option><option value="158">158</option><option value="159">159</option><option value="160">160</option><option value="161">161</option><option value="162">162</option><option value="163">163</option><option value="164">164</option><option value="165">165</option><option value="166">166</option><option value="167">167</option><option value="168">168</option><option value="169">169</option><option value="170">170</option><option value="171">171</option><option value="172">172</option><option value="173">173</option><option value="174">174</option><option value="175">175</option><option value="176">176</option><option value="177">177</option><option value="178">178</option><option value="179">179</option><option value="180">180</option><option value="181">181</option><option value="182">182</option><option value="183">183</option><option value="184">184</option><option value="185">185</option><option value="186">186</option><option value="187">187</option><option value="188">188</option><option value="189">189</option><option value="190">190</option><option value="191">191</option><option value="192">192</option><option value="193">193</option><option value="194">194</option><option value="195">195</option><option value="196">196</option><option value="197">197</option><option value="198">198</option><option value="199">199</option><option value="200">200</option></select> 到
	
	<select name="uheightTo">
	<option value="0"></option>
	<option value="150">150</option><option value="151">151</option><option value="152">152</option><option value="153">153</option><option value="154">154</option><option value="155">155</option><option value="156">156</option><option value="157">157</option><option value="158">158</option><option value="159">159</option><option value="160">160</option><option value="161">161</option><option value="162">162</option><option value="163">163</option><option value="164">164</option><option value="165">165</option><option value="166">166</option><option value="167">167</option><option value="168">168</option><option value="169">169</option><option value="170">170</option><option value="171">171</option><option value="172">172</option><option value="173">173</option><option value="174">174</option><option value="175">175</option><option value="176">176</option><option value="177">177</option><option value="178">178</option><option value="179">179</option><option value="180">180</option><option value="181">181</option><option value="182">182</option><option value="183">183</option><option value="184">184</option><option value="185">185</option><option value="186">186</option><option value="187">187</option><option value="188">188</option><option value="189">189</option><option value="190">190</option><option value="191">191</option><option value="192">192</option><option value="193">193</option><option value="194">194</option><option value="195">195</option><option value="196">196</option><option value="197">197</option><option value="198">198</option><option value="199">199</option><option value="200">200</option></select> 公分
	</td></tr>
		
		<tr><td align="right">有照片：</td><td><input type="checkbox" name="photo" value="yes"></td></tr>
		<tr><td colspan="2"><hr size="2" color="#ffffff"></td></tr>
	
		<tr><td align="right">体重：</td>
		<td nowrap=""><select name="uweightFrom">
	<option value="0"></option>
	<option value="40">40</option><option value="41">41</option><option value="42">42</option><option value="43">43</option><option value="44">44</option><option value="45">45</option><option value="46">46</option><option value="47">47</option><option value="48">48</option><option value="49">49</option><option value="50">50</option><option value="51">51</option><option value="52">52</option><option value="53">53</option><option value="54">54</option><option value="55">55</option><option value="56">56</option><option value="57">57</option><option value="58">58</option><option value="59">59</option><option value="60">60</option><option value="61">61</option><option value="62">62</option><option value="63">63</option><option value="64">64</option><option value="65">65</option><option value="66">66</option><option value="67">67</option><option value="68">68</option><option value="69">69</option><option value="70">70</option><option value="71">71</option><option value="72">72</option><option value="73">73</option><option value="74">74</option><option value="75">75</option><option value="76">76</option><option value="77">77</option><option value="78">78</option><option value="79">79</option><option value="80">80</option><option value="81">81</option><option value="82">82</option><option value="83">83</option><option value="84">84</option><option value="85">85</option><option value="86">86</option><option value="87">87</option><option value="88">88</option><option value="89">89</option><option value="90">90</option><option value="91">91</option><option value="92">92</option><option value="93">93</option><option value="94">94</option><option value="95">95</option><option value="96">96</option><option value="97">97</option><option value="98">98</option><option value="99">99</option><option value="100">100</option></select> 到
	
	<select name="uweightTo">
	<option value="0"></option>
	<option value="40">40</option><option value="41">41</option><option value="42">42</option><option value="43">43</option><option value="44">44</option><option value="45">45</option><option value="46">46</option><option value="47">47</option><option value="48">48</option><option value="49">49</option><option value="50">50</option><option value="51">51</option><option value="52">52</option><option value="53">53</option><option value="54">54</option><option value="55">55</option><option value="56">56</option><option value="57">57</option><option value="58">58</option><option value="59">59</option><option value="60">60</option><option value="61">61</option><option value="62">62</option><option value="63">63</option><option value="64">64</option><option value="65">65</option><option value="66">66</option><option value="67">67</option><option value="68">68</option><option value="69">69</option><option value="70">70</option><option value="71">71</option><option value="72">72</option><option value="73">73</option><option value="74">74</option><option value="75">75</option><option value="76">76</option><option value="77">77</option><option value="78">78</option><option value="79">79</option><option value="80">80</option><option value="81">81</option><option value="82">82</option><option value="83">83</option><option value="84">84</option><option value="85">85</option><option value="86">86</option><option value="87">87</option><option value="88">88</option><option value="89">89</option><option value="90">90</option><option value="91">91</option><option value="92">92</option><option value="93">93</option><option value="94">94</option><option value="95">95</option><option value="96">96</option><option value="97">97</option><option value="98">98</option><option value="99">99</option><option value="100">100</option></select> 公斤
	</td></tr>
		<tr><td align="right">所在行业：</td><td><select name="profession">
	<option value=""></option>
	<option value="IT">IT</option>
	<option value="メーカー">メーカー</option>
	<option value="事務">事務</option>
	<option value="金融">金融</option>
	<option value="不動産">不動産</option>
	<option value="EC">EC</option>
	<option value="无特别要求">无特别要求</option>
</select></td></tr>
		<tr><td align="center" colspan="2">
			<input type="submit" name="saveSearchCondition" value="保存搜索条件">&nbsp;&nbsp;&nbsp;
			<input type="reset" value="重置">

  </div>
	
	</tbody></table>
</form:form>
	</body>
	</html>