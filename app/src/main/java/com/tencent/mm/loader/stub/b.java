package com.tencent.mm.loader.stub;

import android.content.Context;
import android.os.Environment;
import com.tencent.mm.sdk.platformtools.ad;
import java.io.File;

public class b
{
  public static String bnC;
  public static String bnD;
  public static String bnE;
  public static final String duM;
  public static final String duN = duM + "MicroMsg/";
  public static final String duO;
  public static String duP;
  
  static
  {
    Object localObject = ad.getContext();
    if (localObject == null) {
      throw new RuntimeException("MMApplicationContext not initialized.");
    }
    duM = ((Context)localObject).getFilesDir().getParentFile().getAbsolutePath() + "/";
    try
    {
      localObject = new File(duN);
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdirs();
      }
      duO = duM + "files/public/";
      bnC = Environment.getExternalStorageDirectory().getAbsolutePath();
      bnD = "/tencent/MicroMsg/";
      bnE = bnC + bnD;
      duP = bnE + "crash/";
      return;
    }
    catch (Error localError)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/loader/stub/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */