package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.plugin.order.model.a;
import com.tencent.mm.plugin.order.model.a.a;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.List;

public final class b
  implements a.a
{
  public final List<Preference> a(Context paramContext, final com.tencent.mm.ui.base.preference.f paramf, final MallTransactionObject paramMallTransactionObject)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramMallTransactionObject.bCK == 2) {}
    final Object localObject1;
    for (int i = 1;; i = 0)
    {
      if ((!bi.oW(paramMallTransactionObject.lNX)) && (!bi.oW(paramMallTransactionObject.fqJ)))
      {
        localObject1 = new d(paramContext);
        ((d)localObject1).iAb = paramMallTransactionObject.fqJ;
        ((d)localObject1).mName = paramMallTransactionObject.lNX;
        ((d)localObject1).mOnClickListener = new b.1(this, paramMallTransactionObject, paramContext);
        localArrayList.add(localObject1);
        localArrayList.add(new PreferenceSmallCategory(paramContext));
      }
      x.i("MicroMsg.FetchOrderPrefFactory", "getOrderPrefList() chargeFee is " + paramMallTransactionObject.lOm + " and fetchTotalFee is " + paramMallTransactionObject.lOw);
      if (TextUtils.isEmpty(paramMallTransactionObject.lOm)) {
        break;
      }
      localObject1 = new i(paramContext);
      ((i)localObject1).lQC = e.e(paramMallTransactionObject.lOw, paramMallTransactionObject.lNV);
      ((i)localObject1).setTitle(paramContext.getString(a.i.wallet_order_info_amount_outcome));
      if (!bi.oW(paramMallTransactionObject.lOx)) {
        ((i)localObject1).Jx(paramMallTransactionObject.lOx);
      }
      localArrayList.add(localObject1);
      localObject1 = new h(paramContext);
      ((h)localObject1).lQz = false;
      ((h)localObject1).lQA = true;
      localArrayList.add(localObject1);
      localObject1 = new f(paramContext);
      ((f)localObject1).setTitle(a.i.wallet_order_info_fetch_amount);
      ((f)localObject1).setContent(e.e(paramMallTransactionObject.hUL, paramMallTransactionObject.lNV));
      localArrayList.add(localObject1);
      localObject1 = new f(paramContext);
      ((f)localObject1).setTitle(a.i.wallet_order_info_charge_fee);
      ((f)localObject1).setContent(paramMallTransactionObject.lOm);
      localArrayList.add(localObject1);
      if (!bi.oW(paramMallTransactionObject.desc))
      {
        if (i == 0) {
          break label1133;
        }
        paramf = new f(paramContext);
        paramf.setTitle(a.i.wallet_order_info_from);
        paramf.setContent(paramMallTransactionObject.desc);
        localArrayList.add(paramf);
      }
      if (!bi.oW(paramMallTransactionObject.lNK))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.wallet_order_info_merchant_name);
        paramf.setContent(paramMallTransactionObject.lNK);
        localArrayList.add(paramf);
      }
      if (!bi.oW(paramMallTransactionObject.lNP))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.wallet_order_info_status);
        paramf.setContent(paramMallTransactionObject.lNP);
        if (!bi.oW(paramMallTransactionObject.lNQ)) {
          paramf.Jw(paramMallTransactionObject.lNQ);
        }
        localArrayList.add(paramf);
      }
      paramf = new f(paramContext);
      paramf.setTitle(a.i.wallet_order_info_fetch_deal_time);
      paramf.setContent(e.hb(paramMallTransactionObject.dTR));
      localArrayList.add(paramf);
      if (paramMallTransactionObject.lOi <= 0) {
        break label1276;
      }
      paramf = new f(paramContext);
      paramf.setTitle(a.i.wallet_order_info_fetch_arrive_time);
      paramf.setContent(e.hb(paramMallTransactionObject.lOi));
      localArrayList.add(paramf);
      label566:
      if (!bi.oW(paramMallTransactionObject.lNT))
      {
        localObject2 = new f(paramContext);
        ((f)localObject2).setTitle(a.i.wallet_order_info_fetch_bank);
        localObject1 = paramMallTransactionObject.lNT;
        paramf = (com.tencent.mm.ui.base.preference.f)localObject1;
        if (!bi.oW(paramMallTransactionObject.lNU)) {
          paramf = (String)localObject1 + "(" + paramMallTransactionObject.lNU + ")";
        }
        ((f)localObject2).setContent(paramf);
        localArrayList.add(localObject2);
      }
      if (!bi.oW(paramMallTransactionObject.lNS))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.wallet_order_info_fetch_trans_id);
        paramf.setContent(paramMallTransactionObject.lNS);
        localArrayList.add(paramf);
      }
      if ((bi.oW(paramMallTransactionObject.lOf)) && (bi.oW(paramMallTransactionObject.lNW)) && (bi.oW(paramMallTransactionObject.lNy))) {
        break label1333;
      }
      paramf = new h(paramContext);
      paramf.lQz = true;
      localArrayList.add(paramf);
      localArrayList.add(a.a(paramContext, paramMallTransactionObject));
      return localArrayList;
    }
    Object localObject2 = new i(paramContext);
    ((i)localObject2).lQC = e.e(paramMallTransactionObject.hUL, paramMallTransactionObject.lNV);
    if (i != 0)
    {
      localObject1 = paramContext.getString(a.i.wallet_order_info_amount_income);
      label820:
      ((i)localObject2).setTitle((CharSequence)localObject1);
      if (!bi.oW(paramMallTransactionObject.lNN)) {
        ((i)localObject2).Jx(paramMallTransactionObject.lNN);
      }
      localArrayList.add(localObject2);
      if ((paramMallTransactionObject.hUL == paramMallTransactionObject.lOb) || (paramMallTransactionObject.lOb <= 0.0D)) {
        break label1364;
      }
      localObject1 = new h(paramContext);
      ((h)localObject1).lQz = false;
      ((h)localObject1).lQA = true;
      localArrayList.add(localObject1);
      localObject1 = new f(paramContext);
      ((f)localObject1).setContent(e.e(paramMallTransactionObject.lOb, paramMallTransactionObject.lNV));
      ((f)localObject1).setTitle(a.i.wallet_order_info_orginal_amount);
      localArrayList.add(localObject1);
      if (!bi.oW(paramMallTransactionObject.lOa))
      {
        localObject1 = new g(paramContext);
        ((g)localObject1).setTitle(a.i.wallet_order_info_discount);
        ((g)localObject1).gua = paramf;
        localObject2 = paramMallTransactionObject.lOa.split("\n");
        if (localObject2.length != 1) {
          break label1076;
        }
        ((g)localObject1).lQs = localObject2[0];
        label1015:
        localArrayList.add(localObject1);
      }
    }
    label1076:
    label1133:
    label1276:
    label1333:
    label1364:
    for (boolean bool = true;; bool = false)
    {
      localObject1 = new h(paramContext);
      ((h)localObject1).lQz = bool;
      ((h)localObject1).lQA = true;
      localArrayList.add(localObject1);
      break;
      localObject1 = paramContext.getString(a.i.wallet_order_info_fetch_amount);
      break label820;
      ((g)localObject1).lQs = paramContext.getString(a.i.wallet_order_info_discount_summary, new Object[] { Integer.valueOf(localObject2.length), e.e(paramMallTransactionObject.lOb - paramMallTransactionObject.hUL, paramMallTransactionObject.lNV) });
      ((g)localObject1).a((String[])localObject2, TextUtils.TruncateAt.MIDDLE);
      break label1015;
      localObject1 = new f(paramContext);
      ((f)localObject1).setTitle(a.i.wallet_order_info_desc);
      if (!bi.oW(paramMallTransactionObject.lNL))
      {
        localObject2 = paramContext.getString(a.i.wallet_order_info_check_detail);
        String str = paramMallTransactionObject.desc + " " + (String)localObject2;
        i = paramMallTransactionObject.desc.length();
        int j = paramMallTransactionObject.desc.length();
        ((f)localObject1).a(str, i + 1, ((String)localObject2).length() + (j + 1), new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            paramAnonymousView = paramMallTransactionObject.desc + "\n" + paramMallTransactionObject.lNL;
            localObject1.setContent(paramAnonymousView);
            paramf.notifyDataSetChanged();
          }
        });
      }
      for (;;)
      {
        localArrayList.add(localObject1);
        break;
        ((f)localObject1).setContent(paramMallTransactionObject.desc);
      }
      if (paramMallTransactionObject.lOh > 0)
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.wallet_order_info_fetch_pre_time);
        paramf.setContent(e.hb(paramMallTransactionObject.lOh));
        localArrayList.add(paramf);
        break label566;
      }
      x.e("MicroMsg.FetchOrderPrefFactory", "hy: is fetch but no arrive time or fetch time");
      break label566;
      paramContext = new h(paramContext);
      paramContext.lQz = true;
      paramContext.gOc = false;
      localArrayList.add(paramContext);
      return localArrayList;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */