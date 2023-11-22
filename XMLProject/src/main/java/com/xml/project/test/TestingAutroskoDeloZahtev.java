package com.xml.project.test;

import com.google.gson.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xml.project.model.AutorskoDeloZahtev;
import com.xml.project.service.*;
import jakarta.xml.bind.JAXBException;


public class TestingAutroskoDeloZahtev {

    private static final String FAJL_AUTORI_PREDEFINISAN = "./data/A-1.xml";

    private static final String FAJL_AUTORI_GENERISAN = "./data/generated/ZahtevA-1.xml";

    private static AutorskoDeloZahtev ucitaj(String filePath) throws JAXBException {
        return UnmarshallingXMLService.getZahtevZaAutroskoDeloXml(filePath);
    }

    private static void ispisi(AutorskoDeloZahtev autroskoZahtev) {

        Gson gson =new GsonBuilder().setPrettyPrinting()
                .create();

        System.out.println(autroskoZahtev.toString());
        String json = gson.toJson(autroskoZahtev);
        System.out.println(json);
    }

//    private static void izmeniObrazacAutori(ObrazacAutori obrazacAutori) {
//        Adresa a1 = new Adresa();
//        a1.setUlica("Nova ulica");
//        a1.setBroj("21A");
//        a1.setDrzava("Srbija");
//        a1.setPostanskiBroj(22000);
//        a1.setMesto("Neko mesto");
//
//        PodaciOLicu podaciOPeri = new PodaciOLicu();
//        podaciOPeri.setEmail("pera@gmail.com");
//        podaciOPeri.setTelefon("065-314-23-23");
//
//        FizickoLiceSaDrzavljanstvom pera = new FizickoLiceSaDrzavljanstvom();
//        pera.setIme("Pera");
//        pera.setPrezime("Peric");
//        pera.setAdresa(a1);
//        pera.setPodaciOLicu(podaciOPeri);
//        pera.setDrzavljanstvo("Sprsko");
//
//        obrazacAutori.getPodnosilac().add(pera);
//        obrazacAutori.setStvorenoURadnomOdnosu(true);
//        obrazacAutori.setNacinKoriscenja("izdato");
//    }
//
//    private static void sacuvajIzmeneObrascaUNoviXMLFajl(ObrazacAutori obrazacAutori) throws JAXBException {
//        MarshallingXMLService.saveObrazacAutoriToXml(obrazacAutori, FAJL_AUTORI_GENERISAN);
//    }

    private static void testAutori() throws JAXBException {


        AutorskoDeloZahtev autroskoZahtev = ucitaj(FAJL_AUTORI_PREDEFINISAN);

        ispisi(autroskoZahtev);
//
//        izmeniObrazacAutori(obrazacAutori);
//
//        sacuvajIzmeneObrascaUNoviXMLFajl(obrazacAutori);
//
//        ObrazacAutori sacuvanObrazac = ucitaj(FAJL_AUTORI_GENERISAN);
//
//        System.out.println("===============================================");
//        System.out.println("NAKON IZMENE");
//        System.out.println("===============================================");
//        ispisi(sacuvanObrazac);
    }

    public static void main(String[] args) throws JAXBException {
//        File directoryPath = new File(FAJL_AUTORI_PREDEFINISAN);
//        FileFilter textFilefilter = new FileFilter(){
//            public boolean accept(File file) {
//                boolean isFile = file.isFile();
//                if (isFile) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        };
//        //List of all the text files
//        File filesList[] = directoryPath.listFiles(textFilefilter);
//        System.out.println("List of the text files in the specified directory:");
//        for(File file : filesList) {
//            System.out.println("File name: "+file.getName());
//            System.out.println("File path: "+file.getAbsolutePath());
//            System.out.println("Size :"+file.getTotalSpace());
//            System.out.println(" ");
//        }
        testAutori();
    }
}
