import React from 'react'
import {Link} from 'react-router-dom'
import logo from '../assets/dumbbell.svg'
import "../stylesheets/navBar.css"

function NavBar() {
return (
    <div className="nav-bar">
        <div className="logo-container">
            <img src={logo} alt="logo" className="logo" />
            <h1 className="title">Workout</h1>    
        </div>
        <ul className='links'>
            <li>
                <Link to="/">Panel <br/> Główny</Link>
            </li>
            <li>
                <Link to="/plans">Plany <br/> treningowe</Link>
            </li>
            <li>
                <Link to="/plans">Historia <br/> treningów</Link>
            </li>
        </ul>
    </div>
    );
}

export default NavBar;