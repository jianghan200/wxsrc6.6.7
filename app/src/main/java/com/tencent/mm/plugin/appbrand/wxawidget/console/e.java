package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.mm.compatible.util.a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public final class e
{
  private static final List<WeakReference<ControlBoardPanel>> gQA = new LinkedList();
  private static final ControlBoardPanel.a gQB = new e.1();
  
  public static void cP(Context paramContext)
  {
    int i;
    Object localObject;
    if (paramContext != null)
    {
      i = 0;
      if (i < gQA.size())
      {
        localObject = (WeakReference)gQA.get(i);
        if (localObject != null)
        {
          localObject = (ControlBoardPanel)((WeakReference)localObject).get();
          if ((localObject != null) && (paramContext == ((ControlBoardPanel)localObject).getContext()))
          {
            label55:
            if (localObject != null) {
              break label232;
            }
            paramContext = new ControlBoardPanel(paramContext);
            gQA.add(new WeakReference(paramContext));
          }
        }
      }
    }
    for (;;)
    {
      localObject = gQB;
      if (!paramContext.gQK)
      {
        paramContext.gQK = true;
        Activity localActivity = (Activity)paramContext.getContext();
        paramContext.gQJ = new WindowManager.LayoutParams(-2, -2, 1003, 520, -3);
        paramContext.gQJ.y = a.h(localActivity);
        paramContext.gQJ.token = localActivity.getWindow().getDecorView().getWindowToken();
        paramContext.gQJ.gravity = 51;
        paramContext.gQJ.softInputMode = 16;
        paramContext.gQI.addView(paramContext, paramContext.gQJ);
        paramContext.reset();
        paramContext.gQB = ((ControlBoardPanel.a)localObject);
        if (paramContext.gQB != null) {
          paramContext.gQB.a(paramContext, true);
        }
      }
      return;
      i += 1;
      break;
      localObject = null;
      break label55;
      label232:
      paramContext = (Context)localObject;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/wxawidget/console/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */