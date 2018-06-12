package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.oc;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.f.k;
import com.tencent.mm.plugin.emoji.f.n;
import com.tencent.mm.plugin.emoji.model.h.a;
import com.tencent.mm.plugin.emoji.model.h.b;
import com.tencent.mm.pluginsdk.ui.chat.l.b;
import com.tencent.mm.pluginsdk.ui.emoji.MMEmojiView;
import com.tencent.mm.protocal.c.act;
import com.tencent.mm.protocal.c.acz;
import com.tencent.mm.protocal.c.add;
import com.tencent.mm.protocal.c.tg;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.p;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.s;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomSmileyPreviewUI
  extends MMActivity
  implements AdapterView.OnItemClickListener, e, h.a, h.b
{
  private ListView CU;
  private final String TAG = "MicroMsg.emoji.CustomSmileyPreviewUI";
  private String bKk;
  private EmojiInfo gZe;
  private com.tencent.mm.sdk.b.c ikA = new CustomSmileyPreviewUI.3(this);
  private com.tencent.mm.plugin.emoji.f.g ikB;
  com.tencent.mm.plugin.emoji.a.f ikI;
  private View ikJ;
  private ImageView ikK;
  private TextView ikL;
  private TextView ikM;
  private act ikN;
  private to ikO = new to();
  private String ikP;
  private TextView ikQ;
  private com.tencent.mm.plugin.emoji.model.h ikR;
  private acz ikS;
  private final int ikT = 131077;
  private long ikU;
  String ikV;
  private String ikW;
  private com.tencent.mm.sdk.b.c ikX = new com.tencent.mm.sdk.b.c() {};
  protected final int ikp = 131074;
  private final int ikq = 131075;
  private final int ikr = 131076;
  private final String iks = "product_id";
  private final String ikt = "progress";
  private final String iku = "status";
  ag mHandler = new CustomSmileyPreviewUI.1(this);
  
  private static void a(CustomSmileyPreviewUI paramCustomSmileyPreviewUI, TextView paramTextView, Bitmap paramBitmap)
  {
    paramBitmap = new BitmapDrawable(paramBitmap);
    int i = (int)paramCustomSmileyPreviewUI.getResources().getDimension(R.f.HintTextSize);
    paramBitmap.setBounds(0, 0, i, i);
    paramTextView.setCompoundDrawables(paramBitmap, null, null, null);
  }
  
  private void a(String paramString, EmojiInfo paramEmojiInfo)
  {
    if ((bi.oW(paramString)) || (paramEmojiInfo == null)) {}
    do
    {
      do
      {
        return;
        if ((bi.oW(paramString)) || (paramEmojiInfo.field_catalog == EmojiGroupInfo.tcz) || (paramEmojiInfo.field_catalog == EmojiGroupInfo.tcy) || ((paramEmojiInfo.field_type == EmojiInfo.tcL) && (paramEmojiInfo.field_type == EmojiInfo.tcM)) || (!com.tencent.mm.plugin.emoji.model.i.aEA().igz.Zv(paramString))) {
          break;
        }
        if (this.CU != null) {
          this.CU.setVisibility(0);
        }
      } while (this.ikI == null);
      if (com.tencent.mm.plugin.emoji.model.i.aEA().igz.Zw(paramString))
      {
        this.ikI.idI = true;
        return;
      }
      this.ikI.idI = false;
      return;
    } while (this.CU == null);
    this.CU.setVisibility(8);
  }
  
  private void aFx()
  {
    this.mHandler.post(new CustomSmileyPreviewUI.9(this));
  }
  
  private com.tencent.mm.plugin.emoji.a.a.c aFy()
  {
    ArrayList localArrayList = new ArrayList();
    ts localts = new ts();
    localts.rwY = this.ikO.rwY;
    localts.jPG = this.ikO.jPG;
    localts.rwQ = this.ikO.rwQ;
    localts.rwV = this.ikO.rwV;
    localts.rwR = this.ikO.rwR;
    localts.rwZ = this.ikO.rwZ;
    localts.rwU = this.ikO.rwU;
    localts.rwT = this.ikO.rwT;
    localts.rxb = this.ikO.rxb;
    localts.rxc = this.ikO.rxc;
    localts.rem = this.ikO.rem;
    localArrayList.add(new com.tencent.mm.plugin.emoji.a.a.f(localts));
    return new com.tencent.mm.plugin.emoji.a.a.c(localArrayList);
  }
  
  public final void M(String paramString1, String paramString2, String paramString3)
  {
    this.ikB = new com.tencent.mm.plugin.emoji.f.g(paramString1, paramString2, paramString3);
    au.DF().a(this.ikB, 0);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    switch (paraml.getType())
    {
    default: 
    case 412: 
    case 521: 
      do
      {
        do
        {
          do
          {
            return;
            paramString = (com.tencent.mm.plugin.emoji.f.l)paraml;
            if (paramInt1 != 0) {
              break;
            }
            if (paramInt2 == 0)
            {
              this.ikO = paramString.aEO();
              if ((this.ikO != null) && (!TextUtils.isEmpty(this.bKk)) && (this.bKk.equals(this.ikO.rem)))
              {
                paramString = aFy();
                if (this.ikI != null) {
                  this.ikI.a(paramString);
                }
                this.mHandler.sendEmptyMessage(0);
                x.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd]" + this.ikO.rem);
                return;
              }
              paraml = this.bKk;
              if (this.ikO == null) {}
              for (paramString = "";; paramString = this.ikO.rem)
              {
                x.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd no same product id] cureent:%s,scene:%s", new Object[] { paraml, paramString });
                return;
              }
            }
          } while (paramInt2 != 1);
          return;
        } while (paramInt2 != 5);
        if ((this.ikO != null) && (paramString.aEO() != null) && (!TextUtils.isEmpty(this.bKk)) && (this.bKk.equals(this.ikO.rem)) && (this.ikO.rwV != paramString.aEO().rwV))
        {
          this.ikO.rwV = paramString.aEO().rwV;
          paramString = aFy();
          if (this.ikI != null) {
            this.ikI.a(paramString);
          }
          this.mHandler.sendEmptyMessage(0);
          x.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd]" + this.ikO.rem);
          return;
        }
        paraml = this.bKk;
        if (this.ikO == null) {}
        for (paramString = "";; paramString = this.ikO.rem)
        {
          x.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd no same product id or PackFlag is same.] cureent:%s,scene:%s", new Object[] { paraml, paramString });
          return;
        }
      } while (paramInt2 != 0);
      this.mHandler.sendEmptyMessage(2);
      this.mHandler.sendEmptyMessageDelayed(131077, 500L);
      return;
    case 411: 
      paramString = (n)paraml;
      com.tencent.mm.plugin.emoji.model.i.aEA().igA.a(12, paramString.aEQ());
      return;
    case 239: 
      this.ikN = ((com.tencent.mm.plugin.emoji.f.i)paraml).aEM();
      aFx();
      return;
    }
    if (paramInt2 == 0)
    {
      paramString = (com.tencent.mm.plugin.emoji.f.j)paraml;
      paraml = (acz)paramString.diG.dIE.dIL;
      if ((paraml != null) && (paraml.rHt != null))
      {
        paraml.rHt.rwD = ((int)(System.currentTimeMillis() / 1000L) + paraml.rHt.rwD);
        com.tencent.mm.plugin.emoji.model.i.aEA().igA.a(paramString.iiI, paraml);
      }
      this.ikS = paraml;
      aFx();
      return;
    }
    x.w("MicroMsg.emoji.CustomSmileyPreviewUI", "get activity failed.");
  }
  
  public final void a(com.tencent.mm.plugin.emoji.a.a parama)
  {
    String str2 = parama.getProductId();
    if (TextUtils.isEmpty(parama.aDq())) {}
    for (String str1 = "";; str1 = parama.aDq())
    {
      x.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", new Object[] { str2, str1, Integer.valueOf(parama.aDp()) });
      this.ikR.a(parama);
      return;
    }
  }
  
  public final void aEs() {}
  
  protected final int getLayoutId()
  {
    return R.i.custom_smiley_preview;
  }
  
  protected final void initView()
  {
    setMMTitle("");
    Object localObject1 = getIntent().getStringExtra("custom_smiley_preview_md5");
    this.ikU = getIntent().getLongExtra("msg_id", 0L);
    this.ikV = getIntent().getStringExtra("msg_sender");
    this.ikW = getIntent().getStringExtra("msg_content");
    x.d("MicroMsg.emoji.CustomSmileyPreviewUI", "[initView] md5:%s", new Object[] { localObject1 });
    String str = bi.oV((String)localObject1);
    if (TextUtils.isEmpty(str))
    {
      x.e("MicroMsg.emoji.CustomSmileyPreviewUI", "CustomSmileyPreviewUI ini fail md5 is fail");
      finish();
    }
    this.ikQ = ((TextView)findViewById(R.h.custom_smiley_emoji_desc));
    Object localObject3 = (MMEmojiView)findViewById(R.h.custom_smiley_preview_emojiview);
    if (com.tencent.mm.sdk.a.b.chp()) {
      ((MMEmojiView)localObject3).setOnClickListener(new CustomSmileyPreviewUI.5(this, (MMEmojiView)localObject3));
    }
    if (localObject3 == null)
    {
      x.e("MicroMsg.emoji.CustomSmileyPreviewUI", "CustomSmileyPreviewUI ini fail emojiView is null.");
      finish();
      return;
    }
    this.gZe = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Zy(str);
    Object localObject4;
    Object localObject5;
    label357:
    int i;
    if (this.gZe.cny())
    {
      localObject1 = EmojiInfo.bt(this, this.gZe.getName());
      if (localObject1 != null)
      {
        ((MMEmojiView)localObject3).a((InputStream)localObject1, this.gZe.getName());
        localObject1 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zf(this.gZe.Xh());
        if ((this.ikQ != null) && (!bi.oW((String)localObject1)))
        {
          this.ikQ.setText((CharSequence)localObject1);
          ((MMEmojiView)localObject3).setContentDescription((CharSequence)localObject1);
        }
        localObject4 = getIntent().getStringExtra("custom_smiley_preview_appid");
        localObject1 = getIntent().getStringExtra("custom_smiley_preview_appname");
        localObject3 = (TextView)findViewById(R.h.appsource);
        localObject5 = com.tencent.mm.pluginsdk.model.app.g.bl((String)localObject4, true);
        if ((localObject5 != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject5).field_appName != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject5).field_appName.trim().length() > 0)) {
          break label1113;
        }
        if ((localObject4 == null) || (((String)localObject4).length() <= 0)) {
          break label1147;
        }
        if ((localObject1 != null) && (((String)localObject1).trim().length() != 0) && (!((String)localObject1).equals("weixinfile")) && (!((String)localObject1).equals("invalid_appname"))) {
          break label1123;
        }
        i = 0;
        label410:
        if (i == 0) {
          break label1147;
        }
        ((TextView)localObject3).setText(getString(R.l.chatting_source_from, new Object[] { com.tencent.mm.pluginsdk.model.app.g.b(this.mController.tml, (com.tencent.mm.pluginsdk.model.app.f)localObject5, (String)localObject1) }));
        ((TextView)localObject3).setVisibility(0);
        localObject1 = new l.b();
        ((l.b)localObject1).appId = ((String)localObject4);
        ((l.b)localObject1).bXS = "message";
        ((View)localObject3).setTag(localObject1);
        ((View)localObject3).setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.l(this));
        localObject1 = com.tencent.mm.pluginsdk.model.app.g.b((String)localObject4, 2, com.tencent.mm.bp.a.getDensity(this));
        if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {
          break label1128;
        }
        a(this, (TextView)localObject3, (Bitmap)localObject1);
        label530:
        setBackBtn(new CustomSmileyPreviewUI.6(this));
        if ((this.gZe.field_catalog == EmojiInfo.tcH) || (this.gZe.cny())) {
          break label1589;
        }
      }
    }
    label934:
    label975:
    label1113:
    label1123:
    label1128:
    label1147:
    label1565:
    label1577:
    label1589:
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2;
      if ((this.gZe.field_catalog != EmojiInfo.tcH) && (!bi.oW(this.gZe.field_groupId)))
      {
        bool2 = bool1;
        if (!bi.oW(this.gZe.field_groupId))
        {
          bool2 = bool1;
          if (!((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zl(this.gZe.field_groupId)) {}
        }
      }
      else
      {
        bool2 = true;
      }
      addIconOptionMenu(0, R.g.mm_title_btn_menu, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          CustomSmileyPreviewUI.f(CustomSmileyPreviewUI.this);
          return true;
        }
      });
      showOptionMenu(bool2);
      this.ikJ = findViewById(R.h.designer_bar_container);
      this.ikK = ((ImageView)this.ikJ.findViewById(R.h.designer_icon));
      this.ikL = ((TextView)this.ikJ.findViewById(R.h.designer_title));
      this.ikM = ((TextView)this.ikJ.findViewById(R.h.designer_detail));
      this.ikJ.setVisibility(8);
      if ((this.gZe != null) && (!bi.oW(this.gZe.field_designerID)))
      {
        localObject1 = this.gZe.field_designerID;
        this.ikN = com.tencent.mm.plugin.emoji.model.i.aEA().igD.ZC((String)localObject1);
        localObject1 = new com.tencent.mm.plugin.emoji.f.i(this.gZe.field_designerID);
        au.DF().a((com.tencent.mm.ab.l)localObject1, 0);
      }
      if ((this.gZe != null) && (!bi.oW(this.gZe.field_activityid)))
      {
        localObject1 = this.gZe.field_activityid;
        this.ikS = com.tencent.mm.plugin.emoji.model.i.aEA().igA.ZI((String)localObject1);
        localObject1 = this.gZe.field_activityid;
        localObject3 = this.gZe.field_md5;
        if ((this.ikS == null) || ((this.ikS != null) && (this.ikS.rHt != null) && (this.ikS.rHt.rwD < System.currentTimeMillis() / 1000L)))
        {
          localObject1 = new com.tencent.mm.plugin.emoji.f.j((String)localObject1, (String)localObject3);
          au.DF().a((com.tencent.mm.ab.l)localObject1, 0);
        }
      }
      else
      {
        aFx();
        this.ikJ.setOnClickListener(new CustomSmileyPreviewUI.8(this));
        localObject4 = com.tencent.mm.plugin.report.service.h.mEJ;
        localObject5 = this.bKk;
        if (this.gZe != null) {
          break label1565;
        }
        localObject1 = "";
        if (this.gZe != null) {
          break label1577;
        }
      }
      for (localObject3 = "";; localObject3 = this.gZe.field_activityid)
      {
        ((com.tencent.mm.plugin.report.service.h)localObject4).h(12067, new Object[] { Integer.valueOf(2), localObject5, str, localObject1, localObject3 });
        return;
        if (this.gZe == null) {}
        for (localObject1 = "null";; localObject1 = this.gZe.getName())
        {
          x.e("MicroMsg.emoji.CustomSmileyPreviewUI", "input stream is null. emoji name is:%s", new Object[] { localObject1 });
          break;
        }
        ((MMEmojiView)localObject3).a(this.gZe, "");
        if ((this.gZe == null) || (this.gZe.cnE())) {
          break;
        }
        com.tencent.mm.plugin.emoji.e.c.aDJ();
        com.tencent.mm.plugin.emoji.e.c.a(this.gZe, true);
        break;
        localObject1 = ((com.tencent.mm.pluginsdk.model.app.f)localObject5).field_appName;
        break label357;
        i = 1;
        break label410;
        a(this, (TextView)localObject3, BitmapFactory.decodeResource(getResources(), R.g.nosdcard_watermark_icon));
        break label530;
        ((TextView)localObject3).setVisibility(8);
        this.bKk = this.gZe.field_groupId;
        localObject1 = new k(this.bKk);
        au.DF().a((com.tencent.mm.ab.l)localObject1, 0);
        this.CU = ((ListView)findViewById(16908298));
        this.ikI = new com.tencent.mm.plugin.emoji.a.f(this.mController.tml);
        this.ikI.ieo = this;
        this.ikI.idH = true;
        this.ikI.idK = false;
        this.CU.setOnItemClickListener(this);
        this.CU.setAdapter(this.ikI);
        this.ikI.iem = this.CU;
        if (!bi.oW(this.bKk))
        {
          localObject1 = com.tencent.mm.plugin.emoji.model.i.aEA().igB.ZE(this.bKk);
          if ((localObject1 != null) && (((com.tencent.mm.storage.emotion.i)localObject1).field_content != null)) {
            localObject3 = new add();
          }
        }
        try
        {
          ((add)localObject3).aG(((com.tencent.mm.storage.emotion.i)localObject1).field_content);
          this.ikO = ((add)localObject3).rHx;
          this.ikP = ((com.tencent.mm.storage.emotion.i)localObject1).field_lan;
          if ((this.ikO == null) || (bi.oW(this.ikP)) || (!this.ikP.equalsIgnoreCase(w.fD(this.mController.tml))))
          {
            localObject1 = new com.tencent.mm.plugin.emoji.f.l(this.bKk, 1);
            au.DF().a((com.tencent.mm.ab.l)localObject1, 0);
            this.ikR = new com.tencent.mm.plugin.emoji.model.h();
            this.ikR.gKE = this;
            this.ikR.ihz = this.ikI;
            this.ikR.ihC = 9;
            this.ikR.ihF = this;
            a(this.bKk, this.gZe);
          }
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            x.e("MicroMsg.emoji.CustomSmileyPreviewUI", "exception:%s", new Object[] { bi.i(localIOException) });
            continue;
            localObject2 = aFy();
            if (this.ikI != null) {
              this.ikI.a((com.tencent.mm.plugin.emoji.a.a.c)localObject2);
            }
            localObject2 = new com.tencent.mm.plugin.emoji.f.l(this.bKk, 1, this.ikO.hcD);
            au.DF().a((com.tencent.mm.ab.l)localObject2, 0);
          }
        }
        x.i("MicroMsg.emoji.CustomSmileyPreviewUI", "no need to load emoji activity");
        break label934;
        Object localObject2 = this.gZe.field_designerID;
        break label975;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    au.DF().a(412, this);
    au.DF().a(521, this);
    au.DF().a(411, this);
    au.DF().a(239, this);
    au.DF().a(368, this);
    com.tencent.mm.sdk.b.a.sFg.b(this.ikA);
    com.tencent.mm.sdk.b.a.sFg.b(this.ikX);
    initView();
  }
  
  protected void onDestroy()
  {
    au.DF().b(412, this);
    au.DF().b(521, this);
    au.DF().b(411, this);
    au.DF().b(239, this);
    au.DF().b(368, this);
    com.tencent.mm.sdk.b.a.sFg.c(this.ikA);
    com.tencent.mm.sdk.b.a.sFg.c(this.ikX);
    super.onDestroy();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((this.ikI == null) || (paramInt < 0) || (paramInt >= this.ikI.getCount())) {
      return;
    }
    paramAdapterView = this.ikI.oG(paramInt);
    paramView = new Intent();
    paramView.setClass(this, EmojiStoreDetailUI.class);
    Object localObject = paramAdapterView.iez;
    if (localObject == null) {
      paramAdapterView = null;
    }
    for (;;)
    {
      startActivity(paramAdapterView);
      return;
      paramView.putExtra("extra_id", ((ts)localObject).rem);
      paramView.putExtra("extra_name", ((ts)localObject).rwQ);
      paramView.putExtra("extra_copyright", ((ts)localObject).rxa);
      paramView.putExtra("extra_coverurl", ((ts)localObject).rwY);
      paramView.putExtra("extra_description", ((ts)localObject).rwR);
      paramView.putExtra("extra_price", ((ts)localObject).rwT);
      paramView.putExtra("extra_type", ((ts)localObject).rwU);
      paramView.putExtra("extra_flag", ((ts)localObject).rwV);
      paramView.putExtra("preceding_scence", 4);
      paramView.putExtra("call_by", 1);
      paramView.putExtra("download_entrance_scene", 9);
      paramView.putExtra("check_clickflag", true);
      paramView.putExtra("extra_status", paramAdapterView.mStatus);
      paramView.putExtra("extra_progress", paramAdapterView.pF);
      localObject = getIntent().getStringExtra("to_talker_name");
      paramAdapterView = paramView;
      if (!bi.oW((String)localObject))
      {
        paramView.putExtra("to_talker_name", (String)localObject);
        paramAdapterView = paramView;
      }
    }
  }
  
  public void onPause()
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */