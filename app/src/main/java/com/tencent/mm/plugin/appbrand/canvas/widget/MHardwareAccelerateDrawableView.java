package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.mm.plugin.appbrand.canvas.d;
import com.tencent.mm.plugin.appbrand.canvas.f;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;

public class MHardwareAccelerateDrawableView
  extends View
  implements a
{
  private final d fnD = new d(this);
  private final Set<View.OnAttachStateChangeListener> fnE = new LinkedHashSet();
  
  public MHardwareAccelerateDrawableView(Context paramContext)
  {
    super(paramContext);
    setLayerType(2, null);
  }
  
  public MHardwareAccelerateDrawableView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setLayerType(2, null);
  }
  
  public MHardwareAccelerateDrawableView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayerType(2, null);
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
    return 667;
  }
  
  public f getDrawContext()
  {
    return this.fnD.getDrawContext();
  }
  
  public int getDrawCostTimeReportId()
  {
    return 668;
  }
  
  public String getSessionId()
  {
    return this.fnD.getSessionId();
  }
  
  public int getType()
  {
    return 0;
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
    d(paramCanvas);
  }
  
  public final void onPause()
  {
    this.fnD.onPause();
  }
  
  public final void onResume()
  {
    this.fnD.onResume();
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/widget/MHardwareAccelerateDrawableView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */