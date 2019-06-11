package com.aerotivelabs;

import com.aerotivelabs.bridge.JavaQuestions;
import com.aerotivelabs.bridge.QuestionFormat;
import com.aerotivelabs.decorator.ChineseFood;
import com.aerotivelabs.decorator.NonVegetarianFood;
import com.aerotivelabs.decorator.VegetarianFood;
import com.aerotivelabs.facade.DoorSecurity;
import com.aerotivelabs.facade.Personel;
import com.aerotivelabs.facade.PersonelWithSecurityFacade;
import com.aerotivelabs.memento.Memento;
import com.aerotivelabs.memento.OrderState;
import com.aerotivelabs.observer.MessageCenter;
import com.aerotivelabs.observer.MessageClient;
import com.aerotivelabs.strategy.Order;
import com.aerotivelabs.strategy.OrderDeliveryManager;
import com.aerotivelabs.strategy2.BookingManager;
import com.aerotivelabs.strategy2.ISeat;
import com.aerotivelabs.strategy2.PriceStrategyManager;
import com.aerotivelabs.strategy2.Seat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Decorator Pattern
//        VegetarianFood veggie = new VegetarianFood();
//
//        System.out.println("Vegeterian Food");
//        System.out.println(veggie.prepareFood());
//        System.out.println(veggie.foodPrice());
//        System.out.println("=============================");
//
//        NonVegetarianFood nonveggie = new NonVegetarianFood(veggie);
//
//        System.out.println("Non Vegeterian Food");
//        System.out.println(nonveggie.prepareFood());
//        System.out.println(nonveggie.foodPrice());
//        System.out.println("=============================");
//
//
//        ChineseFood chinese = new ChineseFood(veggie);
//
//        System.out.println("Chinese Food");
//        System.out.println(chinese.prepareFood());
//        System.out.println(chinese.foodPrice());
//        System.out.println("=============================");

//        PersonelWithSecurityFacade f = new PersonelWithSecurityFacade();
//        f.CreatePersonalWithSecurityAuthorization("Gani","Tombalak", DoorSecurity.getDoors());

//        Bridge Pattern
//        QuestionFormat questionFormat = new QuestionFormat("Java Programming Questions");
//        questionFormat.setQ(new JavaQuestions());
//        questionFormat.getQ().displayQuestion();
//        questionFormat.getQ().nextQuestion();
//        questionFormat.getQ().displayQuestion();

//        MessageCenter mc = new MessageCenter();
//
//        MessageClient mc1 = new MessageClient(1,mc);
//        MessageClient mc2 = new MessageClient(2,mc);
//        MessageClient mc3 = new MessageClient(3,mc);
//
//        mc1.connect();
//        mc2.connect();
//        mc3.connect();
//
//        mc1.sendMessage("Hey everbody!How is it going?");
//
//        mc2.sendMessage("Hey dude! Awesome!..");

//        Memento mem = new Memento();
//        Order myOrder = new Order(mem);
//
//        myOrder.setState(OrderState.PreAuthorized);
//        System.out.println(myOrder.getState());
//
//        myOrder.setState(OrderState.Confirmed);
//        System.out.println(myOrder.getState());
//
//        mem.Undo();
//        System.out.println(myOrder.getState());
//
//        mem.Undo();
//        System.out.println(myOrder.getState());


//        Order o = new Order("Internal","Parcel");
//        Order o2 = new Order("External","Parcel");
//        Order o3 = new Order("External","Ship");
//
//        OrderDeliveryManager odm = new OrderDeliveryManager();
//
//        odm.ScanOrder(o);
//        odm.ScanOrder(o2);
//        odm.ScanOrder(o3);
//
//        o.deliver();
//        o2.deliver();
//        o3.deliver();


        BookingManager bm = new BookingManager(20d);
        PriceStrategyManager psm = new PriceStrategyManager(bm);
        List<ISeat> seats= Arrays.asList(new Seat("A1")
        ,new Seat("A1")
        ,new Seat("A2")
        ,new Seat("B1")
        ,new Seat("B2")
        ,new Seat("C1")
        ,new Seat("C3")
        ,new Seat("D1")
        ,new Seat("D2")
        ,new Seat("F1")
        , new Seat("F2")
        , new Seat("G1")
        , new Seat("G2")
        , new Seat("H1")
        , new Seat("H2")
        , new Seat("J1")
        , new Seat("J2")
        , new Seat("K1")
        , new Seat("K2"));

        seats.forEach(s->{
            psm.Identify(s);
            System.out.println(s.getSeatNumber() +": $"+s.getPriceStrategy().calculate());
            bm.BookNow(s);
        });




    }
}
