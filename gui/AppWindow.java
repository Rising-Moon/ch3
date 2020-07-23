package gui;
import view.IntegrationView;
import data.CreateDatabaseAndTable;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
public class AppWindow {
   public static void main(String [] args) {
      try
      {
         //设置本属性将改变窗口边框样式定义
         BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
         org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
      }
      catch(Exception e)
      {
         //TODO exception
      }
      new CreateDatabaseAndTable();
      IntegrationView win = new IntegrationView(); 
   }
}