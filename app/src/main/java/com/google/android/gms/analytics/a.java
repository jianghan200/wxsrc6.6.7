package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a
  extends c
{
  private static List<Runnable> aEG = new ArrayList();
  public boolean aEH;
  public boolean aEI;
  private Set<Object> aEJ = new HashSet();
  public boolean aEK;
  volatile boolean aEL;
  
  public a(q paramq)
  {
    super(paramq);
  }
  
  public static void mD()
  {
    try
    {
      if (aEG != null)
      {
        Iterator localIterator = aEG.iterator();
        while (localIterator.hasNext()) {
          ((Runnable)localIterator.next()).run();
        }
        aEG = null;
      }
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */