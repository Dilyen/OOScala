import io.turntabl.grades.Grade
import io.turntabl.ooscala.TLCStudent
import org.junit.Test
import org.junit.Assert._

class TLCStudentTest {
  @Test
  def hasSameTermOfService_?{
    val doreen = TLCStudent("doreen", "doodo", id = 1011)
    val david = TLCStudent("doreen", "doodo", yearStarted = 1991)
    val result = doreen hasSameTermOfService_? david
    assertFalse(result)
  }


  @Test
  def topGrade {
    val david = TLCStudent("doreen", "doodo", yearStarted = 2004)
    val result = david TopGrade
    val expected = Grade("Programming_Fundamentals", 88.3)

    assertEquals(result, expected)
  }

}
