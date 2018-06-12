package com.tencent.mm.plugin.luckymoney.appbrand.a;

import android.content.Context;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ad;
import java.util.LinkedList;
import java.util.List;

public enum g
{
  public int kKQ = 100;
  public double kKR = 200.0D;
  public double kKS = 0.01D;
  public double kKT = 2000.0D;
  public double kKU = 200.0D;
  public String kKV = "¥";
  public String kKW = ad.getContext().getString(a.i.lucky_money_amount_unit_title);
  private List<Object> kKX = new LinkedList();
  
  private g() {}
  
  public final String toString()
  {
    return "WxaLuckyMoneyConfig{maxTotalNum=" + this.kKQ + ", perPersonMaxValue=" + this.kKR + ", perMinValue=" + this.kKS + ", maxTotalAmount=" + this.kKT + ", mListener=" + this.kKX + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */