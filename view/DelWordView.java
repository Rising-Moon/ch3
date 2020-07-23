package view;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class DelWordView extends JPanel {
   JTextField inputWord;     //输入要删除的单词
   JButton submit;           //提交按钮    
   JTextField hintMess;
   HandleDelWord  handleDelWord;  //负责处理删除单词
   DelWordView(){
      initView();
      registerListener() ;
   }
   private void initView() {
      Box boxH1,boxH2;                 //行式盒
      Box boxV;      //列式盒
      boxH1=Box.createHorizontalBox();
      boxH2=Box.createHorizontalBox();
      boxV=Box.createVerticalBox();
      inputWord = new JTextField(12);
      submit = new JButton("删除单词");
      hintMess = new JTextField(20);
      hintMess.setEditable(false);
      boxH1.add(new JLabel("输入要删除的单词:"));
      boxH1.add(inputWord);
      boxH1.add(submit);
      add(boxV);
      boxV.add(boxH1);
      boxV.add(boxH2);
      boxH2.add(new JLabel("提示:"));
      boxH2.add(hintMess);
   }
   private void registerListener() {
      handleDelWord = new HandleDelWord();
      handleDelWord.setView(this);
      submit.addActionListener(handleDelWord);
   }
}