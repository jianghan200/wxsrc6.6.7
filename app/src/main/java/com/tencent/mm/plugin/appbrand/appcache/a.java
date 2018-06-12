package com.tencent.mm.plugin.appbrand.appcache;

import android.content.res.Resources;
import android.util.SparseIntArray;
import com.tencent.mm.plugin.appbrand.e.a.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class a
{
  private static final SparseIntArray ffp;
  
  static
  {
    SparseIntArray localSparseIntArray = new SparseIntArray(3);
    ffp = localSparseIntArray;
    localSparseIntArray.put(0, a.a.app_empty_string);
    ffp.put(1, a.a.app_brand_app_debug_type_testing);
    ffp.put(2, a.a.app_brand_app_debug_type_previewing);
  }
  
  static int D(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte == null) {
      return 0;
    }
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte, paramInt, 4);
    paramArrayOfByte.order(ByteOrder.BIG_ENDIAN);
    return paramArrayOfByte.getInt();
  }
  
  public static String jB(int paramInt)
  {
    paramInt = ffp.get(paramInt, a.a.app_empty_string);
    return ad.getResources().getString(paramInt);
  }
  
  public static String qB(String paramString)
  {
    if (bi.oW(paramString)) {
      return paramString;
    }
    int i = 0;
    while ((i < paramString.length()) && ('/' == paramString.charAt(i))) {
      i += 1;
    }
    return paramString.substring(i);
  }
  
  public static String qC(String paramString)
  {
    int i = 0;
    x.d("MicroMsg.AppBrandAppCacheUtil", "eliminateDuplicateSlashForPkgFile, original file name = [%s]", new Object[] { paramString });
    if (bi.oW(paramString)) {
      return "";
    }
    paramString = paramString.trim();
    if (!paramString.startsWith("/")) {
      return "/" + paramString;
    }
    while ((i < paramString.length()) && ('/' == paramString.charAt(i))) {
      i += 1;
    }
    return "/" + paramString.substring(i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */