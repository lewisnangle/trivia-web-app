import './App.css';
import {BrowserRouter as Router,Switch,Route} from 'react-router-dom';
import Nav from './Nav.js';
import React, {useState,useEffect} from 'react';
import Categories from './Categories.js';




const Home = () => {

  return(
    <div>
      <h1>Home</h1>
    </div>
  )

}

function App() {

  const [categories,setCategories] = useState([
    {id : '',
    name : ''}
    ]);

  useEffect(() => {
  fetchCategories();
  },[])

  const fetchCategories = async () => {
      const data = await fetch(`http://localhost:8080/api/categories`);
      const json = await data.json();
      console.log(json)
      setCategories(json);
    }

  return (

      <Router>
        <div className = "App">
        <Nav/>
        <Switch>
        <Route path = "/" exact component = {Home}/>
        <Route path = "/categories" exact render = {() => (
          <Categories categories = {categories} />)}/>
        </Switch>
        </div>
      </Router>
  );
}

export default App;
