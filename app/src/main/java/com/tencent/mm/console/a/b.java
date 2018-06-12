package com.tencent.mm.console.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Process;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.r;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.protocal.c.avk;
import com.tencent.mm.protocal.c.avl;
import com.tencent.mm.storage.aa.a;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
  implements a
{
  static
  {
    com.tencent.mm.pluginsdk.cmd.b.a(new b(), new String[] { "//fts" });
  }
  
  private static void C(Context paramContext, String paramString)
  {
    TextView localTextView = new TextView(paramContext);
    localTextView.setText(paramString);
    localTextView.setGravity(19);
    localTextView.setTextSize(1, 10.0F);
    localTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    localTextView.setTextColor(-16711936);
    localTextView.setTypeface(Typeface.MONOSPACE);
    int i = paramContext.getResources().getDimensionPixelSize(R.f.LargePadding);
    localTextView.setPadding(i, i, i, i);
    com.tencent.mm.ui.base.h.a(paramContext, null, localTextView, null);
  }
  
  public static void init() {}
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    if (com.tencent.mm.sdk.platformtools.x.getLogLevel() > 1) {
      return false;
    }
    if (paramArrayOfString.length < 2) {
      return true;
    }
    Object localObject1 = paramArrayOfString[1];
    int i = -1;
    switch (((String)localObject1).hashCode())
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
      if (!((String)localObject1).equals("msbiz")) {
        break;
      }
      i = 0;
      break;
      if (!((String)localObject1).equals("deletedb")) {
        break;
      }
      i = 1;
      break;
      if (!((String)localObject1).equals("copydb")) {
        break;
      }
      i = 2;
      break;
      if (!((String)localObject1).equals("corrupt")) {
        break;
      }
      i = 3;
      break;
      if (!((String)localObject1).equals("addchatroomcontact")) {
        break;
      }
      i = 4;
      break;
      if (!((String)localObject1).equals("clearconfig")) {
        break;
      }
      i = 5;
      break;
      if (!((String)localObject1).equals("info")) {
        break;
      }
      i = 6;
      break;
      if (!((String)localObject1).equals("insert")) {
        break;
      }
      i = 7;
      break;
      if (!((String)localObject1).equals("clearunread")) {
        break;
      }
      i = 8;
      break;
      localObject1 = com.tencent.mm.plugin.websearch.api.x.bTb();
      paramArrayOfString = new StringBuilder();
      localObject1 = ((avl)localObject1).hbG.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (avk)((Iterator)localObject1).next();
        paramArrayOfString.append(String.format("%s | %.2f | %s", new Object[] { r.gT(((avk)localObject2).rdS), Double.valueOf(((avk)localObject2).rYh), com.tencent.mm.pluginsdk.f.h.h("yyyy-MM-dd HH:mm", ((avk)localObject2).rYi / 1000L) }));
        paramArrayOfString.append("\n");
      }
      C(paramContext, paramArrayOfString.toString());
      continue;
      au.HU();
      paramContext = new File(com.tencent.mm.model.c.Gp(), "FTS5IndexMicroMsg.db");
      if (paramContext.exists()) {
        paramContext.delete();
      }
      Process.killProcess(Process.myPid());
      continue;
      au.HU();
      paramContext = new File(com.tencent.mm.model.c.Gp(), "FTS5IndexMicroMsg.db");
      paramArrayOfString = new File("/sdcard/IndexMicroMsg.db");
      if (paramArrayOfString.exists()) {
        paramArrayOfString.delete();
      }
      FileOp.y(paramContext.getAbsolutePath(), paramArrayOfString.getAbsolutePath());
      continue;
      paramContext = new i();
      paramContext.jsn = 65522;
      ((n)g.n(n.class)).search(10000, paramContext);
      continue;
      paramContext = new i();
      paramContext.bWm = paramArrayOfString[2];
      paramContext.jsn = 65523;
      ((n)g.n(n.class)).search(10000, paramContext);
      continue;
      paramContext = aa.a.sWu;
      paramArrayOfString = aa.a.sWv;
      localObject1 = aa.a.sWw;
      Object localObject2 = aa.a.sWx;
      aa.a locala1 = aa.a.sWy;
      aa.a locala2 = aa.a.sWz;
      aa.a locala3 = aa.a.sWA;
      aa.a locala4 = aa.a.sWB;
      aa.a locala5 = aa.a.sWC;
      aa.a locala6 = aa.a.sWD;
      aa.a locala7 = aa.a.sWE;
      aa.a locala8 = aa.a.sWF;
      aa.a locala9 = aa.a.sWG;
      aa.a locala10 = aa.a.sWH;
      aa.a locala11 = aa.a.sWI;
      aa.a locala12 = aa.a.sWJ;
      aa.a locala13 = aa.a.sWK;
      aa.a locala14 = aa.a.sWL;
      aa.a locala15 = aa.a.sWM;
      aa.a locala16 = aa.a.sWN;
      aa.a locala17 = aa.a.sWO;
      aa.a locala18 = aa.a.sWP;
      aa.a locala19 = aa.a.sWQ;
      aa.a locala20 = aa.a.sWR;
      aa.a locala21 = aa.a.sWS;
      aa.a locala22 = aa.a.sWT;
      i = 0;
      while (i < 26)
      {
        aa.a locala23 = new aa.a[] { paramContext, paramArrayOfString, localObject1, localObject2, locala1, locala2, locala3, locala4, locala5, locala6, locala7, locala8, locala9, locala10, locala11, locala12, locala13, locala14, locala15, locala16, locala17, locala18, locala19, locala20, locala21, locala22 }[i];
        au.HU();
        com.tencent.mm.model.c.DT().a(locala23, "");
        i += 1;
      }
      paramArrayOfString = new File(com.tencent.mm.plugin.fts.a.c.jqx, "FTS5IndexMicroMsgInfo.txt");
      if (!paramArrayOfString.exists()) {
        continue;
      }
      try
      {
        C(paramContext, FileOp.ct(paramArrayOfString.getAbsolutePath()));
      }
      catch (IOException paramContext) {}
      continue;
      paramContext = new i();
      paramContext.jsn = 65521;
      paramContext.jss = 100;
      if (paramArrayOfString.length > 2) {}
      try
      {
        paramContext.jss = Integer.valueOf(paramArrayOfString[2]).intValue();
        ((n)g.n(n.class)).search(10000, paramContext);
        continue;
        paramContext = new i();
        paramContext.jsn = 65524;
        ((n)g.n(n.class)).search(10000, paramContext);
      }
      catch (Exception paramArrayOfString)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/console/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */