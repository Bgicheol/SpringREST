const addBtn = document.getElementById('add');
const modiBtn = document.getElementById('modi');

const addReq = new XMLHttpRequest();
addReq.addEventListener('readystatechange',(e) =>{
	if(e.target.readyState == 4){
	}
});

addBtn.addEventListener('click', (e) => {
  addReq.open('POST', './add');
  
  // send()에 데이터를 실어보낼 수 있다 (보통 JSON 형식의 문자열을 보낸다)
  
  // 자바 스크립트 객체를 JSON 형식 문자열로 변환하여 전송하기
  // ( 데이터들은 input 태그들에서 가져왔다고 가정)
  const emp = {
  	first_name:'민식',
  	last_name:'최',
  	salary:1234
  	};
  addReq.send(JSON.stringify(emp));
});

const modiReq = new XMLHttpRe

modiReq.addEventListener('readystatechange', (e) => {
	if (e.target.readyState==4) {
	// 서버쪽에서 응답해준 상태코드에 따라 로직 구성이 가능하다
	console.log('응답받은 상태코드:', e.target.status);
		switch (e.target.status) {
			case 200:
				console.log('정상적은 처리를 진행...');
				break;
			case 400:
				console.log('id가 틀려서 안됨');
				break;
			default:
				console.log('예상못한 상태코드');
				break;
		}
	}
});
modiBtn.addEventListener('click', (e) => {

	const data = {
		emplotee_id:107,
		first_name:'신수',
		last_name:'추'
	};
	modiReq.open('PUT', `/put/${data.employee_id}`);
	modiReq.setRequestHeader('content-type', 'application/json')
	modiReq.send(JSON.stringify(data));
});