/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcardfrauddictection;

/**
 *
 * @author Oginni
 */
public class TransactionHistory {

    public TransactionHistory(String card_id,String type,String payment,double amt) {
     DbConnect db= new DbConnect();
     
        try {
            db.ps= db.con.prepareStatement("INSERT INTO transactionhistory (card_id,type,payment_type,amount) values(?,?,?,?)");
            db.ps.setString(1, card_id);
            db.ps.setString(2, type);
            db.ps.setString(3, payment);
            db.ps.setDouble(4, amt);
            db.ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    
}
