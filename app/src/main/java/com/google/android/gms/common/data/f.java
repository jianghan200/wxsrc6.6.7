package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import java.util.Arrays;

public abstract class f
{
  public final DataHolder aMb;
  public int aMx;
  private int aMy;
  
  public f(DataHolder paramDataHolder, int paramInt)
  {
    this.aMb = ((DataHolder)w.ah(paramDataHolder));
    if ((paramInt >= 0) && (paramInt < this.aMb.aMm)) {}
    for (boolean bool = true;; bool = false)
    {
      w.at(bool);
      this.aMx = paramInt;
      this.aMy = this.aMb.dq(this.aMx);
      return;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof f))
    {
      paramObject = (f)paramObject;
      bool1 = bool2;
      if (v.c(Integer.valueOf(((f)paramObject).aMx), Integer.valueOf(this.aMx)))
      {
        bool1 = bool2;
        if (v.c(Integer.valueOf(((f)paramObject).aMy), Integer.valueOf(this.aMy)))
        {
          bool1 = bool2;
          if (((f)paramObject).aMb == this.aMb) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public final byte[] getByteArray(String paramString)
  {
    DataHolder localDataHolder = this.aMb;
    int i = this.aMx;
    int j = this.aMy;
    localDataHolder.m(paramString, i);
    return localDataHolder.aMj[j].getBlob(i, localDataHolder.aMi.getInt(paramString));
  }
  
  public final int getInteger(String paramString)
  {
    DataHolder localDataHolder = this.aMb;
    int i = this.aMx;
    int j = this.aMy;
    localDataHolder.m(paramString, i);
    return localDataHolder.aMj[j].getInt(i, localDataHolder.aMi.getInt(paramString));
  }
  
  public final String getString(String paramString)
  {
    return this.aMb.d(paramString, this.aMx, this.aMy);
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.aMx), Integer.valueOf(this.aMy), this.aMb });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/common/data/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */