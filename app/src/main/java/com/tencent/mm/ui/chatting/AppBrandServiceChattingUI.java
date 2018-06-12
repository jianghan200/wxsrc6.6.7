package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.q;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.v;
import com.tencent.mm.ab.v.a;
import com.tencent.mm.g.a.iy;
import com.tencent.mm.g.a.kz;
import com.tencent.mm.g.c.am;
import com.tencent.mm.model.au;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.b;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.d;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.aer;
import com.tencent.mm.protocal.c.aes;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.appbrand.c.4;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AppBrandServiceChattingUI
  extends MMFragmentActivity
{
  public a tGG;
  public ag tGH = new ag();
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingUI dispatch key event %s", new Object[] { paramKeyEvent });
    if ((this.tGG != null) && (this.tGG.onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent))) {
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    getWindow().setFormat(-2);
    com.tencent.mm.pluginsdk.e.N(this);
    overridePendingTransition(0, 0);
    super.onCreate(null);
    if (getIntent().getStringExtra("Chat_User") == null)
    {
      finish();
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrandServiceChattingUI", "talker is null !!!");
      return;
    }
    setContentView(R.i.chattingui_activity_container);
    this.tGG = new a((byte)0);
    paramBundle = getIntent().getExtras();
    paramBundle.putBoolean("FROM_APP_BRAND_CHATTING_ACTIVITY", true);
    this.tGG.setArguments(paramBundle);
    getSupportFragmentManager().bk().a(R.h.mm_root_view, this.tGG).commit();
    getSupportActionBar().show();
    if (getIntent().getBooleanExtra("resend_fail_messages", false))
    {
      ah.i(new AppBrandServiceChattingUI.1(this), 500L);
      getIntent().putExtra("is_need_resend_sns", false);
    }
    com.tencent.mm.permission.a.Vj().Vk();
    initNavigationSwipeBack();
    this.tGH.post(new AppBrandServiceChattingUI.2(this));
  }
  
  @SuppressLint({"ValidFragment"})
  public static final class a
    extends y
  {
    private com.tencent.mm.ui.appbrand.a appBrandServiceActionSheet;
    private String appId;
    private String fPo;
    private String fPp;
    private String fPq;
    private boolean fPr;
    private String fPs;
    private boolean fPt;
    private WxaAttributes.b frR;
    private int fromScene;
    private WxaExposedParams gvj;
    private String mSceneId;
    private boolean tGK;
    private String tGL = "";
    private com.tencent.mm.sdk.b.c<kz> tGM;
    private final ChatFooter.d tGN = new AppBrandServiceChattingUI.a.1(this);
    private com.tencent.mm.pluginsdk.ui.d.g tGO = new com.tencent.mm.pluginsdk.ui.d.g()
    {
      public final Object a(com.tencent.mm.pluginsdk.ui.applet.m paramAnonymousm)
      {
        switch (paramAnonymousm.type)
        {
        default: 
          return null;
        }
        return AppBrandServiceChattingUI.a.this.bAG.getTalkerUserName();
      }
      
      public final Object b(com.tencent.mm.pluginsdk.ui.applet.m paramAnonymousm)
      {
        Object localObject = null;
        if (paramAnonymousm.type == 45)
        {
          localObject = new String(Base64.decode(paramAnonymousm.url, 0));
          paramAnonymousm = new String(Base64.decode(bi.aG((String)paramAnonymousm.F(String.class), ""), 0));
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppBrandServiceChattingUI", "appId:%s,path:%s", new Object[] { localObject, paramAnonymousm });
          if ((AppBrandServiceChattingUI.a.b(AppBrandServiceChattingUI.a.this) == 2) && (AppBrandServiceChattingUI.a.c(AppBrandServiceChattingUI.a.this).appId.equals(localObject)))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrandServiceChattingUI", "onBackFromContact appId:%s path:%s", new Object[] { localObject, paramAnonymousm });
            AppBrandServiceChattingUI.a.a(AppBrandServiceChattingUI.a.this, paramAnonymousm);
            localObject = Boolean.valueOf(true);
          }
        }
        else
        {
          return localObject;
        }
        AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
        localAppBrandStatObject.scene = 1081;
        ((com.tencent.mm.plugin.appbrand.n.d)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.appbrand.n.d.class)).a(AppBrandServiceChattingUI.a.this.getContext(), null, (String)localObject, 0, 0, paramAnonymousm, localAppBrandStatObject);
        return null;
      }
    };
    private com.tencent.mm.ui.appbrand.c tGP;
    
    public a() {}
    
    public a(byte paramByte)
    {
      super();
    }
    
    private float Cm(int paramInt)
    {
      return TypedValue.applyDimension(1, paramInt, getContext().getResources().getDisplayMetrics());
    }
    
    private String getAppId()
    {
      if (bi.oW(this.appId))
      {
        localObject = ((com.tencent.mm.plugin.appbrand.n.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.appbrand.n.c.class)).rR(this.bAG.getTalkerUserName());
        if (localObject != null) {
          break label64;
        }
      }
      label64:
      for (Object localObject = null;; localObject = ((WxaAttributes)localObject).field_appId)
      {
        this.appId = ((String)localObject);
        if (bi.oW(this.appId)) {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrandServiceChattingUI", "error, appId is null");
        }
        return this.appId;
      }
    }
    
    public final void bw()
    {
      super.bw();
      com.tencent.mm.sdk.b.a.sFg.c(this.tGM);
    }
    
    public final void cpM()
    {
      Object localObject2 = null;
      super.cpM();
      Object localObject1 = ((com.tencent.mm.ui.chatting.b.b.m)this.bAG.O(com.tencent.mm.ui.chatting.b.b.m.class)).cvb();
      ((ChatFooter)localObject1).cei();
      ((ChatFooter)localObject1).cep();
      ((ChatFooter)localObject1).ceA();
      ((ChatFooter)localObject1).ceD();
      ((ChatFooter)localObject1).ceu();
      ((ChatFooter)localObject1).ceq();
      ((ChatFooter)localObject1).ces();
      ((ChatFooter)localObject1).cet();
      ((ChatFooter)localObject1).cer();
      ((ChatFooter)localObject1).ceu();
      ((ChatFooter)localObject1).ceq();
      ((ChatFooter)localObject1).ceC();
      ((ChatFooter)localObject1).un();
      ((ChatFooter)localObject1).cev();
      ((ChatFooter)localObject1).S(true, true);
      ((ChatFooter)localObject1).kP(true);
      ((ChatFooter)localObject1).kQ(true);
      ((ChatFooter)localObject1).cew();
      ((ChatFooter)localObject1).cex();
      ((ChatFooter)localObject1).cey();
      ((ChatFooter)localObject1).cet();
      ((ChatFooter)localObject1).cez();
      ((ChatFooter)localObject1).kO(com.tencent.mm.bg.d.cfH());
      localObject1 = this.bAG.getTalkerUserName();
      label233:
      boolean bool;
      label272:
      label286:
      label318:
      int i;
      Object localObject3;
      if (TextUtils.isEmpty((CharSequence)localObject1))
      {
        localObject1 = null;
        this.frR = ((WxaAttributes.b)localObject1);
        if ((this.frR == null) || (this.frR.frZ.size() != 1)) {
          break label716;
        }
        localObject1 = ((com.tencent.mm.ui.chatting.b.b.m)this.bAG.O(com.tencent.mm.ui.chatting.b.b.m.class)).cvb();
        ((ChatFooter)localObject1).setSwitchButtonMode(1);
        ((ChatFooter)localObject1).setOnFooterSwitchListener(this.tGN);
        localObject1 = ((com.tencent.mm.plugin.appbrand.n.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.appbrand.n.c.class)).rR(this.bAG.getTalkerUserName());
        if ((localObject1 == null) || ((((WxaAttributes)localObject1).field_appOpt & 0x2) <= 0)) {
          break label777;
        }
        bool = true;
        this.tGK = bool;
        if (localObject1 != null) {
          break label782;
        }
        localObject1 = localObject2;
        this.appId = ((String)localObject1);
        if (!this.tGK) {
          break label792;
        }
        ((com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class)).Fa(0);
        if (this.fromScene == 2)
        {
          localObject1 = getAppId();
          localObject2 = this.bAG.getTalkerUserName();
          i = this.fromScene;
          au.HU();
          localObject3 = com.tencent.mm.model.c.FW().Yq((String)localObject2);
          if (localObject3 != null) {
            break label815;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrandServiceChattingUI", "cvs:%s is null, error", new Object[] { localObject2 });
        }
        label384:
        this.appBrandServiceActionSheet = new com.tencent.mm.ui.appbrand.a(getContext());
        if (this.fromScene == 2)
        {
          localObject1 = new com.tencent.mm.modelsimple.g(this.bAG.getTalkerUserName(), 19, getStringExtra("key_temp_session_from"));
          au.DF().a((l)localObject1, 0);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onActivityCreated NetSceneEnterTempSession");
        }
        this.tGM = new AppBrandServiceChattingUI.a.3(this);
        com.tencent.mm.sdk.b.a.sFg.b(this.tGM);
        setMMSubTitle(R.l.app_brand_service_sub_title);
        setMMTitle(this.bAG.cuz());
        if (!this.tGK) {
          break label924;
        }
        ((com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class)).Fa(0);
        label517:
        addIconOptionMenu(0, R.l.app_brand_notify_setting_title, R.g.mm_title_btn_menu, new AppBrandServiceChattingUI.a.5(this));
        showOptionMenu(true);
        localObject1 = new b.a();
        ((b.a)localObject1).dIF = 2912;
        ((b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/wxabusiness/getkefusessioninfo";
        ((b.a)localObject1).dII = 0;
        ((b.a)localObject1).dIJ = 0;
        localObject2 = new aer();
        localObject3 = com.tencent.mm.ui.appbrand.b.ZV(this.bAG.getTalkerUserName());
        if (!bi.oW((String)localObject3)) {
          break label947;
        }
        ((aer)localObject2).bPS = getAppId();
      }
      for (((aer)localObject2).rIG = "";; ((aer)localObject2).rIG = getAppId())
      {
        ((b.a)localObject1).dIG = ((com.tencent.mm.bk.a)localObject2);
        ((b.a)localObject1).dIH = new aes();
        v.a(((b.a)localObject1).KT(), new v.a()
        {
          public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ab.b paramAnonymousb, l paramAnonymousl)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrandServiceChattingUI", "callback, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
            paramAnonymousString = (aes)paramAnonymousb.dIE.dIL;
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && (paramAnonymousString != null) && (paramAnonymousString.rIH != null))
            {
              paramAnonymousb = new StringBuilder();
              paramAnonymousl = paramAnonymousString.rIH.iterator();
              while (paramAnonymousl.hasNext())
              {
                String str = (String)paramAnonymousl.next();
                paramAnonymousb.append(str + "|");
              }
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppBrandServiceChattingUI", "block_qr_prefix:%s, size:%d", new Object[] { paramAnonymousb.toString(), Integer.valueOf(paramAnonymousString.rIH.size()) });
              com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sTZ, paramAnonymousb.toString());
            }
            return 0;
          }
        });
        return;
        localObject3 = ((com.tencent.mm.plugin.appbrand.n.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.appbrand.n.c.class)).rR((String)localObject1);
        if (localObject3 != null)
        {
          localObject1 = ((WxaAttributes)localObject3).aen();
          break;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrandServiceHelper", "username:%s, attr is null or getWxaBizMenuByUsername return null", new Object[] { localObject1 });
        localObject1 = null;
        break;
        label716:
        if ((this.frR != null) && (this.frR.frZ != null))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrandServiceChattingUI", "wxaBizMenu.buttonList.size():%d", new Object[] { Integer.valueOf(this.frR.frZ.size()) });
          break label233;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrandServiceChattingUI", "wxaBizMenu or wxaBizMenu.buttonList is empty");
        break label233;
        label777:
        bool = false;
        break label272;
        label782:
        localObject1 = ((WxaAttributes)localObject1).field_appId;
        break label286;
        label792:
        ((com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class)).Fa(8);
        break label318;
        label815:
        int j = ((am)localObject3).field_unReadCount;
        localObject2 = bi.oV(this.mSceneId);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppBrandServiceChattingUI", "stev report(%s), appId : %s, scene %s, unReadCount %d, sceneId %s", new Object[] { Integer.valueOf(13799), localObject1, Integer.valueOf(i), Integer.valueOf(j), localObject2 });
        h.mEJ.h(13799, new Object[] { localObject1, Integer.valueOf(i), Integer.valueOf(j), localObject2, Long.valueOf(bi.VE()) });
        break label384;
        label924:
        ((com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class)).Fa(8);
        break label517;
        label947:
        ((aer)localObject2).bPS = com.tencent.mm.ui.appbrand.b.rW((String)localObject3);
      }
    }
    
    public final void csH()
    {
      super.csH();
      this.fromScene = getIntExtra("app_brand_chatting_from_scene", 1);
      Object localObject2 = null;
      Object localObject1 = localObject2;
      if (this.isCurrentActivity)
      {
        localObject1 = localObject2;
        if (thisActivity() != null) {
          localObject1 = thisActivity().getIntent().getParcelableExtra("app_brand_chatting_expose_params");
        }
      }
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = localObject1;
        if (getArguments() != null) {
          localObject2 = super.getArguments().getParcelable("app_brand_chatting_expose_params");
        }
      }
      this.gvj = ((WxaExposedParams)localObject2);
      this.mSceneId = bi.oV(getStringExtra("key_scene_id"));
      this.fPo = getStringExtra("sendMessageTitle");
      this.fPp = getStringExtra("sendMessagePath");
      this.fPq = getStringExtra("sendMessageImg");
      this.fPs = getStringExtra("sendMessageLocalImg");
      this.fPr = getBooleanExtra("showMessageCard", false).booleanValue();
      this.fPt = getBooleanExtra("needDelThumb", false).booleanValue();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onCreate fromScene:%d", new Object[] { Integer.valueOf(this.fromScene) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onCreate wxaExposedParams:%s", new Object[] { this.gvj });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrandServiceChattingUI", "mSceneId:%s, sendMessageTitle:%s, sendMessagePath:%s, sendMessageImg:%s, showMessageCard:%b, needDelThumb:%b", new Object[] { this.mSceneId, this.fPo, this.fPp, this.fPq, Boolean.valueOf(this.fPr), Boolean.valueOf(this.fPt) });
    }
    
    public final void csI()
    {
      super.csI();
      j.a(this.tGO);
      if (TextUtils.isEmpty(this.tGL)) {
        this.tGL = com.tencent.mm.ui.appbrand.b.ZW(com.tencent.mm.ui.appbrand.b.ZV(this.bAG.getTalkerUserName()));
      }
      if (TextUtils.isEmpty(this.tGL))
      {
        setMMSubTitle(R.l.app_brand_service_sub_title);
        return;
      }
      setMMSubTitle(getResources().getString(R.l.app_brand_service_sub_title) + "-" + this.tGL);
    }
    
    protected final void csJ()
    {
      super.csJ();
      iy localiy = new iy();
      localiy.bSB.bSv = 0;
      localiy.bSB.aem = w.chP();
      if (s.fq(this.bAG.getTalkerUserName())) {}
      for (localiy.bSB.bSD = true;; localiy.bSB.bSD = false)
      {
        com.tencent.mm.sdk.b.a.sFg.m(localiy);
        return;
      }
    }
    
    public final void csK()
    {
      super.csK();
      j.b(this.tGO);
    }
    
    public final void onViewAttachedToWindow(View paramView)
    {
      super.onViewAttachedToWindow(paramView);
      boolean bool;
      if ((this.fromScene == 2) && (this.fPr))
      {
        if (this.tGP == null)
        {
          paramView = ((com.tencent.mm.ui.chatting.b.b.m)this.bAG.O(com.tencent.mm.ui.chatting.b.b.m.class)).cvb();
          FragmentActivity localFragmentActivity = getActivity();
          View localView = paramView.getRootView();
          if (bi.oW(paramView.getLastText())) {
            break label208;
          }
          bool = true;
          this.tGP = new com.tencent.mm.ui.appbrand.c(localFragmentActivity, localView, paramView, bool);
          this.tGP.qMR = false;
        }
        if (bi.oW(this.fPs)) {
          break label213;
        }
        com.tencent.mm.modelappbrand.b.b.Ka().a(this.tGP, "file://" + this.fPs, null, ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.g.l(com.tencent.mm.modelappbrand.g.class)).bc((int)Cm(75), (int)Cm(60)));
      }
      for (;;)
      {
        this.tGP.trm = new AppBrandServiceChattingUI.a.7(this);
        paramView = this.tGP;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppBrandServiceImageBubble", "show");
        au.Em().H(new c.4(paramView));
        return;
        label208:
        bool = false;
        break;
        label213:
        com.tencent.mm.modelappbrand.b.b.Ka().a(this.tGP, this.fPq, null, ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.g.l(com.tencent.mm.modelappbrand.g.class)).bc((int)Cm(75), (int)Cm(60)));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/AppBrandServiceChattingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */