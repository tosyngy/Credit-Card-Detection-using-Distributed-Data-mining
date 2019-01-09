package creditcardfrauddictection;

/**
 *
 * @author OGINNI
 */
public class Variables {

    public static int id;
    public static String card_id="";
    int auth=0;


 
 

    
    public int getId() {
        return id;
    }

    /**
     * @param auth the auth to set
     */
    public void setId(int id) {
        this.id = id;
    } 
    
    
    public int getAuth() {
        return auth;
    }

    /**
     * @param auth the auth to set
     */
    public void setAuth(int auth) {
        this.auth = auth;
    } 
    public String getCard_id() {
        return card_id;
    }

    /**
     * @param status the status to set
     */
    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }
    
    
}
