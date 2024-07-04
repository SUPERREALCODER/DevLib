//importing depeendencies checked 
import express from "express";
import bodyParser from "body-parser";
import pg from "pg";
//defining the constant checked 
const app = express();
const port = 3000;

const db = new pg.Client({
  user: "postgres",
  host: "localhost",
  database: "world",
  password: "manashama_24",
  port: 5432,
});
//connecting to the database checked 
db.connect();
db.end();
//defining the middlewares checked 
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static("public"));
//defining the current user id and user need to changed for stroing in db 
