package com.tencent.mm.plugin.game.gamewebview.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.plugin.game.gamewebview.ipc.AddShortcutTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameKeepPageTopTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.model.FavUrlTask;
import com.tencent.mm.plugin.webview.modeltools.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.snackbar.a.b;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

public class i
{
  public static a.b jKu = new i.9();
  protected GameWebViewUI jIJ;
  protected b jKc;
  private a jKq;
  public HashSet<Integer> jKr = new HashSet();
  public Map<String, Integer> jKs = new HashMap();
  public HashSet<Integer> jKt = new HashSet();
  private boolean mEnable = false;
  
  public i(b paramb)
  {
    this.jKc = paramb;
    this.jIJ = ((GameWebViewUI)paramb.getContext());
    this.jKs.clear();
    this.jKs.put("menuItem:share:brand", Integer.valueOf(0));
    this.jKs.put("menuItem:share:appMessage", Integer.valueOf(1));
    this.jKs.put("menuItem:share:dataMessage", Integer.valueOf(23));
    this.jKs.put("menuItem:share:timeline", Integer.valueOf(2));
    this.jKs.put("menuItem:favorite", Integer.valueOf(3));
    this.jKs.put("menuItem:profile", Integer.valueOf(5));
    this.jKs.put("menuItem:addContact", Integer.valueOf(5));
    this.jKs.put("menuItem:copyUrl", Integer.valueOf(6));
    this.jKs.put("menuItem:openWithSafari", Integer.valueOf(7));
    this.jKs.put("menuItem:share:email", Integer.valueOf(8));
    this.jKs.put("menuItem:delete", Integer.valueOf(9));
    this.jKs.put("menuItem:exposeArticle", Integer.valueOf(10));
    this.jKs.put("menuItem:setFont", Integer.valueOf(11));
    this.jKs.put("menuItem:editTag", Integer.valueOf(12));
    this.jKs.put("menuItem:readMode", Integer.valueOf(14));
    this.jKs.put("menuItem:originPage", Integer.valueOf(14));
    this.jKs.put("menuItem:share:qq", Integer.valueOf(20));
    this.jKs.put("menuItem:share:weiboApp", Integer.valueOf(21));
    this.jKs.put("menuItem:share:QZone", Integer.valueOf(22));
    this.jKs.put("menuItem:share:enterprise", Integer.valueOf(24));
    this.jKs.put("menuItem:refresh", Integer.valueOf(28));
    this.jKs.put("menuItem:share:wework", Integer.valueOf(25));
    this.jKs.put("menuItem:share:weread", Integer.valueOf(26));
    this.jKs.put("menuItem:keepTop", Integer.valueOf(30));
    this.jKs.put("menuItem:cancelKeepTop", Integer.valueOf(32));
    this.jKs.put("menuItem:addShortcut", Integer.valueOf(29));
    this.jKs.put("menuItem:search", Integer.valueOf(31));
    this.jKt.clear();
    this.jKt.add(Integer.valueOf(28));
    this.jKt.add(Integer.valueOf(6));
    this.jKt.add(Integer.valueOf(27));
    this.jKt.add(Integer.valueOf(30));
    this.jKt.add(Integer.valueOf(32));
  }
  
  protected final boolean Us()
  {
    if ((this.jKc.aSG()) || (this.jKc.jIF)) {}
    GameKeepPageTopTask localGameKeepPageTopTask;
    do
    {
      return true;
      localGameKeepPageTopTask = new GameKeepPageTopTask();
      localGameKeepPageTopTask.type = 1;
      GameWebViewMainProcessService.b(localGameKeepPageTopTask);
    } while (this.jKc.getPageView().getRawUrl().equals(bi.oV(localGameKeepPageTopTask.url)));
    return false;
  }
  
  public void aTe()
  {
    Object localObject = Boolean.valueOf(false);
    com.tencent.mm.ui.widget.a.d locald;
    if (((Boolean)localObject).booleanValue())
    {
      locald = new com.tencent.mm.ui.widget.a.d(this.jIJ, 1, false);
      locald.uAx = new i.1(this);
      locald.uAy = new i.2(this);
      locald.ofq = new i.3(this);
      locald.ofp = new i.4(this, (Boolean)localObject);
      localObject = this.jKc.getPageView().getCurrentURL();
      if (!bi.oW((String)localObject))
      {
        localObject = Uri.parse((String)localObject).getHost();
        if (!bi.oW((String)localObject)) {
          locald.i(this.jIJ.getString(R.l.webview_logo_url, new Object[] { localObject }), 1);
        }
      }
      if (!this.jKc.isFullScreen()) {
        break label211;
      }
      locald.qgK = true;
    }
    for (locald.qgL = true;; locald.qgL = false)
    {
      if (!this.jKc.getPageView().jJb.isShown()) {
        break label224;
      }
      this.jKc.getPageView().fq(false);
      ah.i(new i.5(this, locald), 100L);
      return;
      locald = new com.tencent.mm.ui.widget.a.d(this.jIJ, 0, true);
      break;
      label211:
      locald.qgK = false;
    }
    label224:
    this.jIJ.YC();
    ah.i(new i.6(this, locald), 100L);
  }
  
  protected final void aTh()
  {
    if (!this.jKc.getPageView().aST()) {
      this.jKc.aSH();
    }
  }
  
  protected final void aTi()
  {
    com.tencent.mm.plugin.game.gamewebview.model.h.c(this.jKc.getPageView());
  }
  
  protected final void aTj()
  {
    d locald = this.jKc.getPageView();
    if (locald.bs("shareTimeline", 88))
    {
      locald.Dr("shareTimeline");
      locald.cW("menu:share:timeline", "");
      return;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      String str = locald.getShareUrl();
      localJSONObject.put("link", str);
      localJSONObject.put("desc", str);
      localJSONObject.put("title", locald.getTitle());
      locald.cX("shareTimeline", localJSONObject.toString());
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.GameWebViewShareController", localException, "", new Object[0]);
      }
    }
  }
  
  protected final void aTk()
  {
    String str = this.jKc.getPageView().getShareUrl();
    ClipboardManager localClipboardManager = (ClipboardManager)this.jIJ.getSystemService("clipboard");
    if (localClipboardManager != null) {}
    try
    {
      localClipboardManager.setText(str);
      Toast.makeText(this.jIJ, this.jIJ.getString(R.l.wv_alert_copy_link_toast), 0).show();
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.OptionMenuBtnHelp", localException, "clip.setText error", new Object[0]);
    }
    x.e("MicroMsg.OptionMenuBtnHelp", "clipboard manager is null");
    return;
  }
  
  protected final void aTl()
  {
    x.i("MicroMsg.OptionMenuBtnHelp", "doKeepPageTopLogic");
    Object localObject = getBundle().getString("custom_keep_top_url");
    String str1 = getBundle().getString("custom_keep_top_title");
    String str2 = getBundle().getString("shortcut_user_name");
    GameKeepPageTopTask localGameKeepPageTopTask = new GameKeepPageTopTask();
    localGameKeepPageTopTask.type = 2;
    if ((!bi.oW(str1)) && (!bi.oW((String)localObject)))
    {
      localGameKeepPageTopTask.url = ((String)localObject);
      localGameKeepPageTopTask.title = str1;
    }
    for (localGameKeepPageTopTask.username = str2;; localGameKeepPageTopTask.username = "")
    {
      GameWebViewMainProcessService.a(localGameKeepPageTopTask);
      localObject = this.jKc;
      ((b)localObject).jIF = true;
      ((b)localObject).setEnableGesture(((b)localObject).aSF());
      ((b)localObject).jIE.b((b)localObject);
      com.tencent.mm.ui.widget.snackbar.b.h(this.jIJ, this.jIJ.getString(R.l.readerapp_keep_page_top_done));
      return;
      localGameKeepPageTopTask.url = this.jKc.getPageView().getRawUrl();
      localGameKeepPageTopTask.title = this.jKc.getPageView().getTitle();
    }
  }
  
  protected final void aTm()
  {
    Object localObject = new GameKeepPageTopTask();
    ((GameKeepPageTopTask)localObject).type = 2;
    ((GameKeepPageTopTask)localObject).url = "";
    ((GameKeepPageTopTask)localObject).title = "";
    ((GameKeepPageTopTask)localObject).username = "";
    GameWebViewMainProcessService.a((GWMainProcessTask)localObject);
    localObject = this.jKc;
    ((b)localObject).jIF = false;
    ((b)localObject).setEnableGesture(((b)localObject).aSF());
    ((b)localObject).jIE.aSI();
    com.tencent.mm.ui.widget.snackbar.b.h(this.jIJ, this.jIJ.getString(R.l.readerapp_cancel_keep_page_top_done));
  }
  
  protected final void aTn()
  {
    String str = this.jKc.getPageView().getShareUrl();
    if (this.jKq == null) {
      this.jKq = new a();
    }
    a.d(this.jIJ, str);
  }
  
  protected final void aTo()
  {
    String str1 = getBundle().getString("shortcut_user_name");
    String str2 = this.jKc.getPageView().getCacheAppId();
    if ((bi.oW(str1)) || (bi.oW(str2)))
    {
      x.e("MicroMsg.OptionMenuBtnHelp", "addShortcut,appid or username is null");
      return;
    }
    AddShortcutTask localAddShortcutTask = new AddShortcutTask();
    localAddShortcutTask.username = str1;
    localAddShortcutTask.appId = str2;
    localAddShortcutTask.fFC = new i.7(this, localAddShortcutTask);
    localAddShortcutTask.ahA();
    GameWebViewMainProcessService.a(localAddShortcutTask);
  }
  
  protected final void aTp()
  {
    Object localObject1 = new Bundle();
    ((Bundle)localObject1).putLong("msg_id", getBundle().getLong("msg_id", Long.MIN_VALUE));
    ((Bundle)localObject1).putString("sns_local_id", getBundle().getString("sns_local_id"));
    ((Bundle)localObject1).putInt("news_svr_id", getBundle().getInt("news_svr_id", 0));
    ((Bundle)localObject1).putString("news_svr_tweetid", getBundle().getString("news_svr_tweetid"));
    ((Bundle)localObject1).putInt("message_index", getBundle().getInt("message_index", 0));
    String str = this.jKc.getPageView().getRawUrl();
    ((Bundle)localObject1).putString("rawUrl", str);
    Object localObject2 = this.jKc.getPageView().getCurrentURL();
    if ((!bi.oW(str)) && (str.endsWith("#rd")))
    {
      str = str.substring(0, str.length() - 3);
      if ((!bi.oW((String)localObject2)) && (!((String)localObject2).startsWith(str)))
      {
        ((Bundle)localObject1).putString("rawUrl", (String)localObject2);
        ((Bundle)localObject1).putLong("msg_id", Long.MIN_VALUE);
      }
    }
    for (;;)
    {
      if (getBundle() != null)
      {
        ((Bundle)localObject1).putString("preChatName", getBundle().getString("preChatName"));
        ((Bundle)localObject1).putInt("preMsgIndex", getBundle().getInt("preMsgIndex", 0));
        ((Bundle)localObject1).putString("prePublishId", getBundle().getString("prePublishId"));
        ((Bundle)localObject1).putString("preUsername", getBundle().getString("preUsername"));
      }
      localObject2 = new FavUrlTask();
      ((FavUrlTask)localObject2).actionType = 1;
      ((FavUrlTask)localObject2).jfZ = ((Bundle)localObject1);
      GameWebViewMainProcessService.b((GWMainProcessTask)localObject2);
      if (!((FavUrlTask)localObject2).jHV) {
        break;
      }
      localObject1 = this.jKc.getPageView();
      com.tencent.mm.plugin.game.gamewebview.jsapi.biz.GameJsApiSendAppMessage.cfQ = 1;
      com.tencent.mm.plugin.game.gamewebview.model.h.c((d)localObject1);
      x.i("MicroMsg.OptionMenuBtnHelp", "on favorite simple url");
      return;
      if ((!bi.oW((String)localObject2)) && (!((String)localObject2).startsWith(str)))
      {
        ((Bundle)localObject1).putString("rawUrl", (String)localObject2);
        ((Bundle)localObject1).putLong("msg_id", Long.MIN_VALUE);
        ((Bundle)localObject1).putString("sns_local_id", "");
      }
    }
    com.tencent.mm.plugin.fav.ui.c.a(((FavUrlTask)localObject2).ret, this.jIJ, jKu);
  }
  
  protected final void aTq()
  {
    com.tencent.mm.ui.base.h.a(this.jIJ, this.jIJ.getString(R.l.app_delete_tips), null, null, this.jIJ.getString(R.l.app_delete), new i.8(this));
  }
  
  protected final void aTr()
  {
    Object localObject3 = null;
    Object localObject1 = getBundle().getString("geta8key_username");
    String str = this.jKc.getPageView().getCurrentURL();
    Intent localIntent = new Intent(this.jIJ, GameWebViewUI.class);
    localIntent.putExtra("k_username", (String)localObject1);
    localIntent.putExtra("k_expose_url", str);
    localIntent.putExtra("showShare", false);
    if (!bi.oW(str)) {}
    Object localObject2;
    for (localObject1 = Uri.parse(str).getHost();; localObject2 = null)
    {
      if ((!bi.oW((String)localObject1)) && (((String)localObject1).startsWith("mp.weixin.qq.com"))) {}
      for (;;)
      {
        try
        {
          localObject1 = String.format("https://mp.weixin.qq.com/mp/infringement?url=%s#wechat_redirect", new Object[] { p.encode(str, "utf-8") });
          if (localObject1 != null) {
            localObject3 = localObject1;
          }
          localObject1 = localObject3;
          if (bi.oW((String)localObject3)) {
            localObject1 = String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(34) });
          }
          localIntent.putExtra("rawUrl", (String)localObject1);
          this.jIJ.startActivity(localIntent);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          x.e("MicroMsg.OptionMenuBtnHelp", localUnsupportedEncodingException.getMessage());
          localObject2 = null;
          continue;
        }
        localIntent.putExtra("k_expose_current_url", str);
      }
    }
  }
  
  protected final Bundle getBundle()
  {
    if (this.jKc != null) {
      return this.jKc.getBundle();
    }
    return new Bundle();
  }
  
  public final boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    return (this.jKq != null) && (a.b(this.jIJ, paramInt1, paramInt2, paramIntent));
  }
  
  protected final void refresh()
  {
    if (this.jKc.getPageView().getWebView() != null) {
      this.jKc.getPageView().getWebView().reload();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */