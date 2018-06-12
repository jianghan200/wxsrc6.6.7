package com.tencent.mm.plugin.talkroom.model;

import android.content.Context;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;

public final class h
{
  private static final int ovJ = a.ovJ;
  
  public static String aJ(Context paramContext, String paramString)
  {
    if (bi.oW(paramString)) {}
    ab localab;
    do
    {
      return null;
      au.HU();
      localab = c.FR().Yg(paramString);
    } while (localab == null);
    if (s.fq(paramString))
    {
      if (bi.oW(localab.field_nickname)) {
        return paramContext.getString(R.l.talk_room_tilte);
      }
      return localab.BK();
    }
    return r.gT(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/talkroom/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */