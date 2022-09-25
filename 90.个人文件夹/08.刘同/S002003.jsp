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
	<tr><td align="right" nowrap="">省份/地区：</td><td>
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
<option value="91">亚洲</option>
<option value="92">欧洲</option>
<option value="93">北美洲</option>
<option value="94">拉丁美洲</option>
<option value="95">非洲</option>
<option value="96">大洋洲</option>
</select>
<input name="city" value="9117" type="hidden">
</td></tr>
<tr><td align="right" nowrap="">日本所在城市：</td><td>
<select name="province" style="WIDTH:90px" onchange="loadcity(this.value,&quot;&quot;);">
<option value=""></option>
<option value="11">东京</option>
<option value="31">东京以外</option>
	<tr><td align="right">婚姻状况：</td><td><select name="marriage">
<option value=""></option>
<option value="A">未婚</option>
<option value="B">离异</option>
<option value="C">丧偶</option>
</select></td></tr>
	<tr><td align="right">学历：</td><td><select name="education">
<option value=""></option>
<option value="A">语言学校</option>
<option value="B">专门学校</option>
<option value="C">短大</option>
<option value="D">大学</option>
<option value="E">硕士</option>
<option value="F">博士及以上</option>
</select><input type="checkbox" name="educationup" value="yes">以上</td></tr>
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
	<tr><td align="right">相貌：</td><td><select name="facelook">
<option value=""></option>
<option value="A">不太好看</option>
<option value="B">马马虎虎</option>
<option value="C">中等水平</option>
<option value="D">挺不错的</option>
<option value="E">漂亮英俊</option>
<option value="F">倾国倾城</option>
</select></td></tr>
	<tr><td align="right">年收入（日元）：</td><td><select name="income">
<option value=""></option>
<option value="A">不到360万</option>
<option value="B">360~500万</option>
<option value="C">500~800万</option>
<option value="D">800~1000万</option>
<option value="E">1000~1500万</option>
<option value="F">1500~2000万</option>
<option value="G">2000万以上</option>
</select><input type="checkbox" name="incomeup" value="yes">以上</td></tr>
	<tr><td align="right">个人财产：</td><td><select name="estate">
<option value=""></option>
<option value="A">5万以下</option>
<option value="B">5-10万</option>
<option value="C">10-20万</option>
<option value="D">20-50万</option>
<option value="E">50-100万</option>
<option value="F">100-200万</option>
<option value="G">200-500万</option>
<option value="H">500万以上</option>
</select></td></tr>
	<tr><td align="right">所在行业：</td><td><select name="industry">
<option value=""></option>
<option value="A1">IT</option>
<option value="A2">メーカー</option>
<option value="A3">事務</option>
<option value="A4">金融</option>
<option value="A5">不動産</option>
<option value="A6">EC</option>
<option value="ZZ">其他服务</option>
</select></td></tr>
	<tr><td align="right">职业/职位：</td><td><select name="jobtitle">
<option value=""></option>
<option value="A1">代表取締役</option>
<option value="A2">取締役</option>
<option value="A3">部長</option>
<option value="A4">課長</option>
<option value="A5">一般社員</option>
<option value="ZZ">其他</option>
</select></td></tr>
	<tr><td align="right">体形/身材：</td><td><select name="bodylook">
<option value=""></option>
<option value="A">偏瘦</option>
<option value="B">苗条</option>
<option value="C">匀称</option>
<option value="D">丰满</option>
<option value="E">偏胖</option>
<option value="F">肥胖</option>
</select></td></tr>
	<tr><td align="right">子女情况：</td><td><select name="child">
<option value=""></option>
<option value="A">无子女</option>
<option value="B">有子女</option>
<option value="C">和子女不在一起</option>
</select></td></tr>
	<tr><td align="right">健康状况：</td><td><select name="health">
<option value=""></option>
<option value="A">运动健将</option>
<option value="B">结实健壮</option>
<option value="C">身体健康</option>
<option value="D">体质一般</option>
<option value="E">体弱多病</option>
<option value="F">身体残疾</option>
</select></td></tr>
	<tr><td align="right">事业评价：</td><td><select name="career">
<option value=""></option>
<option value="A">尚未起步</option>
<option value="B">一事无成</option>
<option value="C">不算成功</option>
<option value="D">比较满意</option>
<option value="E">事业有成</option>
<option value="F">非常成功</option>
</select></td></tr>
	<tr><td align="right">星座：</td><td><select name="xingzuo">
<option value=""></option>
<option value="A">魔羯</option>
<option value="B">水瓶</option>
<option value="C">双鱼</option>
<option value="D">白羊</option>
<option value="E">金牛</option>
<option value="F">双子</option>
<option value="G">巨蟹</option>
<option value="H">狮子</option>
<option value="I">处女</option>
<option value="J">天秤</option>
<option value="K">天蝎</option>
<option value="L">射手</option>
</select></td></tr>
	<tr><td align="right">属相：</td><td><select name="shuxiang">
<option value=""></option>
<option value="M">都行</option>
<option value="A">鼠</option>
<option value="B">牛</option>
<option value="C">虎</option>
<option value="D">兔</option>
<option value="E">龙</option>
<option value="F">蛇</option>
<option value="G">马</option>
<option value="H">羊</option>
<option value="I">猴</option>
<option value="J">鸡</option>
<option value="K">狗</option>
<option value="L">猪</option>
</select></td></tr>
	<tr><td align="right">血型：</td><td><select name="blood">
<option value=""></option>
<option value="O">Ｏ型</option>
<option value="A">Ａ型</option>
<option value="B">Ｂ型</option>
<option value="C">ＡＢ型</option>
</select></td></tr>
	<tr><td align="right">民族：</td><td><select name="nation">
<option value=""></option>
<option value="A1">汉族</option>
<option value="ZZ">其它</option>
</select></td></tr>
	<tr><td align="center" colspan="2">
		<input type="submit" value="搜索">&nbsp;&nbsp;&nbsp;
		<input type="reset" value="重置">
	</td></tr>


<input type="hidden" name="nickname" value="">
<input type="hidden" name="school" value="">

<input type="hidden" name="nationality" value="">
<input type="hidden" name="language" value="">
<input type="hidden" name="faith" value="">
<input type="hidden" name="homeplace" value="">
<input type="hidden" name="household" value="">
<input type="hidden" name="residence" value="">
<input type="hidden" name="housework" value="">
<input type="hidden" name="cooking" value="">
<input type="hidden" name="exercise" value="">
<input type="hidden" name="reading" value="">
<input type="hidden" name="smoke" value="">
<input type="hidden" name="drink" value="">
<input type="hidden" name="shopping" value="">
<input type="hidden" name="taste" value="">
<input type="hidden" name="meat" value="">
<input type="hidden" name="xingge" value="">
<input type="hidden" name="tolove" value="">
<input type="hidden" name="careerfamily" value="">
<input type="hidden" name="relation" value="">
<input type="hidden" name="tochild" value="">
<input type="hidden" name="topet" value="">
<input type="hidden" name="humor" value="">
<input type="hidden" name="selflook" value="">
<input type="hidden" name="sexy" value="">
<input type="hidden" name="temper" value="">
<input type="hidden" name="fun" value="">
<input type="hidden" name="relax" value="">
<input type="hidden" name="sport" value="">
<input type="hidden" name="movie" value="">
<input type="hidden" name="television" value="">
<input type="hidden" name="dating" value="">
<input type="hidden" name="newspaper" value="">
<input type="hidden" name="magazine" value="">
<input type="hidden" name="fastfood" value="">
<input type="hidden" name="likedrink" value="">
<input type="hidden" name="cmeal" value="">
<input type="hidden" name="wmeal" value="">

</tbody></table>