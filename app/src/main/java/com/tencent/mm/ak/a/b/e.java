package com.tencent.mm.ak.a.b;

import com.tencent.mm.a.g;
import com.tencent.mm.ak.a.c.k;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class e
  implements k
{
  public static byte[] a(InputStream paramInputStream, boolean paramBoolean)
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    arrayOfByte = localByteArrayOutputStream.toByteArray();
    localByteArrayOutputStream.close();
    if (!paramBoolean) {
      paramInputStream.close();
    }
    return arrayOfByte;
  }
  
  public static byte[] m(InputStream paramInputStream)
  {
    return a(paramInputStream, false);
  }
  
  public final boolean ap(String paramString1, String paramString2)
  {
    if (bi.oW(paramString2))
    {
      x.w("MicroMsg.DefaultImageMD5CheckListener", "hy: filePath is null. check failed");
      return false;
    }
    if (bi.oW(paramString1))
    {
      x.w("MicroMsg.DefaultImageMD5CheckListener", "hy: target md5 is null or nill. check failed");
      return false;
    }
    paramString2 = g.cu(paramString2);
    if ((!bi.oW(paramString2)) && (paramString2.equals(paramString1)))
    {
      x.i("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check success");
      return true;
    }
    x.w("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check failed. original is %s, target is %s", new Object[] { paramString2, paramString1 });
    return false;
  }
  
  public final boolean b(String paramString, InputStream paramInputStream)
  {
    if (paramInputStream == null)
    {
      x.w("MicroMsg.DefaultImageMD5CheckListener", "hy: inputStream is null. check failed");
      return false;
    }
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.DefaultImageMD5CheckListener", "hy: target md5 is null or nill. check failed");
      return false;
    }
    try
    {
      paramInputStream = ac.t(a(paramInputStream, true));
      if ((!bi.oW(paramInputStream)) && (paramInputStream.equals(paramString)))
      {
        x.i("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check success");
        return true;
      }
      x.w("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check failed. original is %s, target is %s", new Object[] { paramInputStream, paramString });
      return false;
    }
    catch (Exception paramString)
    {
      x.w("MicroMsg.DefaultImageMD5CheckListener", "hy: exception: " + paramString.toString());
    }
    return false;
  }
  
  public final boolean j(String paramString, byte[] paramArrayOfByte)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.DefaultImageMD5CheckListener", "hy: target md5 is null or nill. check failed");
      return false;
    }
    paramArrayOfByte = ac.t(paramArrayOfByte);
    if ((!bi.oW(paramArrayOfByte)) && (paramArrayOfByte.equals(paramString)))
    {
      x.i("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check success");
      return true;
    }
    x.w("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check failed. original is %s, target is %s", new Object[] { paramArrayOfByte, paramString });
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ak/a/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */