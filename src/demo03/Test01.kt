//package demo03
//
//import org.apache.poi.ss.usermodel.WorkbookFactory
//import org.springframework.mock.web.MockMultipartFile
//import java.io.File
//import java.io.FileInputStream
//
//fun main() {
//    var file = File("/Users/apple/work/Test/resources/test.xlsx")
//    var inputStream = FileInputStream(file)
//    var workBook  = WorkbookFactory.create(inputStream)
//    var sheet = workBook.getSheetAt(0)
//    var lastRow = sheet.lastRowNum
//    print(lastRow)
//
//}