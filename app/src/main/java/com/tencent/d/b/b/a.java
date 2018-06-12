package com.tencent.d.b.b;

import android.content.SharedPreferences;
import android.util.SparseArray;

public class a
{
  private static volatile a vlO = null;
  private boolean bIu = false;
  private boolean huc = false;
  private SparseArray<String> vlP = new SparseArray(10);
  public SharedPreferences vlQ = null;
  
  public static a cFO()
  {
    if (vlO == null) {
      try
      {
        if (vlO == null) {
          vlO = new a();
        }
        a locala = vlO;
        return locala;
      }
      finally {}
    }
    return vlO;
  }
  
  public final boolean cFN()
  {
    try
    {
      boolean bool = this.bIu;
      return bool;
    }
    finally {}
  }
  
  public final void cFP()
  {
    try
    {
      this.huc = true;
      return;
    }
    finally {}
  }
  
  public final SparseArray<String> cFQ()
  {
    try
    {
      SparseArray localSparseArray = this.vlP;
      return localSparseArray;
    }
    finally {}
  }
  
  public final SharedPreferences cFR()
  {
    try
    {
      SharedPreferences localSharedPreferences = this.vlQ;
      return localSharedPreferences;
    }
    finally {}
  }
  
  public final boolean isInit()
  {
    try
    {
      boolean bool = this.huc;
      return bool;
    }
    finally {}
  }
  
  public final void mQ(boolean paramBoolean)
  {
    try
    {
      this.bIu = paramBoolean;
      return;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/d/b/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */