package data;
public class Word{
   String englishWord;
   String meaning;
   String sentence;
   public void setEnglishWord(String englishWord){
      this.englishWord = englishWord;
   }
   public String getEnglishWord() {
      return englishWord;
   }
   public void setMeaning(String meaning){
      this.meaning = meaning;
   }
   public String getMeaning() {
      return meaning;
   }
   public void setSentence(String sentence){this.sentence=sentence;}
   public String getSentence(){return sentence;}
}
