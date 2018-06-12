package com.tencent.mm.bq;

import android.util.SparseIntArray;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public final class f
{
  SparseIntArray sCU;
  byte[] sCV;
  
  private f(SparseIntArray paramSparseIntArray, byte[] paramArrayOfByte)
  {
    this.sCU = paramSparseIntArray;
    this.sCV = paramArrayOfByte;
  }
  
  public static f a(SparseIntArray paramSparseIntArray, InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    try
    {
      if (paramInputStream.read(arrayOfByte, 0, arrayOfByte.length) != arrayOfByte.length) {
        x.e("MicroMsg.language.StringsCollection", "[cpan] newStringsCollection failed. data length no equal.");
      }
      paramSparseIntArray = new f(paramSparseIntArray, arrayOfByte);
      return paramSparseIntArray;
    }
    catch (IOException paramSparseIntArray)
    {
      x.e("MicroMsg.language.StringsCollection", "[cpan] newStringsCollection failed. %s", new Object[] { bi.i(paramSparseIntArray) });
    }
    return null;
  }
  
  public final String getString(int paramInt)
  {
    try
    {
      paramInt = this.sCU.indexOfKey(paramInt);
      if (paramInt < 0) {
        return null;
      }
      int i = this.sCU.valueAt(paramInt);
      if (paramInt < this.sCU.size() - 1) {
        paramInt = this.sCU.valueAt(paramInt + 1) - i;
      }
      for (;;)
      {
        String str1 = new String(this.sCV, i, paramInt, "UTF-8");
        break;
        paramInt = this.sCV.length;
        paramInt -= i;
      }
      Object localObject;
      String str2;
      return str2;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      x.e("MicroMsg.language.StringsCollection", "[cpan] getString failed. %s", new Object[] { bi.i(localUnsupportedEncodingException) });
      localObject = null;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.language.StringsCollection", "[cpan] getString failed. %s", new Object[] { bi.i(localException) });
      str2 = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bq/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */