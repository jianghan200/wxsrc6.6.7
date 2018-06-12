package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class c
{
  private static final c a = new c();
  private ConcurrentHashMap<Integer, WeakReference<e>> b = new ConcurrentHashMap();
  private PhoneStateListener c = null;
  private Context d;
  
  public static c a()
  {
    return a;
  }
  
  private void a(int paramInt)
  {
    for (;;)
    {
      try
      {
        Iterator localIterator = this.b.entrySet().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        e locale = (e)((WeakReference)((Map.Entry)localIterator.next()).getValue()).get();
        if (locale != null) {
          locale.b(paramInt);
        } else {
          ((Iterator)localObject).remove();
        }
      }
      finally {}
    }
  }
  
  public void a(Context paramContext)
  {
    if (this.c != null) {
      return;
    }
    this.d = paramContext.getApplicationContext();
    new Handler(Looper.getMainLooper()).post(new c.1(this));
  }
  
  public void a(e parame)
  {
    if (parame == null) {}
    for (;;)
    {
      return;
      try
      {
        this.b.put(Integer.valueOf(parame.hashCode()), new WeakReference(parame));
      }
      finally {}
    }
  }
  
  public void b(e parame)
  {
    if (parame == null) {}
    for (;;)
    {
      return;
      try
      {
        if (!this.b.containsKey(Integer.valueOf(parame.hashCode()))) {
          continue;
        }
        this.b.remove(Integer.valueOf(parame.hashCode()));
      }
      finally {}
    }
  }
  
  protected void finalize()
  {
    super.finalize();
    if ((this.c != null) && (this.d != null)) {
      new Handler(Looper.getMainLooper()).post(new c.2(this));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/liteav/audio/impl/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */