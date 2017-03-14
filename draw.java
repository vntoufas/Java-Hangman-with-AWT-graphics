import java.awt.Graphics;
//import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.*;

public class draw extends JComponent{

    private String[] PinakasMePavles;
    private String NewLetter;
    //private String[] PinakasMePavles;
    private int errors;
    private int length;
    
    public void paintComponent(Graphics g){
//////////////////////////////////Με την κληση της draw σχεδιαζεται η κραμμαλα///////////////////
        
        g.drawLine(5,565,105,565);//βαση κρεμμαλας
        g.drawLine(55,565,55,150);//στηλη κρεμμαλας
        g.drawLine(55,150,200,150);//πανω στελεχος κρεμμαλας
        g.drawLine(200, 300,200,150);//σχοινι
 ///////////Για τον σχεδιασμό των - - - - σκεφτηκα την υλοποιηση μιας επαναλληψης που θα εμαφανιζει καθε χαρακτηρα του 
 ////////// PinakaMePavles ολο και πιο δεξια ,για να μη συμπιπτουν στο ιδιο σημειο .
        for (int i=0;i<length;i++)
        {g.drawString(PinakasMePavles[i], 20+i*15, 20);}
        
        /////////Η μεταβλητη errors χρησιμοποιειται σαν flag για να ζωγραφιστει το καταλληλο σχεδιο στο παραθυρο μου
        
        if (errors==0){}
        else if (errors==1){
        g.drawLine(5,565,105,565);//βαση κρεμμαλας
        g.drawLine(55,565,55,150);//στηλη κρεμμαλας
        g.drawLine(55,150,200,150);//πανω στελεχος κρεμμαλας
        g.drawLine(200, 300,200,150);//σχοινι
        g.drawOval(175,300,50,50); //οβαλ , πειραγμενο να βγαζει κυκλο(50,50)
        g.drawString("erros="+errors,40,40);
        for (int i=0;i<length;i++)
        {g.drawString(PinakasMePavles[i], 20+i*15, 20);}
       
        }
        ////Οσο η μεταβλητη errors αυξανεται τοσο πιο πολλα εκτυπωνονται 
        else if (errors==2){
        g.drawLine(5,565,105,565);//βαση κρεμμαλας
        g.drawLine(55,565,55,150);//στηλη κρεμμαλας
        g.drawLine(55,150,200,150);//πανω στελεχος κρεμμαλας
        g.drawLine(200, 300,200,150);//σχοινι
        g.drawOval(175,300,50,50); //οβαλ , πειραγμενο να βγαζει κυκλο(50,50)
        g.drawLine(200,350,200,450); //κορμος
        g.drawString("erros="+errors,40,40);
        for (int i=0;i<length;i++)
        {g.drawString(PinakasMePavles[i], 20+i*15, 20);}
        }
        
        else if (errors==3){
        g.drawLine(5,565,105,565);//βαση κρεμμαλας
        g.drawLine(55,565,55,150);//στηλη κρεμμαλας
        g.drawLine(55,150,200,150);//πανω στελεχος κρεμμαλας
        g.drawLine(200, 300,200,150);//σχοινι
        g.drawOval(175,300,50,50); //kefali ,οβαλ , πειραγμενο να βγαζει κυκλο(50,50)
        g.drawLine(200,350,200,450); //κορμος
        g.drawLine(200,380,170,350);//χερι
        g.drawString("erros="+errors,40,40);
        for (int i=0;i<length;i++)
        {g.drawString(PinakasMePavles[i], 20+i*15, 20);}
        }

        else if (errors==4){
        
        g.drawLine(5,565,105,565);//βαση κρεμμαλας
        g.drawLine(55,565,55,150);//στηλη κρεμμαλας
        g.drawLine(55,150,200,150);//πανω στελεχος κρεμμαλας
        g.drawLine(200, 300,200,150);//σχοινι
        g.drawOval(175,300,50,50); //kefali ,οβαλ , πειραγμενο να βγαζει κυκλο(50,50)
        g.drawLine(200,350,200,450); //κορμος
        g.drawLine(200,380,170,350);//χερι
        g.drawLine(200,380,230,350);//χερι
        g.drawString("erros="+errors,40,40);
        for (int i=0;i<length;i++)
        {g.drawString(PinakasMePavles[i], 20+i*15, 20);}
        
        }

        else if (errors==5){
        g.drawLine(5,565,105,565);//βαση κρεμμαλας
        g.drawLine(55,565,55,150);//στηλη κρεμμαλας
        g.drawLine(55,150,200,150);//πανω στελεχος κρεμμαλας
        g.drawLine(200, 300,200,150);//σχοινι
        g.drawOval(175,300,50,50); //kefali ,οβαλ , πειραγμενο να βγαζει κυκλο(50,50)
        g.drawLine(200,350,200,450); //κορμος
        g.drawLine(200,380,170,350);//χερι
        g.drawLine(200,380,230,350);//χερι
        g.drawLine(200,450,160,480);//ποδι
        g.drawString("erros="+errors,40,40);
        for (int i=0;i<length;i++)
        {g.drawString(PinakasMePavles[i], 20+i*15, 20);}
        }
        
        else if (errors==6){
        //repaint();
        g.drawLine(5,565,105,565);//βαση κρεμμαλας
        g.drawLine(55,565,55,150);//στηλη κρεμμαλας
        g.drawLine(55,150,200,150);//πανω στελεχος κρεμμαλας
        g.drawLine(200, 300,200,150);//σχοινι
        g.drawOval(175,300,50,50); //kefali ,οβαλ , πειραγμενο να βγαζει κυκλο(50,50)
        g.drawLine(200,350,200,450); //κορμος
        g.drawLine(200,380,170,350);//χερι
        g.drawLine(200,380,230,350);//χερι
        g.drawLine(200,450,160,480);//ποδι
        g.drawLine(200,450,240,480);//ποδι
        g.drawString("erros="+errors,40,40);
        ///////////////////////////////////////////////////////////////////////////////////
        //Επιπλεον οταν ο χρηστης φτασει τα 6 λαθη εμφανιζεται το σχετικο μυνημα πως εχασε 
        ///////////////////////////////////////////////////////////////////////////////////
        g.drawString("YOU LOOSE", 210,460);
        for (int i=0;i<length;i++)
        {g.drawString(PinakasMePavles[i], 20+i*15, 20);}
        }
        
        /////Μια τελευταια χρηση της μεταβλητης errors ειναι πως
        else if (errors==7){//χρησιμοποιειται σαν flag για την περιπτωση μυνηματων
        /////////////////////// του νικητήριου μυνηματος.
        g.drawString("You win",210,460);//εκτυπωνεται το νικητηριο μυνημα 
        }
           
    }  
   ////////Παρακατω εχω τις set και get methods για το μηκος του πινακα(εξαρταται απο το μηκος τηςλ εξης που επιλεγεται
        ///Και το ποσο των λαθων του χρηστη
   public void set_PinakasMePavles(String[] PinakasMePavles)
    {this.PinakasMePavles=PinakasMePavles;}
  
   public void set_length(int length)
   {this.length=length;}
   
   public void SetErrors(int errors){this.errors=errors;}
}