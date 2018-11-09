/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.to.ride;

import java.awt.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author COSLAB
 */
public class Table extends Application {
    
    @Override
    public void start(Stage stage) {
        //Image image = new Image(Table.class.getResourceAsStream("0.jpg"));
 
         // simple displays ImageView the image as is
        //ImageView iv1 = new ImageView();
        //iv1.setImage(image);
        
        
        
        Button sf = new Button(); // SAN FRANCISCO
        Button la = new Button(); //LOS ANGELES
        Button lv = new Button(); //LAS VEGAS
        Button slc = new Button(); //SALT LAKE CITY
        Button pl = new Button(); //PORTLAND
        Button s = new Button(); //SEATTLE
        Button v = new Button(); //VANCOUVER
        Button c = new Button(); //CALGARY
        Button p = new Button(); //PHOENIX
        Button h = new Button(); //HELE
        Button ep = new Button(); //EL PASO
        Button sa = new Button(); //SAN ANTONIO
        Button d = new Button(); //DENVER
        Button w = new Button(); //WHINIPG
        Button ok = new Button(); //OKLAHOMA CITY
        Button da = new Button(); //DALLAS
        Button ho = new Button(); //HOUSTON
        Button kc = new Button(); //KANAS CITY
        Button o = new Button(); //OMAHA
        Button du = new Button(); //DULUTH
        Button no = new Button(); //NEW ORLEANS
        Button lr = new Button(); //LITTLE ROCK
        Button sl = new Button(); //SAINT LOUIS
        Button ch = new Button(); //CHICAGO
        Button sm = new Button(); //SAULT MARIO
        Button a = new Button(); //ATLANTA
        Button n = new Button(); //NASHVILLE
        Button ps = new Button(); //PITTSBURG
        Button t = new Button(); //TORANTO
        Button m = new Button(); //MIAMI
        Button chn = new Button(); //CHARLESTON
        Button r = new Button(); //RALEIGH
        Button wn = new Button(); //WASTINGTON
        Button ny = new Button(); //NEW YORK
        Button b = new Button(); //BOSTON
        Button ml = new Button(); //MONTREAL
        
        
        Button DrawT = new Button();
        Button DrawD = new Button();
        
        sf.setText("SF"); //SAN FRANCISCO
        la.setText("LA"); //LOS ANGELES
        lv.setText("LV"); //LAS VEGAS
        slc.setText("SLC"); //SALT LAKE CITY
        pl.setText("PL"); //PORTLAND
        s.setText("S"); //SEATTLE
        v.setText("V"); //VANCOUVER
        c.setText("C"); //CALGARY
        p.setText("P"); //PHOENIX
        h.setText("H"); //HELE
        ep.setText("EP"); //EL PASO
        sa.setText("SA"); //SAN ANTONIO
        d.setText("D"); //DENVER
        w.setText("W"); //WHINIPG
        ok.setText("OK"); //OKLAHOMA CITY
        da.setText("DA"); //DALLAS
        ho.setText("HO"); //HOUSTON
        kc.setText("KC"); //KANAS CITY
        o.setText("O"); //OMAHA
        du.setText("DU"); //DULUTH
        no.setText("NO"); //NEW ORLEANS
        lr.setText("LR"); //LITTLE ROCK
        sl.setText("SL"); //SAINT LOUIS
        ch.setText("CH"); //CHICAGO
        sm.setText("SM"); //SAULT MARIO
        a.setText("A"); //ATLANTA
        n.setText("N"); //NASHVILLE
        ps.setText("PS"); //PITTSBURG
        t.setText("T"); //TORANTO
        m.setText("M"); //MIAMI
        chn.setText("CHN"); //CHARLESTON
        r.setText("R"); //RALEIGH
        wn.setText("WN"); //WASTINGTON
        ny.setText("NY"); //NEW YORK
        b.setText("B"); //BOSTON
        ml.setText("ML"); //MONTREAL
        DrawT.setText("DrawT");
        DrawD.setText("DrawD");
        
        sf.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Starting Game...");
                
            }
        });
        
        
        
        Image image = new Image(Table.class.getResourceAsStream("0.jpg"));
 
         // simple displays ImageView the image as is
        ImageView map = new ImageView();
        map.setImage(image);
        
        Pane root = new Pane();
        root.getChildren().addAll(map,sf,la,lv,slc,pl,s,v,c,p,h,ep,sa,d,w,ok,da,ho,kc,o,du,no
                ,lr,sl,ch,sm,a,n,ps,t,m,chn,r,wn,ny,b,ml,DrawD,DrawT);
        
        //San Fransisco
        sf.setLayoutX(15);  //Location
        sf.setLayoutY(400);
        
        //Los Angeles
        la.setLayoutX(80); //Location
        la.setLayoutY(493);
        
        //Las Vegas
        lv.setLayoutX(140); //Location
        lv.setLayoutY(440);
        
        //Salt Lake City
        slc.setLayoutX(195);  //Location
        slc.setLayoutY(340);
        
        //Portland
        pl.setLayoutX(25);  //Location
        pl.setLayoutY(215);
        
        //Seatle
        s.setLayoutX(50);  //Location
        s.setLayoutY(170); 
        
        //Vancouver
        v.setLayoutX(50); //Location
        v.setLayoutY(120);
                
        //CALARGY
        c.setLayoutX(175); //Location
        c.setLayoutY(105);
        
        //PHOENIX
        p.setLayoutX(195); //Location
        p.setLayoutY(500);
        
        //HELENA
        h.setLayoutX(265); //Location
        h.setLayoutY(220);
        
        //EL PASO
        ep.setLayoutX(300); //Location
        ep.setLayoutY(540);
                
        //SAN ANTONITO
        sa.setLayoutX(310); //Location
        sa.setLayoutY(460);
        
        //DENVER
        d.setLayoutX(319); //Location
        d.setLayoutY(370);
        
        //WHINING
        w.setLayoutX(380); //Location
        w.setLayoutY(115);
        
        //OKALAHOMA
        ok.setLayoutX(460); //Location
        ok.setLayoutY(430);
        
        //DALLAS
        da.setLayoutX(470); //Location
        da.setLayoutY(520);
        
        //HOUSTON
        ho.setLayoutX(520); //Location
        ho.setLayoutY(550);
        
        //KANAS CITY
        kc.setLayoutX(476); //Location
        kc.setLayoutY(350);
        
        //OMAHA
        o.setLayoutX(460); //Location
        o.setLayoutY(300);
         
        //DULUTH
        du.setLayoutX(490); //Location
        du.setLayoutY(220);
        
        //NEW ORLEANS
        no.setLayoutX(600); //Location
        no.setLayoutY(540);
        
        //Little ROCK
        lr.setLayoutX(540); //Location
        lr.setLayoutY(440);
        
        //SAINT LOUIS
        sl.setLayoutX(560); //Location
        sl.setLayoutY(350);
        
        //CHICAGO
        ch.setLayoutX(594); //Location
        ch.setLayoutY(275);
        
        //SAULT MARIO
        sm.setLayoutX(600); //Location
        sm.setLayoutY(154);
        
        //ATLANTA
        a.setLayoutX(696); //Location
        a.setLayoutY(425);
        
        //Nashville
        n.setLayoutX(644); //Location
        n.setLayoutY(390);
        
        //Pittsburg
        ps.setLayoutX(725); //Location
        ps.setLayoutY(265);
        
        //Toranto
        t.setLayoutX(710); //Location
        t.setLayoutY(180);
        
        //MIAMI
        m.setLayoutX(815); //Location
        m.setLayoutY(575);
        
        //Charelston
        chn.setLayoutX(770); //Location
        chn.setLayoutY(435);
        
        //Raleigh
        r.setLayoutX(760); //Location
        r.setLayoutY(370);
        
        //Wastington
        wn.setLayoutX(800); //Location
        wn.setLayoutY(300);
        
        //NEW YORK
        ny.setLayoutX(800); //Location
        ny.setLayoutY(227);
        
        //BOSTON
        b.setLayoutX(855); //Location
        b.setLayoutY(150);
        
        //Montreal
        ml.setLayoutX(780); //Location
        ml.setLayoutY(100);
        
        //Draw Train Card
        DrawT.setLayoutX(900); //Location
        DrawT.setLayoutY(50);
        
        //Draw Destination Card
        DrawD.setLayoutX(900); //Location
        DrawD.setLayoutY(25);
        
        
        //Scene btn = new Scene(root, 300, 250);
        //Scene map = new Scene(box, 300, 250);
        /*
        
        primaryStage.setTitle("Ticket to Ride");
        primaryStage.setScene(map);
        primaryStage.show();
        */

        Scene scene = new Scene(root,1000, 780);
       
        stage.setTitle("Ticket to Ride");
        stage.setWidth(500);
        stage.setHeight(200);
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
