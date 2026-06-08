let workouts, info;

async function init(){
    let link = "https://verbose-invention-4jv75qvrg96whqg7-8500.app.github.dev/"; //replace with your Dev URL
    let route= "workout";

    info = await fetch(link+route);
    workouts = await info.json();
    
    console.log(workouts);
    generateCards(workouts);

}

function generateCards(workouts){
  let build = "";
  let count = 0;

  for(let i = 0; i < workouts.length; i++){
    let workout = workouts[i];

    build += `<div class="card">
                <h3>Workout ID: ${workout.WorkoutId}</h3>
                <h4>${workout.Name}</h4>
                <h5>
                  Difficulty: ${workout.Difficulty}<br>
                  Duration: ${workout.Duration}
                </h5>
              </div>`;

    count++;
  }
  document.getElementById("cardContainer").innerHTML = build;
}
//name search
function filterByName(){
  let name = document.getElementById("name").value;
  let workoutList = []; 

  for(let i = 0; i < workouts.length; i++){
    let workout = workouts[i]; 


    if(workout.Name == name){
      workoutList.push(workout);
    }
  }

  generateCards(workoutList);
}

//gym Id search
function filterByWorkoutId(){
  let workoutid = document.getElementById("workoutid").value;
  let workoutList = [];

  for(let i = 0; i < workouts.length; i++){
    let workout = workouts[i];

    // convert both to string so comparison works
    if(workout.WorkoutId.toString() == workoutid){
      workoutList.push(workout);
    }
  }

  generateCards(workoutList);
}

//distance search
function filterByDifficulty(){
  let difficulty = document.getElementById("difficulty").value;
  let workoutList = [];

  for(let i = 0; i < workouts.length; i++){
    let workout = workouts[i];

    if(workout.Difficlty.toString() == difficulty){
      workoutList.push(workout);
    }
  }

  generateCards(workoutList);
}
//price search
function filterByDuration(){
  let duration = document.getElementById("duration").value;
  let workoutList = [];

  for(let i = 0; i < workouts.length; i++){
    let workout = workouts[i];

    if(workout.Duration.toString() == duration){
      workoutList.push(workout);
    }
  }

  generateCards(workoutList);
}
init();