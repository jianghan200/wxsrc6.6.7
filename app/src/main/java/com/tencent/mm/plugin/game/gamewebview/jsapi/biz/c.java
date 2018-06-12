package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.util.Base64;
import com.tencent.mm.a.e;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.File;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 274;
  public static final int DO_IN_ENV = 2;
  public static final String NAME = "addToEmoticon";
  
  static void a(Context paramContext, String paramString1, String paramString2, GameJsApiMMTask.a parama)
  {
    au.HU();
    String str = EmojiLogic.L(com.tencent.mm.model.c.Gg(), "", paramString1);
    EmojiInfo localEmojiInfo2 = i.aEA().igx.Zy(paramString1);
    EmojiInfo localEmojiInfo1 = localEmojiInfo2;
    if (localEmojiInfo2 == null)
    {
      localEmojiInfo1 = localEmojiInfo2;
      if (e.cn(str)) {
        if (!o.Wf(str)) {
          break label183;
        }
      }
    }
    label183:
    for (int i = EmojiInfo.tcJ;; i = EmojiInfo.tcI)
    {
      localEmojiInfo1 = new EmojiInfo();
      localEmojiInfo1.field_md5 = paramString1;
      localEmojiInfo1.field_catalog = EmojiInfo.tcB;
      localEmojiInfo1.field_type = i;
      localEmojiInfo1.field_size = e.cm(str);
      localEmojiInfo1.field_temp = 1;
      localEmojiInfo1.field_thumbUrl = paramString2;
      i.aEA().igx.n(localEmojiInfo1);
      if (localEmojiInfo1 == null) {
        break label204;
      }
      boolean bool = i.aEw().a(paramContext, localEmojiInfo1, 18, q.GF());
      x.i("MicroMsg.GameJsApiAddToEmotion", "doAddAction %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        break;
      }
      parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("addToEmoticon:ok", null));
      return;
    }
    parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("addToEmoticon:fail", null));
    return;
    label204:
    parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("addToEmoticon:fail", null));
  }
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    x.i("MicroMsg.GameJsApiAddToEmotion", "invoke");
    paramString = com.tencent.mm.plugin.game.gamewebview.a.d.ti(paramString);
    if (paramString == null)
    {
      x.e("MicroMsg.GameJsApiAddToEmotion", "bundle is null");
      parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("addToEmoticon:fail_null_data", null));
      return;
    }
    Object localObject1 = paramString.optString("base64DataString");
    String str = paramString.optString("thumbUrl");
    paramString = paramString.optString("url");
    Object localObject2;
    if (!bi.oW((String)localObject1))
    {
      x.i("MicroMsg.GameJsApiAddToEmotion", "doAddToEmoticon use base64DataString");
      int i = ((String)localObject1).indexOf(";base64,");
      paramString = "";
      if (i != -1) {
        paramString = ((String)localObject1).substring(i + 8, ((String)localObject1).length());
      }
      try
      {
        paramString = Base64.decode(paramString, 0);
        if (bi.bC(paramString))
        {
          parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("addToEmoticon:fail", null));
          return;
        }
      }
      catch (Exception paramContext)
      {
        x.e("MicroMsg.GameJsApiAddToEmotion", "doAddToEmoticon error:" + paramContext.getMessage());
        parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("addToEmoticon:fail", null));
        return;
      }
      localObject1 = com.tencent.mm.a.g.u(paramString);
      au.HU();
      localObject2 = EmojiLogic.L(com.tencent.mm.model.c.Gg(), "", (String)localObject1);
      if ((!e.cn((String)localObject2)) || (!com.tencent.mm.a.g.cu((String)localObject2).equalsIgnoreCase((String)localObject1))) {
        e.b((String)localObject2, paramString, paramString.length);
      }
      a(paramContext, (String)localObject1, str, parama);
      return;
    }
    if (!bi.oW(paramString))
    {
      x.i("MicroMsg.GameJsApiAddToEmotion", "doAddToEmoticon use url:%s", new Object[] { paramString });
      localObject1 = new File(paramContext.getCacheDir(), com.tencent.mm.a.g.u(paramString.getBytes()));
      if (((File)localObject1).exists())
      {
        paramString = com.tencent.mm.a.g.m((File)localObject1);
        au.HU();
        localObject2 = EmojiLogic.L(com.tencent.mm.model.c.Gg(), "", paramString);
        if (!FileOp.cn((String)localObject2)) {
          FileOp.y(((File)localObject1).getAbsolutePath(), (String)localObject2);
        }
        a(paramContext, paramString, str, parama);
        return;
      }
      localObject2 = new c.a();
      ((c.a)localObject2).dXy = true;
      ((c.a)localObject2).dXA = ((File)localObject1).getAbsolutePath();
      ((c.a)localObject2).dYc = new Object[] { ((File)localObject1).getAbsolutePath() };
      localObject1 = ((c.a)localObject2).Pt();
      i.aDZ().a(paramString, null, (com.tencent.mm.ak.a.a.c)localObject1, new c.1(this, paramString, paramContext, str, parama));
      return;
    }
    x.e("MicroMsg.GameJsApiAddToEmotion", "doAddToEmoticon base64DataString is null and url is null");
    parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("addToEmoticon:fail_base64DataString_and_url_is_null", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */