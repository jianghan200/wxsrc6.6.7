package com.tencent.mm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.Toast;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.o;
import com.tencent.mm.ab.v;
import com.tencent.mm.ac.f;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.a.gw;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.modelsimple.h;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.nm;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.chatting.ChattingUI;
import java.util.ArrayList;
import java.util.LinkedList;

public class CheckCanSubscribeBizUI
  extends MMActivity
  implements com.tencent.mm.ab.e, j.a, m.b
{
  private String appId;
  private String bMy;
  private boolean dDR = false;
  private String extInfo;
  private int fromScene;
  private String juZ;
  private int scene;
  private int source;
  private int tha;
  private LinkedList<bhz> thb;
  private boolean thc = false;
  private boolean thd = false;
  private boolean the = false;
  private boolean thf = false;
  private String thg;
  private int thh = 0;
  private String toUserName;
  
  private void aHQ()
  {
    if (this.source == 1) {
      LauncherUI.gm(this);
    }
  }
  
  private boolean afz()
  {
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      x.e("MicroMsg.CheckCanSubscribeBizUI", "intent is null.");
      return false;
    }
    this.appId = localIntent.getStringExtra("appId");
    this.toUserName = localIntent.getStringExtra("toUserName");
    if (bi.oW(this.toUserName))
    {
      x.e("MicroMsg.CheckCanSubscribeBizUI", "toUserName is null.");
      return false;
    }
    this.extInfo = localIntent.getStringExtra("extInfo");
    this.source = localIntent.getIntExtra("source", -1);
    this.scene = localIntent.getIntExtra("scene", 0);
    this.thh = localIntent.getIntExtra("jump_profile_type", 0);
    switch (this.source)
    {
    default: 
      x.e("MicroMsg.CheckCanSubscribeBizUI", "source(%d) is invalidated.", new Object[] { Integer.valueOf(this.source) });
      return false;
    case 1: 
      if (bi.oW(this.appId))
      {
        x.e("MicroMsg.CheckCanSubscribeBizUI", "appId is null.");
        return false;
      }
      this.fromScene = 68;
      ArrayList localArrayList = localIntent.getStringArrayListExtra("androidPackNameList");
      if ((localArrayList == null) || (localArrayList.size() == 0))
      {
        x.e("MicroMsg.CheckCanSubscribeBizUI", "androidPackNameList is null or nil.");
        return false;
      }
      this.thb = new LinkedList();
      int i = 0;
      while (i < localArrayList.size())
      {
        String str = (String)localArrayList.get(i);
        if (!bi.oW(str))
        {
          x.i("MicroMsg.CheckCanSubscribeBizUI", "packName(%d) : %s", new Object[] { Integer.valueOf(i), str });
          this.thb.add(com.tencent.mm.platformtools.ab.oT(str));
        }
        i += 1;
      }
      if (this.thb.size() == 0)
      {
        x.e("MicroMsg.CheckCanSubscribeBizUI", "androidPackNameList is nil.");
        return false;
      }
      this.tha = this.thb.size();
    }
    for (;;)
    {
      this.bMy = localIntent.getStringExtra("fromURL");
      return true;
      this.fromScene = 69;
    }
  }
  
  private void coN()
  {
    for (;;)
    {
      try
      {
        x.i("MicroMsg.CheckCanSubscribeBizUI", "dealSuccess..,canJump = " + this.thc);
        if (this.scene == 1)
        {
          Intent localIntent1 = new Intent();
          localIntent1.putExtra("rawUrl", this.thg);
          com.tencent.mm.bg.d.b(this, "webview", ".ui.tools.WebViewUI", localIntent1);
          finish();
          return;
        }
        if ((this.scene != 0) || (this.thh != 1)) {
          break label154;
        }
        if (this.the)
        {
          x.i("MicroMsg.CheckCanSubscribeBizUI", "has jump ignore this scene");
          continue;
        }
        this.the = true;
      }
      finally {}
      au.DF().a(233, this);
      Object localObject2 = new h(this.extInfo, null, 4, (int)System.currentTimeMillis(), new byte[0]);
      au.DF().a((com.tencent.mm.ab.l)localObject2, 0);
      continue;
      label154:
      if ((coO()) && (this.thc))
      {
        if (!this.the)
        {
          x.i("MicroMsg.CheckCanSubscribeBizUI", "jump to ChattingUI");
          localObject2 = new Intent().putExtra("Chat_User", this.toUserName);
          ((Intent)localObject2).putExtra("finish_direct", true);
          if (bi.oW(this.toUserName)) {
            com.tencent.mm.ui.contact.e.a((Intent)localObject2, this.toUserName);
          }
          ((Intent)localObject2).setClass(this, ChattingUI.class);
          if (!this.thd)
          {
            setResult(-1);
            this.the = true;
            startActivity((Intent)localObject2);
            finish();
          }
        }
      }
      else if ((this.thc) && (!this.the))
      {
        x.i("MicroMsg.CheckCanSubscribeBizUI", "jump to ContactInfoUI");
        au.HU();
        localObject2 = c.FR().Yg(this.toUserName);
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("Contact_Scene", this.fromScene);
        localIntent2.putExtra("Verify_ticket", this.juZ);
        if (localObject2 != null)
        {
          localIntent2.putExtra("Contact_Alias", ((com.tencent.mm.storage.ab)localObject2).wM());
          localIntent2.putExtra("Contact_Nick", ((ai)localObject2).field_nickname);
          localIntent2.putExtra("Contact_Signature", ((ai)localObject2).signature);
          localIntent2.putExtra("Contact_RegionCode", ((ai)localObject2).csQ);
          localIntent2.putExtra("Contact_Sex", ((ai)localObject2).sex);
          localIntent2.putExtra("Contact_VUser_Info", ((ai)localObject2).csP);
          localIntent2.putExtra("Contact_VUser_Info_Flag", ((ai)localObject2).field_verifyFlag);
          localIntent2.putExtra("Contact_KWeibo_flag", ((ai)localObject2).field_weiboFlag);
          localIntent2.putExtra("Contact_KWeibo", ((ai)localObject2).csO);
          localIntent2.putExtra("Contact_KWeiboNick", ((ai)localObject2).field_weiboNickname);
        }
        com.tencent.mm.ui.contact.e.l(localIntent2, this.toUserName);
        if (!this.thd)
        {
          setResult(-1);
          this.the = true;
          com.tencent.mm.bg.d.b(this, "profile", ".ui.ContactInfoUI", localIntent2);
          finish();
        }
      }
    }
  }
  
  private boolean coO()
  {
    boolean bool = false;
    for (;;)
    {
      com.tencent.mm.storage.ab localab;
      int i;
      try
      {
        au.HU();
        localab = c.FR().Yg(this.toUserName);
        if ((localab != null) && ((int)localab.dhP != 0)) {
          break label256;
        }
        x.w("MicroMsg.CheckCanSubscribeBizUI", "contact is null.");
        i = 1;
        com.tencent.mm.ac.d locald = null;
        if (i == 0) {
          locald = f.kH(this.toUserName);
        }
        if ((locald == null) || (locald.LS()))
        {
          x.e("MicroMsg.CheckCanSubscribeBizUI", "BizInfo(" + locald + ") is null or should update.");
          i = 1;
        }
        if (this.thf)
        {
          if (localab == null)
          {
            this.thc = false;
            setResult(5);
            coQ();
            finish();
            return bool;
          }
          this.thc = true;
          this.dDR = true;
          if (!com.tencent.mm.l.a.gd(localab.field_type)) {
            continue;
          }
          this.thc = true;
          this.dDR = true;
          bool = true;
          continue;
        }
        if (i == 0) {
          break label229;
        }
        if (this.thc)
        {
          setResult(5);
          coQ();
          finish();
          continue;
        }
        am.a.dBr.a(this.toUserName, "", new CheckCanSubscribeBizUI.1(this));
      }
      finally {}
      continue;
      label229:
      if (!com.tencent.mm.l.a.gd(localab.field_type))
      {
        x.w("MicroMsg.CheckCanSubscribeBizUI", "is not contact.");
        this.thc = true;
        continue;
        label256:
        i = 0;
      }
    }
  }
  
  private void coP()
  {
    Toast.makeText(this, getString(R.l.verify_authority_err), 1).show();
    aHQ();
  }
  
  private void coQ()
  {
    Toast.makeText(this, R.l.regbyqq_auth_err_title, 1).show();
    aHQ();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.d("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (paraml.getType() != 605)
    {
      if (paraml.getType() != 233) {
        break label198;
      }
      au.DF().b(233, this);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label193;
      }
      paramString = (h)paraml;
      paramInt1 = paramString.QN();
      x.i("MicroMsg.CheckCanSubscribeBizUI", "geta8key, action code = %d", new Object[] { Integer.valueOf(paramInt1) });
      if (paramInt1 == 15)
      {
        paramString = paramString.QL();
        x.d("MicroMsg.CheckCanSubscribeBizUI", "actionCode = %s, url = %s", new Object[] { Integer.valueOf(paramInt1), paramString });
        paraml = new gw();
        paraml.bQd.actionCode = paramInt1;
        paraml.bQd.result = paramString;
        paraml.bQd.context = this;
        com.tencent.mm.sdk.b.a.sFg.a(paraml, Looper.myLooper());
        finish();
      }
    }
    else
    {
      return;
    }
    coP();
    return;
    label193:
    coP();
    return;
    label198:
    x.e("MicroMsg.CheckCanSubscribeBizUI", "un support scene type : %d", new Object[] { Integer.valueOf(paraml.getType()) });
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      x.d("MicroMsg.CheckCanSubscribeBizUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      return;
    }
    a((String)paramObject, null);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    new ag().post(new CheckCanSubscribeBizUI.3(this, paramString));
  }
  
  protected final int getLayoutId()
  {
    return R.i.jump_to_biz_profile_loading;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    if ((!au.HW()) || (au.Dr()))
    {
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent());
      finish();
      return;
    }
    au.DF().a(605, this);
    au.HU();
    c.FR().a(this);
    z.MY().c(this);
    if (afz())
    {
      paramBundle = this.appId;
      String str1 = this.toUserName;
      String str2 = this.extInfo;
      int i = this.tha;
      LinkedList localLinkedList = this.thb;
      String str3 = this.bMy;
      int j = this.source;
      int k = this.scene;
      Object localObject = new b.a();
      ((b.a)localObject).dIG = new nm();
      ((b.a)localObject).dIH = new nn();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkcansubscribebiz";
      ((b.a)localObject).dIF = 605;
      localObject = ((b.a)localObject).KT();
      nm localnm = (nm)((b)localObject).dID.dIL;
      localnm.jPc = paramBundle;
      localnm.jTu = str1;
      localnm.jTB = str2;
      localnm.rrx = i;
      localnm.rry = localLinkedList;
      localnm.rrz = null;
      localnm.rrA = str3;
      localnm.rdq = j;
      localnm.otY = k;
      x.i("MicroMsg.CheckCanSubscribeBizUI", "appId(%s) , toUsername(%s) , extInfo(%s) , packNum(%d), scene(%d)", new Object[] { paramBundle, str1, str2, Integer.valueOf(i), Integer.valueOf(k) });
      v.a((b)localObject, new CheckCanSubscribeBizUI.2(this));
      return;
    }
    setResult(2);
    coQ();
    finish();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.thb != null) {
      this.thb.clear();
    }
    if (au.HX())
    {
      au.DF().b(605, this);
      z.MY().d(this);
      au.HU();
      c.FR().b(this);
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      this.thd = true;
      if (this.the) {
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
  
  public void onStart()
  {
    super.onStart();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/CheckCanSubscribeBizUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */