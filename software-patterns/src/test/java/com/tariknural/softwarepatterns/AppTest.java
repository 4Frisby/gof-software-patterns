package com.tariknural.softwarepatterns;

import static org.junit.Assert.assertEquals;
import com.tariknural.softwarepatterns.behavioral.command.File;
import com.tariknural.softwarepatterns.behavioral.command.ICommandInterface;
import com.tariknural.softwarepatterns.behavioral.command.IFile;
import com.tariknural.softwarepatterns.behavioral.command.ReadFileOperation;
import com.tariknural.softwarepatterns.behavioral.command.SaveFileOperation;
import com.tariknural.softwarepatterns.behavioral.observer.IObserver;
import com.tariknural.softwarepatterns.behavioral.observer.NewsAgency;
import com.tariknural.softwarepatterns.behavioral.observer.NewsChannel;
import com.tariknural.softwarepatterns.behavioral.observer.NewsRadio;
import com.tariknural.softwarepatterns.behavioral.state.StateKeeper;
import com.tariknural.softwarepatterns.behavioral.strategy.ConcreteEncryptor2;
import com.tariknural.softwarepatterns.behavioral.strategy.Context;
import com.tariknural.softwarepatterns.creational.abstractfactory.AbstractFactory;
import com.tariknural.softwarepatterns.creational.abstractfactory.FactoryProvider;
import com.tariknural.softwarepatterns.creational.abstractfactory.IButton;
import com.tariknural.softwarepatterns.creational.abstractfactory.ICheckBox;
import com.tariknural.softwarepatterns.creational.abstractfactory.LinuxCheckBox;
import com.tariknural.softwarepatterns.creational.abstractfactory.WindowsButton;
import com.tariknural.softwarepatterns.structural.adapter.AmericanCar;
import com.tariknural.softwarepatterns.structural.adapter.IMovable;
import com.tariknural.softwarepatterns.structural.adapter.IMovableAdapter;
import com.tariknural.softwarepatterns.structural.adapter.MovableAdapterImpl;
import com.tariknural.softwarepatterns.structural.bridge.Bike;
import com.tariknural.softwarepatterns.structural.bridge.Car;
import com.tariknural.softwarepatterns.structural.composite.CompanyInterface;
import com.tariknural.softwarepatterns.structural.composite.FinanceDepartment;
import com.tariknural.softwarepatterns.structural.composite.HeadDepartment;
import com.tariknural.softwarepatterns.structural.proxy.CommonInterface;
import com.tariknural.softwarepatterns.structural.proxy.ExistingObject;
import com.tariknural.softwarepatterns.structural.proxy.ProxyObject;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
        System.out.println("Adapter pattern test!");
        IMovable americanCar = new AmericanCar();
        IMovableAdapter americanCarAdapter = new MovableAdapterImpl(americanCar);
        assertEquals(americanCarAdapter.getSpeed(), 431.30312, 0.00001);
    }

    @Test
    public void bridgePattern(){
        System.out.println("Bridge pattern test");
        Car c = new Car(3);
        Bike b = new Bike(2);
        c.manifacture();
        b.manifacture();
    }

    @Test
    public void compositePattern(){
        CompanyInterface fd = new FinanceDepartment();
        CompanyInterface hd = new HeadDepartment();
        fd.printName();
        hd.printName();
    }

    @Test
    public void proxyPattern(){
        CommonInterface po = new ProxyObject();
        CommonInterface eo = new ExistingObject();
        assertEquals(5, eo.returnNumber());
        assertEquals(10, po.returnNumber());
    }

    @Test
    public void observerPattern(){
        IObserver nc = new NewsChannel();
        IObserver nr = new NewsRadio();
        NewsAgency na = new NewsAgency();
        na.addObserver(nc);
        na.addObserver(nr);
        na.setNews("corona papi");
        assertEquals("corona papi", nc.getNews());
        assertEquals("corona papi", nr.getNews());
    }

    @Test
    public void commandPattern(){
        IFile f = new File();
        ICommandInterface rFile = new ReadFileOperation();
        rFile.setFile(f);
        assertEquals("command class reading from text file", rFile.execute());
        
        ICommandInterface sFile = new SaveFileOperation();
        sFile.setFile(f);
        assertEquals("command class saving to text file", sFile.execute());
    }

    @Test
    public void statePattern(){
        StateKeeper sk = new StateKeeper();
        sk.nextState();
        assertEquals("Package delivered, to the office.", sk.getState().printStatus());
    }

    @Test   
    public void strategyPattern(){
        Context c = new Context();
        assertEquals("class 1 encrypt", c.executeEncrypt("text"));
        c.setIe(new ConcreteEncryptor2());
        assertEquals("class 2 encrypt", c.executeEncrypt("text"));
    }

    @Test
    public void abstractFactory(){
        FactoryProvider fp = new FactoryProvider();
        AbstractFactory buttonFactory = fp.getFactory("windows");
        IButton winButton = buttonFactory.getButton();
        assertEquals(WindowsButton.class, winButton.getClass());

        AbstractFactory checkBoxFactory = fp.getFactory("linux");
        ICheckBox linuxCheckBox = checkBoxFactory.getCheckBox();
        assertEquals(linuxCheckBox.getClass(), LinuxCheckBox.class);
    }

}
