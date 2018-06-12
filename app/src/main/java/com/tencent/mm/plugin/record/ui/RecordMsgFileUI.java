package com.tencent.mm.plugin.record.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.k.e;
import com.tencent.mm.model.ad;
import com.tencent.mm.model.au;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.tools.a;
import com.tencent.mm.pluginsdk.ui.tools.o;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wa;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.s;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RecordMsgFileUI
  extends MMActivity
  implements com.tencent.mm.plugin.record.a.c
{
  private long bJC;
  private vx bOz;
  private ag dvh;
  private TextView eMe;
  private ProgressBar eVR;
  private TextView gmo;
  private com.tencent.mm.pluginsdk.ui.tools.f hEl = null;
  private Button jcf;
  private Button jcg;
  private Button jch;
  private MMImageView jci;
  private TextView jcj;
  private View jck;
  private View jcl;
  private boolean jcp = false;
  private boolean jct = false;
  private boolean jcu = false;
  private String mediaId;
  private com.tencent.mm.plugin.record.b.f mtf;
  
  private void aMK()
  {
    this.jch.setVisibility(8);
    this.jcf.setVisibility(8);
    this.jcg.setVisibility(8);
    this.jck.setVisibility(8);
    this.gmo.setVisibility(0);
    if (this.bOz.bjS == 4)
    {
      this.gmo.setGravity(17);
      this.gmo.setText(R.l.favorite_out_of_date_video);
      return;
    }
    this.gmo.setGravity(17);
    this.gmo.setText(R.l.favorite_out_of_date_file);
  }
  
  private void aML()
  {
    this.jch.setVisibility(8);
    this.jcf.setVisibility(8);
    this.jcg.setVisibility(8);
    this.gmo.setVisibility(8);
    this.jck.setVisibility(0);
    c(n.getRecordMsgCDNStorage().Kr(this.mediaId));
  }
  
  private void aMM()
  {
    this.jck.setVisibility(8);
    this.jcg.setVisibility(8);
    if (bi.oW(this.bOz.rzv)) {
      this.jcf.setVisibility(8);
    }
    for (;;)
    {
      this.jch.setVisibility(0);
      this.jch.setText(R.l.favorite_item_download);
      this.gmo.setVisibility(8);
      return;
      this.jcf.setVisibility(0);
    }
  }
  
  private void aMN()
  {
    if (this.jct) {
      return;
    }
    this.jct = true;
    Intent localIntent = new Intent();
    localIntent.putExtra("key_detail_fav_path", com.tencent.mm.plugin.record.b.h.c(this.bOz, this.bJC));
    localIntent.putExtra("key_detail_fav_thumb_path", com.tencent.mm.plugin.record.b.h.f(this.bOz, this.bJC));
    localIntent.putExtra("key_detail_fav_video_duration", this.bOz.duration);
    localIntent.putExtra("key_detail_statExtStr", this.bOz.bZN);
    localIntent.putExtra("key_detail_fav_video_scene_from", 1);
    b.a(this, ".ui.detail.FavoriteVideoPlayUI", localIntent);
    finish();
  }
  
  private void bqJ()
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
      String str = com.tencent.mm.plugin.record.b.h.c(this.bOz, this.bJC);
      x.d("MicroMsg.RecordMsgFileUI", com.tencent.mm.compatible.util.g.Ab() + " initView: fullpath:" + str);
      ViewGroup localViewGroup = (ViewGroup)findViewById(R.h.video_container);
      this.hEl = o.fb(this.mController.tml);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams.addRule(13);
      localViewGroup.addView((View)this.hEl, 0, localLayoutParams);
      this.hEl.setVideoCallback(new RecordMsgFileUI.12(this));
      x.d("MicroMsg.RecordMsgFileUI", com.tencent.mm.compatible.util.g.Ab() + " initView :" + str);
      if (str != null)
      {
        this.hEl.stop();
        this.hEl.setVideoPath(str);
      }
      x.d("MicroMsg.RecordMsgFileUI", com.tencent.mm.compatible.util.g.Ab() + " initView");
      if (au.vv() != null) {
        au.vv().xv();
      }
    }
    if ((getType() == 15) || (getType() == 4))
    {
      if (!this.jcu)
      {
        this.jck.setVisibility(8);
        this.jch.setVisibility(8);
        this.jcf.setVisibility(8);
        this.jcg.setVisibility(0);
        this.jcg.setText(R.l.favorite_item_preview);
        this.gmo.setVisibility(8);
        aMN();
      }
      return;
    }
    this.jck.setVisibility(8);
    this.jch.setVisibility(4);
    if (bi.oW(this.bOz.rzv)) {
      this.jcf.setVisibility(8);
    }
    for (;;)
    {
      this.jcg.setVisibility(0);
      this.gmo.setVisibility(0);
      return;
      this.jcf.setVisibility(0);
    }
  }
  
  private String bqK()
  {
    Object localObject = new File(com.tencent.mm.plugin.record.b.h.f(this.bOz, this.bJC));
    if (((File)localObject).exists()) {
      return ((File)localObject).getAbsolutePath();
    }
    localObject = new StringBuilder();
    au.HU();
    return com.tencent.mm.model.c.Gm() + "web/" + com.tencent.mm.a.g.u(bi.aG(this.bOz.bJv, "").getBytes());
  }
  
  private void c(com.tencent.mm.plugin.record.a.f paramf)
  {
    final int j;
    final int i;
    final int k;
    if (paramf != null)
    {
      j = (int)(paramf.field_offset / Math.max(1, paramf.field_totalLen) * 100.0F);
      i = paramf.field_offset;
      k = paramf.field_totalLen;
    }
    for (;;)
    {
      this.dvh.post(new Runnable()
      {
        public final void run()
        {
          RecordMsgFileUI.n(RecordMsgFileUI.this).setProgress(j);
          RecordMsgFileUI.o(RecordMsgFileUI.this).setText(RecordMsgFileUI.this.getString(R.l.favorite_downloading, new Object[] { bi.aj(i), bi.aj(k) }));
        }
      });
      return;
      k = (int)this.bOz.rzJ;
      i = 0;
      j = 0;
    }
  }
  
  private int getType()
  {
    int j = this.bOz.bjS;
    int i = j;
    if (j == 15) {
      i = 4;
    }
    return i;
  }
  
  public final void a(int paramInt, com.tencent.mm.plugin.record.a.f paramf)
  {
    if (paramf == null) {
      x.w("MicroMsg.RecordMsgFileUI", "on cdn info changed, but cdn info is null");
    }
    do
    {
      return;
      x.v("MicroMsg.RecordMsgFileUI", "cur mediaid[%s], notify mediaid[%s]", new Object[] { this.mediaId, paramf.field_mediaId });
    } while (!this.mediaId.equals(paramf.field_mediaId));
    switch (paramf.field_status)
    {
    default: 
      c(paramf);
      return;
    case 2: 
      this.dvh.post(new RecordMsgFileUI.4(this));
      return;
    case 4: 
      this.dvh.post(new RecordMsgFileUI.5(this));
      return;
    }
    this.dvh.post(new RecordMsgFileUI.6(this));
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.file_download_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    a.a(this, paramInt1, paramInt2, paramIntent, true, R.l.download_no_match_msg, R.l.download_no_match_title, 5);
    if (paramInt2 != -1) {
      break label27;
    }
    label27:
    while (paramInt1 != 1001) {
      return;
    }
    final Object localObject1;
    if (paramIntent == null)
    {
      localObject1 = null;
      label42:
      if (paramIntent != null) {
        break label174;
      }
    }
    final Object localObject2;
    label174:
    for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
    {
      localObject2 = com.tencent.mm.ui.base.h.a(this.mController.tml, getString(R.l.favorite_forward_tips), false, null);
      x.d("MicroMsg.RecordMsgFileUI", "do share msg, fav msg type %d", new Object[] { Integer.valueOf(getType()) });
      localObject2 = new RecordMsgFileUI.13(this, (Dialog)localObject2);
      if (bi.oW((String)localObject1)) {
        break;
      }
      localObject1 = bi.F(((String)localObject1).split(","));
      if ((getType() != 4) && (getType() != 15)) {
        break label185;
      }
      au.Em().H(new RecordMsgFileUI.14(this, (List)localObject1, paramIntent, (Runnable)localObject2));
      return;
      localObject1 = paramIntent.getStringExtra("Select_Conv_User");
      break label42;
    }
    label185:
    au.Em().H(new Runnable()
    {
      public final void run()
      {
        Object localObject1 = com.tencent.mm.plugin.record.b.h.c(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this));
        Object localObject2 = new WXFileObject();
        ((WXFileObject)localObject2).setFilePath((String)localObject1);
        localObject1 = new WXMediaMessage();
        ((WXMediaMessage)localObject1).mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
        ((WXMediaMessage)localObject1).title = RecordMsgFileUI.a(RecordMsgFileUI.this).title;
        ((WXMediaMessage)localObject1).description = RecordMsgFileUI.a(RecordMsgFileUI.this).desc;
        ((WXMediaMessage)localObject1).thumbData = bi.readFromFile(com.tencent.mm.plugin.record.b.h.f(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this)));
        localObject2 = localObject1.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          l.a((WXMediaMessage)localObject1, "", "", str, 3, null);
          com.tencent.mm.plugin.messenger.a.g.bcT().dF(paramIntent, str);
        }
        ah.A(localObject2);
      }
      
      public final String toString()
      {
        return super.toString() + "|onActivityResult2";
      }
    });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dvh = new ag();
    this.mtf = new com.tencent.mm.plugin.record.b.f();
    this.bJC = getIntent().getLongExtra("message_id", -1L);
    paramBundle = getIntent().getStringExtra("record_data_id");
    Object localObject = com.tencent.mm.plugin.record.b.h.Ks(getIntent().getStringExtra("record_xml"));
    if (localObject == null)
    {
      x.w("MicroMsg.RecordMsgFileUI", "get record msg data error, empty");
      finish();
      return;
    }
    localObject = ((com.tencent.mm.protocal.b.a.c)localObject).dzs.iterator();
    while (((Iterator)localObject).hasNext())
    {
      vx localvx = (vx)((Iterator)localObject).next();
      if (localvx.jdM.equals(paramBundle)) {
        this.bOz = localvx;
      }
    }
    if (this.bOz == null)
    {
      x.w("MicroMsg.RecordMsgFileUI", "get data error, empty");
      finish();
      return;
    }
    this.mediaId = com.tencent.mm.plugin.record.b.h.e(this.bOz.jdM, this.bJC, true);
    this.jcf = ((Button)findViewById(R.h.preview_btn));
    this.jcg = ((Button)findViewById(R.h.open_btn));
    this.jch = ((Button)findViewById(R.h.download_btn));
    this.jci = ((MMImageView)findViewById(R.h.icon_iv));
    this.eMe = ((TextView)findViewById(R.h.name_tv));
    this.gmo = ((TextView)findViewById(R.h.tips_tv));
    this.jcl = findViewById(R.h.download_stop_btn);
    this.jck = findViewById(R.h.download_progress_area);
    this.eVR = ((ProgressBar)findViewById(R.h.download_pb));
    this.jcj = ((TextView)findViewById(R.h.download_progress_tips));
    label347:
    label482:
    int i;
    label510:
    int j;
    if (4 == getType())
    {
      setMMTitle(R.l.favorite_video);
      if (getType() != 4) {
        break label602;
      }
      this.jci.setImageResource(R.k.app_attach_file_icon_video);
      this.eMe.setText(this.bOz.title);
      setBackBtn(new RecordMsgFileUI.1(this));
      this.jcg.setOnClickListener(new RecordMsgFileUI.7(this));
      paramBundle = this.bOz.rzv;
      if (!bi.oW(paramBundle)) {
        this.jcf.setOnClickListener(new RecordMsgFileUI.8(this, paramBundle));
      }
      this.jch.setOnClickListener(new RecordMsgFileUI.9(this));
      this.jcl.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          RecordMsgFileUI.g(RecordMsgFileUI.this);
        }
      });
      if ((getType() != 15) || (bi.WU(com.tencent.mm.k.g.AT().getValue("SightForwardEnable")) == 1)) {
        break label622;
      }
      x.w("MicroMsg.RecordMsgFileUI", "can not retransmit sight msg");
      if ((!bi.oW(this.bOz.rzo)) && (!bi.oW(this.bOz.rzq))) {
        break label641;
      }
      i = 1;
      if ((!bi.oW(this.bOz.rAG)) && (!bi.oW(this.bOz.rAD))) {
        break label646;
      }
      j = 1;
      label538:
      if ((i != 0) || (j != 0)) {
        break label651;
      }
      aMK();
    }
    for (;;)
    {
      n.getRecordMsgCDNStorage().a(this);
      return;
      if (15 == getType())
      {
        setMMTitle(R.l.favorite_sight);
        findViewById(R.h.video_container).setBackgroundResource(R.e.black);
        break;
      }
      setMMTitle(R.l.favorite_file);
      break;
      label602:
      this.jci.setImageResource(com.tencent.mm.pluginsdk.c.Sz(this.bOz.rzD));
      break label347;
      label622:
      addIconOptionMenu(0, R.g.mm_title_btn_menu, new RecordMsgFileUI.11(this));
      break label482;
      label641:
      i = 0;
      break label510;
      label646:
      j = 0;
      break label538;
      label651:
      if (!com.tencent.mm.plugin.record.b.h.d(this.bOz, this.bJC)) {
        break label677;
      }
      enableOptionMenu(true);
      bqJ();
    }
    label677:
    paramBundle = n.getRecordMsgCDNStorage().Kr(this.mediaId);
    if ((paramBundle == null) || (2 == paramBundle.field_status)) {
      aMM();
    }
    for (;;)
    {
      enableOptionMenu(false);
      break;
      if (4 == paramBundle.field_status)
      {
        aMK();
      }
      else if ((paramBundle.field_status == 0) || (1 == paramBundle.field_status))
      {
        aML();
      }
      else
      {
        x.w("MicroMsg.RecordMsgFileUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
        aMM();
      }
    }
  }
  
  protected void onDestroy()
  {
    if (this.hEl != null)
    {
      this.hEl.setVideoCallback(null);
      this.hEl.stop();
      this.hEl.onDetach();
      if (au.vv() != null) {
        au.vv().xu();
      }
    }
    super.onDestroy();
    n.getRecordMsgCDNStorage().b(this);
    this.mtf.destory();
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.hEl != null) {
      this.hEl.stop();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.hEl != null) {
      this.hEl.start();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/record/ui/RecordMsgFileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */