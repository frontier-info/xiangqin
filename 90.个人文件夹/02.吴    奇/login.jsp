<%@ page language= "java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<form>

<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
      
<div>
    <label for="uid">用户ID:</label>
    <input type="text" id="name" name="name">
</div>

<div>
    <label for="uname">用户名:</label>
    <input type="text" id="name" name="name">
</div>

<div>

<input type="radio" name="sex" value="male">男<br>
<input type="radio" name="sex" value="female">女

          
</div>

<div>
    <label for="birth_date">label>
    <input type="text" id="birth_date" name="birth_date">        
</div>

<div>
    <label for="birth_palace">出生地:</label>
    <input type="text" id="birth_palace" name="birth_palace">        
</div>


<div>
    <label for="address">住所:</label>
    <input type="text" id="address" name="address">
          
</div>

<div>
    <label for="profession">职业:</label>
    <input type="text" id="profession" name="profession">
</div>

<div>
    <label for="interest">兴趣:</label>
    <input type="text" id="nterest" name="nterest">
</div>

<div>
    <label for="uheight">身高:</label>
    <input type="text" id="uheight" name="uheight">
</div>

<div>
    <label for="uweight">体重:</label>
    <input type="text" id="uweight" name="uweight">
</div>

<div>
    <label for="introduce">自我介绍:</label>
    <input type="text" id="introduce" name="introduce">
</div>


<div>
    <label for="uimages">上传照片:</label>
    <input type="text" id="uimages" name="uimages">
</div>

<div>
    <label for="identification_photo">上传照片:</label>
    <input type="text" id="identification_photo" name="identification_photo">
  
  
 </div>  
     <input type="file">
    <div class="avator">
        <img src="./avator.jpg" alt="">
    
</div>

<input type="submit" value="上传">
</body>
</html>

</form>