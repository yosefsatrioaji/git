
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yosef
 */
public class userService {
    private String[][] data = new String[4][2];
    private String user, pass;
    
    //constructor
    public userService(String users, String passwords)
    {
        user = users;
        pass = passwords;
        String[][] data = 
        { 
            {"admin", "12345",},
            {"rio", "12345",},
            {"satrio", "12345"},
            {"arief","12345"}
        };
        this.data = data;

    }
    
    private boolean checkCredential() //mengecek input sesuai dengan data constructor atau tidak
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(user))
            {
                if(data[i][1].equals(pass))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public void login()
    {
        boolean status = checkCredential();
        if(status == true) //jika input sesuai dengan data constructor akan mengoutputkan ini
        {
            JOptionPane.showMessageDialog(null,"Login Sukses");
            SEWATANAH sewa = new SEWATANAH();
            sewa.setVisible(true);
        }
        else //jika salah ini
        {
            JOptionPane.showMessageDialog(null,"Login Gagal");
        }
    }
}