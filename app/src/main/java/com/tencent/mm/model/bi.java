package com.tencent.mm.model;

import android.database.Cursor;
import junit.framework.Assert;

public final class bi
{
  int bWA = -1;
  public String dCO = "";
  public String dCP = "";
  public String dCQ = "";
  public long dCR = 0L;
  public String dCS = "";
  public String dCT = "";
  public int dCU = 0;
  public int dCV = 0;
  public long dCW = 0L;
  public String dCX = "";
  String dCY = "";
  public String dzA = "";
  public String dzy = "";
  public String name = "";
  public long time = 0L;
  public String title = "";
  public int type = 0;
  public String url = "";
  
  public static String he(int paramInt)
  {
    if (paramInt == 20) {
      return "newsapp";
    }
    if (paramInt == 11) {
      return "blogapp";
    }
    Assert.assertTrue("INFO TYPE NEITHER NEWS NOR WEIBO", false);
    return null;
  }
  
  public final String IA()
  {
    if (this.dzA == null) {
      return "";
    }
    return this.dzA;
  }
  
  public final String IB()
  {
    if (this.dCX == null) {
      return "";
    }
    return this.dCX;
  }
  
  public final boolean Iu()
  {
    return this.dCV == 1;
  }
  
  public final String Iv()
  {
    if (this.dCO == null) {
      return "";
    }
    return this.dCO;
  }
  
  public final String Iw()
  {
    if (this.dCP == null) {
      return "";
    }
    return this.dCP;
  }
  
  public final String Ix()
  {
    if (this.dCS == null) {
      return "";
    }
    return this.dCS;
  }
  
  public final String Iy()
  {
    if (this.dCT == null) {
      return "";
    }
    return this.dCT;
  }
  
  public final String Iz()
  {
    if (this.dzy != null)
    {
      String[] arrayOfString = this.dzy.split("\\|");
      if ((arrayOfString != null) && (arrayOfString.length > 0)) {
        return arrayOfString[0];
      }
      return "";
    }
    return "";
  }
  
  public final void d(Cursor paramCursor)
  {
    this.dCO = paramCursor.getString(0);
    this.time = paramCursor.getLong(1);
    this.type = paramCursor.getInt(2);
    this.name = paramCursor.getString(3);
    this.title = paramCursor.getString(4);
    this.url = paramCursor.getString(5);
    this.dCP = paramCursor.getString(6);
    this.dCQ = paramCursor.getString(7);
    this.dCR = paramCursor.getLong(8);
    this.dCS = paramCursor.getString(9);
    this.dCT = paramCursor.getString(10);
    this.dCU = paramCursor.getInt(11);
    this.dzy = paramCursor.getString(12);
    this.dzA = paramCursor.getString(13);
    this.dCV = paramCursor.getInt(14);
    this.dCW = paramCursor.getLong(15);
    this.dCX = paramCursor.getString(16);
    this.dCY = paramCursor.getString(17);
  }
  
  public final String getName()
  {
    if (this.name == null) {
      return "";
    }
    return this.name;
  }
  
  public final String getTitle()
  {
    if (this.title == null) {
      return "";
    }
    return this.title;
  }
  
  public final String getUrl()
  {
    if (this.url == null) {
      return "";
    }
    return this.url;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/model/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */