package com.xml.project.service;

import com.xml.project.model.AutorskoDeloZahtev;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class UnmarshallingXMLService {

    private static final String CONTEXT_PATH = "com.xml.project.model";

    public static AutorskoDeloZahtev getZahtevZaAutroskoDeloXml(String filePath) throws JAXBException {
        return (AutorskoDeloZahtev) getUnmarshaller().unmarshal(new File(filePath));
    }

    public AutorskoDeloZahtev unmarshalZahtevZaAutorskoDeloFromFile(String filePath) throws JAXBException{
        System.out.println("[INFO] Unmarshalling XML document to an JAXB instance: ");


        AutorskoDeloZahtev autorskoDeloZahtev = (AutorskoDeloZahtev) getUnmarshaller().unmarshal(new File(filePath));

        return autorskoDeloZahtev;
    }

    private static Unmarshaller getUnmarshaller() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(CONTEXT_PATH);
        return context.createUnmarshaller();
    }

}
