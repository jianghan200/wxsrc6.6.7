package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ah;
import com.tencent.mm.ui.e.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SightUploadUI
  extends MMActivity
{
  private String desc = "";
  DisplayMetrics mon;
  private String nQQ = "";
  private String nQR = "";
  private SnsEditText nRk;
  private z nRl = null;
  private LinearLayout nRm;
  private SnsSightUploadSayFooter nRn;
  private int nRo = 0;
  private int nRp = 0;
  private ArrayList<String> nRq;
  private boolean nRr = false;
  private int nRs = 0;
  private boolean nRt = false;
  private long nRu = 0L;
  
  protected final int getLayoutId()
  {
    return i.g.sns_sight_upload_ui;
  }
  
  protected final void initView()
  {
    this.nRk = ((SnsEditText)findViewById(i.f.sns_desc_tv));
    this.nRk.setTextSize(1, ah.fe(this.mController.tml) * this.nRk.getTextSize() / com.tencent.mm.bp.a.getDensity(this.mController.tml));
    int i = this.nRk.getPaddingLeft();
    int j = this.nRm.getPaddingRight();
    int k = this.mon.widthPixels;
    this.nRk.postDelayed(new SightUploadUI.1(this, k - (i + j)), 100L);
    if (!bi.oW(getIntent().getStringExtra(e.h.thz))) {
      this.nRk.setText(getIntent().getStringExtra(e.h.thz));
    }
    this.nRk.setBackListener(new SightUploadUI.2(this));
    this.nRn = ((SnsSightUploadSayFooter)findViewById(i.f.say_footer));
    this.nRn.setMMEditText(this.nRk);
    this.nRn.setVisibility(0);
    setBackBtn(new SightUploadUI.3(this));
    if (getIntent().getBooleanExtra("KSightDraftEntrance", true)) {
      addIconOptionMenu(1, i.i.sight_draft_menu, new SightUploadUI.4(this));
    }
    a(0, getString(i.j.app_send), new SightUploadUI.5(this), s.b.tmZ);
    enableOptionMenu(true);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1) {
      return;
    }
    Object localObject1;
    if ((paramInt1 == 6) || (paramInt1 == 5) || (paramInt1 == 10))
    {
      localObject1 = this.nRn;
      if (paramIntent != null)
      {
        if (paramInt1 != 10) {
          break label290;
        }
        ((SnsSightUploadSayFooter)localObject1).obi.Y(paramIntent);
      }
    }
    label56:
    if ((paramInt1 == 5) && (paramIntent != null))
    {
      paramInt2 = paramIntent.getIntExtra("Ktag_range_index", 0);
      if (paramInt2 < 2) {
        break label480;
      }
      this.nQQ = paramIntent.getStringExtra("Klabel_name_list");
      this.nQR = paramIntent.getStringExtra("Kother_user_name_list");
      localObject1 = Arrays.asList(this.nQQ.split(","));
      if (bi.oW(this.nQR)) {
        break label508;
      }
    }
    label175:
    label257:
    label290:
    label311:
    label480:
    label505:
    label506:
    label508:
    for (paramIntent = Arrays.asList(this.nQR.split(","));; paramIntent = null)
    {
      this.nRq = new ArrayList();
      Object localObject2;
      if ((localObject1 != null) && (((List)localObject1).size() > 0))
      {
        Iterator localIterator = ((List)localObject1).iterator();
        if (localIterator.hasNext())
        {
          localObject2 = (String)localIterator.next();
          localObject2 = com.tencent.mm.plugin.label.a.a.aYK().FD(com.tencent.mm.plugin.label.a.a.aYK().FA((String)localObject2));
          if ((localObject2 != null) && (((List)localObject2).size() != 0)) {
            break label311;
          }
          x.e("MicroMsg.SightUploadUI", "dz: getContactNamesFromLabels,namelist get bu label is null");
        }
      }
      if (localObject1 != null)
      {
        localObject1 = ((List)localObject1).iterator();
        paramInt1 = 0;
        if (((Iterator)localObject1).hasNext())
        {
          if (bi.oW((String)((Iterator)localObject1).next())) {
            break label505;
          }
          paramInt1 += 1;
        }
      }
      for (;;)
      {
        break label257;
        if (paramInt1 != 5) {
          break label506;
        }
        ((SnsSightUploadSayFooter)localObject1).obh.a(paramInt1, paramInt2, paramIntent, null);
        break label56;
        break;
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          if (!this.nRq.contains(str))
          {
            this.nRq.add(str);
            x.d("MicroMsg.SightUploadUI", "dz:name : %s", new Object[] { str });
          }
        }
        break label175;
        this.nRo = paramInt1;
        this.nRp = 0;
        if ((paramIntent != null) && (paramIntent.size() > 0))
        {
          paramIntent = paramIntent.iterator();
          while (paramIntent.hasNext())
          {
            localObject1 = (String)paramIntent.next();
            if (!this.nRq.contains(localObject1))
            {
              this.nRq.add(localObject1);
              this.nRp += 1;
            }
          }
        }
        if (paramInt2 == 2) {}
        for (this.nRr = false; 1 == paramInt2; this.nRr = true)
        {
          this.nRs = 1;
          return;
        }
        this.nRs = 0;
        return;
      }
      break label56;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    e.k(this);
    super.onCreate(paramBundle);
    this.mon = getResources().getDisplayMetrics();
    this.nRl = new al(this);
    this.nRl.G(paramBundle);
    this.nRm = ((LinearLayout)findViewById(i.f.widget_content));
    this.nRm.addView(this.nRl.bBV());
    setMMTitle(i.j.sns_timeline_ui_title);
    getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(i.c.black));
    this.nRt = getIntent().getBooleanExtra("KSnsPostManu", false);
    this.nRu = getIntent().getLongExtra("KTouchCameraTime", 0L);
    initView();
    e.l(this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.nRl.bBW();
    this.nRn.obi.stop();
    SnsSightUploadSayFooter localSnsSightUploadSayFooter = this.nRn;
    if (localSnsSightUploadSayFooter.kXH != null)
    {
      localSnsSightUploadSayFooter.kXH.um();
      localSnsSightUploadSayFooter.kXH.destroy();
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    YC();
  }
  
  public void onResume()
  {
    super.onResume();
    x.d("MicroMsg.SightUploadUI", "onResume");
    SnsSightUploadSayFooter localSnsSightUploadSayFooter = this.nRn;
    if (localSnsSightUploadSayFooter.kXH.getVisibility() == 8) {
      localSnsSightUploadSayFooter.bGc.showVKB();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SightUploadUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */