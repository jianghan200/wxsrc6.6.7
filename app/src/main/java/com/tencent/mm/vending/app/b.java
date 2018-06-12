package com.tencent.mm.vending.app;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  private static b uPS = new b();
  Map<c, a> uPT = new ConcurrentHashMap();
  final SparseIntArray uPU = new SparseIntArray();
  final Handler uPV = new b.1(this, com.tencent.mm.vending.i.b.cBP().uRM.getLooper());
  
  public static b cBv()
  {
    return uPS;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/vending/app/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */