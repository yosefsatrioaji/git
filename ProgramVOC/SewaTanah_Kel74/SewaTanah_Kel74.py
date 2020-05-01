import wpf
from System.Windows import Application, Window, MessageBox

class MyWindow(Window):
    def __init__(self):
        wpf.LoadComponent(self, 'SewaTanah_Kel74.xaml')
        
    def Confirm_Click(self, sender, e):
        x= self.Nama.Text.ToString()

        if x == "" or self.ComboTempat.Text == None  :
            MessageBox.Show("Belum Diisi")
        else:
        #menentukan Gender
            if self.ComboTempat.Text == self.comboBox.Items.GetItemAt(0).ToString():
                gender = "Mas"
               # MessageBox.Show("Halo Mas "+x+ " yang suka")
            
            elif self.ComboTempat.Text == self.comboBox.Items.GetItemAt(1).ToString():
                gender = "mbak"
               # MessageBox.Show("Halo Mbak ")


        
            #menentukan Hobi
            MessageBox.Show("Halo "+gender+" "+x+" yang hobinya ")

       
        pass
        pass


if __name__ == '__main__':
    Application().Run(MyWindow())
