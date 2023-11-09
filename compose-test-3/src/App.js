import {useState} from "react";

export default function App() {
  const [text, setText] = useState("");
  const url = '/hello'
  const showText = () => {
    fetch(url,{
      method:"GET",
      headers: {
        'Content-Type': 'application/json'
      }
    })
    .then(res => res.json())
    .then(data => {
      setText(data.msg);
    })
  }

  return(
      <div>
        <h2>안녕</h2>
        <button onClick={showText}> 요청 </button>
        <h1>{text}</h1>
      </div>
  )
}