package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.mm.plugin.appbrand.canvas.d;
import com.tencent.mm.plugin.appbrand.canvas.f;
import com.tencent.mm.plugin.appbrand.canvas.h;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;

public class MCanvasView
  extends View
  implements a
{
  private final d fnD = new d(this);
  private final Set<View.OnAttachStateChangeListener> fnE = new LinkedHashSet();
  private Bitmap mBitmap;
  
  public MCanvasView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MCanvasView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MCanvasView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a(JSONArray paramJSONArray, a.a parama)
  {
    this.fnD.a(paramJSONArray, parama);
  }
  
  public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    if (this.fnE.contains(paramOnAttachStateChangeListener)) {
      return;
    }
    this.fnE.add(paramOnAttachStateChangeListener);
    super.addOnAttachStateChangeListener(paramOnAttachStateChangeListener);
  }
  
  public final void adk()
  {
    if (!z.ai(this))
    {
      post(new MCanvasView.1(this));
      return;
    }
    postInvalidate();
  }
  
  public final void adl()
  {
    this.fnD.adl();
  }
  
  public final void adm()
  {
    this.fnD.adm();
  }
  
  public final void b(JSONArray paramJSONArray, a.a parama)
  {
    this.fnD.b(paramJSONArray, parama);
  }
  
  public final boolean d(Canvas paramCanvas)
  {
    return this.fnD.d(paramCanvas);
  }
  
  public int getDrawActionCostTimeReportId()
  {
    return 685;
  }
  
  public f getDrawContext()
  {
    return this.fnD.getDrawContext();
  }
  
  public int getDrawCostTimeReportId()
  {
    return 684;
  }
  
  public String getSessionId()
  {
    return this.fnD.getSessionId();
  }
  
  public int getType()
  {
    return 3;
  }
  
  public final boolean isPaused()
  {
    return this.fnD.fmT;
  }
  
  public final void m(Runnable paramRunnable)
  {
    post(paramRunnable);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int i = getMeasuredWidth();
    int j = getMeasuredHeight();
    if ((i <= 0) || (j <= 0)) {
      return;
    }
    if ((this.mBitmap == null) || (this.mBitmap.isRecycled()) || (this.mBitmap.getWidth() != i) || (this.mBitmap.getHeight() != j))
    {
      if ((this.mBitmap != null) && (!this.mBitmap.isRecycled())) {
        this.mBitmap.recycle();
      }
      this.mBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
      x.v("MicroMsg.MCanvasView", "create a new bitmap(id : %s, w : %s, h : %s)", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(j) });
    }
    if (this.mBitmap == null)
    {
      x.d("MicroMsg.MCanvasView", "bitmap is null.");
      return;
    }
    this.mBitmap.eraseColor(0);
    h localh = new h(this.mBitmap);
    d(localh);
    paramCanvas.drawBitmap(localh.mBitmap, 0.0F, 0.0F, null);
  }
  
  public final void onPause()
  {
    this.fnD.onPause();
  }
  
  public final void onResume()
  {
    this.fnD.onResume();
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.mBitmap != null) && (!this.mBitmap.isRecycled())) {
      this.mBitmap.recycle();
    }
    paramInt1 = getMeasuredWidth();
    paramInt2 = getMeasuredHeight();
    if ((paramInt1 > 0) && (paramInt2 > 0))
    {
      this.mBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      x.v("MicroMsg.MCanvasView", "onSizeChanged, create a new bitmap(id : %s, w : %s, h : %s)", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
  }
  
  public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    this.fnE.remove(paramOnAttachStateChangeListener);
    super.removeOnAttachStateChangeListener(paramOnAttachStateChangeListener);
  }
  
  public void setId(String paramString)
  {
    this.fnD.setId(paramString);
  }
  
  public void setSessionId(String paramString)
  {
    this.fnD.setSessionId(paramString);
  }
  
  public void setStartTime(long paramLong)
  {
    this.fnD.setStartTime(paramLong);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/widget/MCanvasView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */