package com.sapient.investment.bank.factory;

import java.io.IOException;
import java.util.List;

import com.sapient.investment.bank.constant.InvestmentConstants;
import com.sapient.investment.bank.exceptions.ParseException;
import com.sapient.investment.bank.model.TransactionDto;
/**
 * 
 * @author lakshaynarang
 *
 */

public class DocumentReadersFactory {
	
	public static List<TransactionDto> readFile(String fileType, String filePath) throws IOException ,ParseException {
		
        switch (fileType) {
            case "CSV":
                return new CsvDocumentReaders().read(filePath);
            case "EXCEl":
                return new ExcelDocumentReaders().read(filePath);
            case "XML":
                return new XmlDocumentReaders().read(filePath);         
            case "TEXT":
            	return new TextDocumentReaders().read(filePath);           	
            case "XMl":
            	return new XmlDocumentReaders().read(filePath);
            case "XSL":
            	return new XlsDocumentReaders().read(filePath);           
            default:
                throw new ParseException(InvestmentConstants.CANNOT_PARSE_FILE);
        }
    }

}
