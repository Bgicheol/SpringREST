

// JQuery로 해당 요소 선택하기
console.log($('#get2'));
console.log($('#add2'));
console.log($('#modi2'));

// JQuery로 이벤트 닫기

$('#add2').on('click',(e) => {
	// 이벤트 개겣도 JQuery만의 이벤트 객체가 나온다 (기본 자바스크립트와 다름)
	//console.dir(e);
	//console.dir(e.originalEvent); // 원래 이벤트 객체
	
	// JQuery로 ajax 요청 보내기
	
	const emp = {
  	first_name:'민호',
  	last_name:'송',
  	salary:3333
  	};
	
	$.ajax({
		url: './add',
		method: 'POST',
		data: JSON.stringify(emp),
		contentType: 'application/json',
		success: () => {
			console.log('add2 xhreq success(readyState4, status 200ok');
		}
	});
});

$('modi2').on('click', () => {

	$.ajax({
		url: './put/199',
		method: 'PUT',
		data: JSON.stringify({first_name: 'Mike', last_name:'Park'}),
		contentType: 'application/json',
		success: () => {
			console.log('ajax put xhreq success');			
		},
		statusCode: {
			404: () => {console.log('failed, 404 not found');},
			400: () => {console.log('failed, 400 bad request');}
		}
	})
});
// 데이터를 받을 때 (data, contentType이 생략되고 dataType을 사용)
$('#get2').on('click', () => {
	$.ajax({
		url: './roll',
		method: 'GET',
		dataType: 'json', // 받는 데이터의 타입
		success : (emps, state, xhttp) => {
			emps.forEach((emp) => {
				// document.createElement() + document.craeteTextNode()를 생략
				const newDiv = $(`<div id=${emp.employee_id}>${emp.first_name} ${emp.last_name}</div>`)
				$('#out').append(newDiv);
			});
		}
	});
});