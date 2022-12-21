package org.language3;
import org.language3.*;
public class LanguageInfo extends StateDetails
{
	private void tamilLanguage()
	{
      System.out.println("thirukural");
	}
  private void englishLanguage() 
  {
     System.out.println("poem");
  }
  private void hindiLanguage()
  {
    System.out.println("count");
  }
  public static void main(String[] args) 
  {
	  LanguageInfo l=new LanguageInfo();
	   l.tamilLanguage();
	   l.englishLanguage();
	   l.hindiLanguage();
	   l.southIndia();
	   l.northIndia();
	}
}
