package com.tencent.mm.plugin.gif;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class g
{
  public static Bitmap ay(byte[] paramArrayOfByte)
  {
    if (bi.bC(paramArrayOfByte)) {
      return null;
    }
    int[] arrayOfInt2 = new int[4];
    int[] arrayOfInt1 = new int[4];
    long l = MMWXGFJNI.nativeInitWxAMDecoder();
    if (l == 0L) {
      x.w("MicroMsg.GIF.MMWXGFUtil", "Cpan init wxam decoder failed.");
    }
    int i = MMWXGFJNI.nativeDecodeBufferHeader(l, paramArrayOfByte, paramArrayOfByte.length);
    if (i != 0) {
      x.w("MicroMsg.GIF.MMWXGFUtil", "Cpan WXGF decode buffer header failed. result:%d", new Object[] { Integer.valueOf(i) });
    }
    i = MMWXGFJNI.nativeGetOption(l, paramArrayOfByte, paramArrayOfByte.length, arrayOfInt2);
    if (i != 0) {
      x.w("MicroMsg.GIF.MMWXGFUtil", "Cpan WXGF get option failed. result:%d", new Object[] { Integer.valueOf(i) });
    }
    paramArrayOfByte = Bitmap.createBitmap(arrayOfInt2[1], arrayOfInt2[2], Bitmap.Config.ARGB_8888);
    MMWXGFJNI.nativeDecodeBufferFrame(l, null, 0, paramArrayOfByte, arrayOfInt1);
    MMWXGFJNI.nativeUninit(l);
    return paramArrayOfByte;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/gif/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */