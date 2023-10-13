import React from 'react';
import { Route, BrowserRouter, Routes } from 'react-router-dom';
import NavBar from './components/NavBar';
import "./stylesheets/main.css"

export default function App() { 
  return (
  <BrowserRouter>
    <NavBar/> 
    <Routes>
    </Routes>
  </BrowserRouter>
  );
}
