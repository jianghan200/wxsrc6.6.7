package com.tencent.mm.plugin.fts.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.d.c;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public class FTSTalkerMessageUI
  extends FTSBaseUI
{
  private String bWm;
  private int jsZ;
  private String jsp;
  private l jxs;
  
  protected final d a(e parame)
  {
    if (this.jxs == null) {
      this.jxs = new l(this, this.jsp, this.jsZ);
    }
    return this.jxs;
  }
  
  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    super.a(paramString2, paramString2, paramList, paramb);
  }
  
  protected final void aQB()
  {
    super.aQB();
    this.jsp = getIntent().getStringExtra("key_talker_query");
    this.bWm = getIntent().getStringExtra("key_query");
    this.jsZ = getIntent().getIntExtra("Search_Scene", 0);
    x.i("MicroMsg.FTS.FTSTalkerMessageUI", "initSearchData query=%s talkerQuery=%s", new Object[] { this.bWm, this.jsp });
  }
  
  protected final int getLayoutId()
  {
    return n.e.fts_talker_message_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ((n)g.n(n.class)).getFTSImageLoader().aPO();
    paramBundle = new a((byte)0);
    a.a(paramBundle, this.jsp);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramBundle);
    i(this.bWm, localArrayList);
    aQy();
  }
  
  protected void onDestroy()
  {
    this.jxs.finish();
    ((n)g.n(n.class)).getFTSImageLoader().aPM();
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/FTSTalkerMessageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */