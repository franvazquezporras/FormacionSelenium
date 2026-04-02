package testcases;

import io.qameta.allure.*;
import org.formacion.base.TestCaseBase;
import org.formacion.pageobject.acceso.LoginPageObject;
import org.formacion.pageobject.comun.ComunPageObject;
import org.formacion.pageobject.comun.DeletePopupPageObject;
import org.formacion.pageobject.menus.*;
import org.formacion.pageobject.pantallas.Admin.UserManagement.AdminUsersPageObject;
import org.formacion.pageobject.pantallas.PIM.AddEmployee.AddEmployeePageObject;
import org.formacion.pageobject.pantallas.PIM.EmployeeList.EditEmployeePageObject;
import org.formacion.pageobject.pantallas.PIM.EmployeeList.EmployeeListPageObject;
import org.formacion.utils.allure.AllureListener;
import org.formacion.utils.properties.PropertiesFormacion;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

@Epic("PIM")
@Feature(("Creacion de Empleados"))
@Severity(SeverityLevel.CRITICAL)
@Story("Crear un empleado correctamente")

@Listeners({AllureListener.class})
public class TC_CreacionDeUsuarios extends TestCaseBase {

    @Test
    @Description("Crear un empleado correctamente")
    public void test() throws MalformedURLException, InterruptedException{
        // <editor-fold desc="Configuración Test">
        String mainClass = this.getClass().getSimpleName();
        WebDriver driver = getDriver();
        // </editor-fold>

        try{
            // <editor-fold desc="Inicialización PageObject">
            LoginPageObject login = new LoginPageObject(driver,log,mainClass);
            ComunPageObject comun = new ComunPageObject(driver,log,mainClass);
            AdminMenuPageObject admin = new AdminMenuPageObject(driver,log,mainClass);
            AdminUsersPageObject adminUser = new AdminUsersPageObject(driver,log,mainClass);
            PIMMenuPageObject pim = new PIMMenuPageObject(driver,log,mainClass);
            AddEmployeePageObject addEmployee = new AddEmployeePageObject(driver,log,mainClass);
            EditEmployeePageObject editEmployee = new EditEmployeePageObject(driver,log,mainClass);
            DeletePopupPageObject delete = new DeletePopupPageObject(driver,log,mainClass);
            EmployeeListPageObject listEmployee = new EmployeeListPageObject(driver,log,mainClass);
            // </editor-fold>

            //Inicio Test
            irALogin();
            //step1
            LoginUsuario(login);
            //step2
            NavegarAlistaEmpleados(comun);
            //step3
            NavegarAAgregarEmpleado(pim);
            //step4
            CrearEmpleado(addEmployee);
            //step5
            NavegarAUsers(editEmployee,comun,admin);
            //step6
            BuscarUsuario(adminUser);
            //step7
            EliminarUsuario(adminUser,delete);
            //step8
            BuscarEmpleado(comun,pim,listEmployee);
            //step9
            EliminarEmpleado(listEmployee,delete);
            //Step10
            CerrarSesion(comun);

            if(log.devuelveCriticidad()){
                log.reporta("INFO","-----El caso de prueba se ha completado correctamente------");
                log.reporta("INFO","Fin");
            }
        }catch(Exception e){
            takeScreenshot(this.getClass().getSimpleName()+"_ERROR");
            log.reporta("ERROR","-------El caso de prueba no ha finalizado correctamente------");
            throw new NoSuchElementException(e.getMessage());
        }
    }

    // <editor-fold desc="Step1">
    @Step("Step1: Login")
    public void LoginUsuario(LoginPageObject login){
        log.reporta("INFO","Step1: Login");
        login.esperarSincronizacion();
        login.IntroducirUsuario(PropertiesFormacion.USERNAME);
        login.IntroducirPassword(PropertiesFormacion.PASSWORD);
        login.PulsarLogin();
    }
    // </editor-fold>

    // <editor-fold desc="Step2">
    @Step("Step2: Navegar a EmployeeList")
    public void NavegarAlistaEmpleados(ComunPageObject comun){
        log.reporta("INFO","Step2: Navegar a EmployeeList");
        comun.esperarSincronizacion();
        comun.pulsarBotonMenuLateralPIM();
    }
    // </editor-fold>

