package com.tencent.matrix.trace.d;

import android.app.Activity;
import android.os.Process;
import android.support.v4.app.Fragment;
import com.tencent.matrix.c.c;
import com.tencent.matrix.trace.core.a.a;
import java.util.LinkedList;
import org.json.JSONObject;

public abstract class a
  extends c
  implements com.tencent.matrix.trace.b.b, a.a
{
  final com.tencent.matrix.trace.a btG;
  String btH;
  boolean isBackground;
  
  a(com.tencent.matrix.trace.a parama)
  {
    super(parama);
    this.btG = parama;
  }
  
  protected final void b(JSONObject paramJSONObject)
  {
    com.tencent.matrix.c.b localb = new com.tencent.matrix.c.b();
    localb.tag = getTag();
    localb.brm = paramJSONObject;
    this.btG.a(localb);
  }
  
  protected abstract String getTag();
  
  public void onActivityCreated(Activity paramActivity) {}
  
  public void onActivityPause(Activity paramActivity) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onBackground(Activity paramActivity)
  {
    this.isBackground = true;
  }
  
  public void onChange(Activity paramActivity, Fragment paramFragment)
  {
    if (paramActivity == null)
    {
      paramActivity = "null";
      this.btH = paramActivity;
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder().append(paramActivity.getClass().getName());
    if (paramFragment == null) {}
    for (paramActivity = "";; paramActivity = "&" + paramFragment.getClass().getName())
    {
      paramActivity = paramActivity;
      break;
    }
  }
  
  public void onCreate()
  {
    com.tencent.matrix.d.b.i("Matrix.BaseTracer", "[onCreate] name:%s process:%s", new Object[] { getClass().getSimpleName(), Integer.valueOf(Process.myPid()) });
    com.tencent.matrix.trace.core.a.tE().a(this);
    com.tencent.matrix.trace.core.b localb = com.tencent.matrix.trace.core.b.tF();
    if ((localb.bty != null) && (!localb.bty.contains(this))) {
      localb.bty.add(this);
    }
  }
  
  public void onDestroy()
  {
    com.tencent.matrix.d.b.i("Matrix.BaseTracer", "[onDestroy] name:%s  process:%s", new Object[] { getClass().getSimpleName(), Integer.valueOf(Process.myPid()) });
    com.tencent.matrix.trace.core.a.tE().b(this);
    com.tencent.matrix.trace.core.b localb = com.tencent.matrix.trace.core.b.tF();
    if (localb.bty != null) {
      localb.bty.remove(this);
    }
  }
  
  public void onFront(Activity paramActivity)
  {
    this.isBackground = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/trace/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */