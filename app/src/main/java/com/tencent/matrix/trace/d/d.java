package com.tencent.matrix.trace.d;

import android.app.Activity;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnDrawListener;
import android.view.Window;
import com.tencent.matrix.d.b;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
  extends a
  implements ViewTreeObserver.OnDrawListener
{
  private boolean bum;
  private final LinkedList<com.tencent.matrix.trace.b.a> buy = new LinkedList();
  
  public d(com.tencent.matrix.trace.a parama)
  {
    super(parama);
  }
  
  public final void a(com.tencent.matrix.trace.b.a parama)
  {
    if (!this.buy.contains(parama)) {
      this.buy.add(parama);
    }
  }
  
  public final void b(com.tencent.matrix.trace.b.a parama)
  {
    this.buy.remove(parama);
  }
  
  protected final String getTag()
  {
    return null;
  }
  
  public final void h(final long paramLong1, long paramLong2)
  {
    if (!this.bum) {}
    for (;;)
    {
      return;
      this.bum = false;
      final int i = (int)((paramLong2 - paramLong1) / 16666668L);
      if (i > 1)
      {
        Iterator localIterator = this.buy.iterator();
        while (localIterator.hasNext())
        {
          final com.tencent.matrix.trace.b.a locala = (com.tencent.matrix.trace.b.a)localIterator.next();
          locala.a(paramLong1, paramLong2, this.btH, i);
          if (locala.mHandler != null) {
            locala.mHandler.post(new Runnable()
            {
              public final void run()
              {
                locala.mHandler.post(new d.a(locala, paramLong1, i, d.this.btH, this.buC));
              }
            });
          }
        }
      }
    }
  }
  
  public final void onChange(final Activity paramActivity, Fragment paramFragment)
  {
    super.onChange(paramActivity, paramFragment);
    b.i("Matrix.FrameTracer", "[onChange] activity:%s", new Object[] { paramActivity.getClass().getSimpleName() });
    paramActivity.getWindow().getDecorView().post(new Runnable()
    {
      public final void run()
      {
        paramActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(d.this);
        paramActivity.getWindow().getDecorView().getViewTreeObserver().addOnDrawListener(d.this);
      }
    });
  }
  
  public final void onDraw()
  {
    this.bum = true;
  }
  
  private static final class a
    implements Runnable
  {
    com.tencent.matrix.trace.b.a buE;
    String buF;
    int buG;
    long buH;
    long buI;
    
    a(com.tencent.matrix.trace.b.a parama, long paramLong1, long paramLong2, String paramString, int paramInt)
    {
      this.buE = parama;
      this.buF = paramString;
      this.buG = paramInt;
      this.buH = paramLong1;
      this.buI = paramLong2;
    }
    
    public final void run() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/trace/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */