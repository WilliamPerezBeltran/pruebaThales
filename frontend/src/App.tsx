import React from 'react';
import Button from '@mui/material/Button';
import './App.scss';

const App: React.FC = () => {
  return (
    <div className="app">
      <header className="app-header">
        <h1>Welcome to My Material Design App</h1>
        <Button variant="contained" color="primary">
          Material UI Button
        </Button>
      </header>
    </div>
  );
};

export default App;
