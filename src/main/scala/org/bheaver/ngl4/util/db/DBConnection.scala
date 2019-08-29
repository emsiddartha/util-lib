package org.bheaver.ngl4.util.db

import com.typesafe.scalalogging.Logger
import org.bheaver.ngl4.util.conf.{DBSettings}
import org.mongodb.scala.{MongoClient, MongoClientSettings, MongoDatabase, ServerAddress}
import org.bheaver.ngl4.util.db.Helpers._

import scala.collection.JavaConverters._
class DBConnection(val dbSettings: DBSettings){
  private val mongoClientSettings: MongoClientSettings = MongoClientSettings.builder().applyToClusterSettings(b => b.hosts(dbSettings.mongoCluster.map(host => new ServerAddress(host)).asJava)).build()
  private val mongoClient: MongoClient = MongoClient(mongoClientSettings)

  val logger = Logger("DBConnection")

  private val databasesToConnect: Seq[(String, String)] = mongoClient.getDatabase("master")
    .getCollection("masterLibraryAccessInfo")
    .find()
    .results
    .map(document => (document.getString("config_libraryCode"), document.getString("config_databaseName")))

  private val validDatabases: Seq[String] = mongoClient.listDatabaseNames().results()

  private val theMap: Map[String, MongoDatabase] = databasesToConnect.filter(tuple => validDatabases.contains(tuple._2)).map(tuple => (tuple._1,mongoClient.getDatabase(tuple._2))).toMap

  def getDatabase(libCode: String): MongoDatabase = theMap(libCode)
}
object DBConnection {

  def apply(dbSettings: DBSettings): DBConnection = new DBConnection(dbSettings)


}
