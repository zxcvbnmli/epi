//创建并添加遮罩div
var zzDiv = document.createElement("div");
zzDiv.id = 'loading';
var zzImg = document.createElement("img");
zzImg.src = '/static/img/sys/loding.gif';
zzDiv.appendChild(zzImg);
var zzBr = document.createElement("br");
zzDiv.appendChild(zzBr);
var zzP = document.createElement("p");
zzP.innerText = '页面加载中...';
zzDiv.appendChild(zzP);

document.body.insertBefore(zzDiv, document.body.firstElementChild);

document.onreadystatechange = function(){
	if (document.readyState == "complete") {
		$("#loading").hide();
    }
}