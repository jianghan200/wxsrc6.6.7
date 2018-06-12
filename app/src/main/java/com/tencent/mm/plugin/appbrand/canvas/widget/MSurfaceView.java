package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.mm.plugin.appbrand.canvas.d;
import com.tencent.mm.plugin.appbrand.canvas.f;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;

public class MSurfaceView
  extends SurfaceView
  implements SurfaceHolder.Callback, a
{
  private final d fnD = new d(this);
  private final Set<View.OnAttachStateChangeListener> fnE = new LinkedHashSet();
  private SurfaceHolder fnG;
  private ag fnH;
  private Runnable fnI = new MSurfaceView.1(this);
  private volatile boolean nY;
  
  public MSurfaceView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public MSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public MSurfaceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    this.fnG = getHolder();
    this.fnG.addCallback(this);
    this.fnG.setFormat(-3);
    Paint localPaint = new Paint();
    localPaint.setColor(-1);
    this.fnD.getDrawContext().fnk = localPaint;
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
    m(new MSurfaceView.2(this));
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
  
  public void draw(Canvas paramCanvas)
  {
    x.i("MicroMsg.MSurfaceView", "draw(%s)", new Object[] { Integer.valueOf(hashCode()) });
    paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
    super.draw(paramCanvas);
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
    return 2;
  }
  
  public final boolean isPaused()
  {
    return this.fnD.fmT;
  }
  
  public final void m(Runnable paramRunnable)
  {
    if (this.fnH == null) {
      return;
    }
    this.fnH.post(paramRunnable);
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
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    x.i("MicroMsg.MSurfaceView", "surfaceChanged(%s)", new Object[] { Integer.valueOf(hashCode()) });
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    x.i("MicroMsg.MSurfaceView", "surfaceCreated(%s)", new Object[] { Integer.valueOf(hashCode()) });
    this.nY = false;
    if (this.fnH == null)
    {
      paramSurfaceHolder = e.cZ("MSurfaceView#Rending-Thread", -19);
      paramSurfaceHolder.start();
      this.fnH = new ag(paramSurfaceHolder.getLooper());
    }
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    x.i("MicroMsg.MSurfaceView", "surfaceDestroyed(%s)", new Object[] { Integer.valueOf(hashCode()) });
    this.nY = true;
    this.fnH.getLooper().quit();
    this.fnH = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/widget/MSurfaceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */