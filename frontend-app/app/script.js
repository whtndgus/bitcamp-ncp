const comment = {
  date: new Date(),
  text: 'I hope you enjoy learning React!',
  author: {
    name: 'Hello Kitty',
    avatarUrl: 'http://placekitten.com/g/64/64'
  }
};
function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}
  
function App() {
  return (
    <div>
      <Welcome name="Sara" />
      <Welcome name="Cahal" />
      <Welcome name="Edite" />
    </div>
  );
}

var catSelect = "";

const roots = ReactDOM.createRoot(document.getElementById('roots'));

$(".btn-1").click(() => {
  $(".body")[0].style = "background-color: bisque;";
  roots.render(
  <div id="root">
    <div className="insert-left">
      <h3>필수 입력항목</h3>
      <div className="input-group mb-3" style={{ height: 50, float: "left" }}>
        <span className="input-group-text" id="basic-addon1">
          제목
        </span>
        <input
          type="text"
          className="form-control insert-title"
          placeholder="글의 제목이 되는 부분으로 증상의 간단한 설명을 작성하십시오"
          aria-label="Username"
          aria-describedby="basic-addon1"
        />
      </div>
      <h5>증상 부위 또는 증상의 종류</h5>
      <div className="input-group mb-3" style={{ height: 38 }}>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>머리</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="머리"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>인후</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="인후"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>가슴</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="가슴"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>복부</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="복부"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>손,발</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="손발"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>팔</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="팔"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>하체</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="하체"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>허리</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="허리"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>두통</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="두통"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>흉통(가슴)</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="흉통"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>복통</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="복통"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>요통</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="요통"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>치통</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="치통"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상1</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상1"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상2</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상2"
            aria-label="Checkbox for following text input"
          />
        </div>
      </div>
      <div className="input-group mb-3">
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상4</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상4"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상5</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상5"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상6</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상6"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상7</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상7"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상8</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상8"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상"
            aria-label="Checkbox for following text input"
          />
        </div>
        <div className="input-group-text">
          <span className="font12" style={{marginRight:2}}>증상</span>
          <input
            className="form-check-input mt-0"
            type="checkbox"
            defaultValue="증상"
            aria-label="Checkbox for following text input"
          />
        </div>
        <input
          type="text"
          className="form-control"
          placeholder="기타문항"
          aria-label="Text input with checkbox"
        />
      </div>
      <h3>추가 입력항목</h3>
      <div className="input-group mb-3" style={{ width: 200, float: "left" }}>
        <span className="input-group-text" id="basic-addon1">
          이름
        </span>
        <input
          type="text"
          className="form-control insert-name"
          placeholder="이름"
          aria-label="Username"
          aria-describedby="basic-addon1"
        />
      </div>
      <div className="input-group mb-3" style={{ marginLeft: 20, width: 120, float: "left" }}>
        <span className="input-group-text" id="basic-addon1">
          나이
        </span>
        <input
          type="text"
          className="form-control insert-age"
          placeholder="대략"
          aria-label="Username"
          aria-describedby="basic-addon1"
        />
      </div>
      <div className="input-group mb-3" style={{ marginLeft: 20, width: 200, float: "left" }}>
        <span className="input-group-text" id="basic-addon1">
          연락처
        </span>
        <input
          type="text"
          className="form-control insert-tel"
          placeholder="연락처"
          aria-label="Username"
          aria-describedby="basic-addon1"
        />
      </div>

      <div className="form-check form-check-inline" style={{ padding: 0, lineHeight: 2, with: 40, height:40, marginLeft: 20, float: "left" }}>
        <input
          type="radio"
          name="inlineRadioOptions"
          id="inlineRadio1"
          defaultValue="남"
          defaultChecked="checked"
        />
        <label className="form-check-label" htmlFor="inlineRadio1">
          남
        </label>
      </div>
      <div className="form-check form-check-inline" style={{ padding: 0, lineHeight: 2, with: 40, height:40, marginLeft: 0, float: "left" }}>
        <input
          type="radio"
          name="inlineRadioOptions"
          id="inlineRadio2"
          defaultValue="여"
        />
        <label className="form-check-label" htmlFor="inlineRadio2">
          여
        </label>
      </div>

      <div className="input-group mb-3" style={{ marginLeft: 10, width: 390, float: "left" }}>
        <span className="input-group-text" id="basic-addon1">
          비밀번호
        </span>
        <input
          type="password"
          className="form-control insert-password"
          placeholder="비회원의 경우 이후에 작성글 조회시에 필요합니다"
          aria-label="Username"
          aria-describedby="basic-addon1"
        />
      </div>
      <div className="input-group mb-3" style={{ marginLeft: 0, width: 500, float: "left" }}>
        <span className="input-group-text" id="basic-addon1">
          주소
        </span>
        <input
          type="text"
          className="form-control insert-addr1"
          placeholder="새주소?"
          aria-label="Username"
          aria-describedby="basic-addon1"
        />
      </div>
      <div className="input-group mb-3" style={{ width: 700, float: "left" }}>
        <span className="input-group-text" id="basic-addon1">
          상세주소
        </span>
        <input
          type="text"
          className="form-control insert-addr2"
          placeholder="예: xxx동 xxx호"
          aria-label="Username"
          aria-describedby="basic-addon1"
        />
      </div>
      <div className="input-group" style={{ height: 150 }}>
        <span className="input-group-text">
          그 외<br />
          전달사항
        </span>
        <textarea
          className="form-control insert-another"
          aria-label="With textarea"
          defaultValue={""}
        />
      </div>
      <div className="insert-btns">
      <button type="button" className="btn btn-primary insert-btn" onClick={() => {
        // 저장버튼 툴린후에 발생할 코드 입력 필요
        let pa = "";
        let vaol = $(".form-check-input:checked");
        for(let i = 0;i<vaol.length;i++){
          if(vaol[i].value.length > 0){
            pa = pa + (vaol[i].value);
            if(i != vaol.length-1){
              pa = pa + ",";
            }
          }
        }
        
        fetch('http://192.168.0.7:8080/insert', {
          method: 'POST', // 또는 'PUT'
          headers: {
            'Content-Type': 'application/json',
          },
          body: JSON.stringify({ // 스프링에 전달할 값
            title: $(".insert-title").val(),
            pain: pa,
            name: $(".insert-name").val(),
            age: $(".insert-age").val(),
            tel: $(".insert-tel").val(),
            addr1: $(".insert-addr1").val(),
            addr2: $(".insert-addr2").val(),
            anothr: $(".insert-another").val(),
            password: $(".insert-password").val(),
            gender: $("input[name=inlineRadioOptions]:checked").val(),
          }),
        })
        // .then((response) => response.json())
        // .then((data) => console.log(data));
        $("#root").fadeOut(400)
        setTimeout(() => {
          roots.render(
            );
        }, 400);
      }}>
        저장
      </button>
      <button type="button" className="btn btn-primary close-btn" onClick={() => {
        // 취소버튼 툴린후에 발생할 코드 입력 필요
        $("#root").fadeOut(400)
        setTimeout(() => {
          roots.render(
            );
        }, 400);
      }}> 
        취소
      </button>
    </div>
    </div>
  </div>
  );
})
$(".btn-2").click(() => {
  $(".body")[0].style = "background-color: rgb(219, 255, 119);";
  roots.render(
      <div id="root">
      <div className="insert-left">
        <h3>검색</h3>
        <div className="input-group mb-3" style={{ height: 50, float: "left" }}>
          <input
            type="text"
            className="form-control insert-title"
            placeholder="이용자 분들의 질문을 기반으로 의료 전문가들이 삼담 또는 진단한 내용을 찾아볼 수 있습니다"
            aria-label="Username"
            aria-describedby="basic-addon1"
          />
          <button className="btn btn-dark" type="submit">
            검색
          </button>
        </div>
        <div
          className="input-group"
          style={{ width: 950, float: "left", marginLeft: 5 }}
        >
          <input
            type="text"
            className="form-control search-tags"
            defaultValue=""
            aria-label="Username"
            aria-describedby="addon-wrapping"
          />
        </div>
        <input
          type="button"
          className="btn btn-primary"
          defaultValue="검색 옵션 추가"
          style={{ width: 135, float: "right", marginRight: 5 }}
          onClick={() => {   // 검색 창에서 Tag 선택 버튼 클릭시 액션
            ReactDOM.createRoot(document.getElementById('new-windows')).render(
              <div className="new-window scroll">
                <div className="new-window-tag">머리</div>
                <div className="new-window-tag">인후</div>
                <div className="new-window-tag">가슴</div>
                <div className="new-window-tag">복부</div>
                <div className="new-window-tag">손발</div>
                <div className="new-window-tag">팔</div>
                <div className="new-window-tag">하체</div>
                <div className="new-window-tag">두통</div>
                <div className="new-window-tag">흉통</div>
                <div className="new-window-tag">복통</div>
                <div className="new-window-tag">요통</div>
                <div className="new-window-tag">치통</div>
                <div className="new-window-tag">증상1</div>
                <div className="new-window-tag">증상2</div>
                <div className="new-window-tag">증상3</div>
                <div className="new-window-tag">증상4</div>
                <div className="new-window-tag">증상5</div>
                <div className="new-window-tag">증상6</div>
                <div className="new-window-tag">증상7</div>
                <div className="new-window-tag">증상8</div>
                <div className="new-window-tag">증상9</div>
                <div className="new-window-tag">증상10</div>
                <div className="new-window-tag">증상11</div>
                <div className="new-window-tag">증상12</div>
                <div className="new-window-tag">증상13</div>
                <div className="new-window-tag">증상14</div>
                <div className="new-window-tag">증상15</div>
                <div className="new-window-tag">증상16</div>
                <div className="new-window-tag">증상17</div>
                <div className="new-window-tag">증상18</div>
                <div className="new-window-tag">증상19</div>
                <div className="new-window-tag">증상20</div>
                <div className="new-window-tag">증상21</div>
                <div className="new-window-close" 
                  onClick={() => {
                    ReactDOM.createRoot(document.querySelector("#new-windows")).render()
                  }}>닫기</div>
              </div>
            );
            setTimeout(() => {
              ref();
            }, 1);
          }}
        />
      </div>
      <div id="search-list" className="scroll">
        <div className="list-group">
          <a href="#" className="list-group-item list-group-item-action">
            <div className="d-flex w-100 justify-content-between">
              <h5 className="mb-1 fw-bold">작성글 예시 - I</h5>
              <small className="text-muted">2개월 전</small>
            </div>
            <p className="mb-1">
              연소자의 근로는 특별한 보호를 받는다. 국가는 청원에 대하여 심사할
              의무를 진다.
            </p>
          </a>
          <a href="#" className="list-group-item list-group-item-action">
            <div className="d-flex w-100 justify-content-between">
              <h5 className="mb-1 fw-bold">작성글 예시 - II</h5>
              <small className="text-muted">1년 전</small>
            </div>
            <p className="mb-1 ">
              근로자는 근로조건의 향상을 위하여 자주적인 단결권·단체교섭권 및
              단체행동권을 가진다.
            </p>
          </a>
          <a href="#" className="list-group-item list-group-item-action">
            <div className="d-flex w-100 justify-content-between">
              <h5 className="mb-1 fw-bold">작성글 예시 - III</h5>
              <small className="text-muted">4년 전</small>
            </div>
            <p className="mb-1">
              국정의 중요한 사항에 관한 대통령의 자문에 응하기 위하여 국가원로로
              구성되는 국가원로자문회의를 둘 수 있다.
            </p>
          </a>
          <a href="#" className="list-group-item list-group-item-action">
            <div className="d-flex w-100 justify-content-between">
              <h5 className="mb-1 fw-bold">작성글 예시 - IIII</h5>
              <small className="text-muted">2개월 전</small>
            </div>
            <p className="mb-1">
              연소자의 근로는 특별한 보호를 받는다. 국가는 청원에 대하여 심사할
              의무를 진다.
            </p>
          </a>
          <a href="#" className="list-group-item list-group-item-action">
            <div className="d-flex w-100 justify-content-between">
              <h5 className="mb-1 fw-bold">작성글 예시 - IIIII</h5>
              <small className="text-muted">1년 전</small>
            </div>
            <p className="mb-1 ">
              근로자는 근로조건의 향상을 위하여 자주적인 단결권·단체교섭권 및
              단체행동권을 가진다.
            </p>
          </a>
          <a href="#" className="list-group-item list-group-item-action">
            <div className="d-flex w-100 justify-content-between">
              <h5 className="mb-1 fw-bold">작성글 예시 - IIIIII</h5>
              <small className="text-muted">4년 전</small>
            </div>
            <p className="mb-1">
              국정의 중요한 사항에 관한 대통령의 자문에 응하기 위하여 국가원로로
              구성되는 국가원로자문회의를 둘 수 있다.
            </p>
          </a>
        </div>
      </div>
    </div>
  

  );
})
$(".btn-3").click(() => {
  $(".body")[0].style = "background-color: rgb(0, 129, 129);";
  roots.render(
  );
})

function ref() {
  console.log($(".new-window-tag"))
  $(".new-window-tag").click((e) => {
    if(!$(".search-tags").val().includes(e.target.innerText)){
      $(".search-tags").val($(".search-tags").val() + " " + "#" + e.target.innerText+",")
    }
  });
}



function formatDate(date) {
  return date.toLocaleDateString();
}

function Comment(props) {
  return (
    <div className="Comment">
      <div className="UserInfo">
        <img className="Avatar"
             src={props.author.avatarUrl}
             alt={props.author.name} />
        <div className="UserInfo-name">
          {props.author.name}
        </div>
      </div>
      <div className="Comment-text">
        {props.text}
      </div>
      <div className="Comment-date">
        {formatDate(props.date)}
      </div>
    </div>
  );
}


$(".new-window-close").click(() => {
  $(".new-windows")[0].innerHTML = "";
})

// FB.getLoginStatus(function(response) {
//   statusChangeCallback(response);
// });


