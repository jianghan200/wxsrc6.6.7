package com.tencent.mm.plugin.appbrand.dynamic.widget;

import android.content.Context;
import android.view.View;
import com.tencent.mm.bu.a;
import com.tencent.mm.plugin.appbrand.canvas.widget.MCanvasView;
import com.tencent.mm.plugin.appbrand.canvas.widget.MDrawableView;
import com.tencent.mm.plugin.appbrand.canvas.widget.MHardwareAccelerateDrawableView;
import com.tencent.mm.plugin.appbrand.canvas.widget.MSurfaceView;
import com.tencent.mm.plugin.appbrand.canvas.widget.MTextureView;
import com.tencent.mm.plugin.appbrand.dynamic.b.b;
import com.tencent.mm.sdk.platformtools.x;

public final class c
{
  private static volatile boolean dpg = false;
  private static volatile int fyE = 0;
  
  public static int afA()
  {
    return fyE;
  }
  
  public static String afB()
  {
    switch (fyE)
    {
    default: 
      return "MHADrawableView";
    case 1: 
      return "MTextureView";
    case 2: 
      return "MSurfaceView";
    case 3: 
      return "MCanvasView";
    }
    return "MDrawableView";
  }
  
  public static View bH(Context paramContext)
  {
    if (!dpg) {
      initialize();
    }
    x.d("MicroMsg.WidgetDrawableViewFactory", "inflate(mode : %d)", new Object[] { Integer.valueOf(fyE) });
    switch (fyE)
    {
    default: 
      paramContext = new MHardwareAccelerateDrawableView(paramContext);
      paramContext.getDrawContext().fnl = b.ado();
      return paramContext;
    case 1: 
      paramContext = new MTextureView(paramContext);
      paramContext.getDrawContext().fnl = b.ado();
      return paramContext;
    case 2: 
      paramContext = new MSurfaceView(paramContext);
      paramContext.getDrawContext().fnl = b.ado();
      return paramContext;
    case 3: 
      paramContext = new MCanvasView(paramContext);
      paramContext.getDrawContext().fnl = b.ado();
      return paramContext;
    }
    paramContext = new MDrawableView(paramContext);
    paramContext.getDrawContext().fnl = b.ado();
    return paramContext;
  }
  
  public static void initialize()
  {
    a.post(new c.1());
  }
  
  public static void ki(int paramInt)
  {
    fyE = paramInt;
    dpg = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */