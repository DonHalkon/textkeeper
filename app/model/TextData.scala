package model

import play.api.libs.json.{Json, Writes}

case class TextData(title: String, text: String, createdBy: String)


object TextData {
  implicit val textDataWrites: Writes[TextData] = new Writes[TextData] {
    override def writes(textData: TextData) = Json.obj(
      "title" -> textData.text,
      "text" -> textData.text,
      "createdBy"-> textData.createdBy
    )
  }

  var list = Seq(
    new TextData("t1", "haha", "I'm"),
    new TextData("t2", "hehe", "you are")
  )
}

