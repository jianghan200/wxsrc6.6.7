package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.OnAttachStateChangeListener;
import android.view.Window;
import com.tencent.mm.plugin.appbrand.canvas.d;
import com.tencent.mm.plugin.appbrand.canvas.f;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;

public class MTextureView
  extends TextureView
  implements TextureView.SurfaceTextureListener, a
{
  private final d fnD = new d(this);
  private final Set<View.OnAttachStateChangeListener> fnE = new LinkedHashSet();
  private volatile ag fnH;
  private Runnable fnI = new MTextureView.1(this);
  private volatile boolean fnK;
  private volatile Object mLock = new Object();
  
  public MTextureView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public MTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public MTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    setSurfaceTextureListener(this);
    ((Activity)getContext()).getWindow().setFlags(16777216, 16777216);
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
    if (this.fnH == null) {
      return;
    }
    this.fnH.removeCallbacks(this.fnI);
    this.fnH.post(this.fnI);
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
    return 682;
  }
  
  public f getDrawContext()
  {
    return this.fnD.getDrawContext();
  }
  
  public int getDrawCostTimeReportId()
  {
    return 683;
  }
  
  public String getSessionId()
  {
    return this.fnD.getSessionId();
  }
  
  public int getType()
  {
    return 1;
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
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    x.v("MicroMsg.MTextureView", "onSurfaceTextureAvailable");
    if (this.fnH == null)
    {
      paramSurfaceTexture = e.cZ("MTextureView#Rending-Thread", -19);
      paramSurfaceTexture.start();
      this.fnH = new ag(paramSurfaceTexture.getLooper());
    }
    paramSurfaceTexture = lockCanvas();
    if (paramSurfaceTexture == null) {
      return;
    }
    paramSurfaceTexture.drawColor(-1);
    unlockCanvasAndPost(paramSurfaceTexture);
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture arg1)
  {
    x.v("MicroMsg.MTextureView", "onSurfaceTextureDestroyed");
    this.fnH.removeCallbacks(this.fnI);
    this.fnH.getLooper().quit();
    synchronized (this.mLock)
    {
      boolean bool = this.fnK;
      if (bool) {}
      try
      {
        this.mLock.wait(1000L);
        this.fnH = null;
        return true;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          x.e("MicroMsg.MTextureView", "await error : %s", new Object[] { Log.getStackTraceString(localInterruptedException) });
        }
      }
    }
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    x.v("MicroMsg.MTextureView", "onSurfaceTextureSizeChanged");
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/widget/MTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */