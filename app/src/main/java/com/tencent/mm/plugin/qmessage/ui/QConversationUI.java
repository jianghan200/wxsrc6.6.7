package com.tencent.mm.plugin.qmessage.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.aem;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.s;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public class QConversationUI
  extends MMActivity
  implements e
{
  private TextView emptyTipTv;
  private n.d hlb = new QConversationUI.5(this);
  private ab ipd;
  private boolean isDeleteCancel = false;
  private boolean lbe = false;
  private ListView mbN;
  private c mbO;
  private com.tencent.mm.plugin.qmessage.a.c mbP;
  private boolean mbQ = false;
  private String mbR;
  private String mbS;
  private boolean mbT = false;
  private String mbU;
  
  private static String aF(Context paramContext, String paramString)
  {
    paramContext = paramContext.getPackageManager();
    try
    {
      paramString = paramContext.getPackageInfo(paramString, 0);
      Intent localIntent = new Intent("android.intent.action.MAIN", null);
      localIntent.addCategory("android.intent.category.LAUNCHER");
      localIntent.setPackage(paramString.packageName);
      paramContext = (ResolveInfo)paramContext.queryIntentActivities(localIntent, 0).iterator().next();
      if (paramContext != null)
      {
        paramContext = paramContext.activityInfo.name;
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.QConversationUI", paramContext, "", new Object[0]);
    }
    return null;
  }
  
  private static void bof()
  {
    au.HU();
    Object localObject = com.tencent.mm.model.c.FT().sx(2);
    if ((localObject != null) && (((cm)localObject).field_msgId > 0L))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.QConversationUI", "resetUnread: lastReadTime = " + ((cm)localObject).field_createTime);
      au.HU();
      com.tencent.mm.model.c.DT().set(12295, Long.valueOf(((cm)localObject).field_createTime));
    }
    au.HU();
    localObject = com.tencent.mm.model.c.FW().Yq("qmessage");
    if ((localObject == null) || (bi.oV(((am)localObject).field_username).length() <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.QConversationUI", "resetUnread: can not find QMessage");
    }
    do
    {
      return;
      ((ai)localObject).eV(0);
      au.HU();
    } while (com.tencent.mm.model.c.FW().a((ai)localObject, ((am)localObject).field_username) != -1);
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.QConversationUI", "reset qmessage unread failed");
  }
  
  private void bog()
  {
    this.mController.removeAllOptionMenu();
    if (!bi.oW(this.mbR))
    {
      this.mbQ = true;
      addIconOptionMenu(0, R.l.actionbar_open_qq, R.k.qq, new QConversationUI.13(this));
    }
    addIconOptionMenu(2, R.l.actionbar_setting, R.k.actionbar_setting_icon, new QConversationUI.2(this));
  }
  
  private void goBack()
  {
    if (this.lbe)
    {
      finish();
      return;
    }
    Intent localIntent = new Intent();
    localIntent.addFlags(67108864);
    com.tencent.mm.plugin.qmessage.a.ezn.q(localIntent, this);
    overridePendingTransition(R.a.anim_not_change, R.a.pop_out);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    Object localObject2 = null;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.QConversationUI", "on scene end: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paraml.getType())
    {
    }
    do
    {
      return;
    } while ((paramInt1 != 0) || (paramInt2 != 0));
    Object localObject3 = (com.tencent.mm.plugin.qmessage.a.c)paraml;
    if (((com.tencent.mm.plugin.qmessage.a.c)localObject3).ejL != null)
    {
      paramString = (aem)((com.tencent.mm.plugin.qmessage.a.c)localObject3).ejL.dIE.dIL;
      if (paramString == null) {}
    }
    for (paramString = paramString.rIA;; paramString = null)
    {
      if (((com.tencent.mm.plugin.qmessage.a.c)localObject3).ejL != null)
      {
        paraml = (aem)((com.tencent.mm.plugin.qmessage.a.c)localObject3).ejL.dIE.dIL;
        if (paraml == null) {}
      }
      for (paraml = paraml.rcY;; paraml = null)
      {
        Object localObject1 = localObject2;
        if (((com.tencent.mm.plugin.qmessage.a.c)localObject3).ejL != null)
        {
          localObject3 = (aem)((com.tencent.mm.plugin.qmessage.a.c)localObject3).ejL.dIE.dIL;
          localObject1 = localObject2;
          if (localObject3 != null) {
            localObject1 = ((aem)localObject3).rIB;
          }
        }
        if (!bi.oW((String)localObject1))
        {
          this.mbR = ((String)localObject1);
          au.HU();
          com.tencent.mm.model.c.DT().set(77, localObject1);
        }
        this.mbS = paraml;
        au.HU();
        com.tencent.mm.model.c.DT().set(78, paraml);
        if (!this.mbQ) {
          bog();
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.QConversationUI", "diaplayName: %s, url: %s, qqScheme: %s", new Object[] { paramString, paraml, localObject1 });
        return;
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.tmessage;
  }
  
  protected final void initView()
  {
    this.lbe = getIntent().getBooleanExtra("finish_direct", false);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.QConversationUI", "isFromSearch  " + this.lbe);
    au.HU();
    this.ipd = com.tencent.mm.model.c.FR().Yg("qmessage");
    if ((this.ipd != null) && ((int)this.ipd.dhP > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("can not find qmessage", bool);
      this.mbN = ((ListView)findViewById(R.h.tmessage_lv));
      this.emptyTipTv = ((TextView)findViewById(R.h.empty_msg_tip_tv));
      this.emptyTipTv.setText(R.l.empty_qmsg_tip);
      this.mbO = new c(this, new QConversationUI.1(this));
      this.mbO.setGetViewPositionCallback(new QConversationUI.6(this));
      this.mbO.setPerformItemClickListener(new QConversationUI.7(this));
      this.mbO.a(new QConversationUI.8(this));
      this.mbN.setAdapter(this.mbO);
      this.mbN.setOnItemClickListener(new QConversationUI.9(this));
      com.tencent.mm.ui.widget.b.a locala = new com.tencent.mm.ui.widget.b.a(this);
      this.mbN.setOnItemLongClickListener(new QConversationUI.10(this, locala));
      com.tencent.mm.plugin.qmessage.a.mbs.eu(1010);
      setBackBtn(new QConversationUI.11(this));
      new QConversationUI.12(this);
      au.HU();
      this.mbR = ((String)com.tencent.mm.model.c.DT().get(77, ""));
      au.HU();
      this.mbS = ((String)com.tencent.mm.model.c.DT().get(78, ""));
      if (this.mbP == null)
      {
        this.mbP = new com.tencent.mm.plugin.qmessage.a.c();
        au.DF().a(this.mbP.getType(), this);
      }
      au.DF().a(this.mbP, 0);
      bog();
      com.tencent.mm.plugin.qmessage.a.mbs.eu(1010);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramView = (ai)this.mbO.getItem(paramView.position);
    au.HU();
    paramContextMenu.setHeaderTitle(com.tencent.mm.model.c.FR().Yg(paramView.field_username).BL());
    paramContextMenu.add(0, 0, 0, R.l.main_delete);
    this.mbU = paramView.field_username;
  }
  
  public void onDestroy()
  {
    this.mbO.aYc();
    if (this.mbP != null)
    {
      au.DF().c(this.mbP);
      au.DF().b(this.mbP.getType(), this);
      this.mbP = null;
    }
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.QConversationUI", "on pause");
    au.HU();
    com.tencent.mm.model.c.FW().b(this.mbO);
    bof();
    this.mbO.onPause();
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    bof();
    au.HU();
    com.tencent.mm.model.c.FW().a(this.mbO);
    this.mbO.a(null, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/qmessage/ui/QConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */