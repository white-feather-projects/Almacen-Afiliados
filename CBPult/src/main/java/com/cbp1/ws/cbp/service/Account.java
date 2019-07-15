
package com.cbp1.ws.cbp.service;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para account complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountAmortized" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="accountCommentsStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountIban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="arreasAccount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="assignedPlastic" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="avaliableBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="clientAdditional" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="clientId" type="{http://service.cbp.ws.cbp1.com/}client" minOccurs="0"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cutoffDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="duesLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fechaHoraCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fullPayment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="idAccount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minimunPayment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="officeId" type="{http://service.cbp.ws.cbp1.com/}office" minOccurs="0"/>
 *         &lt;element name="openingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="outstandingBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="overdueAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://service.cbp.ws.cbp1.com/}product" minOccurs="0"/>
 *         &lt;element name="totalBalance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account", propOrder = {
    "accountAmortized",
    "accountCommentsStatus",
    "accountIban",
    "accountNumber",
    "accountStatus",
    "accountType",
    "arreasAccount",
    "assignedPlastic",
    "avaliableBalance",
    "bin",
    "cardId",
    "clientAdditional",
    "clientId",
    "codigoUsuarioModifica",
    "cutoffDate",
    "duesLimit",
    "fechaHoraCarga",
    "fechaHoraModificacion",
    "fullPayment",
    "idAccount",
    "minimunPayment",
    "officeId",
    "openingDate",
    "outstandingBalance",
    "overdueAmount",
    "paymentDate",
    "productId",
    "totalBalance"
})
public class Account {

    protected BigInteger accountAmortized;
    protected String accountCommentsStatus;
    protected String accountIban;
    protected String accountNumber;
    protected String accountStatus;
    protected BigInteger accountType;
    protected Long arreasAccount;
    protected Short assignedPlastic;
    protected Long avaliableBalance;
    protected String bin;
    protected Long cardId;
    protected Short clientAdditional;
    protected Client clientId;
    protected Long codigoUsuarioModifica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cutoffDate;
    protected Double duesLimit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraCarga;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected Double fullPayment;
    protected Long idAccount;
    protected Double minimunPayment;
    protected Office officeId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openingDate;
    protected Double outstandingBalance;
    protected Double overdueAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDate;
    protected Product productId;
    protected double totalBalance;

    /**
     * Obtiene el valor de la propiedad accountAmortized.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountAmortized() {
        return accountAmortized;
    }

    /**
     * Define el valor de la propiedad accountAmortized.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountAmortized(BigInteger value) {
        this.accountAmortized = value;
    }

    /**
     * Obtiene el valor de la propiedad accountCommentsStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCommentsStatus() {
        return accountCommentsStatus;
    }

    /**
     * Define el valor de la propiedad accountCommentsStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCommentsStatus(String value) {
        this.accountCommentsStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad accountIban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIban() {
        return accountIban;
    }

    /**
     * Define el valor de la propiedad accountIban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIban(String value) {
        this.accountIban = value;
    }

    /**
     * Obtiene el valor de la propiedad accountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Define el valor de la propiedad accountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad accountStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Define el valor de la propiedad accountStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad accountType.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountType() {
        return accountType;
    }

    /**
     * Define el valor de la propiedad accountType.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountType(BigInteger value) {
        this.accountType = value;
    }

    /**
     * Obtiene el valor de la propiedad arreasAccount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArreasAccount() {
        return arreasAccount;
    }

    /**
     * Define el valor de la propiedad arreasAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArreasAccount(Long value) {
        this.arreasAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad assignedPlastic.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAssignedPlastic() {
        return assignedPlastic;
    }

    /**
     * Define el valor de la propiedad assignedPlastic.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAssignedPlastic(Short value) {
        this.assignedPlastic = value;
    }

    /**
     * Obtiene el valor de la propiedad avaliableBalance.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvaliableBalance() {
        return avaliableBalance;
    }

    /**
     * Define el valor de la propiedad avaliableBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvaliableBalance(Long value) {
        this.avaliableBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad bin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBin() {
        return bin;
    }

    /**
     * Define el valor de la propiedad bin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBin(String value) {
        this.bin = value;
    }

    /**
     * Obtiene el valor de la propiedad cardId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardId() {
        return cardId;
    }

    /**
     * Define el valor de la propiedad cardId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardId(Long value) {
        this.cardId = value;
    }

    /**
     * Obtiene el valor de la propiedad clientAdditional.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getClientAdditional() {
        return clientAdditional;
    }

    /**
     * Define el valor de la propiedad clientAdditional.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setClientAdditional(Short value) {
        this.clientAdditional = value;
    }

    /**
     * Obtiene el valor de la propiedad clientId.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClientId() {
        return clientId;
    }

    /**
     * Define el valor de la propiedad clientId.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClientId(Client value) {
        this.clientId = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUsuarioModifica.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoUsuarioModifica() {
        return codigoUsuarioModifica;
    }

    /**
     * Define el valor de la propiedad codigoUsuarioModifica.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoUsuarioModifica(Long value) {
        this.codigoUsuarioModifica = value;
    }

    /**
     * Obtiene el valor de la propiedad cutoffDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCutoffDate() {
        return cutoffDate;
    }

    /**
     * Define el valor de la propiedad cutoffDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCutoffDate(XMLGregorianCalendar value) {
        this.cutoffDate = value;
    }

    /**
     * Obtiene el valor de la propiedad duesLimit.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDuesLimit() {
        return duesLimit;
    }

    /**
     * Define el valor de la propiedad duesLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDuesLimit(Double value) {
        this.duesLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraCarga.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraCarga() {
        return fechaHoraCarga;
    }

    /**
     * Define el valor de la propiedad fechaHoraCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraCarga(XMLGregorianCalendar value) {
        this.fechaHoraCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraModificacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraModificacion() {
        return fechaHoraModificacion;
    }

    /**
     * Define el valor de la propiedad fechaHoraModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraModificacion(XMLGregorianCalendar value) {
        this.fechaHoraModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fullPayment.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFullPayment() {
        return fullPayment;
    }

    /**
     * Define el valor de la propiedad fullPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFullPayment(Double value) {
        this.fullPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad idAccount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAccount() {
        return idAccount;
    }

    /**
     * Define el valor de la propiedad idAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAccount(Long value) {
        this.idAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad minimunPayment.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimunPayment() {
        return minimunPayment;
    }

    /**
     * Define el valor de la propiedad minimunPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimunPayment(Double value) {
        this.minimunPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad officeId.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getOfficeId() {
        return officeId;
    }

    /**
     * Define el valor de la propiedad officeId.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setOfficeId(Office value) {
        this.officeId = value;
    }

    /**
     * Obtiene el valor de la propiedad openingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpeningDate() {
        return openingDate;
    }

    /**
     * Define el valor de la propiedad openingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpeningDate(XMLGregorianCalendar value) {
        this.openingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad outstandingBalance.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOutstandingBalance() {
        return outstandingBalance;
    }

    /**
     * Define el valor de la propiedad outstandingBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOutstandingBalance(Double value) {
        this.outstandingBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad overdueAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverdueAmount() {
        return overdueAmount;
    }

    /**
     * Define el valor de la propiedad overdueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverdueAmount(Double value) {
        this.overdueAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Define el valor de la propiedad paymentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductId(Product value) {
        this.productId = value;
    }

    /**
     * Obtiene el valor de la propiedad totalBalance.
     * 
     */
    public double getTotalBalance() {
        return totalBalance;
    }

    /**
     * Define el valor de la propiedad totalBalance.
     * 
     */
    public void setTotalBalance(double value) {
        this.totalBalance = value;
    }

}
