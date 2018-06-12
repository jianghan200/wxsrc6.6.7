package com.tencent.mm.plugin.search.b.a.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.ac.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.ui.FTSConvMessageUI;
import com.tencent.mm.plugin.fts.ui.FTSConvTalkerMessageUI;
import com.tencent.mm.plugin.fts.ui.a.p;
import com.tencent.mm.sdk.platformtools.bi;

public final class b
  implements com.tencent.mm.plugin.fts.a.d.a.b
{
  public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a paramVarArgs)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    com.tencent.mm.plugin.fts.ui.a.m localm = (com.tencent.mm.plugin.fts.ui.a.m)paramVarArgs;
    if (localm.jyF < 2)
    {
      if (f.kM(localm.username))
      {
        paramVarArgs = new Intent().putExtra("Contact_User", localm.username);
        com.tencent.mm.plugin.search.a.ezn.d(paramVarArgs, paramContext);
        return true;
      }
      if (f.eZ(localm.username))
      {
        paramVarArgs = new Intent();
        paramVarArgs.putExtra("Contact_User", localm.username);
        paramVarArgs.addFlags(67108864);
        paramVarArgs.putExtra("biz_chat_from_scene", 5);
        com.tencent.mm.bg.d.e(paramContext, ".ui.bizchat.BizChatConversationUI", paramVarArgs);
        return true;
      }
      if (f.kN(localm.username))
      {
        paramVarArgs = f.kH(localm.username);
        if (paramVarArgs == null) {}
        for (paramVarArgs = (com.tencent.mm.plugin.fts.a.d.a.a)localObject1;; paramVarArgs = paramVarArgs.Mc())
        {
          localObject1 = paramVarArgs;
          if (paramVarArgs == null) {
            localObject1 = "";
          }
          paramVarArgs = new Intent();
          paramVarArgs.putExtra("rawUrl", (String)localObject1);
          paramVarArgs.putExtra("useJs", true);
          paramVarArgs.putExtra("srcUsername", localm.username);
          paramVarArgs.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
          paramVarArgs.addFlags(67108864);
          com.tencent.mm.bg.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramVarArgs);
          return true;
        }
      }
      paramVarArgs = bi.F(localm.jrx.jrX);
      paramVarArgs = new Intent().putExtra("Chat_User", localm.username).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", localm.fyJ.jsA).putExtra("highlight_keyword_list", paramVarArgs);
      com.tencent.mm.plugin.search.a.ezn.e(paramVarArgs, paramContext);
      return true;
    }
    if (f.eZ(localm.username))
    {
      paramVarArgs = new Intent();
      paramVarArgs.putExtra("Contact_User", localm.username);
      paramVarArgs.addFlags(67108864);
      paramVarArgs.putExtra("biz_chat_from_scene", 5);
      com.tencent.mm.bg.d.e(paramContext, ".ui.bizchat.BizChatConversationUI", paramVarArgs);
      return true;
    }
    if (f.kN(localm.username))
    {
      paramVarArgs = f.kH(localm.username);
      if (paramVarArgs == null) {}
      for (paramVarArgs = (com.tencent.mm.plugin.fts.a.d.a.a)localObject2;; paramVarArgs = paramVarArgs.Mc())
      {
        localObject1 = paramVarArgs;
        if (paramVarArgs == null) {
          localObject1 = "";
        }
        paramVarArgs = new Intent();
        paramVarArgs.putExtra("rawUrl", (String)localObject1);
        paramVarArgs.putExtra("useJs", true);
        paramVarArgs.putExtra("srcUsername", localm.username);
        paramVarArgs.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
        paramVarArgs.addFlags(67108864);
        com.tencent.mm.bg.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramVarArgs);
        return true;
      }
    }
    if ((localm instanceof p))
    {
      paramVarArgs = (p)localm;
      paramContext.startActivity(new Intent(paramContext, FTSConvTalkerMessageUI.class).putExtra("Search_Scene", paramVarArgs.jsZ).putExtra("key_talker_query", paramVarArgs.jxW.jrx.jrV).putExtra("key_talker", paramVarArgs.jxW.jrv).putExtra("key_conv", paramVarArgs.username).putExtra("key_query", paramVarArgs.jrx.jrV).putExtra("detail_type", paramVarArgs.showType));
      return true;
    }
    paramContext.startActivity(new Intent(paramContext, FTSConvMessageUI.class).putExtra("Search_Scene", localm.jsZ).putExtra("key_conv", localm.username).putExtra("key_query", localm.jrx.jrV).putExtra("key_count", localm.jyF));
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/search/b/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */