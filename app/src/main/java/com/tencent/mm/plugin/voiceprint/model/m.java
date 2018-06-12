package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.aa;
import java.io.File;

public final class m
{
  public static String aY(String paramString, boolean paramBoolean)
  {
    String str = aa.duN;
    x.i("MicroMsg.VoicePrintLogic", "dbCachePath " + str);
    if (str.endsWith(File.separator))
    {
      paramString = str + paramString;
      x.i("MicroMsg.VoicePrintLogic", "genpath " + paramString);
      if (!bi.oW(paramString)) {
        break label114;
      }
      str = null;
    }
    label114:
    do
    {
      do
      {
        return str;
        paramString = str + File.separator + paramString;
        break;
        str = paramString;
      } while (paramBoolean);
      str = paramString;
    } while (!new File(paramString).exists());
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */