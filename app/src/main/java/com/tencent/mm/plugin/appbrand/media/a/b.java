package com.tencent.mm.plugin.appbrand.media.a;

import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.z.a;
import com.tencent.mm.z.d;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public static a b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    if ((TextUtils.isEmpty(paramString4)) || (TextUtils.isEmpty(paramString3)))
    {
      x.e("MicroMsg.Audio.AudioPlayerParamParser", "parseAudioPlayParam, sourceData or src is null, sourceData:%s, src:%s", new Object[] { paramString4, paramString3 });
      paramString1 = null;
    }
    a locala;
    do
    {
      do
      {
        return paramString1;
        x.i("MicroMsg.Audio.AudioPlayerParamParser", "parseAudioPlayParam audioId:%s, sourceData:%s", new Object[] { paramString2, paramString4 });
        locala = new a();
        locala.appId = paramString1;
        locala.bGW = paramString2;
        locala.processName = paramString6;
        locala.cfD = paramString3;
        locala.fromScene = 0;
        try
        {
          paramString1 = new JSONObject(paramString4);
          int i = paramString1.optInt("startTime", 0);
          boolean bool1 = paramString1.optBoolean("autoplay", false);
          boolean bool2 = paramString1.optBoolean("loop", false);
          double d = paramString1.optDouble("volume", 1.0D);
          locala.dGs = i;
          locala.dGt = i;
          locala.dGu = bool1;
          locala.dGv = bool2;
          locala.dGx = d;
          if (paramString3.startsWith("wxfile://"))
          {
            locala.filePath = paramString3.substring(9);
            x.i("MicroMsg.Audio.AudioPlayerParamParser", "filePath:%s", new Object[] { locala.filePath });
            return locala;
          }
        }
        catch (JSONException paramString1)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.Audio.AudioPlayerParamParser", paramString1, "parseAudioPlayParam", new Object[0]);
          }
          paramString1 = locala;
        }
      } while (paramString3.startsWith("http://"));
      paramString1 = locala;
    } while (paramString3.startsWith("https://"));
    paramString1 = f.bD(paramString3, paramString5);
    if (!paramString1.isOpen())
    {
      x.e("MicroMsg.Audio.AudioPlayerParamParser", "the wxa audioDataSource not found for src %s", new Object[] { paramString3 });
      try
      {
        paramString1.close();
        return null;
      }
      catch (IOException paramString1)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.Audio.AudioPlayerParamParser", paramString1, "", new Object[0]);
        }
      }
    }
    locala.filePath = paramString3;
    locala.dGy = paramString1;
    return locala;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */