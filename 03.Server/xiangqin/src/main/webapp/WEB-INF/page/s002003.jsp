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
<table border="0" cellpadding="4" cellspacing="0" width="100%" '="">
<tbody><tr>
	<td class="title5">相亲信息</td>
	<td align="right"> </td>
</tr>
</tbody></table>
<table border="0" cellpadding="2" cellspacing="0" width="100%">
<form action="searchuser.jsp" method="post" name="form_search"></form>
	<tbody><tr><td align="right">性别：</td><td><select name="gender">
<option value=""></option>
<option value="M">男</option>
<option value="F">女</option>
</select></td></tr>
	<tr><td align="right">年龄：</td><td><select name="age_min">
<option value="0"></option>
<option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option><option value="32">32</option><option value="33">33</option><option value="34">34</option><option value="35">35</option><option value="36">36</option><option value="37">37</option><option value="38">38</option><option value="39">39</option><option value="40">40</option><option value="41">41</option><option value="42">42</option><option value="43">43</option><option value="44">44</option><option value="45">45</option><option value="46">46</option><option value="47">47</option><option value="48">48</option><option value="49">49</option><option value="50">50</option><option value="51">51</option><option value="52">52</option><option value="53">53</option><option value="54">54</option><option value="55">55</option><option value="56">56</option><option value="57">57</option><option value="58">58</option><option value="59">59</option><option value="60">60</option><option value="61">61</option><option value="62">62</option><option value="63">63</option><option value="64">64</option><option value="65">65</option><option value="66">66</option><option value="67">67</option><option value="68">68</option><option value="69">69</option><option value="70">70</option><option value="71">71</option><option value="72">72</option><option value="73">73</option><option value="74">74</option><option value="75">75</option><option value="76">76</option><option value="77">77</option><option value="78">78</option><option value="79">79</option><option value="80">80</option></select> 到

<select name="age_max">
<option value="0"></option>
<option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option><option value="32">32</option><option value="33">33</option><option value="34">34</option><option value="35">35</option><option value="36">36</option><option value="37">37</option><option value="38">38</option><option value="39">39</option><option value="40">40</option><option value="41">41</option><option value="42">42</option><option value="43">43</option><option value="44">44</option><option value="45">45</option><option value="46">46</option><option value="47">47</option><option value="48">48</option><option value="49">49</option><option value="50">50</option><option value="51">51</option><option value="52">52</option><option value="53">53</option><option value="54">54</option><option value="55">55</option><option value="56">56</option><option value="57">57</option><option value="58">58</option><option value="59">59</option><option value="60">60</option><option value="61">61</option><option value="62">62</option><option value="63">63</option><option value="64">64</option><option value="65">65</option><option value="66">66</option><option value="67">67</option><option value="68">68</option><option value="69">69</option><option value="70">70</option><option value="71">71</option><option value="72">72</option><option value="73">73</option><option value="74">74</option><option value="75">75</option><option value="76">76</option><option value="77">77</option><option value="78">78</option><option value="79">79</option><option value="80">80</option></select>
</td></tr>
	<tr><td align="right" nowrap="">籍贯：</td><td>
<select name="province" style="WIDTH:90px" onchange="loadcity(this.value,&quot;&quot;);">
<option value=""></option>
<option value="11">北京</option>
<option value="31">上海</option>
<option value="12">天津</option>
<option value="50">重庆</option>
<option value="34">安徽</option>
<option value="35">福建</option>
<option value="62">甘肃</option>
<option value="44">广东</option>
<option value="45">广西</option>
<option value="52">贵州</option>
<option value="46">海南</option>
<option value="13">河北</option>
<option value="41">河南</option>
<option value="23">黑龙江</option>
<option value="42">湖北</option>
<option value="43">湖南</option>
<option value="22">吉林</option>
<option value="32">江苏</option>
<option value="36">江西</option>
<option value="21">辽宁</option>
<option value="15">内蒙古</option>
<option value="64">宁夏</option>
<option value="63">青海</option>
<option value="37">山东</option>
<option value="14">山西</option>
<option value="61">陕西</option>
<option value="51">四川</option>
<option value="54">西藏</option>
<option value="65">新疆</option>
<option value="53">云南</option>
<option value="33">浙江</option>
<option value="71">台湾</option>
<option value="81">香港</option>
<option value="82">澳门</option>
<option value="83">都可以</option>

</select>
<input name="city" value="9117" type="hidden">
</td></tr>
<tr><td align="right" nowrap="">现住址：</td><td>
<select name="province" style="WIDTH:90px" onchange="loadcity(this.value,&quot;&quot;);">
<option value=""></option>
<option value="text">北海道</option>
      <option value="text">青森県</option>
      <option value="text">宮城県</option>
      <option value="text">秋田県</option>
      <option value="text">山形県</option>
      <option value="text">福島県</option>
      <option value="text">茨城県</option>
      <option value="text">栃木県</option>
      <option value="text">群馬県</option>
      <option value="text">埼玉県</option>
      <option value="text">東京都</option>
      <option value="text">神奈川県</option>
      <option value="text">新潟県</option>
      <option value="text">富山県</option>
      <option value="text">石川県</option>
      <option value="text">福井県</option>
      <option value="text">山梨県</option>
      <option value="text">長野県</option>
      <option value="text">岐阜県</option>
      <option value="text">静岡県</option>
      <option value="text">愛知県</option>
      <option value="text">三重県</option>
      <option value="text">滋賀県</option>
      <option value="text">京都府</option>
      <option value="text">大阪府</option>
      <option value="text">兵庫県</option>
      <option value="text">奈良県</option>
      <option value="text">和歌山県</option>
      <option value="text">鳥取県</option>
      <option value="text">島根県</option>
      <option value="text">岡山県</option>
      <option value="text">広島県</option>
      <option value="text">山口県</option>
      <option value="text">東徳島県</option>
      <option value="text">香川県</option>
      <option value="text">愛媛県</option>
      <option value="text">高知県</option>
      <option value="text">福岡県</option>
      <option value="text">佐賀県</option>
      <option value="text">長崎県</option>
      <option value="text">熊本県</option>
      <option value="text">大分県</option>
      <option value="text">宮崎県</option>
      <option value="text">鹿児島県</option>
      <option value="text">沖縄県</option>
      <option value="text">都可以</option>

</select></td></tr>
	<tr><td align="right">身高：</td><td nowrap=""><select name="height_min">
<option value="0"></option>
<option value="150">150</option><option value="151">151</option><option value="152">152</option><option value="153">153</option><option value="154">154</option><option value="155">155</option><option value="156">156</option><option value="157">157</option><option value="158">158</option><option value="159">159</option><option value="160">160</option><option value="161">161</option><option value="162">162</option><option value="163">163</option><option value="164">164</option><option value="165">165</option><option value="166">166</option><option value="167">167</option><option value="168">168</option><option value="169">169</option><option value="170">170</option><option value="171">171</option><option value="172">172</option><option value="173">173</option><option value="174">174</option><option value="175">175</option><option value="176">176</option><option value="177">177</option><option value="178">178</option><option value="179">179</option><option value="180">180</option><option value="181">181</option><option value="182">182</option><option value="183">183</option><option value="184">184</option><option value="185">185</option><option value="186">186</option><option value="187">187</option><option value="188">188</option><option value="189">189</option><option value="190">190</option><option value="191">191</option><option value="192">192</option><option value="193">193</option><option value="194">194</option><option value="195">195</option><option value="196">196</option><option value="197">197</option><option value="198">198</option><option value="199">199</option><option value="200">200</option></select> 到

<select name="height_max">
<option value="0"></option>
<option value="150">150</option><option value="151">151</option><option value="152">152</option><option value="153">153</option><option value="154">154</option><option value="155">155</option><option value="156">156</option><option value="157">157</option><option value="158">158</option><option value="159">159</option><option value="160">160</option><option value="161">161</option><option value="162">162</option><option value="163">163</option><option value="164">164</option><option value="165">165</option><option value="166">166</option><option value="167">167</option><option value="168">168</option><option value="169">169</option><option value="170">170</option><option value="171">171</option><option value="172">172</option><option value="173">173</option><option value="174">174</option><option value="175">175</option><option value="176">176</option><option value="177">177</option><option value="178">178</option><option value="179">179</option><option value="180">180</option><option value="181">181</option><option value="182">182</option><option value="183">183</option><option value="184">184</option><option value="185">185</option><option value="186">186</option><option value="187">187</option><option value="188">188</option><option value="189">189</option><option value="190">190</option><option value="191">191</option><option value="192">192</option><option value="193">193</option><option value="194">194</option><option value="195">195</option><option value="196">196</option><option value="197">197</option><option value="198">198</option><option value="199">199</option><option value="200">200</option></select> 公分
</td></tr>
	
	<tr><td align="right">有照片：</td><td><input type="checkbox" name="photo" value="yes"></td></tr>
	<tr><td colspan="2"><hr size="2" color="#ffffff"></td></tr>

	<tr><td align="right">体重：</td><td nowrap=""><select name="weight_min">
