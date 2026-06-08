let gyms, info;

async function init(){
    let link = "https://verbose-invention-4jv75qvrg96whqg7-8500.app.github.dev/"; //replace with your Dev URL
    let route= "gym";

    info = await fetch(link+route);
    gyms = await info.json();
    
    console.log(gyms);
    generateCards(gyms);

}

function generateCards(gyms){
  let build = "";
  let count = 0;

  for(let i = 0; i < gyms.length; i++){
    let gym = gyms[i];

    build += `<div class="card">
                <h3>Gym ID: ${gym.GymId}</h3>
                <h4>${gym.Name}</h4>
                <h5>
                  Price: ${gym.Price}<br>
                  Distance: ${gym.Distance}
                </h5>
              </div>`;

    count++;
  }
  document.getElementById("cardContainer").innerHTML = build;
}
//name search
function filterByName(){
  let name = document.getElementById("name").value;
  let gymList = []; 

  for(let i = 0; i < gyms.length; i++){
    let gym = gyms[i]; 


    if(gym.Name == name){
      gymList.push(gym);
    }
  }

  generateCards(gymList);
}

//gym Id search
function filterByGymId(){
  let gymid = document.getElementById("gymid").value;
  let gymList = [];

  for(let i = 0; i < gyms.length; i++){
    let gym = gyms[i];

    // convert both to string so comparison works
    if(gym.GymId.toString() == gymid){
      gymList.push(gym);
    }
  }

  generateCards(gymList);
}
//price search
function filterByPrice(){
  let price = document.getElementById("price").value;
  let gymList = [];

  for(let i = 0; i < gyms.length; i++){
    let gym = gyms[i];

    if(gym.Price.toString() == price){
      gymList.push(gym);
    }
  }

  generateCards(gymList);
}

//distance search
function filterByDistance(){
  let distance = document.getElementById("distance").value;
  let gymList = [];

  for(let i = 0; i < gyms.length; i++){
    let gym = gyms[i];

    if(gym.Distance.toString() == distance){
      gymList.push(gym);
    }
  }

  generateCards(gymList);
}

init();