package utilities;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

public class ReadXLSfiles {

    @DataProvider(name="loggin_Credentials")
    public Object[][] getData(Method m) throws IOException {
        String xsheetName = m.getName();
        File f = new File("src/test/resources/testdata/credentials.xlsx");
        FileInputStream file =new FileInputStream(f);
        Workbook wk = WorkbookFactory.create(file);
        Sheet sheetName = wk.getSheet(xsheetName);
        int totalRows =sheetName.getLastRowNum();
        Row rowCells = sheetName.getRow(0);
        int totalColumns =rowCells.getLastCellNum();
        String loginData[][]=new String[totalRows][totalColumns];

        DataFormatter df =new DataFormatter();
        for(int i=1;i<=totalRows;i++){
            for(int r =0;r<totalColumns;r++){
                loginData[i-1][r] =df.formatCellValue(sheetName.getRow(i).getCell(r));
              //  System.out.println(loginData[i-1][r]);
            }
        }
        return loginData;
    }


}
