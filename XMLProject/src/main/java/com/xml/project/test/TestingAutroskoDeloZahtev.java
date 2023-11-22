package com.xml.project.test;

import com.google.gson.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xml.project.model.*;
import com.xml.project.service.*;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.math.BigInteger;


public class TestingAutroskoDeloZahtev {

    private static final String FAJL_AUTORI_PREDEFINISAN = "./data/A-1.xml";

    private static final String FAJL_AUTORI_GENERISAN = "./data/generated/ZahtevA-1.xml";

    private static AutorskoDeloZahtev ucitaj(String filePath) throws JAXBException {
        return UnmarshallingXMLService.getZahtevZaAutroskoDeloXml(filePath);
    }

    private static void ispisi(AutorskoDeloZahtev autroskoZahtev) {

        System.out.println(autroskoZahtev);
    }

    private static void izmeniObrazacAutori(AutorskoDeloZahtev autorskoDeloZahtev) {
        Adresa a1 = new Adresa();
        a1.setUlica("Nova ulica");
        a1.setBroj(BigInteger.valueOf(434));
        a1.setMesto("Kragujevac");
        ObjectFactory objectFactory= new ObjectFactory();


        TFizickoLice pera = new TFizickoLice();
        pera.setIme("velja");
        pera.setPrezime("selja");
        pera.setAdresa(a1);
        pera.setDrzavljanstvo("Sprsko");
        autorskoDeloZahtev.setNaslov("Najnovija istorija srba");
        autorskoDeloZahtev.setBrojPrijave("123456789");
        TPrilog t = new TPrilog();
        t.setSadrziOpis(false);
        t.setSadrziPrimer(false);
        autorskoDeloZahtev.setPrilog(objectFactory.createAutorskoDeloZahtevPrilog(t));
        AutorskoDeloZahtev.Podnosilac p = new AutorskoDeloZahtev.Podnosilac();

        autorskoDeloZahtev.setPodnosilac(objectFactory.createAutorskoDeloZahtevPodnosilac());

    }

    private static void sacuvajIzmeneObrascaUNoviXMLFajl(AutorskoDeloZahtev autorskoDeloZahtev) throws JAXBException {



        MarshallingXMLService.saveZahtevToXml(autorskoDeloZahtev, FAJL_AUTORI_GENERISAN);
    }

    private static void testAutori() throws JAXBException {


        AutorskoDeloZahtev autroskoZahtev = ucitaj(FAJL_AUTORI_PREDEFINISAN);

        ispisi(autroskoZahtev);

        izmeniObrazacAutori(autroskoZahtev);

        sacuvajIzmeneObrascaUNoviXMLFajl(autroskoZahtev);

        AutorskoDeloZahtev a = ucitaj(FAJL_AUTORI_GENERISAN);

        System.out.println("\n\n\n\n===============================================\n\n\n\n\n");

        ispisi(a);
    }

    public static void main(String[] args) throws JAXBException {
        testAutori();
    }
}
