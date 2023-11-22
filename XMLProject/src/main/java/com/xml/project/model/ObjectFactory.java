
package com.xml.project.model;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AutorskoDeloZahtevPrilog_QNAME = new QName("", "Prilog");
    private final static QName _TOsnovnoODeluIdentifikatorAlternativniNaslov_QNAME = new QName("", "Alternativni_naslov");
    private final static QName _TAutorPseudonim_QNAME = new QName("", "Pseudonim");
    private final static QName _TAutorGodinaSmrti_QNAME = new QName("", "Godina_smrti");
    private final static QName _TAutorskoDeloPodaciOPreradi_QNAME = new QName("", "podaci_o_preradi");
    private final static QName _TAutorskoDeloRadniOdnos_QNAME = new QName("", "radni_odnos");
    private final static QName _TAutorskoDeloNacinKoriscenja_QNAME = new QName("", "nacin_koriscenja");
    private final static QName _AutorskoDeloZahtevPodnosilacTelefon_QNAME = new QName("", "Telefon");
    private final static QName _AutorskoDeloZahtevPodnosilacPodaciPodnosiocaPunomocnik_QNAME = new QName("", "Punomocnik");
    private final static QName _AutorskoDeloZahtevPodnosilacPodaciPodnosiocaPravnoLice_QNAME = new QName("", "Pravno_lice");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AutorskoDeloZahtev }
     * 
     */
    public AutorskoDeloZahtev createAutorskoDeloZahtev() {
        return new AutorskoDeloZahtev();
    }

    /**
     * Create an instance of {@link TOsnovnoODelu }
     * 
     */
    public TOsnovnoODelu createTOsnovnoODelu() {
        return new TOsnovnoODelu();
    }

    /**
     * Create an instance of {@link AutorskoDeloZahtev.Podnosilac }
     * 
     */
    public AutorskoDeloZahtev.Podnosilac createAutorskoDeloZahtevPodnosilac() {
        return new AutorskoDeloZahtev.Podnosilac();
    }

    /**
     * Create an instance of {@link TAutorskoDelo }
     * 
     */
    public TAutorskoDelo createTAutorskoDelo() {
        return new TAutorskoDelo();
    }

    /**
     * Create an instance of {@link TPrilog }
     * 
     */
    public TPrilog createTPrilog() {
        return new TPrilog();
    }

    /**
     * Create an instance of {@link Adresa }
     * 
     */
    public Adresa createAdresa() {
        return new Adresa();
    }

    /**
     * Create an instance of {@link TPravnoLice }
     * 
     */
    public TPravnoLice createTPravnoLice() {
        return new TPravnoLice();
    }

    /**
     * Create an instance of {@link TFizickoLice }
     * 
     */
    public TFizickoLice createTFizickoLice() {
        return new TFizickoLice();
    }

    /**
     * Create an instance of {@link TAutor }
     * 
     */
    public TAutor createTAutor() {
        return new TAutor();
    }

    /**
     * Create an instance of {@link TAutori }
     * 
     */
    public TAutori createTAutori() {
        return new TAutori();
    }

    /**
     * Create an instance of {@link TOsnovnoODelu.Identifikator }
     * 
     */
    public TOsnovnoODelu.Identifikator createTOsnovnoODeluIdentifikator() {
        return new TOsnovnoODelu.Identifikator();
    }

    /**
     * Create an instance of {@link AutorskoDeloZahtev.Podnosilac.PodaciPodnosioca }
     * 
     */
    public AutorskoDeloZahtev.Podnosilac.PodaciPodnosioca createAutorskoDeloZahtevPodnosilacPodaciPodnosioca() {
        return new AutorskoDeloZahtev.Podnosilac.PodaciPodnosioca();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPrilog }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TPrilog }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Prilog", scope = AutorskoDeloZahtev.class)
    public JAXBElement<TPrilog> createAutorskoDeloZahtevPrilog(TPrilog value) {
        return new JAXBElement<TPrilog>(_AutorskoDeloZahtevPrilog_QNAME, TPrilog.class, AutorskoDeloZahtev.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Alternativni_naslov", scope = TOsnovnoODelu.Identifikator.class)
    public JAXBElement<String> createTOsnovnoODeluIdentifikatorAlternativniNaslov(String value) {
        return new JAXBElement<String>(_TOsnovnoODeluIdentifikatorAlternativniNaslov_QNAME, String.class, TOsnovnoODelu.Identifikator.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Pseudonim", scope = TAutor.class)
    public JAXBElement<String> createTAutorPseudonim(String value) {
        return new JAXBElement<String>(_TAutorPseudonim_QNAME, String.class, TAutor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Godina_smrti", scope = TAutor.class)
    public JAXBElement<BigInteger> createTAutorGodinaSmrti(BigInteger value) {
        return new JAXBElement<BigInteger>(_TAutorGodinaSmrti_QNAME, BigInteger.class, TAutor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOsnovnoODelu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOsnovnoODelu }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "podaci_o_preradi", scope = TAutorskoDelo.class)
    public JAXBElement<TOsnovnoODelu> createTAutorskoDeloPodaciOPreradi(TOsnovnoODelu value) {
        return new JAXBElement<TOsnovnoODelu>(_TAutorskoDeloPodaciOPreradi_QNAME, TOsnovnoODelu.class, TAutorskoDelo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "radni_odnos", scope = TAutorskoDelo.class)
    public JAXBElement<String> createTAutorskoDeloRadniOdnos(String value) {
        return new JAXBElement<String>(_TAutorskoDeloRadniOdnos_QNAME, String.class, TAutorskoDelo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "nacin_koriscenja", scope = TAutorskoDelo.class)
    public JAXBElement<String> createTAutorskoDeloNacinKoriscenja(String value) {
        return new JAXBElement<String>(_TAutorskoDeloNacinKoriscenja_QNAME, String.class, TAutorskoDelo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Telefon", scope = AutorskoDeloZahtev.Podnosilac.class)
    public JAXBElement<String> createAutorskoDeloZahtevPodnosilacTelefon(String value) {
        return new JAXBElement<String>(_AutorskoDeloZahtevPodnosilacTelefon_QNAME, String.class, AutorskoDeloZahtev.Podnosilac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TFizickoLice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TFizickoLice }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Punomocnik", scope = AutorskoDeloZahtev.Podnosilac.PodaciPodnosioca.class)
    public JAXBElement<TFizickoLice> createAutorskoDeloZahtevPodnosilacPodaciPodnosiocaPunomocnik(TFizickoLice value) {
        return new JAXBElement<TFizickoLice>(_AutorskoDeloZahtevPodnosilacPodaciPodnosiocaPunomocnik_QNAME, TFizickoLice.class, AutorskoDeloZahtev.Podnosilac.PodaciPodnosioca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPravnoLice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TPravnoLice }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Pravno_lice", scope = AutorskoDeloZahtev.Podnosilac.PodaciPodnosioca.class)
    public JAXBElement<TPravnoLice> createAutorskoDeloZahtevPodnosilacPodaciPodnosiocaPravnoLice(TPravnoLice value) {
        return new JAXBElement<TPravnoLice>(_AutorskoDeloZahtevPodnosilacPodaciPodnosiocaPravnoLice_QNAME, TPravnoLice.class, AutorskoDeloZahtev.Podnosilac.PodaciPodnosioca.class, value);
    }

}
