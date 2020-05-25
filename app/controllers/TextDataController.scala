package controllers

import javax.inject._
import model.TextData
import play.api.libs.json.Json
import play.api.mvc.{BaseController, ControllerComponents}

@Singleton
class TextDataController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def texts() = Action {
    val json = Json.toJson(TextData.list)
    Ok(json)
  }
}
