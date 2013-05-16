package ericj.scalatra.todo.data

import ericj.scalatra.todo.models._

import java.util.concurrent.atomic.AtomicInteger

object TodoData {

	val idCounter = new AtomicInteger()

	var all = List(
			Todo(1, "Shampoo the cat"),
			Todo(2, "Wax the floor"),
			Todo(3, "Scrub the rug")
		)

	def remaining = all.filterNot(_.done).length

	def add( todo: Todo ): List[Todo] = {
		all = (todo :: all).sortWith((e1, e2) => (e1.id < e2.id))
		all
	}

	def newTodo(name: String) = Todo(idCounter.incrementAndGet, name)

}