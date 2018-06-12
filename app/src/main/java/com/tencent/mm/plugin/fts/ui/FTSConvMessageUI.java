package com.tencent.mm.plugin.fts.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import java.util.ArrayList;
import java.util.List;

public class FTSConvMessageUI
  extends FTSBaseUI
{
  private String bWm;
  private int jsZ;
  private String jso;
  private g jwx;
  
  protected final d a(e parame)
  {
    if (this.jwx == null) {
      this.jwx = new g(parame, this.jso, this.jsZ);
    }
    return this.jwx;
  }
  
  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    super.a(paramString2, paramString2, paramList, paramb);
  }
  
  protected final void aQB()
  {
    super.aQB();
    this.jso = getIntent().getStringExtra("key_conv");
    this.bWm = getIntent().getStringExtra("key_query");
    this.jsZ = getIntent().getIntExtra("Search_Scene", 0);
  }
  
  public final boolean anx()
  {
    return false;
  }
  
  public final String getHint()
  {
    return getString(n.g.search_talker_page_hint);
  }
  
  protected final int getLayoutId()
  {
    return n.e.fts_detail_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new a((byte)0);
    a.a(paramBundle, com.tencent.mm.plugin.fts.a.d.Bc(this.jso));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramBundle);
    i(this.bWm, localArrayList);
    aQy();
  }
  
  protected void onDestroy()
  {
    this.jwx.finish();
    super.onDestroy();
  }
  
  private final class a
    implements a.b
  {
    private String daA;
    
    private a() {}
    
    public final int compareTo(Object paramObject)
    {
      return 0;
    }
    
    public final String getTagName()
    {
      return this.daA;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/FTSConvMessageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */