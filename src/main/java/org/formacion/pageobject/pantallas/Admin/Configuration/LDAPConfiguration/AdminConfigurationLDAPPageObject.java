package org.formacion.pageobject.pantallas.Admin.Configuration.LDAPConfiguration;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationLDAPPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By checkEnableLDAP = By.xpath("");
    private By txtHost = By.xpath("");
    private By txtPort = By.xpath("");
    private By listaEncriptado = By.xpath("");
    private By listaLDAPImplementacion = By.xpath("");
    private By checkBindAnonymously = By.xpath("");
    private By txtDistinguishedName = By.xpath("");
    private By txtPassword = By.xpath("");
    private By txtBaseDistinguishedName = By.xpath("");
    private By listaSearchScope = By.xpath("");
    private By txtUserNameAttribute = By.xpath("");
    private By txtUserSearchFilter = By.xpath("");
    private By txtUserUniqueIDAttribute = By.xpath("");
    private By txtFirstName = By.xpath("");
    private By txtMiddleName = By.xpath("");
    private By txtLastName = By.xpath("");
    private By txtUserStatus = By.xpath("");
    private By txtWorkEmail= By.xpath("");
    private By txtEmployeeId= By.xpath("");
    private By checkWorkEmail= By.xpath("");
    private By checkEmployeeId = By.xpath("");
    private By checkMergeLDAPUsers = By.xpath("");
    private By txtSyncInterval = By.xpath("");

    private By btnSave = By.xpath("");
    private By btnTestConnection = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminConfigurationLDAPPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla LDAP Configuracion");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// CHECKBOXES
// -------------------------

    /**
     * Activa o desactiva la opción "Enable LDAP".
     * Permite habilitar o deshabilitar la autenticación LDAP.
     */
    public void pulsarCheckEnableLDAP(){
        esClickeable(checkEnableLDAP);
        clickElemento(checkEnableLDAP, "Seleccionar Enable LDAP");
    }

    /**
     * Activa o desactiva la opción "Bind Anonymously".
     * Determina si la conexión LDAP se realiza sin credenciales.
     */
    public void pulsarCheckBindAnonymously(){
        esClickeable(checkBindAnonymously);
        clickElemento(checkBindAnonymously, "Seleccionar Bind Anonymously");
    }

    /**
     * Activa o desactiva la opción "Work Email".
     * Indica si se debe sincronizar el correo laboral.
     */
    public void pulsarCheckWorkEmail(){
        esClickeable(checkWorkEmail);
        clickElemento(checkWorkEmail, "Seleccionar Work Email");
    }

    /**
     * Activa o desactiva la opción "Employee ID".
     * Indica si se debe sincronizar el ID del empleado.
     */
    public void pulsarCheckEmployeeId(){
        esClickeable(checkEmployeeId);
        clickElemento(checkEmployeeId, "Seleccionar Employee ID");
    }

    /**
     * Activa o desactiva la opción "Merge LDAP Users".
     * Permite combinar usuarios LDAP con usuarios existentes.
     */
    public void pulsarCheckMergeLDAPUsers(){
        esClickeable(checkMergeLDAPUsers);
        clickElemento(checkMergeLDAPUsers, "Seleccionar Merge LDAP Users");
    }

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el host del servidor LDAP.
     * @param texto Dirección del servidor LDAP.
     */
    public void insertarHost(String texto){
        esClickeable(txtHost);
        setText(txtHost, texto);
    }

    /**
     * Inserta el puerto del servidor LDAP.
     * @param texto Número de puerto.
     */
    public void insertarPort(String texto){
        esClickeable(txtPort);
        setText(txtPort, texto);
    }

    /**
     * Inserta el Distinguished Name (DN) para la autenticación.
     * @param texto DN del usuario LDAP.
     */
    public void insertarDistinguishedName(String texto){
        esClickeable(txtDistinguishedName);
        setText(txtDistinguishedName, texto);
    }

    /**
     * Inserta la contraseña del usuario LDAP.
     * @param texto Contraseña del usuario.
     */
    public void insertarPassword(String texto){
        esClickeable(txtPassword);
        setText(txtPassword, texto);
    }

    /**
     * Inserta el Base Distinguished Name.
     * @param texto Base DN para búsquedas LDAP.
     */
    public void insertarBaseDistinguishedName(String texto){
        esClickeable(txtBaseDistinguishedName);
        setText(txtBaseDistinguishedName, texto);
    }

    /**
     * Inserta el atributo de nombre de usuario.
     * @param texto Atributo LDAP correspondiente al nombre de usuario.
     */
    public void insertarUserNameAttribute(String texto){
        esClickeable(txtUserNameAttribute);
        setText(txtUserNameAttribute, texto);
    }

    /**
     * Inserta el filtro de búsqueda de usuario.
     * @param texto Filtro LDAP para localizar usuarios.
     */
    public void insertarUserSearchFilter(String texto){
        esClickeable(txtUserSearchFilter);
        setText(txtUserSearchFilter, texto);
    }

    /**
     * Inserta el atributo de ID único del usuario.
     * @param texto Atributo LDAP que identifica al usuario de forma única.
     */
    public void insertarUserUniqueIDAttribute(String texto){
        esClickeable(txtUserUniqueIDAttribute);
        setText(txtUserUniqueIDAttribute, texto);
    }

    /**
     * Inserta el nombre del usuario.
     * @param texto Nombre del usuario.
     */
    public void insertarFirstName(String texto){
        esClickeable(txtFirstName);
        setText(txtFirstName, texto);
    }

    /**
     * Inserta el segundo nombre del usuario.
     * @param texto Segundo nombre.
     */
    public void insertarMiddleName(String texto){
        esClickeable(txtMiddleName);
        setText(txtMiddleName, texto);
    }

    /**
     * Inserta el apellido del usuario.
     * @param texto Apellido del usuario.
     */
    public void insertarLastName(String texto){
        esClickeable(txtLastName);
        setText(txtLastName, texto);
    }

    /**
     * Inserta el estado del usuario.
     * @param texto Estado del usuario.
     */
    public void insertarUserStatus(String texto){
        esClickeable(txtUserStatus);
        setText(txtUserStatus, texto);
    }

    /**
     * Inserta el correo laboral del usuario.
     * @param texto Correo laboral.
     */
    public void insertarWorkEmail(String texto){
        esClickeable(txtWorkEmail);
        setText(txtWorkEmail, texto);
    }

    /**
     * Inserta el ID del empleado.
     * @param texto Identificador del empleado.
     */
    public void insertarEmployeeId(String texto){
        esClickeable(txtEmployeeId);
        setText(txtEmployeeId, texto);
    }

    /**
     * Inserta el intervalo de sincronización LDAP.
     * @param texto Intervalo en minutos.
     */
    public void insertarSyncInterval(String texto){
        esClickeable(txtSyncInterval);
        setText(txtSyncInterval, texto);
    }

// -------------------------
// LISTAS DESPLEGABLES
// -------------------------

    /**
     * Selecciona un valor en la lista de encriptación.
     * @param texto Valor visible a seleccionar.
     */
    public void seleccionarEncriptado(String texto){
        esClickeable(listaEncriptado);
        seleccionarOpcion(listaEncriptado, texto);
    }

    /**
     * Selecciona la implementación LDAP.
     * @param texto Valor visible a seleccionar.
     */
    public void seleccionarLDAPImplementacion(String texto){
        esClickeable(listaLDAPImplementacion);
        seleccionarOpcion(listaLDAPImplementacion, texto);
    }

    /**
     * Selecciona el alcance de búsqueda LDAP.
     * @param texto Valor visible a seleccionar.
     */
    public void seleccionarSearchScope(String texto){
        esClickeable(listaSearchScope);
        seleccionarOpcion(listaSearchScope, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda la configuración LDAP.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    /**
     * Realiza clic en el botón Test Connection.
     * Prueba la conexión con el servidor LDAP configurado.
     */
    public void pulsarBotonTestConnection(){
        esClickeable(btnTestConnection);
        clickElemento(btnTestConnection, "Pulsar botón Test Connection");
    }

// </editor-fold>
}
