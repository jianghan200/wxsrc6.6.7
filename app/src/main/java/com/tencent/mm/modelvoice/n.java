package com.tencent.mm.modelvoice;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;

public final class n
{
  public String enF;
  public boolean enG;
  public long time;
  
  public n(String paramString)
  {
    String str = paramString;
    for (;;)
    {
      try
      {
        if (paramString.endsWith("\n")) {
          str = paramString.substring(0, paramString.length() - 1);
        }
        paramString = str.split(":");
        if ((paramString.length == 4) && (ab.gY(paramString[0])))
        {
          i = 1;
          if (paramString.length > i) {
            this.enF = paramString[i];
          }
          if (paramString.length > i + 1) {
            this.time = bi.getLong(paramString[(i + 1)], 0L);
          }
          if (paramString.length > i + 2) {
            this.enG = paramString[(i + 2)].equals("1");
          }
          return;
        }
      }
      catch (Exception paramString)
      {
        if (this.enF == null) {
          this.enF = "";
        }
        this.enG = false;
        this.time = 0L;
        x.e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
        return;
      }
      int i = 0;
    }
  }
  
  public static String b(String paramString, long paramLong, boolean paramBoolean)
  {
    paramString = new StringBuilder().append(paramString).append(":").append(paramLong).append(":");
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      return i + "\n";
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelvoice/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */