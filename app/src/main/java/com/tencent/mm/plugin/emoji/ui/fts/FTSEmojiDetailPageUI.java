package com.tencent.mm.plugin.emoji.ui.fts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.g.a.cs;
import com.tencent.mm.model.au;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.d.a;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.websearch.api.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.tools.k;
import com.tencent.mm.ui.widget.snackbar.b;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public class FTSEmojiDetailPageUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private int bJt;
  private String bKk;
  private String bOs;
  private String bVd;
  private String designerName;
  private int dzF;
  private ProgressBar gVi;
  private EmojiInfo gZe;
  private k gcQ;
  private String ihE;
  private d.a ihx = new d.a()
  {
    public final void h(EmojiInfo paramAnonymousEmojiInfo)
    {
      if ((paramAnonymousEmojiInfo != null) && (FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this) != null) && (FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this).Xh().equals(paramAnonymousEmojiInfo.Xh())))
      {
        x.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "emojiServiceCallback onDownload %s", new Object[] { FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this).Xh() });
        ah.A(new FTSEmojiDetailPageUI.9.1(this));
        return;
      }
      x.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "somethings error.");
    }
  };
  private String ioA;
  private String ioB;
  private String ioC;
  private com.tencent.mm.sdk.b.c ioD = new com.tencent.mm.sdk.b.c() {};
  private com.tencent.mm.ak.a.c.i ioE = new FTSEmojiDetailPageUI.10(this);
  private n.d ioF = new FTSEmojiDetailPageUI.3(this);
  private MMAnimateView ioo;
  private Button iop;
  private Button ioq;
  private TextView ior;
  private ImageView ios;
  private View iot;
  private boolean iou;
  private boolean iov;
  private String iow;
  private String iox;
  private String ioy;
  private String ioz;
  private int scene;
  private int type;
  
  private void aGf()
  {
    EmojiInfo localEmojiInfo2 = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Zy(this.gZe.Xh());
    EmojiInfo localEmojiInfo1 = localEmojiInfo2;
    if (localEmojiInfo2 == null) {
      localEmojiInfo1 = this.gZe;
    }
    if (localEmojiInfo1.field_catalog == EmojiGroupInfo.tcA)
    {
      this.iop.setEnabled(false);
      this.iop.setText(R.l.app_added);
      return;
    }
    this.iop.setText(R.l.emoji_store_add_emoji);
    if (com.tencent.mm.a.e.cn(this.bVd))
    {
      this.iop.setEnabled(true);
      return;
    }
    this.iop.setEnabled(false);
  }
  
  private boolean aGg()
  {
    return (!bi.oW(this.ioC)) && (this.bJt == 1);
  }
  
  private void eo(boolean paramBoolean)
  {
    if (paramBoolean) {
      setMMTitle(this.gZe.getName());
    }
    Object localObject1;
    switch (this.type)
    {
    default: 
      if (FileOp.cn(this.bVd))
      {
        this.gVi.setVisibility(8);
        this.ioo.setVisibility(0);
        localObject1 = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Zy(this.gZe.Xh());
        if ((localObject1 != null) && ((((EmojiInfo)localObject1).field_reserved4 & EmojiInfo.tcW) == EmojiInfo.tcW))
        {
          x.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "file exist: decrypt");
          this.ioo.g(((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a((EmojiInfo)localObject1), "");
          label143:
          aGf();
          localObject1 = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Zy(this.gZe.Xh());
          if (localObject1 != null) {
            break label682;
          }
          localObject1 = this.gZe;
        }
      }
      break;
    }
    label682:
    for (;;)
    {
      if ((((EmojiInfo)localObject1).field_catalog == EmojiInfo.tcH) || (bi.oW(((EmojiInfo)localObject1).field_groupId)) || ((!bi.oW(((EmojiInfo)localObject1).field_groupId)) && (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zl(((EmojiInfo)localObject1).field_groupId))) || (this.type == 4)) {
        this.ioq.setEnabled(true);
      }
      for (;;)
      {
        if (this.iou) {
          this.iop.setVisibility(8);
        }
        return;
        com.tencent.mm.ak.o.Pj().a(this.iox, this.ios);
        this.ior.setText(this.ioy);
        this.bVd = this.gZe.cnF();
        break;
        com.tencent.mm.ak.o.Pj().a(this.ioB, this.ios);
        this.ior.setText(this.designerName);
        this.bVd = this.gZe.cnF();
        break;
        this.ios.setVisibility(8);
        if (!bi.oW(this.ioA))
        {
          this.ior.setText(this.ioA);
          break;
        }
        this.ior.setText(R.l.search_emoji_network_source);
        break;
        x.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "file exist: no decrypt");
        this.ioo.setImageFilePath(this.bVd);
        break label143;
        localObject1 = this.gZe.field_groupId;
        au.DF().a(423, this);
        localObject1 = new com.tencent.mm.plugin.emoji.f.g((String)localObject1, (byte)0);
        au.DF().a((com.tencent.mm.ab.l)localObject1, 0);
        continue;
        if (paramBoolean) {
          if (this.type == 4)
          {
            localObject1 = new File(getCacheDir(), com.tencent.mm.a.g.u(this.gZe.field_encrypturl.getBytes()));
            Object localObject2;
            if (((File)localObject1).exists())
            {
              this.gZe.field_md5 = com.tencent.mm.a.g.m((File)localObject1);
              au.HU();
              localObject2 = EmojiLogic.L(com.tencent.mm.model.c.Gg(), "", this.gZe.field_md5);
              if (!FileOp.cn((String)localObject2)) {
                FileOp.y(((File)localObject1).getAbsolutePath(), (String)localObject2);
              }
              this.bVd = ((String)localObject2);
              eo(false);
            }
            else
            {
              localObject2 = new c.a();
              ((c.a)localObject2).dXy = true;
              ((c.a)localObject2).dXA = ((File)localObject1).getAbsolutePath();
              ((c.a)localObject2).dYc = new Object[] { ((File)localObject1).getAbsolutePath() };
              localObject1 = ((c.a)localObject2).Pt();
              com.tencent.mm.plugin.emoji.model.i.aDZ().a(this.gZe.field_encrypturl, null, (com.tencent.mm.ak.a.a.c)localObject1, this.ioE);
            }
          }
          else
          {
            this.ioo.setVisibility(8);
            this.gVi.setVisibility(0);
            this.iop.setText(R.l.emoji_store_add_emoji);
            this.ioq.setText(R.l.retransmits);
            this.iop.setEnabled(false);
            this.ioq.setEnabled(false);
            com.tencent.mm.plugin.emoji.model.i.aEu().g(this.gZe);
          }
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.emoji.f.g))
    {
      au.DF().b(423, this);
      paramString = (com.tencent.mm.plugin.emoji.f.g)paraml;
      if ((paramString == null) || (bi.oW(paramString.iiv)) || (this.gZe == null) || (bi.oW(this.gZe.field_groupId)) || (!this.gZe.field_groupId.equalsIgnoreCase(paramString.iiv))) {
        break label101;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        this.ioq.setEnabled(true);
      }
    }
    else
    {
      return;
    }
    this.ioq.setEnabled(false);
    return;
    label101:
    x.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "no the same product ID");
  }
  
  protected final int getLayoutId()
  {
    return R.i.fts_emoji_detail_page_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 0) && (paramInt2 == -1))
    {
      Object localObject = paramIntent.getStringExtra("Select_Conv_User");
      String str1 = paramIntent.getStringExtra("custom_send_text");
      paramIntent = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Zy(this.gZe.Xh());
      String str2;
      if (paramIntent == null)
      {
        au.HU();
        str2 = EmojiLogic.L(com.tencent.mm.model.c.Gg(), "", this.gZe.Xh());
        if (com.tencent.mm.a.e.cn(str2))
        {
          if (!com.tencent.mm.sdk.platformtools.o.Wf(str2)) {
            break label273;
          }
          paramInt1 = EmojiInfo.tcJ;
          paramIntent = new EmojiInfo();
          paramIntent.field_md5 = this.gZe.Xh();
          paramIntent.field_catalog = EmojiInfo.tcB;
          paramIntent.field_type = paramInt1;
          paramIntent.field_size = com.tencent.mm.a.e.cm(str2);
          paramIntent.field_temp = 1;
          if (!bi.oW(this.gZe.field_activityid)) {
            paramIntent.field_activityid = this.gZe.field_activityid;
          }
          paramIntent.field_designerID = this.gZe.field_designerID;
          paramIntent.field_thumbUrl = this.gZe.field_thumbUrl;
          paramIntent = com.tencent.mm.plugin.emoji.model.i.aEA().igx.n(paramIntent);
        }
      }
      for (;;)
      {
        localObject = bi.F(bi.aG((String)localObject, "").split(",")).iterator();
        while (((Iterator)localObject).hasNext())
        {
          str2 = (String)((Iterator)localObject).next();
          if (paramIntent != null)
          {
            com.tencent.mm.plugin.emoji.model.i.aEw().a(str2, paramIntent, null);
            if (!bi.oW(str1)) {
              com.tencent.mm.plugin.messenger.a.g.bcT().dF(str1, str2);
            }
          }
        }
        label273:
        paramInt1 = EmojiInfo.tcI;
        break;
        paramIntent.field_designerID = this.gZe.field_designerID;
        paramIntent.field_thumbUrl = this.gZe.field_thumbUrl;
      }
      b.h(this, this.mController.tml.getString(R.l.finish_sent));
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.iop = ((Button)findViewById(R.h.emoji_add_btn));
    this.ioq = ((Button)findViewById(R.h.emoji_send_btn));
    this.ioo = ((MMAnimateView)findViewById(R.h.emoji_image_iv));
    this.gVi = ((ProgressBar)findViewById(R.h.loading_pb));
    this.ior = ((TextView)findViewById(R.h.emoji_source_title_tv));
    this.ios = ((ImageView)findViewById(R.h.emoji_source_iv));
    this.iot = findViewById(R.h.bottom_bar);
    setBackBtn(new FTSEmojiDetailPageUI.1(this));
    this.iop.setOnClickListener(new FTSEmojiDetailPageUI.4(this));
    this.ioq.setOnClickListener(new FTSEmojiDetailPageUI.5(this));
    this.iot.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        FTSEmojiDetailPageUI.b(FTSEmojiDetailPageUI.this);
      }
    });
    addIconOptionMenu(0, R.g.mm_title_btn_menu, new FTSEmojiDetailPageUI.7(this));
    this.type = getIntent().getIntExtra("extra_type", 0);
    this.scene = getIntent().getIntExtra("extra_scence", 0);
    this.gZe = new EmojiInfo();
    this.gZe.field_designerID = getIntent().getStringExtra("id");
    this.gZe.field_name = getIntent().getStringExtra("extra_emoji_name");
    this.gZe.field_aeskey = getIntent().getStringExtra("extra_aeskey");
    this.gZe.field_encrypturl = getIntent().getStringExtra("extra_encrypt_url");
    this.gZe.field_thumbUrl = getIntent().getStringExtra("extra_thumb_url");
    this.gZe.field_md5 = getIntent().getStringExtra("extra_md5");
    this.gZe.field_groupId = getIntent().getStringExtra("extra_product_id");
    this.bKk = this.gZe.field_groupId;
    this.ioy = getIntent().getStringExtra("extra_product_name");
    this.iox = getIntent().getStringExtra("productUrl");
    this.ioz = getIntent().getStringExtra("extra_article_url");
    this.ioA = getIntent().getStringExtra("extra_article_name");
    this.bOs = this.gZe.field_designerID;
    this.designerName = getIntent().getStringExtra("name");
    this.ioB = getIntent().getStringExtra("headurl");
    this.ioC = getIntent().getStringExtra("weapp_user_name");
    this.dzF = getIntent().getIntExtra("weapp_version", 0);
    this.bJt = getIntent().getIntExtra("source_type", 0);
    this.iow = getIntent().getStringExtra("searchID");
    this.ihE = getIntent().getStringExtra("docID");
    this.iou = getIntent().getBooleanExtra("disableAddSticker", false);
    this.iov = getIntent().getBooleanExtra("needSavePhotosAlbum", false);
    paramBundle = getIntent().getStringExtra("activityId");
    if (!bi.oW(paramBundle)) {
      this.gZe.field_activityid = paramBundle;
    }
    com.tencent.mm.sdk.b.a.sFg.b(this.ioD);
    com.tencent.mm.plugin.emoji.model.i.aEu().ihj = this.ihx;
    ad.v(this.scene, this.iow, this.ihE);
    eo(true);
    x.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "localPath=%s", new Object[] { this.bVd });
    ad.v(this.scene, this.iow, this.ihE);
  }
  
  protected void onDestroy()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.ioD);
    com.tencent.mm.plugin.emoji.model.i.aEu().ihj = null;
    super.onDestroy();
  }
  
  protected void onResume()
  {
    super.onResume();
    aGf();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */