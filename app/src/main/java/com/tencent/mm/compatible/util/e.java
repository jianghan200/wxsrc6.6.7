package com.tencent.mm.compatible.util;

import com.tencent.mm.loader.stub.b;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.ax.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class e
  extends b
{
  public static final String dgi = h.getExternalStorageDirectory().getParent();
  public static String dgj = bnE + "Download/";
  public static String dgk;
  public static String dgl;
  public static String dgm = bnE + "vusericon/";
  public static String dgn = bnE + "Game/";
  public static String dgo = bnE + "CDNTemp/";
  public static String dgp = bnE + "Download/VoiceRemind";
  public static String dgq = bnE + "watchdog/";
  public static String dgr = bnE + "xlog";
  public static String dgs = bnE + "avatar/";
  public static String dgt = bnE + "exdevice/";
  public static String dgu = bnE + "newyear/";
  public static String dgv = bnE + "expose/";
  public static String dgw = bnE + "f2flucky/";
  public static String dgx = bnE + "WebviewCache/";
  public static String dgy = bnE + "pattern_recognition/";
  public static String dgz = bnE + "sniffer/";
  
  public static void ff(String paramString)
  {
    x.i("MicroMsg.CConstants", "initSdCardPath start SDCARD_ROOT: " + bnC);
    if (bi.oW(paramString))
    {
      paramString = ax.ciH();
      int j = paramString.size();
      int i = 0;
      while (i < j)
      {
        x.i("MicroMsg.CConstants", "initSdCardPath start list i = " + i + " StatMountParse: " + paramString.get(i));
        i += 1;
      }
      if (j > 1) {
        Collections.sort(paramString, new Comparator() {});
      }
      if ((j > 0) && (paramString.get(0) != null) && (!bi.oW(((ax.a)paramString.get(0)).sIK)))
      {
        bnC = ((ax.a)paramString.get(0)).sIK;
        i = 0;
        while (i < j)
        {
          x.i("MicroMsg.CConstants", "initSdCardPath end list i = " + i + " StatMountParse: " + paramString.get(i));
          i += 1;
        }
      }
    }
    else
    {
      bnC = paramString;
    }
    bnE = bnC + bnD;
    dgj = bnE + "Download/";
    dgm = bnE + "vusericon/";
    dgn = bnE + "Game/";
    dgo = bnE + "CDNTemp/";
    dgq = bnE + "watchdog/";
    dgr = bnE + "xlog";
    duP = bnE + "crash/";
    dgs = bnE + "avatar/";
    dgk = bnE + "Cache/";
    String str = bnE + "WeChat/";
    paramString = bnE + "WeiXin/";
    if (!com.tencent.mm.a.e.cn(str)) {
      if (!com.tencent.mm.a.e.cn(paramString)) {}
    }
    for (;;)
    {
      dgl = paramString;
      x.i("MicroMsg.CConstants", "initSdCardPath end SDCARD_ROOT: " + bnC);
      return;
      if (!w.chP().equals("zh_CN")) {
        paramString = str;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/util/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */