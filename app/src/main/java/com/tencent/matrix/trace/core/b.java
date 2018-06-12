package com.tencent.matrix.trace.core;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
  implements Choreographer.FrameCallback, a.a
{
  private static b btx;
  public boolean btA;
  public long btB;
  public final LinkedList<com.tencent.matrix.trace.b.b> bty = new LinkedList();
  public Choreographer btz;
  
  public static b tF()
  {
    if (btx == null) {
      btx = new b();
    }
    return btx;
  }
  
  public final void doFrame(long paramLong)
  {
    if (paramLong < this.btB)
    {
      com.tencent.matrix.d.b.w("Matrix.FrameBeat", "frameTimeNanos < mLastFrameNanos, just return", new Object[0]);
      this.btB = paramLong;
      this.btz.postFrameCallback(this);
    }
    while (this.bty == null) {
      return;
    }
    Iterator localIterator = this.bty.iterator();
    while (localIterator.hasNext()) {
      ((com.tencent.matrix.trace.b.b)localIterator.next()).h(this.btB, paramLong);
    }
    this.btz.postFrameCallback(this);
    this.btB = paramLong;
  }
  
  public final void onActivityCreated(Activity paramActivity) {}
  
  public final void onActivityPause(Activity paramActivity) {}
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onBackground(Activity paramActivity)
  {
    com.tencent.matrix.d.b.i("Matrix.FrameBeat", "[onBackground] isExist:%s removeFrameCallback", new Object[] { Boolean.valueOf(this.btA) });
    if ((this.btA) && (this.btz != null)) {
      this.btz.removeFrameCallback(this);
    }
  }
  
  public final void onChange(Activity paramActivity, Fragment paramFragment)
  {
    com.tencent.matrix.d.b.i("Matrix.FrameBeat", "[onChange] reset mLastFrameNanos, current activity:%s", new Object[] { paramActivity.getClass().getSimpleName() });
  }
  
  public final void onFront(Activity paramActivity)
  {
    com.tencent.matrix.d.b.i("Matrix.FrameBeat", "[onFront] isExist:%s postFrameCallback", new Object[] { Boolean.valueOf(this.btA) });
    if ((this.btA) && (this.btz != null))
    {
      this.btB = System.nanoTime();
      this.btz.removeFrameCallback(this);
      this.btz.postFrameCallback(this);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/trace/core/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */