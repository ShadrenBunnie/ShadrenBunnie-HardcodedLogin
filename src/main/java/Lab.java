
public class Lab {
    /**
     * This challenge represents a hardcoded login example:
     *
     *     Let's say we have two users, named "admin" and "user".
     *     "admin" has a password of "qwerty".
     *     "user" has a password of "password".
     *
     * The method should return true if the login should be permitted, and false if it should not. You will need to use
     * if/else statements.
     *
     * @param username a String that represents a username.
     * @param password a String that represents a password.
     * @return true if there is a successful login, and false otherwise.
     */ 
    
     /** Logical think/plan to write the code.
      * The challenge is to test if the password is correct, or 'true', under both usernames.
         * Admin password must = string of "qwerty".
         *if username = admin
         *  if password = "qwerty"
         *      return true;
         *  else 
         *      return false;
         * 
         * user password must = string of "password".
         * if username = user
         *      if password = "password"
         *          return true;
         *      else
         *          return false;
         */
    public boolean login(String username, String password){
 
        if (username == "admin") {
            if(password == "qwerty"){
                
                return true;

            }else {
                return false;
            }

            
        } else if (username == "user") {
            if(password == "password"){
                return true;
            }else{
                return false;
            }
            
        }
        return false;
    }
}
