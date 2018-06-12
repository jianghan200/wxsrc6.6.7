package com.tencent.mm.plugin.wenote.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.g.a.kp;
import com.tencent.mm.g.a.kp.a;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.fav.a.an;
import com.tencent.mm.plugin.wenote.model.d;
import com.tencent.mm.plugin.wenote.model.f;
import com.tencent.mm.plugin.wenote.model.g;
import com.tencent.mm.plugin.wenote.model.g.1;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c.1;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;

public final class a
  extends com.tencent.mm.sdk.b.c<kp>
{
  public a()
  {
    this.sFo = kp.class.getName().hashCode();
  }
  
  private static boolean a(kp paramkp)
  {
    Object localObject;
    g localg;
    Context localContext;
    wl localwl;
    boolean bool;
    long l;
    switch (paramkp.bUP.type)
    {
    case 1: 
    case 4: 
    case 5: 
    case 6: 
    default: 
      return false;
    case 0: 
      com.tencent.mm.plugin.wenote.model.c.bZb().qnC.b(paramkp);
      return false;
    case 2: 
      if (paramkp.bUP.bUW != 4)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(14789, new Object[] { Integer.valueOf(1) });
        x.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_FAV");
        localObject = new g();
        com.tencent.mm.plugin.wenote.model.c.bZb().qnC = ((d)localObject);
        if ((paramkp.bUP.field_favProto != null) && (paramkp.bUP.field_favProto.rBG != null)) {
          ((g)localObject).qob = paramkp.bUP.field_favProto.rBG.bJt;
        }
        if (paramkp.bUP.bUU != null) {
          ((g)localObject).qoc = paramkp.bUP.bUU.getLong("edittime", 0L);
        }
        ((g)localObject).a(paramkp.bUP.field_localId, paramkp.bUP.context, Boolean.valueOf(paramkp.bUP.bUY), 0, 0, paramkp.bUP.bUZ);
        return false;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.h(14789, new Object[] { Integer.valueOf(4) });
      x.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_SNS");
      localg = new g();
      com.tencent.mm.plugin.wenote.model.c.bZb().qnC = localg;
      localContext = paramkp.bUP.context;
      localwl = paramkp.bUP.field_favProto;
      Bundle localBundle = paramkp.bUP.bUU;
      bool = paramkp.bUP.bUY;
      localObject = "";
      paramkp = "";
      if (localBundle != null)
      {
        localObject = localBundle.getString("noteauthor", "");
        paramkp = localBundle.getString("noteeditor", "");
        l = localBundle.getLong("edittime", 0L);
        localg.qnV = localBundle.getString("snslocalid");
        localg.qnW = localBundle.getString("notexml", "");
        localg.qod = localBundle.getString("snsthumbpath", "");
        localg.qoe = localBundle.getString("snsnotelinkxml", "");
      }
      break;
    }
    for (;;)
    {
      localg.bVe = System.currentTimeMillis();
      localg.bUY = bool;
      localg.qnN = false;
      localg.qoa = ((String)localObject + ";" + paramkp + ";" + l);
      localg.R(localContext, 4);
      au.Em().H(new g.1(localg, localwl));
      return false;
      x.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_ADD");
      localObject = new g();
      ((g)localObject).bVe = paramkp.bUP.field_localId;
      com.tencent.mm.plugin.wenote.model.c.bZb().qnC = ((d)localObject);
      paramkp = paramkp.bUP.context;
      ((g)localObject).qnN = true;
      ((g)localObject).R(paramkp, 2);
      return false;
      paramkp.bUQ.path = an.aLR();
      return false;
      switch (paramkp.bUP.bUV)
      {
      default: 
        return false;
      case 2: 
        com.tencent.mm.plugin.wenote.model.h.X(paramkp.bUP.bUX);
        return false;
      case 4: 
        com.tencent.mm.plugin.wenote.model.h.l(paramkp.bUP.context, paramkp.bUP.path, paramkp.bUP.bUW);
        return false;
      case 5: 
        com.tencent.mm.plugin.wenote.model.h.Sh(paramkp.bUP.path);
        return false;
      }
      try
      {
        com.tencent.mm.plugin.wenote.model.h.Si(paramkp.bUP.bUS);
        return false;
      }
      catch (JSONException paramkp)
      {
        x.printErrStackTrace("MicroMsg.NotifyWNNoteOperationListener", paramkp, "", new Object[0]);
        return false;
      }
      com.tencent.mm.plugin.wenote.model.h.ba(paramkp.bUP.context, paramkp.bUP.path);
      return false;
      f.t(paramkp.bUP.field_localId, paramkp.bUP.path);
      return false;
      f.W(paramkp.bUP.bUX);
      return false;
      paramkp = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD();
      au.Em().h(new c.1(paramkp), 700L);
      return false;
      l = 0L;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wenote/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */