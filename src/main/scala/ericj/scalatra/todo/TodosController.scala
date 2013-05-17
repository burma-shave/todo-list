package ericj.scalatra.todo

import org.scalatra._
import scalate.ScalateSupport

import models._
import data._
import commands._


class TodosController extends TodoListStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

  get("/todos/:id") {
    TodoData.all find (_.id == params("id").toInt) match {
      case Some(todo) => todo
      case None => halt(404)
    }
  }
  
}
