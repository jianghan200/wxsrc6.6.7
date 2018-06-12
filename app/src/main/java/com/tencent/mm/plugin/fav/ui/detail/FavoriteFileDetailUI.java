package com.tencent.mm.plugin.fav.ui.detail;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.k.e;
import com.tencent.mm.plugin.fav.a.ab;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.plugin.fav.a.h.a;
import com.tencent.mm.plugin.fav.a.k;
import com.tencent.mm.plugin.fav.a.m.c;
import com.tencent.mm.plugin.fav.a.p;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.plugin.fav.ui.h.3;
import com.tencent.mm.plugin.fav.ui.m.b;
import com.tencent.mm.plugin.fav.ui.m.e;
import com.tencent.mm.plugin.fav.ui.m.f;
import com.tencent.mm.plugin.fav.ui.m.h;
import com.tencent.mm.plugin.fav.ui.m.i;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.o;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wa;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavoriteFileDetailUI
  extends BaseFavDetailReportUI
  implements p, j.a
{
  private long bJA;
  private vx bOz;
  private boolean bUY = true;
  private ag dvh;
  private TextView eMe;
  private ProgressBar eVR;
  private TextView gmo;
  private f hEl = null;
  private com.tencent.mm.plugin.fav.a.g iWQ;
  private k jaf = new k();
  private Button jcf;
  private Button jcg;
  private Button jch;
  private MMImageView jci;
  private TextView jcj;
  private View jck;
  private View jcl;
  private TextView jcm;
  private ImageView jcn;
  private TextView jco;
  private boolean jcp = false;
  private boolean jcq = false;
  private String jcr;
  private String jcs;
  private boolean jct = false;
  private boolean jcu = false;
  private boolean jcv = false;
  
  private void aMJ()
  {
    this.jcs = getIntent().getStringExtra("key_detail_data_id");
    Iterator localIterator = this.iWQ.field_favProto.rBI.iterator();
    while (localIterator.hasNext())
    {
      vx localvx = (vx)localIterator.next();
      if (localvx.jdM.equals(this.jcs)) {
        this.bOz = localvx;
      }
    }
    if (this.bOz == null) {
      this.bOz = com.tencent.mm.plugin.fav.a.b.c(this.iWQ);
    }
  }
  
  private void aMK()
  {
    this.jci.setVisibility(8);
    this.eMe.setVisibility(8);
    this.jch.setVisibility(8);
    this.jcf.setVisibility(8);
    this.jcg.setVisibility(8);
    this.jck.setVisibility(8);
    this.gmo.setVisibility(8);
    this.jcn.setVisibility(0);
    this.jco.setVisibility(0);
    if (this.bOz.bjS == 4)
    {
      this.gmo.setGravity(17);
      this.gmo.setText(m.i.favorite_out_of_date_video);
      return;
    }
    this.gmo.setGravity(17);
    this.gmo.setText(m.i.favorite_out_of_date_file);
    if (this.bOz.rAw == 2)
    {
      this.jco.setText(m.i.favorite_detail_illegal_big_file);
      return;
    }
    this.jco.setText(m.i.favorite_detail_illegal_expired_file);
  }
  
  private void aML()
  {
    this.jch.setVisibility(8);
    this.jcf.setVisibility(8);
    this.jcg.setVisibility(8);
    this.gmo.setVisibility(8);
    this.jck.setVisibility(0);
    c localc = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(this.bOz.jdM);
    int k;
    int j;
    int i;
    if (localc != null)
    {
      k = (int)localc.getProgress();
      j = localc.field_offset;
      i = localc.field_totalLen;
    }
    while ((this.iWQ.aLf()) && (bi.oW(this.bOz.rzo)))
    {
      b(k, getString(m.i.favorite_uploading, new Object[] { com.tencent.mm.plugin.fav.a.b.aj(j), com.tencent.mm.plugin.fav.a.b.aj(i) }));
      return;
      i = (int)this.bOz.rzJ;
      j = 0;
      k = 0;
    }
    b(k, getString(m.i.favorite_downloading, new Object[] { com.tencent.mm.plugin.fav.a.b.aj(j), com.tencent.mm.plugin.fav.a.b.aj(i) }));
  }
  
  private void aMM()
  {
    this.jck.setVisibility(8);
    this.jcg.setVisibility(8);
    if (bi.oW(this.bOz.rzv))
    {
      this.jcf.setVisibility(8);
      this.jch.setVisibility(0);
      localObject = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(this.bOz.jdM);
      if ((localObject == null) || (((c)localObject).field_offset <= 0)) {
        break label138;
      }
      localObject = this.jch;
      if (!this.iWQ.aLg()) {
        break label131;
      }
    }
    label131:
    for (int i = m.i.favorite_item_restart_upload;; i = m.i.favorite_item_restart_download)
    {
      ((Button)localObject).setText(i);
      this.gmo.setVisibility(8);
      return;
      this.jcf.setVisibility(0);
      break;
    }
    label138:
    Object localObject = this.jch;
    if (this.iWQ.aLg()) {}
    for (i = m.i.favorite_item_upload;; i = m.i.favorite_item_download)
    {
      ((Button)localObject).setText(i);
      break;
    }
  }
  
  private void aMN()
  {
    if (this.jct) {
      return;
    }
    Object localObject = this.jcb;
    ((h.a)localObject).iVM += 1;
    this.jct = true;
    localObject = new Intent();
    ((Intent)localObject).putExtra("key_detail_info_id", this.bJA);
    ((Intent)localObject).putExtra("key_detail_fav_path", com.tencent.mm.plugin.fav.a.b.b(this.bOz));
    ((Intent)localObject).putExtra("key_detail_fav_thumb_path", com.tencent.mm.plugin.fav.a.b.c(this.bOz));
    ((Intent)localObject).putExtra("key_detail_fav_video_duration", this.bOz.duration);
    ((Intent)localObject).putExtra("key_detail_statExtStr", this.bOz.bZN);
    com.tencent.mm.plugin.fav.a.b.a(this, ".ui.detail.FavoriteVideoPlayUI", (Intent)localObject);
    finish();
  }
  
  private void b(float paramFloat, String paramString)
  {
    this.dvh.post(new FavoriteFileDetailUI.5(this, paramFloat, paramString));
  }
  
  private void eV(boolean paramBoolean)
  {
    boolean bool = com.tencent.mm.plugin.fav.a.b.f(this.bOz);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteFileDetailUI", "init status, info type %d, exist:%B path:%s", new Object[] { Integer.valueOf(this.iWQ.field_itemStatus), Boolean.valueOf(bool), com.tencent.mm.plugin.fav.a.b.b(this.bOz) });
    if (this.bOz.rAw != 0) {
      aMK();
    }
    label625:
    label837:
    do
    {
      do
      {
        do
        {
          return;
          if ((this.iWQ.isDone()) || (bool) || (!bi.oW(this.bOz.rzo)))
          {
            if (bool)
            {
              if ((getType() == 15) && (this.bOz.rAo != null) && (!bi.oW(this.bOz.rAo.dyJ)) && (!bi.oW(this.bOz.rAo.dyN)))
              {
                this.jcu = true;
                this.jci.setVisibility(8);
                this.jck.setVisibility(8);
                this.jch.setVisibility(8);
                this.jcf.setVisibility(8);
                this.jcg.setVisibility(8);
                this.gmo.setVisibility(8);
                String str = com.tencent.mm.plugin.fav.a.b.b(this.bOz);
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteFileDetailUI", com.tencent.mm.compatible.util.g.Ab() + " initView: fullpath:" + str);
                ViewGroup localViewGroup = (ViewGroup)findViewById(m.e.video_container);
                this.hEl = o.fb(this.mController.tml);
                RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
                localLayoutParams.addRule(13);
                localViewGroup.addView((View)this.hEl, 0, localLayoutParams);
                this.hEl.setVideoCallback(new FavoriteFileDetailUI.14(this));
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteFileDetailUI", com.tencent.mm.compatible.util.g.Ab() + " initView :" + str);
                if (str != null)
                {
                  this.hEl.stop();
                  this.hEl.setVideoPath(str);
                }
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteFileDetailUI", com.tencent.mm.compatible.util.g.Ab() + " initView");
                com.tencent.mm.an.b.PW();
                com.tencent.mm.plugin.report.service.h.mEJ.h(11444, new Object[] { Integer.valueOf(4) });
              }
              if ((getType() == 15) || (getType() == 4))
              {
                if (!this.jcu)
                {
                  this.jck.setVisibility(8);
                  this.jch.setVisibility(8);
                  this.jcf.setVisibility(8);
                  this.jcg.setVisibility(0);
                  this.jcg.setText(m.i.favorite_item_preview);
                  this.gmo.setVisibility(8);
                  aMN();
                }
                com.tencent.mm.kernel.g.Em().H(new FavoriteFileDetailUI.3(this));
                return;
              }
              if ((com.tencent.mm.plugin.fav.a.b.f(this.bOz)) && (com.tencent.mm.plugin.fav.a.b.g(this.bOz))) {}
              for (i = 1;; i = 0)
              {
                if (i == 0) {
                  break label625;
                }
                this.jck.setVisibility(8);
                this.jch.setVisibility(8);
                this.jcf.setVisibility(0);
                this.jcg.setVisibility(8);
                this.gmo.setVisibility(8);
                this.jcf.setOnClickListener(new FavoriteFileDetailUI.2(this));
                break;
              }
              this.jck.setVisibility(8);
              this.jch.setVisibility(8);
              if (bi.oW(this.bOz.rzv)) {
                this.jcf.setVisibility(8);
              }
              for (;;)
              {
                this.jcg.setVisibility(0);
                this.jcb.iVL = true;
                this.gmo.setVisibility(0);
                break;
                this.jcf.setVisibility(0);
              }
            }
            if (bi.oW(this.bOz.rzo))
            {
              aMK();
              return;
            }
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteFileDetailUI", "? info is done, source file not exist, cdn data url is not null");
            aMM();
            return;
          }
          if (!this.iWQ.aLh()) {
            break label837;
          }
          if (!bi.oW(this.bOz.rzo)) {
            break;
          }
          aMK();
        } while (!paramBoolean);
        int i = getType();
        if ((4 == i) || (15 == i)) {}
        for (i = m.i.favorite_record_video_error;; i = m.i.favorite_record_file_error)
        {
          com.tencent.mm.ui.base.h.bA(this.mController.tml, getString(i));
          return;
        }
        aMM();
      } while (!paramBoolean);
      com.tencent.mm.ui.base.h.bA(this.mController.tml, getString(m.i.download_fail));
      return;
      if (!this.iWQ.aLg()) {
        break;
      }
      aMM();
    } while (!paramBoolean);
    com.tencent.mm.ui.base.h.bA(this.mController.tml, getString(m.i.fav_upload_fail));
    return;
    if ((this.iWQ.isDownloading()) || (this.iWQ.aLf()))
    {
      aML();
      return;
    }
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteFileDetailUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
    aMM();
  }
  
  private int getType()
  {
    if (this.bOz == null) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteFileDetailUI", "get type but data item is null");
    }
    do
    {
      return 8;
      if (this.bOz.bjS != 0) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteFileDetailUI", "get data type, but data item type is 0, info type %d", new Object[] { Integer.valueOf(this.iWQ.field_type) });
      if (4 == this.iWQ.field_type) {
        return 4;
      }
    } while (16 != this.iWQ.field_type);
    if ((this.bOz != null) && (this.bOz.rAo != null))
    {
      if (!bi.oW(this.bOz.rAo.dyJ)) {
        return 15;
      }
      if (!bi.oW(this.bOz.rAo.dyN)) {
        return 15;
      }
    }
    return 4;
    if (this.bOz.bjS == 15)
    {
      if ((this.bOz != null) && (this.bOz.rAo != null))
      {
        if (!bi.oW(this.bOz.rAo.dyJ)) {
          return 15;
        }
        if (!bi.oW(this.bOz.rAo.dyN)) {
          return 15;
        }
      }
      return 4;
    }
    return this.bOz.bjS;
  }
  
  public final void a(String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteFileDetailUI", "on favitem change, notifyId:%s, curId:%d", new Object[] { paramString, Long.valueOf(this.iWQ.field_localId) });
    paramString = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(this.iWQ.field_localId);
    if ((paramString == null) && (!this.jcq))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteFileDetailUI", "error, on notify change, cannot find info");
      finish();
    }
    for (;;)
    {
      return;
      if (!this.jcq) {
        this.iWQ = paramString;
      }
      aMJ();
      paramString = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(this.bOz.jdM);
      boolean bool;
      if (paramString == null) {
        bool = false;
      }
      while (!bool)
      {
        this.dvh.post(new FavoriteFileDetailUI.6(this));
        return;
        if (paramString.field_status == 1)
        {
          bool = true;
        }
        else if (this.bOz.bjS == 8)
        {
          bool = false;
        }
        else if (this.jcv)
        {
          bool = false;
        }
        else
        {
          if ((paramString.field_status == 4) && (((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(this.bOz.jdM).field_extFlag != 0))
          {
            com.tencent.mm.plugin.fav.a.b.a(this.iWQ, this.bOz, true);
            this.jcv = true;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteFileDetailUI", "FavoriteFileDetail download, check retry, return %B", new Object[] { Boolean.valueOf(this.jcv) });
          bool = this.jcv;
        }
      }
    }
  }
  
  public final void d(c paramc)
  {
    if ((paramc == null) || (paramc.field_dataId == null)) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteFileDetailUI", "on cdn status changed, item is null");
    }
    do
    {
      do
      {
        return;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteFileDetailUI", "on cdn status changed, dataID is %s, field id is %s", new Object[] { this.bOz.jdM, paramc.field_dataId });
      } while (!paramc.field_dataId.equals(this.bOz.jdM));
      if ((this.iWQ.aLf()) && (bi.oW(this.bOz.rzo)))
      {
        b(paramc.getProgress(), getString(m.i.favorite_uploading, new Object[] { com.tencent.mm.plugin.fav.a.b.aj(paramc.field_offset), com.tencent.mm.plugin.fav.a.b.aj(paramc.field_totalLen) }));
        return;
      }
      b(paramc.getProgress(), getString(m.i.favorite_downloading, new Object[] { com.tencent.mm.plugin.fav.a.b.aj(paramc.field_offset), com.tencent.mm.plugin.fav.a.b.aj(paramc.field_totalLen) }));
    } while ((!this.jcq) || (!com.tencent.mm.vfs.d.cn(paramc.field_path)));
    this.iWQ.field_itemStatus = 10;
    a("", null);
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return m.f.favorite_download_detail_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ((ab)com.tencent.mm.kernel.g.l(ab.class)).a(this, paramInt1, paramInt2, paramIntent, m.i.no_match_application_msg, m.i.no_match_application_title);
    if (paramInt2 != -1) {}
    Object localObject1;
    label54:
    Object localObject2;
    do
    {
      do
      {
        return;
      } while (paramInt1 != 1);
      if (paramIntent != null) {
        break;
      }
      localObject1 = null;
      if (paramIntent != null) {
        break label290;
      }
      paramIntent = null;
      localObject2 = com.tencent.mm.ui.base.h.a(this.mController.tml, getString(m.i.favorite_forward_tips), false, null);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteFileDetailUI", "do share msg, fav msg type %d", new Object[] { Integer.valueOf(getType()) });
      localObject2 = new FavoriteFileDetailUI.4(this, (Dialog)localObject2);
      paramInt2 = getType();
    } while (bi.oW((String)localObject1));
    Iterator localIterator = bi.F(((String)localObject1).split(",")).iterator();
    label141:
    label203:
    label220:
    label242:
    label290:
    label363:
    label371:
    label399:
    for (;;)
    {
      if (!localIterator.hasNext()) {
        break label401;
      }
      String str = (String)localIterator.next();
      Object localObject3;
      if ((paramInt2 == 4) || (paramInt2 == 15))
      {
        localObject1 = this.mController.tml;
        localObject3 = this.bOz;
        if (localObject1 == null)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavSendLogic", "want to send fav video, but context is null");
          boolean bool = com.tencent.mm.model.s.fq(str);
          if (!bool) {
            break label363;
          }
          localObject1 = m.c.iWy;
          localObject3 = this.iWQ;
          com.tencent.mm.plugin.fav.a.m.d locald = com.tencent.mm.plugin.fav.a.m.d.iWC;
          if (!bool) {
            break label371;
          }
          paramInt1 = com.tencent.mm.model.m.gK(str);
          com.tencent.mm.plugin.fav.a.m.a((m.c)localObject1, (com.tencent.mm.plugin.fav.a.g)localObject3, locald, paramInt1);
        }
      }
      for (;;)
      {
        if (bi.oW(paramIntent)) {
          break label399;
        }
        com.tencent.mm.plugin.messenger.a.g.bcT().D(str, paramIntent, com.tencent.mm.model.s.hQ(str));
        break label141;
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        break;
        paramIntent = paramIntent.getStringExtra("custom_send_text");
        break label54;
        if (bi.oW(str))
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavSendLogic", "want to send fav video, but to user is null");
          break label203;
        }
        if (localObject3 == null)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavSendLogic", "want to send fav video, but dataItem is null");
          break label203;
        }
        com.tencent.mm.kernel.g.Em().H(new h.3((vx)localObject3, (Context)localObject1, str, (Runnable)localObject2));
        break label203;
        localObject1 = m.c.iWx;
        break label220;
        paramInt1 = 0;
        break label242;
        com.tencent.mm.plugin.fav.ui.h.a(this.mController.tml, str, this.iWQ, this.bOz, (Runnable)localObject2);
      }
    }
    label401:
    com.tencent.mm.ui.widget.snackbar.b.h(this, getString(m.i.fav_finish_sent));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool2 = true;
    super.onCreate(paramBundle);
    this.dvh = new ag();
    this.bJA = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.jcq = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
    this.bUY = getIntent().getBooleanExtra("show_share", true);
    this.jcr = getIntent().getStringExtra("fav_note_xml");
    this.iWQ = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(this.bJA);
    if ((this.jcq) && (!bi.oW(this.jcr))) {
      this.iWQ = com.tencent.mm.plugin.fav.a.b.Bf(this.jcr);
    }
    if (this.iWQ == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteFileDetailUI", "error, cannot find download info");
      finish();
      return;
    }
    F(this.iWQ);
    com.tencent.mm.plugin.fav.a.m.w(this.iWQ);
    aMJ();
    this.jcf = ((Button)findViewById(m.e.preview_btn));
    this.jcg = ((Button)findViewById(m.e.open_btn));
    this.jch = ((Button)findViewById(m.e.download_btn));
    this.jci = ((MMImageView)findViewById(m.e.icon_iv));
    this.eMe = ((TextView)findViewById(m.e.name_tv));
    this.gmo = ((TextView)findViewById(m.e.tips_tv));
    this.jcl = findViewById(m.e.download_stop_btn);
    this.jck = findViewById(m.e.download_progress_area);
    this.eVR = ((ProgressBar)findViewById(m.e.download_pb));
    this.jcj = ((TextView)findViewById(m.e.download_progress_tips));
    this.jcm = ((TextView)findViewById(m.e.show_ad_sight));
    this.jcn = ((ImageView)findViewById(m.e.fav_file_illegal_image));
    this.jco = ((TextView)findViewById(m.e.fav_file_illegal_tv));
    int i = getType();
    label389:
    wa localwa;
    label426:
    boolean bool3;
    boolean bool1;
    if (4 == i)
    {
      setMMTitle(m.i.favorite_video);
      if (this.bOz.bjS != 4) {
        break label639;
      }
      this.jci.setImageResource(m.h.app_attach_file_icon_video);
      this.eMe.setText(this.bOz.title);
      localwa = this.bOz.rAo;
      if (localwa != null) {
        break label669;
      }
      this.jcm.setVisibility(8);
      setBackBtn(new FavoriteFileDetailUI.8(this));
      this.jcg.setOnClickListener(new FavoriteFileDetailUI.9(this));
      paramBundle = this.bOz.rzv;
      if (!bi.oW(paramBundle)) {
        this.jcf.setOnClickListener(new FavoriteFileDetailUI.10(this, paramBundle));
      }
      this.jch.setOnClickListener(new FavoriteFileDetailUI.11(this));
      this.jcl.setOnClickListener(new FavoriteFileDetailUI.12(this));
      if (this.bUY)
      {
        bool3 = getIntent().getBooleanExtra("key_detail_can_delete", true);
        i = getType();
        if (i != 8) {
          break label962;
        }
        bool1 = this.iWQ.aLd();
      }
    }
    for (;;)
    {
      if ((bool1) || (bool3)) {
        addIconOptionMenu(0, m.i.top_item_desc_more, com.tencent.mm.plugin.fav.ui.m.d.mm_title_btn_menu, new FavoriteFileDetailUI.13(this, bool1, bool3, i));
      }
      eV(false);
      return;
      if (15 == i)
      {
        setMMTitle(m.i.favorite_video);
        findViewById(m.e.video_container).setBackgroundResource(m.b.black);
        this.eMe.setVisibility(8);
        break;
      }
      setMMTitle(m.i.favorite_file);
      break;
      label639:
      this.jci.setImageResource(((ab)com.tencent.mm.kernel.g.l(ab.class)).Bu(this.bOz.rzD));
      break label389;
      label669:
      if (bi.oW(localwa.dyJ))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteFileDetailUI", " there is no attachurl, show more info btn");
        paramBundle = localwa.dyM;
        localObject = localwa.dyN;
        if ((!bi.oW(paramBundle)) && (!bi.oW((String)localObject)))
        {
          this.jcm.setText(paramBundle);
          this.jcm.setVisibility(0);
          this.jcm.setOnClickListener(new FavoriteFileDetailUI.1(this, (String)localObject));
          break label426;
        }
        this.jcm.setVisibility(8);
        break label426;
      }
      Object localObject = getResources().getString(m.i.sns_ad_sight_full);
      paramBundle = (Bundle)localObject;
      if (localwa.rBq / 60 > 0) {
        paramBundle = (String)localObject + getResources().getString(m.i.sns_ad_sight_full_m, new Object[] { Integer.valueOf(localwa.rBq / 60) });
      }
      localObject = paramBundle;
      if (localwa.rBq % 60 > 0) {
        localObject = paramBundle + getResources().getString(m.i.sns_ad_sight_full_s, new Object[] { Integer.valueOf(localwa.rBq % 60) });
      }
      paramBundle = (String)localObject + getResources().getString(m.i.sns_ad_sight_full_end);
      this.jcm.setText(paramBundle);
      this.jcm.setVisibility(0);
      this.jcm.setOnClickListener(new FavoriteFileDetailUI.7(this));
      break label426;
      label962:
      if (i == 15)
      {
        paramBundle = com.tencent.mm.k.g.AT().getValue("SIGHTCannotTransmitForFav");
        if ((this.iWQ.aLd()) && (bi.WU(paramBundle) == 0)) {
          bool1 = true;
        } else {
          bool1 = false;
        }
      }
      else
      {
        bool1 = bool2;
        if (!this.iWQ.aLe())
        {
          bool1 = bool2;
          if (!this.iWQ.aLd()) {
            bool1 = false;
          }
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    setResult(0, getIntent().putExtra("key_activity_browse_time", cql()));
    if (this.hEl != null)
    {
      this.hEl.setVideoCallback(null);
      this.hEl.stop();
      this.hEl.onDetach();
    }
    super.onDestroy();
  }
  
  protected void onPause()
  {
    super.onPause();
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().d(this);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().b(this);
    if (this.hEl != null) {
      this.hEl.stop();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().c(this);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().a(this);
    if (this.hEl != null) {
      this.hEl.start();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */