package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.tencent.mm.R.a;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.model.au;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.io.File;
import org.json.JSONObject;

public final class ax
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 275;
  public static final int DO_IN_ENV = 2;
  public static final String NAME = "shareEmoticon";
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    x.i("MicroMsg.GameJsApiShareEmotion", "invoke");
    paramString = com.tencent.mm.plugin.game.gamewebview.a.d.ti(paramString);
    if (paramString == null)
    {
      x.e("MicroMsg.GameJsApiShareEmotion", "data is null");
      parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("shareEmoticon:fail_null_data", null));
      return;
    }
    Object localObject1 = paramString.optString("base64DataString");
    paramString = paramString.optString("url");
    if (!bi.oW((String)localObject1))
    {
      x.i("MicroMsg.GameJsApiShareEmotion", "use base64DataString");
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
          parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("shareEmoticon:fail", null));
          return;
        }
      }
      catch (Exception paramContext)
      {
        x.e("MicroMsg.GameJsApiShareEmotion", "doShareEmoticon error:" + paramContext.getMessage());
        parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("shareEmoticon:fail_base64_decode_fail", null));
        return;
      }
      localObject1 = g.u(paramString);
      au.HU();
      localObject2 = EmojiLogic.L(com.tencent.mm.model.c.Gg(), "", (String)localObject1);
      if ((!e.cn((String)localObject2)) || (!g.cu((String)localObject2).equalsIgnoreCase((String)localObject1))) {
        e.b((String)localObject2, paramString, paramString.length);
      }
      b(paramContext, (String)localObject1, parama);
      return;
    }
    x.i("MicroMsg.GameJsApiShareEmotion", "doShareEmoticon use url:%s", new Object[] { paramString });
    localObject1 = new File(paramContext.getCacheDir(), g.u(paramString.getBytes()));
    if (((File)localObject1).exists())
    {
      paramString = g.m((File)localObject1);
      au.HU();
      localObject2 = EmojiLogic.L(com.tencent.mm.model.c.Gg(), "", paramString);
      if (!FileOp.cn((String)localObject2)) {
        FileOp.y(((File)localObject1).getAbsolutePath(), (String)localObject2);
      }
      b(paramContext, paramString, parama);
      return;
    }
    Object localObject2 = new c.a();
    ((c.a)localObject2).dXy = true;
    ((c.a)localObject2).dXA = ((File)localObject1).getAbsolutePath();
    ((c.a)localObject2).dYc = new Object[] { ((File)localObject1).getAbsolutePath() };
    localObject1 = ((c.a)localObject2).Pt();
    i.aDZ().a(paramString, null, (com.tencent.mm.ak.a.a.c)localObject1, new ax.1(this, paramString, paramContext, parama));
  }
  
  final void b(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("scene_from", 4);
    localIntent.putExtra("Select_Conv_Type", 3);
    localIntent.putExtra("select_is_ret", true);
    localIntent.putExtra("mutil_select_is_ret", true);
    localIntent.putExtra("Retr_Msg_Type", 5);
    localIntent.putExtra("Retr_Msg_thumb_path", paramString);
    localIntent.putExtra("MMActivity.OverrideEnterAnimation", R.a.fast_faded_in);
    if ((paramContext instanceof MMActivity))
    {
      ((MMActivity)paramContext).geJ = new ax.2(this, parama);
      com.tencent.mm.bg.d.b(paramContext, ".ui.transmit.SelectConversationUI", localIntent, hashCode() & 0xFFFF);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */