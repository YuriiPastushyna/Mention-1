/* eslint-disable indent */
import React, { Component, Fragment } from 'react'
import './css/index.css'
import { Route, Switch } from 'react-router-dom'
import Profile from './components/Profile'
import Messages from './components/Messages'
import CreatePost from './components/CreatePost'
import Favorites from './components/Favorites'
import HomePage from './components/HomePage'
import NotFound from './components/NotFound'
import Login from './components/Login'
import Registration from './components/Registration'
import UserPage from './components/UserPage'

class App extends Component {
  render() {
    return (
      <Fragment>
        <Switch>
          <Route exact path='/' component={HomePage}/>
          <Route path='/messages' component={Messages}/>
          <Route path="/login" component={Login}/>
          <Route path="/registration" component={Registration}/>
          <Route path='/profile' component={Profile}/>
          <Route path='/createPost' component={CreatePost}/>
          <Route path='/favorites' component={Favorites}/>
          <Route path='/:username' component={UserPage}/>
          <Route path="*" component={NotFound}/>
        </Switch>
      </Fragment>
    )
  }
}

export default App