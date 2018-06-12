package com.tencent.mm.modelvideo;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class p
{
  public String enF;
  private boolean enG;
  private long time;
  
  public p(String paramString)
  {
    String str = paramString;
    if (paramString.endsWith("\n")) {
      str = paramString.substring(0, paramString.length() - 1);
    }
    paramString = str.split(":");
    try
    {
      if (paramString.length > 0) {
        this.enF = paramString[0];
      }
      if (paramString.length > 1) {
        this.time = bi.getLong(paramString[1], 0L);
      }
      if (paramString.length > 2) {
        this.enG = paramString[2].equals("1");
      }
      return;
    }
    catch (Exception paramString)
    {
      if (this.enF == null) {
        this.enF = "";
      }
      this.enG = false;
      this.time = 0L;
      x.e("MicroMsg.VideoContent", "VoiceContent parse failed.");
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelvideo/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */