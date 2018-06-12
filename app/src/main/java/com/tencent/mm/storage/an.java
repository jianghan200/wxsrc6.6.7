package com.tencent.mm.storage;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class an
{
  public String bKg = "-1";
  public String enF;
  public boolean enG;
  public boolean taS;
  public String taT = "";
  public long time;
  
  public an(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.emoji.EmojiContent", "EmojiContent parse failed. content is null.");
      return;
    }
    for (;;)
    {
      try
      {
        if (paramString.endsWith("\n"))
        {
          Object localObject = paramString.substring(0, paramString.length() - 1);
          localObject = ((String)localObject).split(":", 6);
          if ((localObject.length != 4) || (!ab.gY(localObject[0]))) {
            break label244;
          }
          i = 1;
          if (localObject.length > i) {
            this.enF = localObject[i];
          }
          if (localObject.length > i + 1) {
            this.time = bi.getLong(localObject[(i + 1)], 0L);
          }
          if (localObject.length > i + 2) {
            this.enG = localObject[(i + 2)].equals("1");
          }
          if (localObject.length > i + 3) {
            this.bKg = localObject[(i + 3)];
          }
          if (localObject.length > i + 4) {
            this.taT = localObject[(i + 4)].replace("*#*", ":");
          }
          if (localObject.length <= i + 5) {
            break;
          }
          this.taS = localObject[(i + 5)].equals("1");
          return;
        }
      }
      catch (Exception localException)
      {
        this.time = 0L;
        x.e("MicroMsg.emoji.EmojiContent", "EmojiContent parse failed. Content:%s Excpetion:%s", new Object[] { paramString, bi.i(localException) });
        return;
      }
      this.taT = paramString.replace(":", "*#*");
      String str = paramString;
      continue;
      label244:
      int i = 0;
    }
  }
  
  public static an YJ(String paramString)
  {
    return new an(paramString);
  }
  
  public static String a(String paramString1, long paramLong, boolean paramBoolean1, String paramString2, boolean paramBoolean2, String paramString3)
  {
    int j = 1;
    paramString3 = paramString3.replace(":", "*#*");
    paramString1 = new StringBuilder().append(paramString1).append(":").append(paramLong).append(":");
    if (paramBoolean1)
    {
      i = 1;
      paramString1 = paramString1.append(i).append(":").append(paramString2).append(":").append(paramString3).append(":");
      if (!paramBoolean2) {
        break label109;
      }
    }
    label109:
    for (int i = j;; i = 0)
    {
      return i + "\n";
      i = 0;
      break;
    }
  }
  
  public final String clN()
  {
    int j = 1;
    StringBuilder localStringBuilder = new StringBuilder().append(this.enF).append(":").append(this.time).append(":");
    if (this.enG)
    {
      i = 1;
      localStringBuilder = localStringBuilder.append(i).append(":").append(this.bKg).append(":").append(this.taT).append(":");
      if (!this.taS) {
        break label106;
      }
    }
    label106:
    for (int i = j;; i = 0)
    {
      return i + "\n";
      i = 0;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/storage/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */