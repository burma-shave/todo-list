package ericj.scalatra.todo.models


case class Todo(id: Integer, name: String, done: Boolean = false)