<option value="0"></option>
<option value="40">40</option><option value="41">41</option><option value="42">42</option><option value="43">43</option><option value="44">44</option><option value="45">45</option><option value="46">46</option><option value="47">47</option><option value="48">48</option><option value="49">49</option><option value="50">50</option><option value="51">51</option><option value="52">52</option><option value="53">53</option><option value="54">54</option><option value="55">55</option><option value="56">56</option><option value="57">57</option><option value="58">58</option><option value="59">59</option><option value="60">60</option><option value="61">61</option><option value="62">62</option><option value="63">63</option><option value="64">64</option><option value="65">65</option><option value="66">66</option><option value="67">67</option><option value="68">68</option><option value="69">69</option><option value="70">70</option><option value="71">71</option><option value="72">72</option><option value="73">73</option><option value="74">74</option><option value="75">75</option><option value="76">76</option><option value="77">77</option><option value="78">78</option><option value="79">79</option><option value="80">80</option><option value="81">81</option><option value="82">82</option><option value="83">83</option><option value="84">84</option><option value="85">85</option><option value="86">86</option><option value="87">87</option><option value="88">88</option><option value="89">89</option><option value="90">90</option><option value="91">91</option><option value="92">92</option><option value="93">93</option><option value="94">94</option><option value="95">95</option><option value="96">96</option><option value="97">97</option><option value="98">98</option><option value="99">99</option><option value="100">100</option></select> 到

<select name="weight_max">
<option value="0"></option>
<option value="40">40</option><option value="41">41</option><option value="42">42</option><option value="43">43</option><option value="44">44</option><option value="45">45</option><option value="46">46</option><option value="47">47</option><option value="48">48</option><option value="49">49</option><option value="50">50</option><option value="51">51</option><option value="52">52</option><option value="53">53</option><option value="54">54</option><option value="55">55</option><option value="56">56</option><option value="57">57</option><option value="58">58</option><option value="59">59</option><option value="60">60</option><option value="61">61</option><option value="62">62</option><option value="63">63</option><option value="64">64</option><option value="65">65</option><option value="66">66</option><option value="67">67</option><option value="68">68</option><option value="69">69</option><option value="70">70</option><option value="71">71</option><option value="72">72</option><option value="73">73</option><option value="74">74</option><option value="75">75</option><option value="76">76</option><option value="77">77</option><option value="78">78</option><option value="79">79</option><option value="80">80</option><option value="81">81</option><option value="82">82</option><option value="83">83</option><option value="84">84</option><option value="85">85</option><option value="86">86</option><option value="87">87</option><option value="88">88</option><option value="89">89</option><option value="90">90</option><option value="91">91</option><option value="92">92</option><option value="93">93</option><option value="94">94</option><option value="95">95</option><option value="96">96</option><option value="97">97</option><option value="98">98</option><option value="99">99</option><option value="100">100</option></select> 公斤
</td></tr>
	<tr><td align="right">所在行业：</td><td><select name="industry">
<option value=""></option>
<option value="A1">IT</option>
<option value="A2">メーカー</option>
<option value="A3">事務</option>
<option value="A4">金融</option>
<option value="A5">不動産</option>
<option value="A6">EC</option>
<option value="ZZ">无特别要求</option>
</select></td></tr>
	<tr><td align="center" colspan="2">
		<input type="submit" value="搜索">&nbsp;&nbsp;&nbsp;
		<input type="reset" value="重置">


</tbody></table>
<h3>相亲-检索条件设定</h3>
</body>
</html>