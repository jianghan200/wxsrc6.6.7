package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.text.ClipboardManager;
import android.text.Spanned;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.wenote.b.c;
import com.tencent.mm.plugin.wenote.model.nativenote.a.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class f
{
  public static ArrayList<com.tencent.mm.plugin.wenote.model.a.b> gvR;
  private static String qqt;
  
  public static void acV()
  {
    if (gvR != null) {
      gvR.clear();
    }
    qqt = "";
    com.tencent.mm.plugin.fav.a.an.iXj = null;
  }
  
  public static ArrayList<com.tencent.mm.plugin.wenote.model.a.b> bZS()
  {
    ArrayList localArrayList = new ArrayList();
    if (gvR == null) {
      return localArrayList;
    }
    Iterator localIterator = gvR.iterator();
    label169:
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.wenote.model.a.b localb = c.c((com.tencent.mm.plugin.wenote.model.a.b)localIterator.next());
      int j;
      if (localb == null) {
        j = 0;
      }
      for (;;)
      {
        if (j == 0) {
          break label169;
        }
        localArrayList.add(localb);
        break;
        j = 1;
        int k = localb.getType();
        int i;
        String str;
        if ((k != 2) && (k != 6) && (k != 4))
        {
          i = j;
          if (k != 5) {}
        }
        else
        {
          str = c.d(localb);
          if (!bi.oW(str))
          {
            i = j;
            if (FileOp.cn(str)) {}
          }
          else
          {
            i = 0;
          }
        }
        if (k != 2)
        {
          j = i;
          if (k != 6) {}
        }
        else
        {
          str = c.e(localb);
          if (!bi.oW(str))
          {
            j = i;
            if (FileOp.cn(str)) {}
          }
          else
          {
            j = 0;
          }
        }
      }
    }
    return localArrayList;
  }
  
  public static void c(Context paramContext, ArrayList<com.tencent.mm.plugin.wenote.model.a.b> paramArrayList)
  {
    if (gvR != null) {
      gvR.clear();
    }
    gvR = paramArrayList;
    paramArrayList = new HashSet();
    if (gvR != null)
    {
      Iterator localIterator = gvR.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (com.tencent.mm.plugin.wenote.model.a.b)localIterator.next();
        String str = c.d((com.tencent.mm.plugin.wenote.model.a.b)localObject);
        if (!bi.oW(str)) {
          paramArrayList.add(str);
        }
        localObject = c.e((com.tencent.mm.plugin.wenote.model.a.b)localObject);
        if (!bi.oW((String)localObject)) {
          paramArrayList.add(localObject);
        }
      }
    }
    com.tencent.mm.plugin.fav.a.an.iXj = paramArrayList;
    paramArrayList = new StringBuilder("");
    if (gvR != null)
    {
      int i = 0;
      if (i < gvR.size())
      {
        if (i != gvR.size() - 1) {
          paramArrayList.append(c.a(paramContext, (com.tencent.mm.plugin.wenote.model.a.b)gvR.get(i))).append("<br/>");
        }
        for (;;)
        {
          i += 1;
          break;
          paramArrayList.append(c.a(paramContext, (com.tencent.mm.plugin.wenote.model.a.b)gvR.get(i)));
        }
      }
    }
    qqt = c.Su(paramArrayList.toString());
    paramContext = (ClipboardManager)paramContext.getSystemService("clipboard");
    if (paramContext != null) {
      paramContext.setText(a.Sk(qqt));
    }
  }
  
  public static boolean eD(Context paramContext)
  {
    paramContext = (ClipboardManager)paramContext.getSystemService("clipboard");
    if (paramContext.getText().length() >= 16384) {
      return true;
    }
    return c.Ss(paramContext.getText().toString()) >= 16384;
  }
  
  public static int eE(Context paramContext)
  {
    paramContext = (ClipboardManager)paramContext.getSystemService("clipboard");
    if ((paramContext == null) || (paramContext.getText() == null) || (paramContext.getText().length() <= 0)) {}
    for (int i = 1;; i = 0)
    {
      if ((gvR == null) || (gvR.size() <= 0)) {}
      for (int j = 1;; j = 0)
      {
        if ((i != 0) && (j != 0)) {
          return 1;
        }
        if ((i == 0) && (j != 0)) {
          return 2;
        }
        if (i != 0) {
          return 3;
        }
        try
        {
          paramContext = paramContext.getText();
          if ((paramContext instanceof Spanned)) {}
          for (paramContext = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)paramContext); paramContext.equals(qqt); paramContext = paramContext.toString()) {
            return 3;
          }
        }
        catch (Exception paramContext)
        {
          for (;;)
          {
            x.e("WNNoteClipboardManager", "get clipboard data error : ", new Object[] { paramContext });
            paramContext = "";
          }
        }
        return 2;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/manager/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */