package models

import sorm._

object DB extends Instance(entities = Seq(Entity[Person]()), url="jdbc:h2:men:person")


