package com.tencent.mm.plugin.appbrand.media.record;

import android.text.TextUtils;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.IOException;

public final class f
{
  public static final String giQ = b.bnE;
  
  public static short[] E(byte[] paramArrayOfByte, int paramInt)
  {
    short[] arrayOfShort = new short[paramInt / 2];
    paramInt = 0;
    while (paramInt < arrayOfShort.length)
    {
      arrayOfShort[paramInt] = ((short)(paramArrayOfByte[(paramInt * 2)] & 0xFF | (paramArrayOfByte[(paramInt * 2 + 1)] & 0xFF) << 8));
      paramInt += 1;
    }
    return arrayOfShort;
  }
  
  public static String bF(String paramString1, String paramString2)
  {
    File localFile = new File(giQ, "AudioRecord");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    paramString2 = new StringBuilder("audio").append(ac.ce(paramString2));
    if (!TextUtils.isEmpty(paramString1)) {
      if ("aac".equalsIgnoreCase(paramString1)) {
        paramString1 = ".m4a";
      }
    }
    for (;;)
    {
      paramString1 = paramString1;
      paramString2 = new File(localFile, paramString1);
      x.d("MicroMsg.Record.AudioRecordUtil", "getAudioFilePath audio name %s path %s", new Object[] { paramString1, paramString2.getAbsoluteFile() });
      return paramString2.getAbsolutePath();
      if ("mp3".equalsIgnoreCase(paramString1)) {
        paramString1 = ".mp3";
      } else if ("wav".equalsIgnoreCase(paramString1)) {
        paramString1 = ".wav";
      } else {
        paramString1 = "";
      }
    }
  }
  
  public static long uA(String paramString)
  {
    File localFile = new File(paramString);
    if (localFile.exists())
    {
      x.i("MicroMsg.Record.AudioRecordUtil", "exist audio file");
      return localFile.length();
    }
    x.i("MicroMsg.Record.AudioRecordUtil", "audio file not exit, path:%s", new Object[] { paramString });
    return -1L;
  }
  
  public static String ux(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return "";
    }
    if ("aac".equalsIgnoreCase(paramString)) {
      return "m4a";
    }
    if ("mp3".equalsIgnoreCase(paramString)) {
      return "mp3";
    }
    if ("wav".equalsIgnoreCase(paramString)) {
      return "wav";
    }
    return "";
  }
  
  public static boolean uy(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    do
    {
      return false;
      if ("aac".equalsIgnoreCase(paramString)) {
        return true;
      }
      if ("mp3".equalsIgnoreCase(paramString)) {
        return true;
      }
    } while (!"wav".equalsIgnoreCase(paramString));
    return false;
  }
  
  public static boolean uz(String paramString)
  {
    paramString = new File(paramString);
    boolean bool;
    if (!paramString.exists()) {
      try
      {
        x.i("MicroMsg.Record.AudioRecordUtil", "new audio file");
        bool = paramString.createNewFile();
        return bool;
      }
      catch (IOException paramString)
      {
        x.printErrStackTrace("MicroMsg.Record.AudioRecordUtil", paramString, "prepareCacheFile", new Object[0]);
        return false;
      }
      catch (Exception paramString)
      {
        x.printErrStackTrace("MicroMsg.Record.AudioRecordUtil", paramString, "prepareCacheFile", new Object[0]);
        return false;
      }
    }
    x.i("MicroMsg.Record.AudioRecordUtil", "delete audio file");
    paramString.delete();
    try
    {
      bool = paramString.createNewFile();
      return bool;
    }
    catch (IOException paramString)
    {
      x.printErrStackTrace("MicroMsg.Record.AudioRecordUtil", paramString, "prepareCacheFile", new Object[0]);
      return false;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.Record.AudioRecordUtil", paramString, "prepareCacheFile", new Object[0]);
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/record/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */