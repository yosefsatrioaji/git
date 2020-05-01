import wpf

from System.Windows import Application, Window

class MyWindow(Window):
    def __init__(self):
        wpf.LoadComponent(self, 'SewaTanahKel74.xaml')

    
    def ComboBox_SelectionChanged(self, sender, e):
        pass

if __name__ == '__main__':
    Application().Run(MyWindow())
