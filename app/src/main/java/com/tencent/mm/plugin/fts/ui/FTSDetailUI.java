package com.tencent.mm.plugin.fts.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.d.c;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.sdk.platformtools.x;

public class FTSDetailUI
  extends FTSBaseUI
{
  private int jsZ;
  private int jtk;
  private i jwI;
  
  protected final d a(e parame)
  {
    if (this.jwI == null) {
      this.jwI = new i(parame, this.jtk, this.jsZ);
    }
    return this.jwI;
  }
  
  public final void a(com.tencent.mm.plugin.fts.a.d.a.a parama) {}
  
  protected final void aQB()
  {
    this.jtk = getIntent().getIntExtra("detail_type", 0);
    this.jsZ = getIntent().getIntExtra("Search_Scene", 0);
  }
  
  public final String getHint()
  {
    String str2 = m.qm(this.jtk);
    String str1 = str2;
    if (str2 == null) {
      str1 = getString(n.g.app_search);
    }
    return str1;
  }
  
  protected final int getLayoutId()
  {
    return n.e.fts_detail_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ((n)g.n(n.class)).getFTSImageLoader().aPO();
    paramBundle = getIntent().getStringExtra("detail_query");
    this.bWm = paramBundle;
    this.jwl.getFtsEditText().j(paramBundle, null);
    x.i("MicroMsg.FTS.FTSDetailUI", "onCreate query=%s, searchType=%d, kvScene=%d", new Object[] { this.bWm, Integer.valueOf(this.jtk), Integer.valueOf(this.jsZ) });
    aQy();
  }
  
  protected void onDestroy()
  {
    this.jwI.finish();
    ((n)g.n(n.class)).getFTSImageLoader().aPL();
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/FTSDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */