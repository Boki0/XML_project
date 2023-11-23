package com.xml.project.test;

import com.xml.project.repository.ZahtevRepositroy;

public class TestingDB {
    public static void main(String[] args) {
        ZahtevRepositroy zahtevRepositroy = new ZahtevRepositroy();

        zahtevRepositroy.saveFile("A-1.xml","data/A-1.xml");

    }
}
