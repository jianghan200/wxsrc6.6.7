package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.widget.ListView;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.hardcoder.HardCoderJNI;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.pluginsdk.ui.tools.l;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.statusbar.c.a;

public class SnsUserUI
  extends MMActivity
  implements h.a
{
  private long dRd = 0L;
  private int dYK;
  private long dkA = 0L;
  private com.tencent.mm.sdk.b.c fIu = new SnsUserUI.7(this);
  private String gtX;
  private boolean nNG;
  private com.tencent.matrix.trace.b.a nYi = new SnsUserUI.11(this);
  private boolean ocD = false;
  private String ocI;
  private boolean ocJ;
  private int ocK;
  private View odd;
  private c.a ode;
  private MenuItem.OnMenuItemClickListener odq = new SnsUserUI.4(this);
  private at ogY;
  private bb ogZ;
  private am.a oha;
  private bb.a ohb;
  private Runnable ohc = new Runnable()
  {
    public final void run()
    {
      SnsUserUI.a(SnsUserUI.this).bDI();
      SnsUserUI.a(SnsUserUI.this).bCb();
    }
  };
  
  private void bEB()
  {
    if (com.tencent.mm.p.a.bw(this)) {}
    boolean bool;
    do
    {
      do
      {
        return;
        bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.CAMERA", 18, "", "");
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsUserUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this });
      } while (!bool);
      bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.RECORD_AUDIO", 18, "", "");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsUserUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this });
    } while (!bool);
    Intent localIntent = new Intent();
    l.A(this.mController.tml, localIntent);
  }
  
  public final void a(boolean paramBoolean1, String paramString, boolean paramBoolean2, boolean paramBoolean3, int paramInt, long paramLong)
  {
    af.aRu().removeCallbacks(this.ohc);
    String str;
    if (this.ogY != null)
    {
      this.ogY.nZF = paramBoolean2;
      this.ogY.nQU = paramString;
      str = this.ogY.iKw;
      if (paramString.compareTo(str) < 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsUserUI", "onNpAddSize addsize %s %s", new Object[] { paramString, str });
        this.ogY.bDI();
        this.ogY.bCb();
      }
    }
    else
    {
      if ((!paramBoolean3) || (this.ocI.equals(this.gtX))) {
        break label145;
      }
      this.ogZ.ofU = true;
      this.ogZ.xk(paramInt);
    }
    label145:
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsUserUI", "onNpAddSize addsize passed %s %s", new Object[] { paramString, str });
      break;
      if ((this.ocI.equals(this.gtX)) && (paramLong != 0L))
      {
        g.Ek();
        g.Ei().DT().a(aa.a.sVE, Long.valueOf(paramLong));
        this.ogY.fn(paramLong);
      }
      this.ogZ.ofU = paramBoolean1;
    } while (!paramBoolean1);
    this.ogZ.im(paramBoolean2);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, boolean paramBoolean4, int paramInt, long paramLong)
  {
    String str;
    if (this.ogY != null)
    {
      this.ogY.nQU = paramString;
      str = this.ogY.iKw;
      if (paramString.compareTo(str) < 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsUserUI", "onFpSetSize addsize %s %s isNeedNP %s", new Object[] { paramString, str, Boolean.valueOf(paramBoolean1) });
        this.ogY.bDI();
        this.ogY.bCb();
      }
    }
    else
    {
      if ((!paramBoolean4) || (this.ocI.equals(this.gtX))) {
        break label158;
      }
      this.ogZ.ofU = true;
      this.ogZ.xk(paramInt);
    }
    for (;;)
    {
      if (paramBoolean3) {
        this.ogZ.nvg.bDn();
      }
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsUserUI", "onFpSetSize addsize passed %s %s isNeedNP %s", new Object[] { paramString, str, Boolean.valueOf(paramBoolean1) });
      break;
      label158:
      if ((this.ocI.equals(this.gtX)) && (paramLong != 0L))
      {
        g.Ek();
        g.Ei().DT().a(aa.a.sVE, Long.valueOf(paramLong));
        this.ogY.fn(paramLong);
      }
      this.ogZ.ofU = paramBoolean2;
      if (paramBoolean2) {
        this.ogZ.im(false);
      } else if (paramBoolean1) {
        this.oha.b(this.ohb.getType(), this.gtX, this.nNG, this.ocK);
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return i.g.sns_self;
  }
  
  protected final void initView()
  {
    this.ogY = new at(this, new SnsUserUI.12(this), this.gtX, new SnsUserUI.13(this));
    this.ogZ.kww.setAdapter(this.ogY);
    this.ogZ.kww.setOnItemClickListener(new SnsUserUI.14(this));
    this.ogZ.kww.postDelayed(new SnsUserUI.15(this), 500L);
    setBackBtn(this.odq, i.i.actionbar_icon_dark_back);
  }
  
  public final void lF(int paramInt)
  {
    super.lF(paramInt);
    if ((Build.VERSION.SDK_INT >= 21) && (this.odd != null))
    {
      this.odd.setBackgroundColor(getWindow().getStatusBarColor());
      com.tencent.mm.ui.statusbar.d.a(getWindow());
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsUserUI", "on activity result, %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((5985 == paramInt1) && (paramInt2 == -1))
    {
      finish();
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.ogZ.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    if (this.mController != null) {
      this.mController.ak(2, false);
    }
    super.onCreate(paramBundle);
    if (!g.Eg().Dx())
    {
      finish();
      return;
    }
    this.odd = findViewById(i.f.action_bar_container);
    String str2;
    String str3;
    if ((this.odd == null) || (!com.tencent.mm.ui.statusbar.c.uuT))
    {
      getWindow().getDecorView().setSystemUiVisibility(1280);
      lF(this.mController.tml.getResources().getColor(i.c.transparent));
      b(new Runnable()new Runnable
      {
        public final void run() {}
      }, new Runnable()
      {
        public final void run()
        {
          SnsUserUI.this.cqg();
        }
      });
      this.oha = af.bye();
      this.ocK = getIntent().getIntExtra("sns_source", 0);
      this.gtX = getIntent().getStringExtra("sns_userName");
      if (this.gtX == null) {
        this.gtX = "";
      }
      g.Ek();
      this.ocJ = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yc(this.gtX);
      this.ocI = q.GF();
      this.nNG = this.ocI.equals(this.gtX);
      paramBundle = af.byc();
      str2 = bi.aG(getIntent().getStringExtra("sns_signature"), "");
      str3 = bi.aG(getIntent().getStringExtra("sns_nickName"), "");
      if ((this.gtX != null) && (!this.gtX.equals(""))) {
        break label509;
      }
    }
    label509:
    for (paramBundle = paramBundle.Yg(this.ocI);; paramBundle = paramBundle.Yg(this.gtX))
    {
      String str1 = str3;
      Object localObject = str2;
      if (paramBundle != null)
      {
        str1 = str3;
        localObject = str2;
        if ((int)paramBundle.dhP > 0)
        {
          localObject = paramBundle.signature;
          str1 = paramBundle.BK();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsUserUI", "contact:user[%s] id[%d] nickname[%s]", new Object[] { paramBundle.field_username, Integer.valueOf((int)paramBundle.dhP), str1 });
        }
      }
      this.ogZ = new bb(this);
      this.ogZ.a(this.ocI, this.gtX, str1, (String)localObject, this.ocJ, this.nNG, this.ocK);
      paramBundle = this.ogZ;
      localObject = new SnsUserUI.10(this);
      this.ohb = ((bb.a)localObject);
      paramBundle.ofW = ((bb.a)localObject);
      this.ogZ.onCreate();
      if (getIntent().getExtras() != null) {
        getIntent().getExtras().setClassLoader(getClass().getClassLoader());
      }
      initView();
      com.tencent.mm.sdk.b.a.sFg.b(this.fIu);
      return;
      paramBundle = com.tencent.mm.ui.statusbar.c.ab(this);
      localObject = new SnsUserUI.3(this);
      this.ode = ((c.a)localObject);
      paramBundle.a((c.a)localObject);
      getWindow().getDecorView().requestApplyInsets();
      com.tencent.mm.ui.statusbar.d.a(getWindow());
      break;
    }
  }
  
  public void onDestroy()
  {
    this.ocD = true;
    com.tencent.mm.sdk.b.a.sFg.c(this.fIu);
    b localb = b.p(getIntent());
    if (localb != null)
    {
      localb.update();
      localb.RD();
    }
    if ((this.ogZ != null) && (this.ogZ.tipDialog != null))
    {
      this.ogZ.tipDialog.dismiss();
      this.ogZ.tipDialog = null;
    }
    g.Ek();
    if ((g.Eg().Dx()) && (this.oha != null)) {
      this.oha.a(this, this.ohb.getType());
    }
    if (this.ogZ != null) {
      this.ogZ.onDestroy();
    }
    super.onDestroy();
  }
  
  public void onDrag()
  {
    super.onDrag();
    cqg();
  }
  
  public void onPause()
  {
    HardCoderJNI.stopPerformace(HardCoderJNI.hcSNSUserScrollEnable, this.dYK);
    this.dYK = 0;
    bb.onPause();
    super.onPause();
    ((com.tencent.matrix.trace.a)com.tencent.matrix.a.tg().g(com.tencent.matrix.trace.a.class)).bsV.b(this.nYi);
    if (bi.VE() > this.dRd) {}
    for (long l = bi.VE() - this.dRd;; l = 1L)
    {
      this.dRd = l;
      HardCoderJNI.reportFPS(704, HardCoderJNI.hcSNSUserScrollAction, 1, this.dkA, this.dRd);
      this.dkA = 0L;
      this.dRd = 0L;
      return;
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsUserUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      return;
      if (paramArrayOfInt[0] == 0)
      {
        bEB();
        return;
      }
      if ("android.permission.CAMERA".equals(paramArrayOfString[0])) {}
      for (paramInt = i.j.permission_camera_request_again_msg; paramArrayOfInt[0] != 0; paramInt = i.j.permission_microphone_request_again_msg)
      {
        h.a(this, getString(paramInt), getString(i.j.permission_tips_title), getString(i.j.jump_to_settings), getString(i.j.app_cancel), false, new SnsUserUI.5(this), new SnsUserUI.6(this));
        return;
      }
    }
  }
  
  public void onResume()
  {
    this.dRd = bi.VE();
    ((com.tencent.matrix.trace.a)com.tencent.matrix.a.tg().g(com.tencent.matrix.trace.a.class)).bsV.a(this.nYi);
    if (this.ogY != null) {
      this.ogY.notifyDataSetChanged();
    }
    setRequestedOrientation(-1);
    if (!this.nNG) {
      enableOptionMenu(false);
    }
    for (;;)
    {
      setBackBtn(this.odq, i.i.actionbar_icon_dark_back);
      if (!this.nNG) {
        break;
      }
      setMMTitle(i.j.sns_photo_ui_title);
      bb.onResume();
      super.onResume();
      return;
      localObject = getString(i.j.sns_message_desc);
      int i = i.i.actionbar_list_icon;
      MenuItem.OnMenuItemClickListener local2 = new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.setClass(SnsUserUI.this, SnsMsgUI.class);
          paramAnonymousMenuItem.putExtra("sns_msg_force_show_all", true);
          SnsUserUI.this.startActivityForResult(paramAnonymousMenuItem, 8);
          return true;
        }
      };
      this.mController.addIconOptionMenu(0, (String)localObject, i, local2);
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsUserUI", "SnsUserUI, userName:%s, title:%s", new Object[] { this.gtX, this.ogZ.title });
    Object localObject = af.byc().Yg(this.gtX);
    if (localObject != null) {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsUserUI", "SnsUserUI, contact is not null");
    }
    for (localObject = ((com.tencent.mm.l.a)localObject).BL();; localObject = this.ogZ.title)
    {
      setMMTitle(com.tencent.mm.plugin.sns.data.i.y((CharSequence)localObject));
      break;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsUserUI", "SnsUserUI, contact is null, title:%s", new Object[] { this.ogZ.title });
    }
  }
  
  public boolean supportNavigationSwipeBack()
  {
    return super.supportNavigationSwipeBack();
  }
  
  class a
    extends at.f
  {
    private ba odt = null;
    
    a() {}
    
    public void dE(int paramInt1, int paramInt2)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsUserUI", "showImg snsinfo snslocalId:%d, pos:%d，mIsSelf:%b ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(SnsUserUI.f(SnsUserUI.this)) });
      if ((SnsUserUI.f(SnsUserUI.this)) && (paramInt2 == -1))
      {
        g.Ek();
        Object localObject = (String)g.Ei().DT().get(aa.a.sQL, null);
        if (!bi.oW((String)localObject))
        {
          localObject = bi.WP((String)localObject);
          Parcel localParcel = Parcel.obtain();
          localParcel.unmarshall((byte[])localObject, 0, localObject.length);
          localParcel.setDataPosition(0);
          try
          {
            localObject = (Intent)Intent.CREATOR.createFromParcel(localParcel);
            ((Intent)localObject).addFlags(268435456);
            ((Intent)localObject).setClass(SnsUserUI.this, SnsUploadUI.class);
            SnsUserUI.this.startActivity((Intent)localObject);
            return;
          }
          catch (Exception localException)
          {
            g.Ek();
            g.Ei().DT().a(aa.a.sQL, "");
          }
        }
        this.odt = new ba(SnsUserUI.this);
        this.odt.ofp = new SnsUserUI.a.1(this);
        this.odt.c(0, SnsUserUI.this.mController.tml.getString(i.j.app_field_pic_video));
        this.odt.ofq = new SnsUserUI.a.2(this);
        this.odt.bEo();
        return;
      }
      Intent localIntent = new Intent(SnsUserUI.this, SnsGalleryUI.class);
      localIntent.putExtra("sns_gallery_userName", SnsUserUI.c(SnsUserUI.this));
      localIntent.putExtra("sns_gallery_is_self", SnsUserUI.f(SnsUserUI.this));
      localIntent.putExtra("sns_gallery_localId", paramInt1);
      localIntent.putExtra("sns_source", SnsUserUI.e(SnsUserUI.this));
      localIntent.putExtra("sns_gallery_st_time", SnsUserUI.a(SnsUserUI.this).nZI);
      localIntent.putExtra("sns_gallery_ed_time", SnsUserUI.a(SnsUserUI.this).nZJ);
      if (SnsUserUI.a(SnsUserUI.this) != null)
      {
        localIntent.putExtra("sns_gallery_limit_seq", SnsUserUI.a(SnsUserUI.this).iKw);
        SnsUserUI.b(SnsUserUI.this).h(SnsUserUI.c(SnsUserUI.this), SnsUserUI.a(SnsUserUI.this).dD(paramInt1, paramInt2));
        localIntent.putExtra("sns_gallery_position", SnsUserUI.a(SnsUserUI.this).nZM);
      }
      SnsUserUI.this.startActivityForResult(localIntent, 8);
    }
    
    public final void dF(int paramInt1, int paramInt2)
    {
      Object localObject = af.byo().xd(paramInt1);
      if (localObject == null) {
        return;
      }
      if (((n)localObject).field_type == 15)
      {
        localObject = new Intent(SnsUserUI.this, SnsGalleryUI.class);
        ((Intent)localObject).putExtra("sns_gallery_userName", SnsUserUI.c(SnsUserUI.this));
        ((Intent)localObject).putExtra("sns_gallery_is_self", SnsUserUI.f(SnsUserUI.this));
        ((Intent)localObject).putExtra("sns_gallery_localId", paramInt1);
        ((Intent)localObject).putExtra("sns_source", SnsUserUI.e(SnsUserUI.this));
        ((Intent)localObject).putExtra("sns_gallery_st_time", SnsUserUI.a(SnsUserUI.this).nZI);
        ((Intent)localObject).putExtra("sns_gallery_ed_time", SnsUserUI.a(SnsUserUI.this).nZJ);
        if (SnsUserUI.a(SnsUserUI.this) != null)
        {
          ((Intent)localObject).putExtra("sns_gallery_limit_seq", SnsUserUI.a(SnsUserUI.this).iKw);
          SnsUserUI.b(SnsUserUI.this).h(SnsUserUI.c(SnsUserUI.this), SnsUserUI.a(SnsUserUI.this).dD(paramInt1, paramInt2));
          ((Intent)localObject).putExtra("sns_gallery_position", SnsUserUI.a(SnsUserUI.this).nZM);
        }
        SnsUserUI.this.startActivityForResult((Intent)localObject, 8);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.setClass(SnsUserUI.this, SnsCommentDetailUI.class);
      localIntent.putExtra("INTENT_TALKER", ((n)localObject).field_userName);
      localIntent.putExtra("INTENT_SNS_LOCAL_ID", v.ai("sns_table_", paramInt1));
      SnsUserUI.this.startActivityForResult(localIntent, 12);
    }
    
    public final void xw(int paramInt)
    {
      n localn = af.byo().xd(paramInt);
      if (localn == null) {
        return;
      }
      Intent localIntent = new Intent();
      localIntent.setClass(SnsUserUI.this, SnsCommentDetailUI.class);
      localIntent.putExtra("INTENT_TALKER", localn.field_userName);
      localIntent.putExtra("INTENT_SNS_LOCAL_ID", v.ai("sns_table_", paramInt));
      SnsUserUI.this.startActivityForResult(localIntent, 12);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsUserUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */