package com.tencent.mm.plugin.readerapp.c;

import com.tencent.mm.g.a.ch;
import com.tencent.mm.model.bi;
import com.tencent.mm.plugin.readerapp.a.g;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vfs.d;
import java.util.LinkedList;

public final class b
{
  public static boolean a(ch paramch, bi parambi, int paramInt)
  {
    if ((paramch == null) || (parambi == null))
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or readerAppInfo is null");
      if (paramch != null) {
        paramch.bJF.bJL = a.g.favorite_fail_argument_error;
      }
      return false;
    }
    wl localwl = new wl();
    wr localwr = new wr();
    vx localvx = new vx();
    localwr.Vw("newsapp");
    localwr.Vx(com.tencent.mm.model.q.GF());
    localwr.Vx(com.tencent.mm.model.q.GF());
    localwr.CO(1);
    localwr.fU(parambi.dCR);
    localwr.VA(parambi.dCW);
    localwr.VD(parambi.getUrl());
    localwr.VE("newsapp");
    localvx.UT(String.valueOf(parambi.dCW));
    Object localObject;
    if (paramInt == 0)
    {
      localObject = com.tencent.mm.pluginsdk.model.q.v(parambi.Iz(), parambi.type, "@T");
      if (!d.cn((String)localObject)) {
        break label287;
      }
      localvx.UQ((String)localObject);
    }
    for (;;)
    {
      localvx.CF(5);
      localvx.UB(parambi.getTitle());
      localvx.UC(parambi.IA());
      localvx.kX(true);
      localwl.a(localwr);
      localwl.rBI.add(localvx);
      paramch.bJF.desc = parambi.getTitle();
      paramch.bJF.bJH = localwl;
      paramch.bJF.type = 5;
      return true;
      localObject = com.tencent.mm.pluginsdk.model.q.v(parambi.Iz(), parambi.type, "@S");
      break;
      label287:
      localvx.kY(true);
      localvx.UK(parambi.Iz());
      localObject = new xa();
      ((xa)localObject).VM(parambi.Iz());
      localwl.b((xa)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/readerapp/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */