package com.xml.project.repository;

import com.xml.project.model.AutorskoDeloZahtev;
import com.xml.project.service.MarshallingXMLService;
import com.xml.project.service.UnmarshallingXMLService;
import jakarta.xml.bind.JAXBContext;
import org.w3c.dom.Node;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.modules.XMLResource;

import java.io.OutputStream;

public class ZahtevRepositroy {
//    private JAXBContext context;
    private final String collectionId = "db/project/zahtevi";
    private final String TARGET_NAMESPACE = "http://ftn.uns.ac.rs/a1";

    private static UnmarshallingXMLService unmarshallingXMLService = new UnmarshallingXMLService();
    private static MarshallingXMLService marshallingXMLService = new MarshallingXMLService();



//    public ZahtevRepositroy() {
//        setContext();
//    }
//
//    private void setContext() {
//        try {
//            context = JAXBContext.newInstance("rs.ac.uns.ftn.jaxb.a1");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


//    private ZahtevZaAutorskoDelo unmarshalZahtevZaAutorskoDeloFromNode(Node contentAsDOM) throws JAXBException{
//        System.out.println("[INFO] Unmarshalling XML document to an JAXB instance: ");
//
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//        ZahtevZaAutorskoDelo bookstore = (ZahtevZaAutorskoDelo) unmarshaller.unmarshal(contentAsDOM);
//
//        return bookstore;
//    }



    public void saveFile(String resourceId, String filePath) {
        Collection col = null;
        XMLResource res = null;
        try {

            ConnUtil.setup();
            col = ConnUtil.initCollection(collectionId);
            res = ConnUtil.initResource(col, resourceId);

            AutorskoDeloZahtev delo = unmarshallingXMLService.unmarshalZahtevZaAutorskoDeloFromFile(filePath);

            // do something to delo;

            OutputStream os = marshallingXMLService.marshallZahtevZaAutroskoDelo(delo);
            ConnUtil.linkResourceToCollection(col, res, os);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnUtil.cleanup(col , res);
        }
    }

//    public ZahtevZaAutorskoDelo getZahtevById(String documentId) {
//        Collection col = null;
//        XMLResource res = null;
//        try {
//            ConnectionUtilities.setup();
//            col = ConnectionUtilities.getCollection(collectionId);
//            res = ConnectionUtilities.getResource(col, documentId);
//
//            if(res == null) {
//                System.out.println("[WARNING] Document '" + documentId + "' can not be found!");
//                return null;
//            } else {
//
//                return unmarshalZahtevZaAutorskoDeloFromNode(res.getContentAsDOM());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        } finally {
//            ConnectionUtilities.cleanup(col , res);
//        }
//    }
//
//
//    public ResourceSet getByXQuery(String xQueryExpression) {
//        Collection col = null;
//        try {
//            ConnectionUtilities.setup();
//            col = ConnectionUtilities.getCollection(collectionId);
//            return ConnectionUtilities.getResourceSetByXQuery(col, TARGET_NAMESPACE, xQueryExpression);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        } finally {
//            ConnectionUtilities.cleanup(col);
//        }
//    }
}
