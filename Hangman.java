import javax.swing.*;
import java.util.Random;
import java.awt.*;
public class Hangman {
    int len;
    
    public static void main(String[] args) {
      int playagain=1;//η μεταβλητη αυτη ορίζει αν θελει να ξαναπαιξει
      String[] options = {"No,thanks","Yes, please"};//πινακας options για το παραθυρο επιλογων (Εμφανιζεται στο τελος)
      
        while(playagain==1){
        int  errors=0;
       boolean winner=false;
        String[] AvailableWords={"dog","marathon","chances","motorbike","duvet","caterpillar"};//πινακας με λεξεις που θα επιλεγονται τυχαια 
       
       int k=0;
       Random rand=new Random();//νεα rand
        int RandomNumber=rand.nextInt(AvailableWords.length);//Επιλογή τυχαιου αριθμου μεσα στα ορια του πινακα
        String word=AvailableWords[RandomNumber];//Για να επιλεξουμε τελικα την τυχαια λεξη
        int len=word.length(); //επιστρεφει το μηκος του πινακα
    
         
        String[] PinakasMePavles=new String[len];//Ο πινακας με παβλες εμφανιζεται στο παιχνιδια σιγα σιγα να 
                                        //γεμιζει , οταν παικτης βρισκει καποιο γραμμα που περιεχεται στη λεξη
        for (int i=0;i<len;i++)//ξεκινω επαναλληψη για να γεμισω 
        {PinakasMePavles[i]="_";}//τον πινακα με παυλες 
    
        String[] PinakasLeksis=new String[len];//δημιουργω τον πινακα που θα μπει η λεξη
        PinakasLeksis=word.split("");//σπαω τη λεξη και βαζω καθε γραμμα σε επομενο κελι.
        //αυτη είναι μια τεχνική που χρειαστηκα για να γεμισω ωραια τον πινακα μονο με γραμματα

      
       JFrame window = new JFrame();//δημιουργία νεου JFrame
        window.setSize(500, 800);//ορισμός διαστασεων παραθύρου  
        window.setTitle("Let's play Hangman");//τιτλος παραθυρου
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//default λειτουργια Χ κουμπιου παραθυρου
        
        draw dr=new draw();//δηιουργια νεου instance της draw .
        dr.set_length(len);//οριζω το μηκος του πινακα στην dr με set_draw(len);
        dr.set_PinakasMePavles(PinakasMePavles);//φτιαχνω τον πινακα με τις παυλιτσες στην draw .
        
        window.add(dr);
        window.setVisible(true); 
       
        ////////////////////////////////////////////////////////
        ///////////////////ξεκινάω την while///////////////////
        while((errors<6)||(winner==false)){
        
        //asks user to guess a letter
        String Letter=JOptionPane.showInputDialog("Enter a letter :");//καθε φορα σε παραθυρακι
      
        boolean Vrike_Idio_Gramma=false;
        for (int i=0; i<len;i++){//ξεκιναω ελεγχο για υπαρξη ιδιου γραμματος με αυτο που εδωσε ο χρήστης
    if (PinakasLeksis[i].equals(Letter))//αν υπαρχει ,στη λεξη, το γραμμα που εδωσε ο χρηστης 
        {PinakasMePavles[i]=Letter;//το συμπεριλαμβανω στον πινακα με της παυλες , στην καταλληλη θεση
          Vrike_Idio_Gramma=true;  }//και αλλαζω την τιμη της μεταβλητης μου
        }
        if (!Vrike_Idio_Gramma)//αν οχι 
        {errors=errors+1;}//αυξανω την μεταβλητη σφλαματων κατα 1
        
        for (int i=0;i<len;i++)//ελεγχος για να βρω αν εχω συμπληρωσει τη λεξη
         if(PinakasMePavles[i].equals(PinakasLeksis[i]))//αν εχει συμπληρωθει γραμμα προς γραμμα η λεξη
            {winner=true;}//αλλαζω τη μεταβλητη winner 
         else{winner=false;}
      if (winner){errors=7;}//και χρησιμοποιω την μεταβλητη errors ως flag για νεο μυνημα στο χρηστη.
      
    dr.repaint();//κανει repaint το σχεδιο μου .
    dr.SetErrors(errors);//στελνει το πληθος των errors στην draw 
                      //για να μπορει να διαλεξει το καταλληλο σχεδιο κρεμμάλας
    
        if (errors==6){System.out.println("You loose");//ελεγχος για πληθος λαθων(λαθος εισαγωγες γραμματων) απο χρηστη
     break;}
        }//κλεινει την while 
        //////////////////////////////////////////////////
        /////////////////////////////////////////////////απο κατω εχω το παραθυρο ερωτησης για replay game η οχι .
     playagain=JOptionPane.showOptionDialog(null,"Want to play again","REPLAY",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
     /////////////////////////////////////////////////////
     ///edo thelo na kano tin erotisi gia replay και εδω κλεινει η επαναληψη 
        }
    
    }//κλεινει την main 
       
    }//κλεινει την class
    
 
