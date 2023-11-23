package com.xml.project.service;

import com.xml.project.model.AutorskoDeloZahtev;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;

public class MarshallingXMLService {
    private static final String CONTEXT_PATH = "com.xml.project.model";



    public OutputStream marshallZahtevZaAutroskoDelo(AutorskoDeloZahtev delo) throws JAXBException {
        OutputStream os = new ByteArrayOutputStream();


        getMarshaller().setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        getMarshaller().marshal(delo, os);

        return os;
    }


    public static void saveZahtevToXml(AutorskoDeloZahtev autorskoDeloZahtev, String filePath) throws JAXBException {
        getMarshaller().marshal(autorskoDeloZahtev, new File(filePath));
    }


    private static Marshaller getMarshaller() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(CONTEXT_PATH);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        return marshaller;



    }
}
