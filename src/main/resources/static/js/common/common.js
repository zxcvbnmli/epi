$.ajaxSetup({
	dataType: "json",
	cache: false,
	timeout : 15000,
    complete: function(xhr) {
		if(xhr.status == 401){
			window.parent.location.href = "/login";
		}else if(xhr.status == 403){
			alert("权限不足");
		}
    }
});

$(function(){
	var layer = layui.layer;
	layer.config({
		skin: 'layui-layer-molv'
	})
})

function zuploadFile(url, data, fileMap, onSuccess, onError, onProgress){
	var formData = new FormData();
	for(key in data){
		formData.append(key, data[key]);
	}
	for(filename in fileMap){
		var file = document.getElementById(fileMap[filename]);
		var files = null;
		if(file.type === 'text'){	//可能是个easyui组件,自动查找file对象
			files = $(file).next('span').find('input[type="file"]')[0].files;
		}else{
			files = file.files;
		}
		for(var i = 0; i < files.length; i++){
			console.log(files[i]);
			formData.append(filename, files[i]);
		}
	}
	var xhr = new XMLHttpRequest();
	xhr.open("post", url);
	xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
	xhr.withCredentials = true;
	if(onProgress){
		xhr.upload.onprogress=onProgress;
	}
	xhr.send(formData);
	if(onError){
		xhr.onerror = onError;
	}
	xhr.onload=function(){
		if(xhr.status == 200){
			var re = eval('('+xhr.response+')');
			onSuccess(re);
		}else if(xhr.status == 401){
			window.parent.location.href = "/login";
		}else{
			if(onError){
				onError(xhr);
			}
		}
	}
}
