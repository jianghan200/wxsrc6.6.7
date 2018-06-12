package com.tencent.mm.kernel.a;

import com.tencent.mm.kernel.j;

public final class a
{
  public static long drq;
  public static long drr;
  public com.tencent.mm.kernel.a.a.b dro;
  public b drp;
  public volatile boolean mConfigured = false;
  
  public static String aQ(long paramLong)
  {
    return System.currentTimeMillis() - paramLong + "ms";
  }
  
  public static final void j(String paramString, Object... paramVarArgs)
  {
    if (paramVarArgs.length == 0)
    {
      j.i("MMSkeleton.Boot", paramString, new Object[0]);
      return;
    }
    j.i("MMSkeleton.Boot", paramString, paramVarArgs);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */