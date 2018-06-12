package com.tencent.mm.plugin.topstory.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Process;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.g.a.rq;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.topstory.PluginTopStory;
import com.tencent.mm.plugin.topstory.b;
import com.tencent.mm.plugin.websearch.api.ae;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.protocal.c.btf;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.base.h;

public final class c
  implements com.tencent.mm.pluginsdk.cmd.a
{
  public boolean ozq;
  public boolean ozr;
  public boolean ozs;
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    int i = -1;
    if (com.tencent.mm.sdk.platformtools.x.getLogLevel() > 1) {
      return false;
    }
    if (paramArrayOfString.length < 2) {
      return true;
    }
    Object localObject = paramArrayOfString[1];
    switch (((String)localObject).hashCode())
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      return true;
      if (!((String)localObject).equals("ch")) {
        break;
      }
      i = 0;
      break;
      if (!((String)localObject).equals("cu")) {
        break;
      }
      i = 1;
      break;
      if (!((String)localObject).equals("st")) {
        break;
      }
      i = 2;
      break;
      if (!((String)localObject).equals("mn")) {
        break;
      }
      i = 3;
      break;
      if (!((String)localObject).equals("cr")) {
        break;
      }
      i = 4;
      break;
      if (!((String)localObject).equals("rd")) {
        break;
      }
      i = 5;
      break;
      if (!((String)localObject).equals("info")) {
        break;
      }
      i = 6;
      break;
      if (!((String)localObject).equals("ct")) {
        break;
      }
      i = 7;
      break;
      g.Ei().DT().a(aa.a.tac, "");
      continue;
      paramContext = new rq();
      paramContext.ccx.actionType = 2;
      com.tencent.mm.sdk.b.a.sFg.m(paramContext);
      continue;
      this.ozq = true;
      continue;
      this.ozr = true;
      continue;
      this.ozs = true;
      continue;
      paramContext = new btf();
      paramContext.bWQ = paramArrayOfString[2];
      paramContext.text = "测试测试";
      paramContext.type = 1;
      try
      {
        paramContext.pMm = Integer.valueOf(paramArrayOfString[3]).intValue();
        paramContext.sqG = System.currentTimeMillis();
        paramContext.eiD = 30L;
        paramContext.sqE = System.currentTimeMillis();
        ((PluginTopStory)g.n(PluginTopStory.class)).getRedDotMgr().a(paramContext);
      }
      catch (Exception paramArrayOfString)
      {
        for (;;)
        {
          paramContext.pMm = 2;
        }
      }
      try
      {
        paramArrayOfString = com.tencent.mm.a.e.ct(com.tencent.mm.compatible.util.e.bnE + "topstory/trace.info");
        localObject = new TextView(paramContext);
        ((TextView)localObject).setText(paramArrayOfString);
        ((TextView)localObject).setGravity(19);
        ((TextView)localObject).setTextSize(1, 10.0F);
        ((TextView)localObject).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ((TextView)localObject).setTextColor(-16711936);
        ((TextView)localObject).setTypeface(Typeface.MONOSPACE);
        i = paramContext.getResources().getDimensionPixelSize(b.b.LargePadding);
        ((TextView)localObject).setPadding(i, i, i, i);
        ((TextView)localObject).setMovementMethod(ScrollingMovementMethod.getInstance());
        h.a(paramContext, null, (View)localObject, null);
      }
      catch (Exception paramContext) {}
      continue;
      FileOp.I(p.zL(1).adP(), false);
      Process.killProcess(Process.myPid());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */