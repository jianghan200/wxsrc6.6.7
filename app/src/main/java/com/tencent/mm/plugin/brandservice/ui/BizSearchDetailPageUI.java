package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.tencent.mm.plugin.brandservice.b.d;
import com.tencent.mm.plugin.brandservice.b.e;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.o;
import com.tencent.mm.ui.tools.o.b;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BizSearchDetailPageUI
  extends MMActivity
  implements o.b
{
  private o hol;
  private BizSearchResultItemContainer hom;
  private long hon;
  private String hoo;
  private int hop;
  private int hoq;
  private Runnable hor = new BizSearchDetailPageUI.1(this);
  private int tH;
  
  public final void WW()
  {
    finish();
  }
  
  public final void WX() {}
  
  public final void WY() {}
  
  public final void WZ() {}
  
  protected final int getLayoutId()
  {
    return b.e.biz_search_detail_page_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = true;
    super.onCreate(paramBundle);
    setBackBtn(new BizSearchDetailPageUI.2(this));
    paramBundle = getIntent();
    this.hon = paramBundle.getLongExtra("businessType", 0L);
    boolean bool2 = paramBundle.getBooleanExtra("showEditText", false);
    this.hop = paramBundle.getIntExtra("fromScene", 0);
    this.hoq = paramBundle.getIntExtra("addContactScene", 35);
    Object localObject = paramBundle.getStringExtra("title");
    String str = paramBundle.getStringExtra("keyword");
    boolean bool3 = paramBundle.getBooleanExtra("showCatalog", false);
    this.tH = paramBundle.getIntExtra("offset", 0);
    if ((this.hon == 0L) || (bi.oW(str)))
    {
      x.e("MicroMsg.BrandService.BizSearchDetailPageUI", "businessType(%d) or queryStr is nil.", new Object[] { Long.valueOf(this.hon) });
      finish();
      return;
    }
    paramBundle = paramBundle.getByteArrayExtra("result");
    if (paramBundle != null) {}
    for (;;)
    {
      int i;
      try
      {
        paramBundle = (ju)new ju().aG(paramBundle);
        if (paramBundle == null) {
          break label538;
        }
        i = 1;
        this.hom = ((BizSearchResultItemContainer)findViewById(b.d.searchResultItemContainer));
        this.hom.setAdapter(new c(this));
        this.hom.setBusinessTypes(new long[] { this.hon });
        this.hom.setMode(1);
        this.hom.setDisplayArgs$25decb5(bool3);
        this.hom.setScene(this.hop);
        this.hom.setAddContactScene(this.hoq);
        this.hom.setReporter(new BizSearchDetailPageUI.3(this));
        if (bool2)
        {
          this.hol = new o();
          a(this.hol);
          this.hol.mv(false);
          this.hol.clearFocus();
          this.hol.setSearchContent(str);
          this.hol.uBw = this;
          this.hom.setOnTouchListener(new BizSearchDetailPageUI.4(this));
          if (i == 0) {
            break label531;
          }
          localObject = this.hom;
          i = this.tH;
          ((BizSearchResultItemContainer)localObject).reset();
          if (paramBundle != null) {
            break label416;
          }
          x.e("MicroMsg.BrandService.BizSearchResultItemContainer", "setFirst page content failed, content is null.");
          return;
        }
      }
      catch (IOException paramBundle)
      {
        x.printErrStackTrace("MicroMsg.BrandService.BizSearchDetailPageUI", paramBundle, "", new Object[0]);
        finish();
        return;
      }
      if (!bi.oW((String)localObject))
      {
        setMMTitle((String)localObject);
        continue;
        label416:
        ((BizSearchResultItemContainer)localObject).hoJ.bHt = str;
        ((BizSearchResultItemContainer)localObject).setBusinessTypes(new long[] { paramBundle.rll });
        ((BizSearchResultItemContainer)localObject).hoJ.dYU = paramBundle.rlm;
        ((BizSearchResultItemContainer)localObject).hoO = i;
        LinkedList localLinkedList = new LinkedList();
        localLinkedList.add(paramBundle);
        ((BizSearchResultItemContainer)localObject).hoH.d(str, localLinkedList);
        ((BizSearchResultItemContainer)localObject).hoJ.offset = (i + paramBundle.rjC);
        paramBundle = ((BizSearchResultItemContainer)localObject).hoJ;
        if (!((BizSearchResultItemContainer)localObject).hoH.isEmpty()) {}
        for (;;)
        {
          paramBundle.hoX = bool1;
          return;
          bool1 = false;
        }
        label531:
        pk(str);
        return;
        label538:
        i = 0;
        continue;
        i = 0;
        paramBundle = null;
      }
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    if (this.hol != null) {
      this.hol.a(this, paramMenu);
    }
    return true;
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.hol != null) {
      this.hol.clearFocus();
    }
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    if (this.hol != null) {
      this.hol.a(this, paramMenu);
    }
    return true;
  }
  
  public final boolean pj(String paramString)
  {
    return false;
  }
  
  public final void pk(String paramString)
  {
    if (bi.oW(paramString)) {}
    do
    {
      return;
      paramString = paramString.trim();
    } while (paramString.equals(this.hoo));
    ah.M(this.hor);
    this.hoo = paramString;
    ah.i(this.hor, 400L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/BizSearchDetailPageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */