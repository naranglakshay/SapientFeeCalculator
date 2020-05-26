package com.sapient.investment.bank.factory;

import java.io.IOException;

import com.sapient.investment.bank.api.DocumentWriters;
import com.sapient.investment.bank.constant.InvestmentConstants;
import com.sapient.investment.bank.exceptions.ParseException;


/**
 * 
 * @author lakshaynarang
 *
 */
public class DocumentWriterFactory {
	
  public static DocumentWriters createWriters(String fileType) throws IOException ,ParseException {
		
        switch (fileType) {
            case "CSV":
                return new CsvDocumentWriters();
            case "EXCEl":
                return new ExcelDocumentWriters();    
            case "TEXT":
            	return new TextDocumentWriters();           	
            case "XMl":
            	return new XmlDocumentWrites();
            case "XSL":
            	return new XlsDocumentWriters(); 
            case "JSON":
            	return new JsonDocumentWriters(); 
            default:
                throw new ParseException(InvestmentConstants.CANNOT_PARSE_FILE);
        }
    }


}
