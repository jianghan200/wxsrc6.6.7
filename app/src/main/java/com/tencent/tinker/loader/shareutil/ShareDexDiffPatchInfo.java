package com.tencent.tinker.loader.shareutil;

import com.tencent.tinker.loader.TinkerRuntimeException;
import java.util.ArrayList;

public class ShareDexDiffPatchInfo
{
  public final String dia;
  public final String path;
  public final String vuA;
  public final String vuB;
  public final String vuC;
  public final String vuD;
  public final String vuE;
  public final String vuF;
  public final boolean vuG;
  public final String vuz;
  
  public ShareDexDiffPatchInfo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this.vuz = paramString1;
    this.path = paramString2;
    this.vuA = paramString3;
    this.vuB = paramString4;
    this.vuE = paramString5;
    this.vuC = paramString6;
    this.vuD = paramString7;
    this.vuF = paramString8;
    if (paramString8.equals("jar"))
    {
      this.vuG = true;
      if (SharePatchFileUtil.acY(paramString1))
      {
        this.dia = (paramString1 + ".jar");
        return;
      }
      this.dia = paramString1;
      return;
    }
    if (paramString8.equals("raw"))
    {
      this.vuG = false;
      this.dia = paramString1;
      return;
    }
    throw new TinkerRuntimeException("can't recognize dex mode:" + paramString8);
  }
  
  public static boolean c(ShareDexDiffPatchInfo paramShareDexDiffPatchInfo)
  {
    if (paramShareDexDiffPatchInfo == null) {}
    for (;;)
    {
      return false;
      String str = paramShareDexDiffPatchInfo.vuz;
      if (ShareTinkerInternals.cHe()) {}
      for (paramShareDexDiffPatchInfo = paramShareDexDiffPatchInfo.vuB; (str != null) && (str.length() > 0) && (paramShareDexDiffPatchInfo != null) && (paramShareDexDiffPatchInfo.length() == 32); paramShareDexDiffPatchInfo = paramShareDexDiffPatchInfo.vuA) {
        return true;
      }
    }
  }
  
  public static void m(String paramString, ArrayList<ShareDexDiffPatchInfo> paramArrayList)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    for (;;)
    {
      return;
      paramString = paramString.split("\n");
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        String[] arrayOfString = paramString[i];
        if ((arrayOfString != null) && (arrayOfString.length() > 0))
        {
          arrayOfString = arrayOfString.split(",", 8);
          if ((arrayOfString != null) && (arrayOfString.length >= 8)) {
            paramArrayList.add(new ShareDexDiffPatchInfo(arrayOfString[0].trim(), arrayOfString[1].trim(), arrayOfString[2].trim(), arrayOfString[3].trim(), arrayOfString[4].trim(), arrayOfString[5].trim(), arrayOfString[6].trim(), arrayOfString[7].trim()));
          }
        }
        i += 1;
      }
    }
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.vuz);
    localStringBuffer.append(",");
    localStringBuffer.append(this.path);
    localStringBuffer.append(",");
    localStringBuffer.append(this.vuA);
    localStringBuffer.append(",");
    localStringBuffer.append(this.vuB);
    localStringBuffer.append(",");
    localStringBuffer.append(this.vuC);
    localStringBuffer.append(",");
    localStringBuffer.append(this.vuD);
    localStringBuffer.append(",");
    localStringBuffer.append(this.vuE);
    localStringBuffer.append(",");
    localStringBuffer.append(this.vuF);
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */