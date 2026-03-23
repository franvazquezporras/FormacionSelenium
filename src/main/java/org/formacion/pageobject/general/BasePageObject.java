package org.formacion.pageobject.general;

import org.apache.commons.logging.Log;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class BasePageObject {
    // <editor-fold desc="Variables">
    protected WebDriver driver;
    protected LogManager log;
    protected String mainClass;
    private static final String ERROR_CRITICO = "ERRORCRITICO";
    //</editor-fold>

    // <editor-fold desc="Constructor">
    protected BasePageObject(WebDriver driver, LogManager log,String mainClass){
        this.driver = driver;
        this.log = log;
        this.mainClass = mainClass;
    }
    //</editor-fold>

    public WebDriver getDriver() {
        return driver;
    }

    protected  boolean esClickeable(By by){
        try{
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(by));
            return true;
        }catch (Exception e){
            return false;
        }
    }


    public void esperarPagina(By by,String nombrePantalla){
        try{
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
            wait.until(ExpectedConditions.elementToBeClickable(by));
            log.reporta("INFO","Se realiza correctamente la carga de la página "+nombrePantalla);
        }catch(Exception e){
            log.reporta(ERROR_CRITICO,"No se ha podido cargar la página: "+nombrePantalla);
            log.reportaStackTrace(e);
        }
    }

    public void clickElemento(By by,String nombreBoton){
        try{
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(by));
            WebElement element = driver.findElement(by);
            element.click();
        }catch (Exception e){
            reportaError(nombreBoton, by.toString());
        }
    }

    public void setText(By by,String text){
        try{
            WebElement input = driver.findElement(by);
            input.click();
            input.sendKeys(Keys.CONTROL+"a");
            input.sendKeys(Keys.DELETE);

            WebElement element = driver.findElement(by);
            WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(by));
            if(text != null){
                String trimText = text.trim();
                element.click();
                element.clear();
                element.sendKeys(trimText);

            }
        }catch (Exception e){
            reportaError(by.toString());
        }
    }

    public boolean reportaError(String... args){
        ArrayList<String> elementosReporte = new ArrayList<>();
        if(args.length>0){
            for(String text : args){
                elementosReporte.add(text);
            }
        }

        //Reporta aquellos elementos de la pagina que tengan 2 parametros
        if(elementosReporte.size()==2){
            log.reporta(ERROR_CRITICO,"El elemento - "+elementosReporte.get(0)+" - con localizador: "+ elementosReporte.get(1)+" no se ha encontrado en la página");
        }

        //Reporta aquellos elementos de la pagina que tengan 1 parametro
        if(elementosReporte.size()==1){
            log.reporta(ERROR_CRITICO,"El elemento cuyo localizado corresponde a: - "+elementosReporte.get(0)+" - no se ha encontrado en la página");
        }
        return false;
    }
}
