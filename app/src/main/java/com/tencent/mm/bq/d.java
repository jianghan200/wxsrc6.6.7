package com.tencent.mm.bq;

import android.util.SparseArray;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.InputStream;

public final class d
{
  public byte[] hfA;
  public SparseArray<a> sCJ;
  
  private d(SparseArray<a> paramSparseArray, byte[] paramArrayOfByte)
  {
    this.sCJ = paramSparseArray;
    this.hfA = paramArrayOfByte;
  }
  
  public static d b(SparseArray<a> paramSparseArray, InputStream paramInputStream, int paramInt)
  {
    try
    {
      byte[] arrayOfByte = new byte[paramInt];
      if (paramInputStream.read(arrayOfByte, 0, arrayOfByte.length) != arrayOfByte.length) {
        x.e("MicroMsg.language.StringArraysCollection", "[cpan] newPluralsConllection failed. data length no equal.");
      }
      paramSparseArray = new d(paramSparseArray, arrayOfByte);
      return paramSparseArray;
    }
    catch (IOException paramSparseArray)
    {
      x.e("MicroMsg.language.StringArraysCollection", "[cpan] newPluralsConllection failed:%s", new Object[] { bi.i(paramSparseArray) });
    }
    return null;
  }
  
  static final class a
  {
    public final int jxE;
    public final int[] sCK;
    
    public a(int paramInt, int[] paramArrayOfInt)
    {
      this.jxE = paramInt;
      this.sCK = paramArrayOfInt;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bq/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */