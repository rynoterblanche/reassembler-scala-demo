package fragment.submissions

import org.scalatest.FunSuite

class TestShopWithOffers extends FunSuite {

//  test("reassemble small line of text") {
//    val fragments = "O draconia;conian devil! Oh la;h lame sa;saint!"
//    val result = "O draconian devil! Oh lame saint!"
//    assert(Reassembler.reassemble(fragments) == result)
//  }
//
//  test("reassemble long line of text") {
//    val fragments = "m quaerat voluptatem.;pora incidunt ut labore et d;, consectetur, adipisci velit;olore magnam aliqua;idunt ut labore et dolore magn;uptatem.;i dolorem ipsum qu;iquam quaerat vol;psum quia dolor sit amet, consectetur, a;ia dolor sit amet, conse;squam est, qui do;Neque porro quisquam est, qu;aerat voluptatem.;m eius modi tem;Neque porro qui;, sed quia non numquam ei;lorem ipsum quia dolor sit amet;ctetur, adipisci velit, sed quia non numq;unt ut labore et dolore magnam aliquam qu;dipisci velit, sed quia non numqua;us modi tempora incid;Neque porro quisquam est, qui dolorem i;uam eius modi tem;pora inc;am al"
//    val result = "Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem."
//    assert(Reassembler.reassemble(fragments) == result)
//  }

  test("correct overlaps") {
    assert(Reassembler.getOverlap("ABCDEF", "DEFG") == 3)
    assert(Reassembler.getOverlap("ABCDEF", "XYZABC") == 3)
    assert(Reassembler.getOverlap("ABCDEF", "BCDE") == 4)
    assert(Reassembler.getOverlap("ABCDEF", "XCDEZ") == 0)
  }
}

