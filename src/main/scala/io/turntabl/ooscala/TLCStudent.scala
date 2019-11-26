package io.turntabl.ooscala

import java.time.LocalDate

import io.turntabl.grades.Grade

abstract class TurntablEmployee extends AccessCard {
  def GetWorkload : String
  def termOfService: Int
  val hasAccessCard: Boolean = true
}

class TLCStudent  (val fname: String,
                  val sname: String,
                  val id: Int=1011,
                  yearStarted: Int,
                  val roleDescription : String = "developer",
                  val githubURL: String = "http://github.com/turntabl")
  extends TurntablEmployee {

  override def GetWorkload = "A TLCStudent works super hard "
  override def toString = s"$fname $sname started in the year $yearStarted as a $roleDescription"
  def termOfService : Int = LocalDate.now().getYear - yearStarted
  val TopGrade: Grade = Grade("Programming_Fundamentals", 88.3)
  def hasSameTermOfService_? ( student: TLCStudent): Boolean = termOfService == student.termOfService
  //def TopGrade(subject : String, grade : Double) = Grade(subject, grade)
}
class TurntablManager extends TurntablEmployee{}


object TLCStudent{
  def apply(fname: String, sname: String, yearStarted: Int, id: Int = 1011, roleDescription: String = "developer"):
  TLCStudent = new TLCStudent(fname, sname, yearStarted, id, roleDescription)
}