    // <editor-fold desc="Step3">
    @Step("Step3: Navegar a AddEmployee")
    public void NavegarAAgregarEmpleado(PIMMenuPageObject pim){
        log.reporta("INFO","Step3: Navegar a AddEmployee");
        Allure.step("Step3: Navegar a AddEmployee");

        pim.esperarSincronizacion();
        pim.pulsarBotonAddEmployee();
    }
    // </editor-fold>

    // <editor-fold desc="Step4">
    @Step("Step4: Agregar Empleado")
    public void CrearEmpleado(AddEmployeePageObject addEmployee) throws InterruptedException {
        log.reporta("INFO","Step4: Agregar Empleado");
        addEmployee.esperarSincronizacion();
        Thread.sleep(5000);
        addEmployee.insertarFirstName(PropertiesFormacion.FIRSTNAME);
        addEmployee.insertarMiddleName(PropertiesFormacion.MIDNAME);
        addEmployee.insertarLastName(PropertiesFormacion.LASTNAME);
        addEmployee.pulsarCheckLoginDetails();
        addEmployee.insertarUserName(PropertiesFormacion.USERID);
        addEmployee.insertarPassword(PropertiesFormacion.PASS);
        addEmployee.insertarRepeatPassword(PropertiesFormacion.PASS);
        addEmployee.pulsarBotonSave();
    }
    // </editor-fold>

    // <editor-fold desc="Step5">
    @Step("Step5: Navegar a Admin Users")
    public void NavegarAUsers(EditEmployeePageObject editEmployee,ComunPageObject comun,AdminMenuPageObject admin){
        log.reporta("INFO","Step5: Navegar a Admin Users");
        editEmployee.esperarSincronizacion();
        comun.pulsarBotonMenuLateralAdmin();
        admin.esperarSincronizacion();
        admin.pulsarBotonUserManagment();
        admin.pulsarBotonUserManagmentUsers();
    }
    // </editor-fold>

    // <editor-fold desc="Step6">
    @Step("Step6: Buscar Usuario")
    public void BuscarUsuario(AdminUsersPageObject adminUser){
        log.reporta("INFO","Step6: Buscar Usuario");
        adminUser.esperarSincronizacion();
        adminUser.insertarUsername(PropertiesFormacion.USERID);
        adminUser.pulsarBotonSearch();
    }
    // </editor-fold>

    // <editor-fold desc="Step7">
    @Step("Step7: Eliminar Usuario")
    public void EliminarUsuario(AdminUsersPageObject adminUser, DeletePopupPageObject delete){
        log.reporta("INFO","Step7: Eliminar Usuario");
        adminUser.pulsarBotonEliminar();
        delete.esperarSincronizacion();
        delete.pulsarBotonYes();
    }
    // </editor-fold>

    // <editor-fold desc="Step8">
    @Step("Step8: Buscar Empleado")
    public void BuscarEmpleado(ComunPageObject comun,PIMMenuPageObject pim,EmployeeListPageObject listEmployee){
        log.reporta("INFO","Step8: Buscar Empleado");
        comun.pulsarBotonMenuLateralPIM();
        pim.esperarSincronizacion();
        pim.pulsarBotonEmployeeList();
        listEmployee.esperarSincronizacion();
        listEmployee.insertarEmployeeName(PropertiesFormacion.FIRSTNAME+" "+PropertiesFormacion.MIDNAME+" "+PropertiesFormacion.LASTNAME);
        listEmployee.pulsarBotonSearch();
    }
    // </editor-fold>

    // <editor-fold desc="Step9">
    @Step("Step9: Eliminar Empleado")
    public void EliminarEmpleado(EmployeeListPageObject listEmployee,DeletePopupPageObject delete){
        log.reporta("INFO","Step9: Eliminar Empleado");
        listEmployee.pulsarBotonEliminar();
        delete.esperarSincronizacion();
        delete.pulsarBotonYes();
    }
    // </editor-fold>

    // <editor-fold desc="Step10">
    @Step("Step10: Cerrar Sesion")
    public void CerrarSesion(ComunPageObject comun) throws InterruptedException {
        log.reporta("INFO","Step10: Cerrar Sesion");
        comun.pulsarBotonBarraSuperiorMenuUsuario();
        comun.pulsarBotonBarraSuperiorMenuUsuarioLogout();
        Thread.sleep(5000);
    }
    // </editor-fold>

}
