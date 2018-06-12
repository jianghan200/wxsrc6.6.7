package com.tencent.mm.plugin.sight.base;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Environment;
import android.os.StatFs;
import android.util.StringBuilderPrinter;
import com.tencent.mm.compatible.e.v;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

public final class d
{
  private static int ldW = 0;
  private static int ldX = 0;
  
  public static String Ho(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    String str = a(paramString, new PInt(), new PInt(), new PInt(), new PInt(), new PInt());
    localStringBuffer.append("extInfo: \n" + str);
    localStringBuffer.append("size: " + bi.bF(FileOp.mI(paramString)) + ":" + paramString + "\n");
    str = SightVideoJNI.getMp4RecordInfo(paramString);
    if (!bi.oW(str)) {
      localStringBuffer.append(str);
    }
    localStringBuffer.append("isH265:").append(com.tencent.mm.modelvideo.q.nF(paramString));
    return localStringBuffer.toString();
  }
  
  public static String Ll(String paramString)
  {
    return bi.aG(paramString, "") + ".thumb";
  }
  
  public static String Lm(String paramString)
  {
    return bi.aG(paramString, "") + ".soundmp4";
  }
  
  public static boolean Ln(String paramString)
  {
    if ((bi.oW(paramString)) || (!com.tencent.mm.a.e.cn(paramString))) {
      return false;
    }
    long l = bi.VG();
    c localc = new c();
    int i = SightVideoJNI.isSightOk(paramString, localc.ncd, localc.nce, localc.ncf, localc.nch, localc.ncg, localc.ncg.length);
    x.d("MicroMsg.SightUtil", "ashu::check sight use %dms", new Object[] { Long.valueOf(bi.bI(l)) });
    return i == 0;
  }
  
  public static a Lo(String paramString)
  {
    if (bi.oW(paramString)) {}
    while (!com.tencent.mm.a.e.cn(paramString)) {
      return null;
    }
    a locala = new a();
    try
    {
      paramString = SightVideoJNI.getSimpleMp4Info(paramString);
      x.d("MicroMsg.SightUtil", "get simple mp4 info %s", new Object[] { paramString });
      paramString = new JSONObject(paramString);
      locala.jdD = ((int)paramString.getDouble("videoDuration"));
      locala.width = paramString.getInt("videoWidth");
      locala.height = paramString.getInt("videoHeight");
      locala.ljG = ((int)paramString.getDouble("videoFPS"));
      locala.videoBitrate = paramString.getInt("videoBitrate");
      locala.dQF = paramString.getInt("audioBitrate");
      locala.nbS = paramString.getInt("audioChannel");
      x.i("MicroMsg.SightUtil", "get media %s", new Object[] { locala });
      return locala;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        x.e("MicroMsg.SightUtil", "get media info error %s", new Object[] { paramString.toString() });
      }
    }
  }
  
  public static String a(String paramString, PInt paramPInt1, PInt paramPInt2, PInt paramPInt3, PInt paramPInt4, PInt paramPInt5)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    try
    {
      paramString = SightVideoJNI.getSimpleMp4Info(paramString);
      x.d("MicroMsg.SightUtil", "get simple mp4 info %s", new Object[] { paramString });
      paramString = new JSONObject(paramString);
      paramPInt1.value = ((int)paramString.getDouble("videoDuration"));
      paramPInt2.value = paramString.getInt("videoWidth");
      paramPInt3.value = paramString.getInt("videoHeight");
      paramPInt4.value = ((int)paramString.getDouble("videoFPS"));
      paramPInt5.value = paramString.getInt("videoBitrate");
      localStringBuffer.append("videoBitrate: ").append(paramPInt5.value).append("\n");
      localStringBuffer.append("videoWidth,videoHeight: ").append(paramPInt2.value).append("*").append(paramPInt3.value);
      localStringBuffer.append(" ").append(String.format("%.4f", new Object[] { Double.valueOf(paramPInt2.value * 1.0D / paramPInt3.value) })).append("\n");
      localStringBuffer.append("videoDuration: ").append(paramPInt1.value).append("\n");
      localStringBuffer.append("videoFPS: ").append(paramPInt4.value).append("\n");
      return localStringBuffer.toString();
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.SightUtil", paramString, "get media info error", new Object[0]);
      }
    }
  }
  
  public static Bitmap ad(String paramString, int paramInt1, int paramInt2)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    Bitmap localBitmap = ThumbnailUtils.createVideoThumbnail(paramString, 1);
    if (localBitmap == null)
    {
      x.e("MicroMsg.SightUtil", "create remux thumb bmp error, target path %s", new Object[] { paramString });
      return localBitmap;
    }
    return com.tencent.mm.sdk.platformtools.c.a(localBitmap, paramInt2, paramInt1, true, true);
  }
  
  public static boolean bvC()
  {
    if (com.tencent.mm.compatible.e.q.deO.dfx == 0) {
      return false;
    }
    return com.tencent.mm.compatible.util.d.fR(14);
  }
  
  public static String bvD()
  {
    StringBuilder localStringBuilder = new StringBuilder(512);
    StringBuilderPrinter localStringBuilderPrinter = new StringBuilderPrinter(localStringBuilder);
    Object localObject2 = ad.getContext();
    localStringBuilderPrinter.println("#accinfo.revision=" + com.tencent.mm.sdk.platformtools.d.REV);
    localStringBuilderPrinter.println("#accinfo.build=" + com.tencent.mm.sdk.platformtools.d.TIME + ":" + com.tencent.mm.sdk.platformtools.d.HOSTNAME + ":" + com.tencent.mm.sdk.platformtools.e.bxk);
    Object localObject3 = new StringBuilder("#accinfo.env=");
    Object localObject1;
    if (b.foreground) {
      localObject1 = "f";
    }
    for (;;)
    {
      localStringBuilderPrinter.println((String)localObject1 + ":" + Thread.currentThread().getName() + ":" + b.sFc);
      localStringBuilderPrinter.println("#aacinfo.device_brand=" + com.tencent.mm.protocal.d.qVH);
      localStringBuilderPrinter.println("#aacinfo.device_model=" + com.tencent.mm.protocal.d.qVI);
      localStringBuilderPrinter.println("#aacinfo.os_type=" + com.tencent.mm.protocal.d.qVJ);
      localStringBuilderPrinter.println("#aacinfo.os_name=" + com.tencent.mm.protocal.d.qVK);
      localStringBuilderPrinter.println("#aacinfo.os_version=" + com.tencent.mm.protocal.d.qVL);
      localStringBuilderPrinter.println("#aacinfo.device_name=" + com.tencent.mm.protocal.d.DEVICE_NAME);
      try
      {
        localObject1 = Environment.getDataDirectory();
        localObject3 = new StatFs(((File)localObject1).getPath());
        StatFs localStatFs = new StatFs(com.tencent.mm.compatible.util.e.bnC);
        localObject1 = String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", new Object[] { Integer.valueOf(((ActivityManager)((Context)localObject2).getSystemService("activity")).getMemoryClass()), ((File)localObject1).getAbsolutePath(), Integer.valueOf(((StatFs)localObject3).getBlockSize()), Integer.valueOf(((StatFs)localObject3).getBlockCount()), Integer.valueOf(((StatFs)localObject3).getAvailableBlocks()), com.tencent.mm.compatible.util.e.bnC, Integer.valueOf(localStatFs.getBlockSize()), Integer.valueOf(localStatFs.getBlockCount()), Integer.valueOf(localStatFs.getAvailableBlocks()) });
        localStringBuilderPrinter.println("#accinfo.data=" + (String)localObject1);
        localObject1 = new Date();
        localObject2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
        localStringBuilderPrinter.println("#accinfo.crashTime=" + ((SimpleDateFormat)localObject2).format((Date)localObject1));
        localStringBuilderPrinter.println("#crashContent=");
        return localStringBuilder.toString();
        localObject1 = "b";
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("MicroMsg.SightUtil", "check data size failed :%s", new Object[] { localException.getMessage() });
          String str = "";
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sight/base/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */