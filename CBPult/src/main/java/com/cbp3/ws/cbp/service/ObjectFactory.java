
package com.cbp3.ws.cbp.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cbp3.ws.cbp.service package. 
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

    private final static QName _ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "consultaPurchaseOrderPorPurchaseOrderIdWSResponse");
    private final static QName _ProductoUbicacion_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "productoUbicacion");
    private final static QName _Movimiento_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "movimiento");
    private final static QName _ListTipoMovimientoWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "listTipoMovimientoWSResponse");
    private final static QName _TipoMovimiento_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "tipoMovimiento");
    private final static QName _Departamento_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "departamento");
    private final static QName _GenerarMovimientoWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "generarMovimientoWSResponse");
    private final static QName _PurchaseOrder_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "purchaseOrder");
    private final static QName _ListMovimientosByTipoMovimientoWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "listMovimientosByTipoMovimientoWSResponse");
    private final static QName _Empresa_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "empresa");
    private final static QName _ModificarTerceroWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "modificarTerceroWS");
    private final static QName _ConsultaTerceroPorTerceroIdWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "consultaTerceroPorTerceroIdWSResponse");
    private final static QName _Tipoidentificacion_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "tipoidentificacion");
    private final static QName _Product_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "product");
    private final static QName _Tercero_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "tercero");
    private final static QName _TipoZona_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "tipoZona");
    private final static QName _ConsultaProveedorPorProveedorIdWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "consultaProveedorPorProveedorIdWSResponse");
    private final static QName _Estanteria_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "estanteria");
    private final static QName _CrearProductoUbicacionWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "crearProductoUbicacionWS");
    private final static QName _ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "consultaProductoUbicacionsByIdProductoUbicacionWSResponse");
    private final static QName _Catalogue_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "catalogue");
    private final static QName _CrearProductoUbicacionWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "crearProductoUbicacionWSResponse");
    private final static QName _Warehouse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "warehouse");
    private final static QName _CrearTerceroWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "crearTerceroWSResponse");
    private final static QName _GenerarMovimientoWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "generarMovimientoWS");
    private final static QName _Zona_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "zona");
    private final static QName _ConsultaPurchaseOrderPorPurchaseOrderIdWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "consultaPurchaseOrderPorPurchaseOrderIdWS");
    private final static QName _Empleado_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "empleado");
    private final static QName _Provider_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "provider");
    private final static QName _ConsultaProveedorPorProveedorIdWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "consultaProveedorPorProveedorIdWS");
    private final static QName _ConsultaTerceroPorTerceroIdWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "consultaTerceroPorTerceroIdWS");
    private final static QName _Cargo_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "cargo");
    private final static QName _ModificarProductoUbicacionWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "modificarProductoUbicacionWSResponse");
    private final static QName _CrearTerceroWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "crearTerceroWS");
    private final static QName _ModificarProductoUbicacionWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "modificarProductoUbicacionWS");
    private final static QName _ListProductoUbicacionWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "listProductoUbicacionWS");
    private final static QName _ListMovimientosByTipoMovimientoWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "listMovimientosByTipoMovimientoWS");
    private final static QName _ListProductoUbicacionWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "listProductoUbicacionWSResponse");
    private final static QName _ListTipoMovimientoWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "listTipoMovimientoWS");
    private final static QName _ConsultaProductoUbicacionsByIdProductoUbicacionWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "consultaProductoUbicacionsByIdProductoUbicacionWS");
    private final static QName _ModificarTerceroWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "modificarTerceroWSResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cbp3.ws.cbp.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearTerceroWS }
     * 
     */
    public CrearTerceroWS createCrearTerceroWS() {
        return new CrearTerceroWS();
    }

    /**
     * Create an instance of {@link ModificarProductoUbicacionWS }
     * 
     */
    public ModificarProductoUbicacionWS createModificarProductoUbicacionWS() {
        return new ModificarProductoUbicacionWS();
    }

    /**
     * Create an instance of {@link ListProductoUbicacionWS }
     * 
     */
    public ListProductoUbicacionWS createListProductoUbicacionWS() {
        return new ListProductoUbicacionWS();
    }

    /**
     * Create an instance of {@link ConsultaProductoUbicacionsByIdProductoUbicacionWS }
     * 
     */
    public ConsultaProductoUbicacionsByIdProductoUbicacionWS createConsultaProductoUbicacionsByIdProductoUbicacionWS() {
        return new ConsultaProductoUbicacionsByIdProductoUbicacionWS();
    }

    /**
     * Create an instance of {@link ModificarTerceroWSResponse }
     * 
     */
    public ModificarTerceroWSResponse createModificarTerceroWSResponse() {
        return new ModificarTerceroWSResponse();
    }

    /**
     * Create an instance of {@link ListProductoUbicacionWSResponse }
     * 
     */
    public ListProductoUbicacionWSResponse createListProductoUbicacionWSResponse() {
        return new ListProductoUbicacionWSResponse();
    }

    /**
     * Create an instance of {@link ListTipoMovimientoWS }
     * 
     */
    public ListTipoMovimientoWS createListTipoMovimientoWS() {
        return new ListTipoMovimientoWS();
    }

    /**
     * Create an instance of {@link ListMovimientosByTipoMovimientoWS }
     * 
     */
    public ListMovimientosByTipoMovimientoWS createListMovimientosByTipoMovimientoWS() {
        return new ListMovimientosByTipoMovimientoWS();
    }

    /**
     * Create an instance of {@link Zona }
     * 
     */
    public Zona createZona() {
        return new Zona();
    }

    /**
     * Create an instance of {@link GenerarMovimientoWS }
     * 
     */
    public GenerarMovimientoWS createGenerarMovimientoWS() {
        return new GenerarMovimientoWS();
    }

    /**
     * Create an instance of {@link CrearTerceroWSResponse }
     * 
     */
    public CrearTerceroWSResponse createCrearTerceroWSResponse() {
        return new CrearTerceroWSResponse();
    }

    /**
     * Create an instance of {@link Empleado }
     * 
     */
    public Empleado createEmpleado() {
        return new Empleado();
    }

    /**
     * Create an instance of {@link Provider }
     * 
     */
    public Provider createProvider() {
        return new Provider();
    }

    /**
     * Create an instance of {@link ConsultaPurchaseOrderPorPurchaseOrderIdWS }
     * 
     */
    public ConsultaPurchaseOrderPorPurchaseOrderIdWS createConsultaPurchaseOrderPorPurchaseOrderIdWS() {
        return new ConsultaPurchaseOrderPorPurchaseOrderIdWS();
    }

    /**
     * Create an instance of {@link ConsultaProveedorPorProveedorIdWS }
     * 
     */
    public ConsultaProveedorPorProveedorIdWS createConsultaProveedorPorProveedorIdWS() {
        return new ConsultaProveedorPorProveedorIdWS();
    }

    /**
     * Create an instance of {@link ConsultaTerceroPorTerceroIdWS }
     * 
     */
    public ConsultaTerceroPorTerceroIdWS createConsultaTerceroPorTerceroIdWS() {
        return new ConsultaTerceroPorTerceroIdWS();
    }

    /**
     * Create an instance of {@link Cargo }
     * 
     */
    public Cargo createCargo() {
        return new Cargo();
    }

    /**
     * Create an instance of {@link ModificarProductoUbicacionWSResponse }
     * 
     */
    public ModificarProductoUbicacionWSResponse createModificarProductoUbicacionWSResponse() {
        return new ModificarProductoUbicacionWSResponse();
    }

    /**
     * Create an instance of {@link TipoZona }
     * 
     */
    public TipoZona createTipoZona() {
        return new TipoZona();
    }

    /**
     * Create an instance of {@link Tercero }
     * 
     */
    public Tercero createTercero() {
        return new Tercero();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ConsultaTerceroPorTerceroIdWSResponse }
     * 
     */
    public ConsultaTerceroPorTerceroIdWSResponse createConsultaTerceroPorTerceroIdWSResponse() {
        return new ConsultaTerceroPorTerceroIdWSResponse();
    }

    /**
     * Create an instance of {@link Tipoidentificacion }
     * 
     */
    public Tipoidentificacion createTipoidentificacion() {
        return new Tipoidentificacion();
    }

    /**
     * Create an instance of {@link Estanteria }
     * 
     */
    public Estanteria createEstanteria() {
        return new Estanteria();
    }

    /**
     * Create an instance of {@link ConsultaProveedorPorProveedorIdWSResponse }
     * 
     */
    public ConsultaProveedorPorProveedorIdWSResponse createConsultaProveedorPorProveedorIdWSResponse() {
        return new ConsultaProveedorPorProveedorIdWSResponse();
    }

    /**
     * Create an instance of {@link CrearProductoUbicacionWS }
     * 
     */
    public CrearProductoUbicacionWS createCrearProductoUbicacionWS() {
        return new CrearProductoUbicacionWS();
    }

    /**
     * Create an instance of {@link Warehouse }
     * 
     */
    public Warehouse createWarehouse() {
        return new Warehouse();
    }

    /**
     * Create an instance of {@link Catalogue }
     * 
     */
    public Catalogue createCatalogue() {
        return new Catalogue();
    }

    /**
     * Create an instance of {@link CrearProductoUbicacionWSResponse }
     * 
     */
    public CrearProductoUbicacionWSResponse createCrearProductoUbicacionWSResponse() {
        return new CrearProductoUbicacionWSResponse();
    }

    /**
     * Create an instance of {@link ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse }
     * 
     */
    public ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse createConsultaProductoUbicacionsByIdProductoUbicacionWSResponse() {
        return new ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse();
    }

    /**
     * Create an instance of {@link Movimiento }
     * 
     */
    public Movimiento createMovimiento() {
        return new Movimiento();
    }

    /**
     * Create an instance of {@link ProductoUbicacion }
     * 
     */
    public ProductoUbicacion createProductoUbicacion() {
        return new ProductoUbicacion();
    }

    /**
     * Create an instance of {@link ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse }
     * 
     */
    public ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse createConsultaPurchaseOrderPorPurchaseOrderIdWSResponse() {
        return new ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse();
    }

    /**
     * Create an instance of {@link GenerarMovimientoWSResponse }
     * 
     */
    public GenerarMovimientoWSResponse createGenerarMovimientoWSResponse() {
        return new GenerarMovimientoWSResponse();
    }

    /**
     * Create an instance of {@link PurchaseOrder }
     * 
     */
    public PurchaseOrder createPurchaseOrder() {
        return new PurchaseOrder();
    }

    /**
     * Create an instance of {@link Departamento }
     * 
     */
    public Departamento createDepartamento() {
        return new Departamento();
    }

    /**
     * Create an instance of {@link ListTipoMovimientoWSResponse }
     * 
     */
    public ListTipoMovimientoWSResponse createListTipoMovimientoWSResponse() {
        return new ListTipoMovimientoWSResponse();
    }

    /**
     * Create an instance of {@link TipoMovimiento }
     * 
     */
    public TipoMovimiento createTipoMovimiento() {
        return new TipoMovimiento();
    }

    /**
     * Create an instance of {@link Empresa }
     * 
     */
    public Empresa createEmpresa() {
        return new Empresa();
    }

    /**
     * Create an instance of {@link ModificarTerceroWS }
     * 
     */
    public ModificarTerceroWS createModificarTerceroWS() {
        return new ModificarTerceroWS();
    }

    /**
     * Create an instance of {@link ListMovimientosByTipoMovimientoWSResponse }
     * 
     */
    public ListMovimientosByTipoMovimientoWSResponse createListMovimientosByTipoMovimientoWSResponse() {
        return new ListMovimientosByTipoMovimientoWSResponse();
    }

    /**
     * Create an instance of {@link ErroresDTO }
     * 
     */
    public ErroresDTO createErroresDTO() {
        return new ErroresDTO();
    }

    /**
     * Create an instance of {@link BdsUtil }
     * 
     */
    public BdsUtil createBdsUtil() {
        return new BdsUtil();
    }

    /**
     * Create an instance of {@link RespuestaDTO }
     * 
     */
    public RespuestaDTO createRespuestaDTO() {
        return new RespuestaDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "consultaPurchaseOrderPorPurchaseOrderIdWSResponse")
    public JAXBElement<ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse> createConsultaPurchaseOrderPorPurchaseOrderIdWSResponse(ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse value) {
        return new JAXBElement<ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse>(_ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse_QNAME, ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoUbicacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "productoUbicacion")
    public JAXBElement<ProductoUbicacion> createProductoUbicacion(ProductoUbicacion value) {
        return new JAXBElement<ProductoUbicacion>(_ProductoUbicacion_QNAME, ProductoUbicacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Movimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "movimiento")
    public JAXBElement<Movimiento> createMovimiento(Movimiento value) {
        return new JAXBElement<Movimiento>(_Movimiento_QNAME, Movimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTipoMovimientoWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "listTipoMovimientoWSResponse")
    public JAXBElement<ListTipoMovimientoWSResponse> createListTipoMovimientoWSResponse(ListTipoMovimientoWSResponse value) {
        return new JAXBElement<ListTipoMovimientoWSResponse>(_ListTipoMovimientoWSResponse_QNAME, ListTipoMovimientoWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoMovimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "tipoMovimiento")
    public JAXBElement<TipoMovimiento> createTipoMovimiento(TipoMovimiento value) {
        return new JAXBElement<TipoMovimiento>(_TipoMovimiento_QNAME, TipoMovimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Departamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "departamento")
    public JAXBElement<Departamento> createDepartamento(Departamento value) {
        return new JAXBElement<Departamento>(_Departamento_QNAME, Departamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarMovimientoWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "generarMovimientoWSResponse")
    public JAXBElement<GenerarMovimientoWSResponse> createGenerarMovimientoWSResponse(GenerarMovimientoWSResponse value) {
        return new JAXBElement<GenerarMovimientoWSResponse>(_GenerarMovimientoWSResponse_QNAME, GenerarMovimientoWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "purchaseOrder")
    public JAXBElement<PurchaseOrder> createPurchaseOrder(PurchaseOrder value) {
        return new JAXBElement<PurchaseOrder>(_PurchaseOrder_QNAME, PurchaseOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMovimientosByTipoMovimientoWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "listMovimientosByTipoMovimientoWSResponse")
    public JAXBElement<ListMovimientosByTipoMovimientoWSResponse> createListMovimientosByTipoMovimientoWSResponse(ListMovimientosByTipoMovimientoWSResponse value) {
        return new JAXBElement<ListMovimientosByTipoMovimientoWSResponse>(_ListMovimientosByTipoMovimientoWSResponse_QNAME, ListMovimientosByTipoMovimientoWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Empresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "empresa")
    public JAXBElement<Empresa> createEmpresa(Empresa value) {
        return new JAXBElement<Empresa>(_Empresa_QNAME, Empresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarTerceroWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "modificarTerceroWS")
    public JAXBElement<ModificarTerceroWS> createModificarTerceroWS(ModificarTerceroWS value) {
        return new JAXBElement<ModificarTerceroWS>(_ModificarTerceroWS_QNAME, ModificarTerceroWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaTerceroPorTerceroIdWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "consultaTerceroPorTerceroIdWSResponse")
    public JAXBElement<ConsultaTerceroPorTerceroIdWSResponse> createConsultaTerceroPorTerceroIdWSResponse(ConsultaTerceroPorTerceroIdWSResponse value) {
        return new JAXBElement<ConsultaTerceroPorTerceroIdWSResponse>(_ConsultaTerceroPorTerceroIdWSResponse_QNAME, ConsultaTerceroPorTerceroIdWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tipoidentificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "tipoidentificacion")
    public JAXBElement<Tipoidentificacion> createTipoidentificacion(Tipoidentificacion value) {
        return new JAXBElement<Tipoidentificacion>(_Tipoidentificacion_QNAME, Tipoidentificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tercero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "tercero")
    public JAXBElement<Tercero> createTercero(Tercero value) {
        return new JAXBElement<Tercero>(_Tercero_QNAME, Tercero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoZona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "tipoZona")
    public JAXBElement<TipoZona> createTipoZona(TipoZona value) {
        return new JAXBElement<TipoZona>(_TipoZona_QNAME, TipoZona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProveedorPorProveedorIdWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "consultaProveedorPorProveedorIdWSResponse")
    public JAXBElement<ConsultaProveedorPorProveedorIdWSResponse> createConsultaProveedorPorProveedorIdWSResponse(ConsultaProveedorPorProveedorIdWSResponse value) {
        return new JAXBElement<ConsultaProveedorPorProveedorIdWSResponse>(_ConsultaProveedorPorProveedorIdWSResponse_QNAME, ConsultaProveedorPorProveedorIdWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estanteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "estanteria")
    public JAXBElement<Estanteria> createEstanteria(Estanteria value) {
        return new JAXBElement<Estanteria>(_Estanteria_QNAME, Estanteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProductoUbicacionWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "crearProductoUbicacionWS")
    public JAXBElement<CrearProductoUbicacionWS> createCrearProductoUbicacionWS(CrearProductoUbicacionWS value) {
        return new JAXBElement<CrearProductoUbicacionWS>(_CrearProductoUbicacionWS_QNAME, CrearProductoUbicacionWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "consultaProductoUbicacionsByIdProductoUbicacionWSResponse")
    public JAXBElement<ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse> createConsultaProductoUbicacionsByIdProductoUbicacionWSResponse(ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse value) {
        return new JAXBElement<ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse>(_ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse_QNAME, ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Catalogue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "catalogue")
    public JAXBElement<Catalogue> createCatalogue(Catalogue value) {
        return new JAXBElement<Catalogue>(_Catalogue_QNAME, Catalogue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProductoUbicacionWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "crearProductoUbicacionWSResponse")
    public JAXBElement<CrearProductoUbicacionWSResponse> createCrearProductoUbicacionWSResponse(CrearProductoUbicacionWSResponse value) {
        return new JAXBElement<CrearProductoUbicacionWSResponse>(_CrearProductoUbicacionWSResponse_QNAME, CrearProductoUbicacionWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Warehouse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "warehouse")
    public JAXBElement<Warehouse> createWarehouse(Warehouse value) {
        return new JAXBElement<Warehouse>(_Warehouse_QNAME, Warehouse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearTerceroWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "crearTerceroWSResponse")
    public JAXBElement<CrearTerceroWSResponse> createCrearTerceroWSResponse(CrearTerceroWSResponse value) {
        return new JAXBElement<CrearTerceroWSResponse>(_CrearTerceroWSResponse_QNAME, CrearTerceroWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarMovimientoWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "generarMovimientoWS")
    public JAXBElement<GenerarMovimientoWS> createGenerarMovimientoWS(GenerarMovimientoWS value) {
        return new JAXBElement<GenerarMovimientoWS>(_GenerarMovimientoWS_QNAME, GenerarMovimientoWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Zona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "zona")
    public JAXBElement<Zona> createZona(Zona value) {
        return new JAXBElement<Zona>(_Zona_QNAME, Zona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPurchaseOrderPorPurchaseOrderIdWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "consultaPurchaseOrderPorPurchaseOrderIdWS")
    public JAXBElement<ConsultaPurchaseOrderPorPurchaseOrderIdWS> createConsultaPurchaseOrderPorPurchaseOrderIdWS(ConsultaPurchaseOrderPorPurchaseOrderIdWS value) {
        return new JAXBElement<ConsultaPurchaseOrderPorPurchaseOrderIdWS>(_ConsultaPurchaseOrderPorPurchaseOrderIdWS_QNAME, ConsultaPurchaseOrderPorPurchaseOrderIdWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Empleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "empleado")
    public JAXBElement<Empleado> createEmpleado(Empleado value) {
        return new JAXBElement<Empleado>(_Empleado_QNAME, Empleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Provider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "provider")
    public JAXBElement<Provider> createProvider(Provider value) {
        return new JAXBElement<Provider>(_Provider_QNAME, Provider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProveedorPorProveedorIdWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "consultaProveedorPorProveedorIdWS")
    public JAXBElement<ConsultaProveedorPorProveedorIdWS> createConsultaProveedorPorProveedorIdWS(ConsultaProveedorPorProveedorIdWS value) {
        return new JAXBElement<ConsultaProveedorPorProveedorIdWS>(_ConsultaProveedorPorProveedorIdWS_QNAME, ConsultaProveedorPorProveedorIdWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaTerceroPorTerceroIdWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "consultaTerceroPorTerceroIdWS")
    public JAXBElement<ConsultaTerceroPorTerceroIdWS> createConsultaTerceroPorTerceroIdWS(ConsultaTerceroPorTerceroIdWS value) {
        return new JAXBElement<ConsultaTerceroPorTerceroIdWS>(_ConsultaTerceroPorTerceroIdWS_QNAME, ConsultaTerceroPorTerceroIdWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cargo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "cargo")
    public JAXBElement<Cargo> createCargo(Cargo value) {
        return new JAXBElement<Cargo>(_Cargo_QNAME, Cargo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarProductoUbicacionWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "modificarProductoUbicacionWSResponse")
    public JAXBElement<ModificarProductoUbicacionWSResponse> createModificarProductoUbicacionWSResponse(ModificarProductoUbicacionWSResponse value) {
        return new JAXBElement<ModificarProductoUbicacionWSResponse>(_ModificarProductoUbicacionWSResponse_QNAME, ModificarProductoUbicacionWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearTerceroWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "crearTerceroWS")
    public JAXBElement<CrearTerceroWS> createCrearTerceroWS(CrearTerceroWS value) {
        return new JAXBElement<CrearTerceroWS>(_CrearTerceroWS_QNAME, CrearTerceroWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarProductoUbicacionWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "modificarProductoUbicacionWS")
    public JAXBElement<ModificarProductoUbicacionWS> createModificarProductoUbicacionWS(ModificarProductoUbicacionWS value) {
        return new JAXBElement<ModificarProductoUbicacionWS>(_ModificarProductoUbicacionWS_QNAME, ModificarProductoUbicacionWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProductoUbicacionWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "listProductoUbicacionWS")
    public JAXBElement<ListProductoUbicacionWS> createListProductoUbicacionWS(ListProductoUbicacionWS value) {
        return new JAXBElement<ListProductoUbicacionWS>(_ListProductoUbicacionWS_QNAME, ListProductoUbicacionWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMovimientosByTipoMovimientoWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "listMovimientosByTipoMovimientoWS")
    public JAXBElement<ListMovimientosByTipoMovimientoWS> createListMovimientosByTipoMovimientoWS(ListMovimientosByTipoMovimientoWS value) {
        return new JAXBElement<ListMovimientosByTipoMovimientoWS>(_ListMovimientosByTipoMovimientoWS_QNAME, ListMovimientosByTipoMovimientoWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProductoUbicacionWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "listProductoUbicacionWSResponse")
    public JAXBElement<ListProductoUbicacionWSResponse> createListProductoUbicacionWSResponse(ListProductoUbicacionWSResponse value) {
        return new JAXBElement<ListProductoUbicacionWSResponse>(_ListProductoUbicacionWSResponse_QNAME, ListProductoUbicacionWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTipoMovimientoWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "listTipoMovimientoWS")
    public JAXBElement<ListTipoMovimientoWS> createListTipoMovimientoWS(ListTipoMovimientoWS value) {
        return new JAXBElement<ListTipoMovimientoWS>(_ListTipoMovimientoWS_QNAME, ListTipoMovimientoWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProductoUbicacionsByIdProductoUbicacionWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "consultaProductoUbicacionsByIdProductoUbicacionWS")
    public JAXBElement<ConsultaProductoUbicacionsByIdProductoUbicacionWS> createConsultaProductoUbicacionsByIdProductoUbicacionWS(ConsultaProductoUbicacionsByIdProductoUbicacionWS value) {
        return new JAXBElement<ConsultaProductoUbicacionsByIdProductoUbicacionWS>(_ConsultaProductoUbicacionsByIdProductoUbicacionWS_QNAME, ConsultaProductoUbicacionsByIdProductoUbicacionWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarTerceroWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "modificarTerceroWSResponse")
    public JAXBElement<ModificarTerceroWSResponse> createModificarTerceroWSResponse(ModificarTerceroWSResponse value) {
        return new JAXBElement<ModificarTerceroWSResponse>(_ModificarTerceroWSResponse_QNAME, ModificarTerceroWSResponse.class, null, value);
    }

}
