package com.tencent.mm.plugin.ext.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.api.h;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.hb;
import com.tencent.mm.g.a.hb.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.messenger.a.f;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.biy;
import com.tencent.mm.protocal.c.bja;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import java.util.HashMap;
import java.util.Map;

public final class c
{
  private static Map<String, a> iJu = null;
  final e diJ = new c.1(this);
  private String iJs = "";
  private boolean iJt = false;
  private Context mContext = null;
  
  public c(Context paramContext, String paramString)
  {
    this.mContext = paramContext;
    this.iJs = paramString;
    this.iJt = true;
  }
  
  private void AH(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("Chat_User", paramString);
    localIntent.putExtra("finish_direct", false);
    d.e(this.mContext, ".ui.chatting.ChattingUI", localIntent);
  }
  
  private int a(String paramString, bja parambja, biy parambiy)
  {
    if (this.mContext == null)
    {
      x.w("MicroMsg.RedirectToChattingByPhoneHelper", "hy: error param. start redirect param error: context is null");
      return -1;
    }
    if (!bi.oW(paramString))
    {
      au.HU();
      if (com.tencent.mm.model.c.FR().Yc(paramString))
      {
        x.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: is friend. direct to chatting");
        AH(paramString);
        return 0;
      }
    }
    if (parambja != null)
    {
      x.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: direct via searchResp");
      a(parambja);
      return 1;
    }
    if (parambiy != null)
    {
      x.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: direct via SearchContactItem");
      a(parambiy);
      return 1;
    }
    x.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: no matching for starting redirect");
    return -1;
  }
  
  private void a(biy parambiy)
  {
    if (parambiy == null)
    {
      x.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start to profile failed: item or context is null");
      return;
    }
    Object localObject = ab.a(parambiy.rvi);
    if (!bi.oW((String)localObject))
    {
      a(this.iJs, new a(ab.a(parambiy.rvi), null, parambiy));
      au.HU();
      if (com.tencent.mm.model.c.FR().Yc((String)localObject))
      {
        x.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: search item is friend. start to chatting");
        AH((String)localObject);
        return;
      }
      localObject = new Intent();
      ((h)g.l(h.class)).a((Intent)localObject, parambiy, 15);
      ((Intent)localObject).putExtra("add_more_friend_search_scene", 2);
      com.tencent.mm.plugin.ext.a.ezn.d((Intent)localObject, this.mContext);
      return;
    }
    x.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start failed: no user name");
  }
  
  private void a(bja parambja)
  {
    if (parambja == null)
    {
      x.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start to profile failed: resp or context is null");
      return;
    }
    Object localObject = ab.a(parambja.rvi);
    if (!bi.oW((String)localObject))
    {
      a(this.iJs, new a(ab.a(parambja.rvi), parambja, null));
      au.HU();
      if (com.tencent.mm.model.c.FR().Yc((String)localObject))
      {
        x.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: search response is friend. start to chatting");
        AH((String)localObject);
        return;
      }
      localObject = new Intent();
      com.tencent.mm.pluginsdk.ui.tools.c.a((Intent)localObject, parambja, 15);
      ((Intent)localObject).putExtra("add_more_friend_search_scene", 2);
      com.tencent.mm.plugin.ext.a.ezn.d((Intent)localObject, this.mContext);
      return;
    }
    x.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start failed: no user name");
  }
  
  private static void a(String paramString, a parama)
  {
    if (bi.oW(paramString))
    {
      x.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: username is null when put to cache");
      return;
    }
    if (iJu == null) {
      iJu = new HashMap();
    }
    iJu.put(paramString, parama);
  }
  
  public final int aIS()
  {
    if (this.mContext == null)
    {
      x.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: context is null");
      return -1;
    }
    if (bi.oW(this.iJs))
    {
      x.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: phone is null");
      return -1;
    }
    String str = ap.Ww(this.iJs);
    if (bi.oW(str))
    {
      x.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: pure num is null");
      return -1;
    }
    Object localObject = this.iJs;
    if (bi.oW((String)localObject)) {
      x.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: username is null when get from cache");
    }
    for (localObject = null; localObject != null; localObject = (a)iJu.get(localObject))
    {
      x.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: got from cache");
      return a(((a)localObject).userName, ((a)localObject).iJw, ((a)localObject).iJx);
      if (iJu == null) {
        iJu = new HashMap();
      }
    }
    localObject = new hb();
    ((hb)localObject).bQl.bQn = str;
    com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
    localObject = ((hb)localObject).bQm.userName;
    if (!bi.oW((String)localObject))
    {
      x.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: has found username: %s", new Object[] { localObject });
      return a((String)localObject, null, null);
    }
    x.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: not found from local storage. Try to find from search");
    au.DF().a(106, this.diJ);
    localObject = new f(str, 3);
    au.DF().a((l)localObject, 0);
    localObject = new Intent();
    ((Intent)localObject).setClassName(this.mContext, "com.tencent.mm.plugin.ext.ui.RedirectToChattingByPhoneStubUI");
    ((Intent)localObject).setFlags(268435456);
    this.mContext.startActivity((Intent)localObject);
    return 2;
  }
  
  final class a
  {
    bja iJw = null;
    biy iJx = null;
    String userName = "";
    
    public a(String paramString, bja parambja, biy parambiy)
    {
      this.userName = paramString;
      this.iJw = parambja;
      this.iJx = parambiy;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/ext/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */