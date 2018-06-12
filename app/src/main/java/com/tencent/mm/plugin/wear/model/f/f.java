package com.tencent.mm.plugin.wear.model.f;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.mm.R.l;
import com.tencent.mm.bk.b;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.g;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.cdz;
import com.tencent.mm.protocal.c.cea;
import com.tencent.mm.sdk.platformtools.ad;
import java.io.IOException;
import java.util.LinkedList;

public final class f
  extends c
{
  private String nickname;
  private int type;
  private String username;
  
  public f(String paramString1, String paramString2, int paramInt)
  {
    this.username = paramString1;
    this.nickname = paramString2;
    this.type = paramInt;
  }
  
  public final String getName()
  {
    return "WearFriendCreateTask";
  }
  
  protected final void send()
  {
    Object localObject = a.bSl().pIO.PK(this.username);
    cea localcea = new cea();
    if (this.type == 1)
    {
      cdz localcdz = new cdz();
      localcdz.jTt = ((com.tencent.mm.plugin.wear.model.f)localObject).id;
      localcdz.hbL = this.username;
      localcdz.hcS = this.nickname;
      localcdz.jSA = ad.getContext().getString(R.l.notification_receive_new_friend);
      localObject = com.tencent.mm.aa.c.a(this.username, false, -1);
      if (localObject != null) {
        localcdz.szc = new b(h.N((Bitmap)localObject));
      }
      localcea.hbG.add(localcdz);
    }
    try
    {
      a.bSl();
      r.b(20006, localcea.toByteArray(), true);
      return;
    }
    catch (IOException localIOException) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */