let trainers, info;

async function init(){
    let link = "https://verbose-invention-4jv75qvrg96whqg7-8500.app.github.dev/"; //replace with your Dev URL
    let route= "trainer";

    info = await fetch(link+route);
    trainers = await info.json();
    
    console.log(trainers);
    generateCards(trainers);

}

function generateCards(trainers){
  let build = "";
  let count = 0;

  for(let i = 0; i < trainers.length; i++){
    let trainer = trainers[i];

    build += `<div class="card">
                <h3>Trainer ID: ${trainer.TrainerId}</h3>
                <h4>${trainer.Name}</h4>
                <h5>
                  Specialty: ${trainer.Specialty}<br>
                  Price: ${trainer.Price}
                </h5>
              </div>`;

    count++;
  }
  document.getElementById("cardContainer").innerHTML = build;
}
//name search
function filterByName(){
  let name = document.getElementById("name").value;
  let trainerList = []; 

  for(let i = 0; i < trainers.length; i++){
    let trainer = trainers[i]; 


    if(trainer.Name == name){
      trainerList.push(trainer);
    }
  }

  generateCards(trainerList);
}

//gym Id search
function filterByTrainerId(){
  let trainerid = document.getElementById("trainerid").value;
  let trainerList = [];

  for(let i = 0; i < trainers.length; i++){
    let trainer = trainers[i];

    // convert both to string so comparison works
    if(trainer.TrainerId.toString() == trainerid){
      trainerList.push(trainer);
    }
  }

  generateCards(trainerList);
}

//distance search
function filterBySpecialty(){
  let specialty = document.getElementById("specialty").value;
  let trainerList = [];

  for(let i = 0; i < trainers.length; i++){
    let trainer = trainers[i];

    if(trainer.Specialty.toString() == specialty){
      trainerList.push(trainer);
    }
  }

  generateCards(trainerList);
}
//price search
function filterByPrice(){
  let price = document.getElementById("price").value;
  let trainerList = [];

  for(let i = 0; i < trainers.length; i++){
    let trainer = trainers[i];

    if(trainer.Price.toString() == price){
      trainerList.push(trainer);
    }
  }

  generateCards(trainerList);
}
init();