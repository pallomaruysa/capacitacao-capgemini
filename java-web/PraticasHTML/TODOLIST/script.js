let inpuntBackColor = document.getElementById("labelColor");
//inpuntBackColor.style.color="red";

let titleBackgroud = document.querySelector("#labelColor");
//titleBackgroud.style.background="red";

let titleBackgroud = document.querySelector("h1");

function setBackgroundTitle(value){
    console.log(value);
    //console.log(event.target.value);
    titleBackgroud.style.backgroundColor = value;
}
