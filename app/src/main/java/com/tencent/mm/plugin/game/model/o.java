package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URI;
import java.net.URISyntaxException;

public final class o
{
  public static String a(String paramString, s params)
  {
    if (params != null)
    {
      params.aTW();
      if (bi.oW(params.jMI.url)) {}
    }
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.GameFloatUtil", "hasFloatLayer = " + bool);
      params = paramString;
      Uri localUri;
      if (bool)
      {
        localUri = Uri.parse(paramString);
        params = localUri.getQuery();
        if (params == null) {
          break label129;
        }
        params = params + "&h5FloatLayer=1";
      }
      try
      {
        for (;;)
        {
          params = new URI(localUri.getScheme(), localUri.getAuthority(), localUri.getPath(), params, localUri.getFragment()).toString();
          x.i("MicroMsg.GameFloatUtil", "abtest, url = %s", new Object[] { params });
          return params;
          label129:
          params = "h5FloatLayer=1";
        }
      }
      catch (URISyntaxException params)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.GameFloatUtil", params, "", new Object[0]);
          params = paramString;
        }
      }
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, s params, int paramInt)
  {
    if (bi.oW(paramString1)) {
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("geta8key_scene", 32);
    localIntent.putExtra("KPublisherId", paramString2);
    localIntent.putExtra("game_check_float", paramBoolean);
    if ((paramBoolean) && (params != null))
    {
      params.aTW();
      if (params.jMI.jNf) {
        localIntent.putExtra("game_transparent_float_url", params.jMI.url);
      }
      localIntent.putExtra("game_sourceScene", paramInt);
    }
    com.tencent.mm.plugin.game.e.c.x(localIntent, paramContext);
  }
  
  public static void a(s params, int paramInt1, int paramInt2)
  {
    s locals = params;
    if (params == null)
    {
      ((b)g.l(b.class)).aSi();
      params = v.aTZ();
      locals = params;
      if (params == null) {
        return;
      }
    }
    locals.aTW();
    x.i("MicroMsg.GameFloatUtil", "float layer report");
    if (!bi.oW(locals.jMI.url))
    {
      int i = locals.field_msgType;
      if (locals.field_msgType == 100) {
        i = locals.jNa;
      }
      an.a(ad.getContext(), 10, 1006, 1, 1, 0, locals.field_appId, paramInt1, i, locals.field_gameMsgId, locals.jNb, null);
      if (paramInt2 != 1) {
        break label179;
      }
      h.mEJ.a(858L, 16L, 1L, false);
    }
    for (;;)
    {
      locals.field_isRead = true;
      ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().c(locals, new String[0]);
      ((b)g.l(b.class)).aSi();
      v.aUa();
      return;
      label179:
      if (paramInt2 == 2) {
        h.mEJ.a(858L, 17L, 1L, false);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/model/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */