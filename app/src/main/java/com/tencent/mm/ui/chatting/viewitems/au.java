package com.tencent.mm.ui.chatting.viewitems;

import android.os.Bundle;
import com.tencent.mm.pluginsdk.ui.chat.c;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.q;
import com.tencent.mm.y.g.a;

public class au
  extends c
{
  public String bKk;
  public g.a bXA;
  public String bZG;
  public String bZH;
  public String cGB;
  public String ceR;
  public int cfR = 0;
  public String chatroomName;
  public String desc;
  public String designerName;
  public String designerRediretctUrl;
  public int designerUIN;
  public String dyH;
  public String iconUrl;
  public int pSA;
  public long pSz;
  public int pageType;
  public int position;
  public String secondUrl;
  public boolean tGg;
  public int tid;
  public String title;
  public boolean ufA;
  public String ufB;
  public boolean ufC;
  public String ufD;
  public Bundle ufE;
  public q ufF;
  public boolean ufx;
  public String ufy;
  public boolean ufz;
  public String userName;
  
  public au() {}
  
  public au(bd parambd, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, String paramString7, String paramString8)
  {
    this.bXQ = parambd;
    this.tGg = false;
    this.position = paramInt1;
    this.userName = paramString1;
    this.ufx = false;
    this.title = paramString2;
    this.bZG = paramString3;
    this.bZH = paramString4;
    this.ufy = paramString5;
    this.designerUIN = paramInt2;
    this.designerName = paramString6;
    this.designerRediretctUrl = paramString7;
    this.cGB = paramString8;
  }
  
  public au(bd parambd, String paramString)
  {
    this(paramString);
    this.bXQ = parambd;
  }
  
  public au(bd parambd, String paramString1, String paramString2)
  {
    this.bXQ = parambd;
    this.userName = paramString1;
    this.bXQ = parambd;
    this.ufD = paramString2;
  }
  
  private au(bd parambd, boolean paramBoolean, int paramInt, String paramString)
  {
    this(parambd, paramBoolean, paramInt, paramString, false, null, null, null);
  }
  
  private au(bd parambd, boolean paramBoolean, int paramInt, String paramString, byte paramByte)
  {
    this(parambd, paramBoolean, paramInt, paramString);
  }
  
  public au(bd parambd, boolean paramBoolean, int paramInt, String paramString, char paramChar)
  {
    this(parambd, paramBoolean, paramInt, paramString, (byte)0);
  }
  
  public au(bd parambd, boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    this(parambd, paramBoolean, paramInt, paramString1, (byte)0);
    this.chatroomName = paramString2;
  }
  
  public au(bd parambd, boolean paramBoolean1, int paramInt, String paramString1, boolean paramBoolean2, String paramString2, String paramString3, String paramString4)
  {
    this(parambd, paramBoolean1, paramInt, paramString1, paramBoolean2, paramString2, paramString3, paramString4, null);
  }
  
  public au(bd parambd, boolean paramBoolean1, int paramInt, String paramString1, boolean paramBoolean2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this(parambd, paramBoolean1, paramInt, paramString1, paramBoolean2, paramString2, paramString3, paramString4, paramString5, null, null, false, false);
  }
  
  public au(bd parambd, boolean paramBoolean1, int paramInt, String paramString1, boolean paramBoolean2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, boolean paramBoolean3, boolean paramBoolean4)
  {
    this.bXQ = parambd;
    this.tGg = paramBoolean1;
    this.position = paramInt;
    this.userName = paramString1;
    this.ufx = paramBoolean2;
    this.title = paramString2;
    this.bZG = paramString3;
    this.bZH = paramString4;
    this.ufy = paramString5;
    this.bKk = paramString6;
    this.cGB = paramString7;
    this.ufz = paramBoolean3;
    this.ufA = paramBoolean4;
  }
  
  private au(String paramString)
  {
    this.userName = paramString;
  }
  
  public au(String paramString1, String paramString2)
  {
    this.userName = paramString1;
    this.chatroomName = paramString2;
  }
  
  public static au a(g.a parama, bd parambd)
  {
    au localau = new au();
    localau.bXA = parama;
    localau.bXQ = parambd;
    return localau;
  }
  
  public static au aaI(String paramString)
  {
    au localau = new au();
    localau.cGB = paramString;
    return localau;
  }
  
  public static au b(bd parambd, boolean paramBoolean, int paramInt)
  {
    au localau = new au();
    localau.bXQ = parambd;
    localau.tGg = paramBoolean;
    localau.position = paramInt;
    localau.ufC = false;
    return localau;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */