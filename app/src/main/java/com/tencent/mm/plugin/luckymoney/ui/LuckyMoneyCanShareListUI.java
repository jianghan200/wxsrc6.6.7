package com.tencent.mm.plugin.luckymoney.ui;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.luckymoney.b.h;
import com.tencent.mm.plugin.luckymoney.b.i;
import com.tencent.mm.plugin.luckymoney.b.z;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.ui.s;
import java.util.LinkedList;
import java.util.List;

public class LuckyMoneyCanShareListUI
  extends LuckyMoneyBaseUI
{
  private boolean ikj = false;
  private List<i> kLz = new LinkedList();
  private MMLoadMoreListView kUS;
  private d kUT;
  private boolean kUl = true;
  private String kUu = "";
  private int tH = 0;
  
  private void bbr()
  {
    this.ikj = true;
    if (this.tH == 0) {
      this.kUu = "";
    }
    l(new z(10, this.tH, 3, "", "v1.0", this.kUu));
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paraml instanceof z))
    {
      bool1 = bool2;
      if (paramInt1 == 0)
      {
        bool1 = bool2;
        if (paramInt2 == 0)
        {
          paramString = (z)paraml;
          paraml = paramString.kRl.kQe;
          this.kUu = paramString.kRb;
          if (paraml != null)
          {
            paramInt1 = 0;
            while (paramInt1 < paraml.size())
            {
              this.kLz.add(paraml.get(paramInt1));
              paramInt1 += 1;
            }
            this.tH += paraml.size();
            this.kUl = paramString.baZ();
            this.ikj = false;
            this.kUT.bw(this.kLz);
          }
          if (!this.kUl) {
            break label157;
          }
          this.kUS.crC();
        }
      }
    }
    for (;;)
    {
      bool1 = true;
      return bool1;
      label157:
      this.kUS.crD();
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.lucky_money_my_record_ui;
  }
  
  protected final void initView()
  {
    setBackBtn(new LuckyMoneyCanShareListUI.1(this));
    this.kUS = ((MMLoadMoreListView)findViewById(a.f.lucky_money_my_record_list));
    setMMTitle(getString(a.i.lucky_money_has_can_share_list_title));
    this.kUT = new e(this.mController.tml);
    this.kUS.setAdapter(this.kUT);
    this.kUS.setOnItemClickListener(new LuckyMoneyCanShareListUI.2(this));
    this.kUS.setOnLoadMoreListener(new LuckyMoneyCanShareListUI.3(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    bbr();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyCanShareListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */