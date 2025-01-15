// API criada em node json para os exercicios 3 e 4 simulando um retorno json 

const express = require('express');
const http = require('http');
const cors = require('cors');
const path = require('path');

const app = express();

 
app.use(express.json({limit : '2mb'}), cors());

const server = http.createServer(app);


app.get("/dadosFtaturamentoDiarioDistribuidora" , (req , res )=> {

return res.json( {

        "1" : 1000 ,
        "2" : 2000 ,
        "3" : 4000 ,
        "4" : 500 ,
        "5" : 1900 ,
        "6" : 2000 ,
        "7" : 1000 ,
        "8" : 8000 ,
        "9" : 0 ,
        "10" : 200,
        "11" : 400 ,
        "12" : 1000,
        "13" : 0 ,
        "14": 10000 ,
        "15" : 700
      });
});


// ---------------------------------
server.listen(3000  , '192.168.0.114' ,  ()=>{
	console.log("porta sendo lista");
}).on( 'error' , (error)=>{
	console.log('error ',error);
});
