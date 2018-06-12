package com.qq.taf.jce.dynamic;

public class StringField
  extends JceField
{
  private String data;
  
  StringField(String paramString, int paramInt)
  {
    super(paramInt);
    this.data = paramString;
  }
  
  public String get()
  {
    return this.data;
  }
  
  public void set(String paramString)
  {
    this.data = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/qq/taf/jce/dynamic/StringField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */