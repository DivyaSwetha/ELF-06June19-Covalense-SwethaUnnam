/* var a=10;
console.log(a);
var b=a;
console.log(b);
b=20;
console.log(a);
console.log(b);
console.log("============");

var person={
name:'ram',
age:23,

};




console.log("P Name ="+person.name);
var person1=person;
console.log("p1 name is= "+person1.name);
person1.name='seetha';
console.log(" P name= "+person.name);
console.log("p1 name= "+person1.name);
 */




/* 
 var person={
    firstName:'ram',
    lastName:'m',
    eyeColor:'brown',
    age:23,

    getFullName:function(){
        return this.firstName+" "+this.lastName;
    },

    address: {
        city:'Bangalore',
        state:'Karnataka',
        pincode:560068
    },

    hobbies:['sleeping','watching tv']

 };

 console.log("firstName="+person.firstName);
 console.log("full name="+person.getFullName());
 console.log("City="+person.address.city);
 console.log("Hobbies="+person.hobbies);

 var library=[{id:1,name:'ram',marks:25},
                {id:2,name:'seetha',marks:25},
                {id:3,name:'lakshman',marks:25}];

                console.log("1st student is "+library[0]);
                console.log("Name of 1st student is "+library[0].name); */

               /*  var date= new Date();
                var date1=new Date(2019,07,12,15,27,20,0);
                var date2=new Date(1000);
                var date3=new Date("May 27,1997 04:20:03");
                console.log(date);
                console.log(date1);
                console.log(date2);
                console.log(date3); */




                var hobbies=['cricket','volleyBall','Ring'];
                document.getElementById('sports').innerHTML=hobbies;
                var person={
                            name:'ram',
                            age:22,
                            city:'Bangalore'

                };

                for(var i=0;i<hobbies.length;i++){          //for for array works
                    console.log("value = "+hobbies[i]);
                }

                for(var i=0;i<person.length;i++){           // for for object doesnt works
                    console.log("value = "+person[i]);
                }
                console.log("======for-each======");
                hobbies.forEach((val,index)=>{              //forEach for array works
console.log("value="+val);
console.log("Index="+index);

                });



                
              /*   person.forEach((val,index)=>{              //forEach for array doesnt work
                    console.log("value="+val);
                    console.log("Index="+index);
                    
                                    }); */

                                   /*  console.log("======for-of======");
                                    for(var val of hobbies){
                                        console.log('hobbies are: '+val);
                                    }

                                 /*    for(var val of person){
                                        console.log('person is: '+val);
                                    } */
                                    /* console.log("======for-in======");  // works for both arrays nad objects
                                    for(var index in hobbies){
console.log("hobbies= "+hobbies[index]);

                                    }
                                    for(var index in person){
                                        console.log("person= "+person[index]);
                          }


                                        
                          hobbies['test'] =4;
                        for(var value in hobbies)     {
                            console.log("hobbies= "+hobbies[value]);
                            
                        } */





                       /*  console.log("===for of loop===");
                        console.time("forof");
                        for(var i of hobbies){
                            var a=[];
                        }
console.timeEnd("forof");
console.log("for of ended");


console.log("===for in loop===");
console.time("forin");
for(var i in hobbies){
    var a=[];
}
console.timeEnd("forin");
console.log("for in ended"); */





/* function alertMessage(val,num){
    alert(`This is a named function value=${val} number=${num}`);
}
 */
/* (function(){
alert("This is IIFE");
}())

(function(){
    alert("This is IIFE111111");
    })(); */

   /*  alertMessage("aa",12); */
  
   /* function varKey(){
    console.log("a="+a);
  var a=20;


    }
    //console.log("a="+a);
    varKey();  */



/* function letKey(){
    let b=20;
    console.log("b="+b);
    
        }
        console.log("b="+b);

    function constKey(){
        const c=30;
        console.log("c="+c);
        
            }
            console.log("c="+c); */



/* fnName();
            function fnName(){
                console.log("aa");
            }

            var fnName1=function(){

                console.log("bb");
            };

            fnName1(); */


/* var a={};
console.log(typeof hobbies);
            console.log(Array.isArray(hobbies));
            console.log(Array.isArray(a)); */

/* 
            console.log(hobbies.includes('cricket'));

            hobbies.push("kabaddi");
        console.log(hobbies);

        hobbies.pop();
        console.log(hobbies);

        hobbies.shift();
        console.log(hobbies);

        hobbies.unshift("new value");
        console.log(hobbies); */


      /*   hobbies.splice(0,1,"aaaaa","bbbbb");
        console.log(hobbies); */

    /*    let slicing= hobbies.slice(1);
        console.log(slicing); */

        
   /*      console.log(hobbies.join('---')); */


              //  console.log(hobbies.indexOf('cricket'));


       /*        function first(sec){
                  setTimeout(()=>{
                    console.log("This is first");
                    sec();
                  });
                  
                  
              }
              function second(){

                console.log("This is second");
              }

              first(second); */


              /* const items=[{id:1,name:'book',price:200},
                            {id:2,name:'pen',price:100},
                            {id:3,name:'bag',price:600},
                            {id:4,name:'shirt',price:1000},
                            {id:5,name:'laptop',price:250000}];

                            console.log(items);

                          let mappedIds=  items.map((value)=>{
                                    return value.price;
                            });

                            console.log(mappedIds);

                        /*     let filteredValue=  items.filter((value)=>{
                                return value.name=='bag';
                        }); */

                      /*   let filteredValue=  items.filter((value)=>value.name=='bag');

                        console.log(filteredValue);  */

                        /* var a=10;
                        console.log(this);
                        console.log(window);
                        console.log(this.a);
                        console.log(window.a);
                        console.log(this===window); */


var person={

    name:'John Cena',
    age:25,
    getName:function(){
        console.log(this);
        function innerFunction(){
            console.log(this);
        }
        innerFunction();
    }
};
person.getName();

var john={
name:'john',
age:25,
presentation:function(style,message){
    if(style==='formal'){
        console.log("Hi "+this.name+' good'+message);
    }else{
        console.log('Hey '+this.name+' '+message);
    }
}


};
//john.presentation('formal','Morning');


var mike={

    name:'mike',
    age:26,

};

john.presentation.call(mike,'friendly','Evening');
john.presentation.apply(mike,['friendly','Evening']);
var johnFormal=john.presentation.bind(mike,'formal');
johnFormal('Night');



                     /*    var a=10;
                        function checkThis(){
                        console.log(this);
                        console.log(window);
                        console.log(this.a);
                        console.log(window.a);
                        console.log(this===window);
                        }

                        checkThis();
 */




 


              
             
              