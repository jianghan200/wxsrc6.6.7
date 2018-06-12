package com.tencent.mm.plugin.fav.ui.detail;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.h;
import com.tencent.mm.plugin.fav.a.h.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMLoadScrollView;

public abstract class BaseFavDetailReportUI
  extends MMActivity
{
  public h.a jcb = new h.a();
  protected boolean jcc;
  private String jcd = null;
  
  public final void F(com.tencent.mm.plugin.fav.a.g paramg)
  {
    if ((paramg != null) && (this.jcb.scene > 0))
    {
      this.jcb.iVH = paramg.field_id;
      this.jcb.type = paramg.field_type;
      this.jcb.source = paramg.field_sourceType;
      this.jcb.timestamp = (paramg.field_sourceCreateTime / 1000L);
      if (this.jcb.timestamp == 0L) {
        this.jcb.timestamp = (paramg.field_updateTime / 1000L);
      }
      if (this.jcb.timestamp == 0L) {
        this.jcb.timestamp = paramg.field_edittime;
      }
      this.jcb.iVI = b.r(paramg);
      this.jcc = true;
    }
  }
  
  protected MMLoadScrollView aMI()
  {
    return null;
  }
  
  public final void dE(long paramLong)
  {
    com.tencent.mm.plugin.fav.a.g localg = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramLong);
    if (localg != null) {
      F(localg);
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramIntent != null))
    {
      long l = paramIntent.getLongExtra("key_activity_browse_time", 0L);
      h.a locala = this.jcb;
      locala.iVK += l;
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.BaseFavDetailReportUI", "onActivityResult subDetailPeriod[%d] subUIBrowserTime[%d]", new Object[] { Long.valueOf(this.jcb.iVK), Long.valueOf(l) });
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jcb.scene = getIntent().getIntExtra("key_detail_fav_scene", 0);
    this.jcb.iVT = getIntent().getIntExtra("key_detail_fav_sub_scene", 0);
    this.jcb.index = getIntent().getIntExtra("key_detail_fav_index", 0);
    this.jcb.bWm = getIntent().getStringExtra("key_detail_fav_query");
    this.jcb.iVU = getIntent().getStringExtra("key_detail_fav_sessionid");
    this.jcb.iVW = getIntent().getStringExtra("key_detail_fav_tags");
    h.a locala = this.jcb;
    if (this.jcb.bWm == null)
    {
      paramBundle = "";
      locala.bWm = paramBundle;
      locala = this.jcb;
      if (this.jcb.iVU != null) {
        break label223;
      }
      paramBundle = "";
      label145:
      locala.iVU = paramBundle;
      locala = this.jcb;
      if (this.jcb.iVW != null) {
        break label234;
      }
    }
    label223:
    label234:
    for (paramBundle = "";; paramBundle = this.jcb.iVW)
    {
      locala.iVW = paramBundle;
      paramBundle = aMI();
      if (paramBundle != null) {
        paramBundle.setOnTopOrBottomListerner(new BaseFavDetailReportUI.1(this));
      }
      if (this.jcb.scene == 0) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.BaseFavDetailReportUI", "report object scene is 0");
      }
      return;
      paramBundle = this.jcb.bWm;
      break;
      paramBundle = this.jcb.iVU;
      break label145;
    }
  }
  
  public void onDestroy()
  {
    if (this.jcc) {
      e.post(new Runnable()
      {
        public final void run()
        {
          BaseFavDetailReportUI.this.jcb.iVV = (((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().pL((int)BaseFavDetailReportUI.this.jcb.iVH) + 1);
          h.a(BaseFavDetailReportUI.this.jcb);
        }
      }, "BaseFavReport");
    }
    setResult(-1, getIntent().putExtra("key_activity_browse_time", cql()));
    super.onDestroy();
  }
  
  public void onPause()
  {
    this.jcb.iVJ = cql();
    String str1 = com.tencent.mm.modelstat.f.RY().ejF;
    h.a locala;
    long l2;
    com.tencent.mm.modelstat.f localf;
    String str2;
    if ((!bi.fS(getClass().getName(), str1)) && (!bi.fS(str1, this.jcd)))
    {
      locala = this.jcb;
      l2 = locala.iVK;
      localf = com.tencent.mm.modelstat.f.RY();
      str2 = com.tencent.mm.modelstat.f.RY().ejF;
      if (localf.ejE == null) {
        break label152;
      }
    }
    label152:
    for (long l1 = ((Long)localf.ejE.get(str2)).longValue();; l1 = 0L)
    {
      locala.iVK = (l1 + l2);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.BaseFavDetailReportUI", "onPause lastClassname[%s] detailPeriod[%d] subDetailPeriod[%d]", new Object[] { str1, Long.valueOf(this.jcb.iVJ), Long.valueOf(this.jcb.iVK) });
      super.onPause();
      return;
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (bi.oW(this.jcd)) {
      this.jcd = com.tencent.mm.modelstat.f.RY().ejF;
    }
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.BaseFavDetailReportUI", "onResume firstResumeClassname[%s]", new Object[] { this.jcd });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/detail/BaseFavDetailReportUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */