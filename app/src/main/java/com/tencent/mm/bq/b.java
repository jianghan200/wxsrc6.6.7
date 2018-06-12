package com.tencent.mm.bq;

import android.util.SparseArray;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.InputStream;

public final class b
{
  public byte[] hfA;
  public SparseArray<a> sCE;
  
  private b(SparseArray<a> paramSparseArray, byte[] paramArrayOfByte)
  {
    this.sCE = paramSparseArray;
    this.hfA = paramArrayOfByte;
  }
  
  public static b a(SparseArray<a> paramSparseArray, InputStream paramInputStream, int paramInt)
  {
    try
    {
      byte[] arrayOfByte = new byte[paramInt];
      if (paramInputStream.read(arrayOfByte, 0, arrayOfByte.length) != arrayOfByte.length) {
        x.e("MicroMsg.language.PluralsCollection", "[cpan] newPluralsConllection failed. data length no equal.");
      }
      paramSparseArray = new b(paramSparseArray, arrayOfByte);
      return paramSparseArray;
    }
    catch (IOException paramSparseArray)
    {
      x.e("MicroMsg.language.PluralsCollection", "[cpan] newPluralsConllection failed:%s", new Object[] { bi.i(paramSparseArray) });
    }
    return null;
  }
  
  public final String getQuantityString(int paramInt1, int paramInt2, Object... paramVarArgs)
  {
    for (;;)
    {
      try
      {
        int j = this.sCE.indexOfKey(paramInt1);
        if (j < 0) {
          return null;
        }
        localObject = (a)this.sCE.valueAt(j);
        k = ((a)localObject).sCG.length;
        paramInt1 = 0;
        i = 0;
        if (paramInt1 < k)
        {
          if (localObject.sCG[paramInt1] != paramInt2) {
            break label326;
          }
          i = paramInt1;
          break label332;
        }
        if (j <= this.sCE.size() - 1) {
          if (i >= k - 1)
          {
            a locala = (a)this.sCE.valueAt(j + 1);
            localObject = new String(this.hfA, localObject.sCH[i], locala.sCH[0] - localObject.sCH[i]);
          }
        }
      }
      catch (Exception paramVarArgs)
      {
        int k;
        int i;
        localObject = null;
        x.e("MicroMsg.language.PluralsCollection", "[cpan] getString failed. %s", new Object[] { bi.i(paramVarArgs) });
        return (String)localObject;
      }
      try
      {
        if ((!bi.oW((String)localObject)) && (paramVarArgs == null)) {
          break label329;
        }
        paramVarArgs = String.format((String)localObject, paramVarArgs);
        return paramVarArgs;
      }
      catch (Exception paramVarArgs)
      {
        continue;
      }
      Object localObject = new String(this.hfA, localObject.sCH[i], localObject.sCH[(i + 1)] - localObject.sCH[i]);
      continue;
      if (i >= k - 1)
      {
        localObject = new String(this.hfA, localObject.sCH[i], this.hfA.length - localObject.sCH[i]);
      }
      else
      {
        localObject = new String(this.hfA, localObject.sCH[i], localObject.sCH[(i + 1)] - localObject.sCH[i]);
        continue;
        label326:
        break label332;
        label329:
        return (String)localObject;
        label332:
        paramInt1 += 1;
      }
    }
  }
  
  static final class a
  {
    public final int sCF;
    public final int[] sCG;
    public final int[] sCH;
    
    public a(int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
    {
      this.sCF = paramInt;
      this.sCG = paramArrayOfInt1;
      this.sCH = paramArrayOfInt2;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bq/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */