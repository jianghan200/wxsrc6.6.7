package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.plugin.order.model.a.a;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements a.a
{
  public com.tencent.mm.wallet_core.ui.c lQc;
  
  public final List<Preference> a(final Context paramContext, com.tencent.mm.ui.base.preference.f paramf, final MallTransactionObject paramMallTransactionObject)
  {
    ArrayList localArrayList = new ArrayList();
    int i;
    Object localObject1;
    final Object localObject2;
    label149:
    label353:
    label663:
    int j;
    if (paramMallTransactionObject.bCK == 2)
    {
      i = 1;
      if ((!bi.oW(paramMallTransactionObject.lNX)) && (!bi.oW(paramMallTransactionObject.fqJ)))
      {
        localObject1 = new d(paramContext);
        ((d)localObject1).iAb = paramMallTransactionObject.fqJ;
        ((d)localObject1).mName = paramMallTransactionObject.lNX;
        ((d)localObject1).mOnClickListener = new a.1(this, paramMallTransactionObject, paramContext);
        localArrayList.add(localObject1);
        localArrayList.add(new PreferenceSmallCategory(paramContext));
      }
      localObject2 = new i(paramContext);
      ((i)localObject2).lQC = e.e(paramMallTransactionObject.hUL, paramMallTransactionObject.lNV);
      if (i == 0) {
        break label1555;
      }
      localObject1 = paramContext.getString(a.i.wallet_order_info_amount_income);
      ((i)localObject2).setTitle((CharSequence)localObject1);
      if (!bi.oW(paramMallTransactionObject.lNN)) {
        ((i)localObject2).Jx(paramMallTransactionObject.lNN);
      }
      localArrayList.add(localObject2);
      boolean bool = false;
      if (paramMallTransactionObject.hUL != paramMallTransactionObject.lOb)
      {
        localObject1 = new h(paramContext);
        ((h)localObject1).lQz = false;
        ((h)localObject1).lQA = true;
        localArrayList.add(localObject1);
        localObject1 = new f(paramContext);
        ((f)localObject1).setContent(e.e(paramMallTransactionObject.lOb, paramMallTransactionObject.lNV));
        ((f)localObject1).setTitle(a.i.wallet_order_info_orginal_amount);
        localArrayList.add(localObject1);
        bool = true;
      }
      if ((paramMallTransactionObject.hUL != paramMallTransactionObject.lOb) && (!bi.oW(paramMallTransactionObject.lOa)))
      {
        localObject1 = new g(paramContext);
        ((g)localObject1).setTitle(a.i.wallet_order_info_discount);
        ((g)localObject1).gua = paramf;
        localObject2 = paramMallTransactionObject.lOa.split("\n");
        if (localObject2.length != 1) {
          break label1588;
        }
        ((g)localObject1).lQs = localObject2[0];
        localArrayList.add(localObject1);
      }
      localObject1 = new h(paramContext);
      ((h)localObject1).lQz = bool;
      ((h)localObject1).lQA = true;
      localArrayList.add(localObject1);
      if ((i == 0) && (!bi.oW(paramMallTransactionObject.lOk)))
      {
        com.tencent.mm.kernel.g.Ek();
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramMallTransactionObject.lOk);
        if ((localObject1 != null) && ((int)((com.tencent.mm.l.a)localObject1).dhP > 0))
        {
          localObject1 = ((com.tencent.mm.l.a)localObject1).BL();
          localObject2 = new f(paramContext);
          ((f)localObject2).setTitle(a.i.wallet_order_info_spid);
          ((f)localObject2).setContent((String)localObject1);
          localArrayList.add(localObject2);
        }
      }
      if ((paramMallTransactionObject.lNG == 31) && (i != 0) && (!bi.oW(paramMallTransactionObject.lOr)))
      {
        com.tencent.mm.kernel.g.Ek();
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramMallTransactionObject.lOr);
        if ((localObject1 != null) && ((int)((com.tencent.mm.l.a)localObject1).dhP > 0))
        {
          localObject1 = ((com.tencent.mm.l.a)localObject1).BL();
          localObject2 = new f(paramContext);
          ((f)localObject2).setTitle(a.i.wallet_order_info_from);
          ((f)localObject2).setContent((String)localObject1);
          localArrayList.add(localObject2);
        }
      }
      if (!bi.oW(paramMallTransactionObject.desc))
      {
        if (i == 0) {
          break label1655;
        }
        paramf = new f(paramContext);
        if ((paramMallTransactionObject.lNG != 32) && (paramMallTransactionObject.lNG != 33) && (paramMallTransactionObject.lNG != 31)) {
          break label1645;
        }
        paramf.setTitle(a.i.wallet_order_info_collect_remark_txt);
        paramf.setContent(paramMallTransactionObject.desc);
        localArrayList.add(paramf);
      }
      if (!bi.oW(paramMallTransactionObject.lOv))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.wallet_order_original_feeinfo_title);
        paramf.setContent(paramMallTransactionObject.lOv);
        localArrayList.add(paramf);
      }
      if (!bi.oW(paramMallTransactionObject.lOu))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.wallet_order_rate_title);
        paramf.setContent(paramMallTransactionObject.lOu);
        localArrayList.add(paramf);
      }
      if (!TextUtils.isEmpty(paramMallTransactionObject.lOm))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.wallet_order_info_charge_fee);
        paramf.setContent(paramMallTransactionObject.lOm);
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
        if ((paramMallTransactionObject.lNG != 31) || (q.GF().equals(paramMallTransactionObject.lOk)) || (paramMallTransactionObject.lOl <= 0) || (bi.oW(paramMallTransactionObject.lOk)) || (bi.oW(paramMallTransactionObject.bOe))) {
          break label1818;
        }
        localObject1 = paramContext.getString(a.i.remittance_resend_transfer_msg);
        localObject2 = paramMallTransactionObject.lNP + " " + (String)localObject1;
        i = paramMallTransactionObject.lNP.length();
        j = paramMallTransactionObject.lNP.length();
        paramf.a((String)localObject2, i + 1, ((String)localObject1).length() + j + 1, new a.3(this, paramContext, paramMallTransactionObject));
        label1014:
        localArrayList.add(paramf);
      }
      paramf = new f(paramContext);
      paramf.setTitle(a.i.wallet_order_info_deal_time);
      paramf.setContent(e.hb(paramMallTransactionObject.dTR));
      localArrayList.add(paramf);
      if (!bi.oW(paramMallTransactionObject.lNT))
      {
        localObject2 = new f(paramContext);
        ((f)localObject2).setTitle(a.i.wallet_order_info_pay_method);
        localObject1 = paramMallTransactionObject.lNT;
        paramf = (com.tencent.mm.ui.base.preference.f)localObject1;
        if (!bi.oW(paramMallTransactionObject.lNU)) {
          paramf = (String)localObject1 + "(" + paramMallTransactionObject.lNU + ")";
        }
        ((f)localObject2).setContent(paramf);
        localArrayList.add(localObject2);
      }
      if (!bi.oW(paramMallTransactionObject.bOe))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.wallet_order_info_trans_id);
        paramf.setContent(paramMallTransactionObject.bOe);
        localArrayList.add(paramf);
      }
      if (!bi.oW(paramMallTransactionObject.lNS))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.wallet_order_info_sp_billno);
        if (paramMallTransactionObject.lNG != 8) {
          break label1847;
        }
        paramf.setContent(paramContext.getString(a.i.wallet_order_info_sp_billno_tip));
        localObject1 = new c(paramContext);
        localObject2 = com.tencent.mm.bm.a.a.b(paramContext, paramMallTransactionObject.lNS, 5, 0);
        ((c)localObject1).lQk = e.acd(paramMallTransactionObject.lNS);
        ((c)localObject1).dHf = ((Bitmap)localObject2);
        ((c)localObject1).mOnClickListener = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            if (a.this.lQc != null)
            {
              a locala = a.this;
              Bitmap localBitmap = localObject2;
              String str = paramMallTransactionObject.lNS;
              if (locala.lQc != null)
              {
                locala.lQc.gn(str, str);
                locala.lQc.lLl = localBitmap;
                locala.lQc.lLm = localBitmap;
                locala.lQc.cDE();
              }
              a.this.lQc.v(paramAnonymousView, true);
            }
          }
        };
        localArrayList.add(paramf);
        localArrayList.add(localObject1);
      }
      label1322:
      if (paramMallTransactionObject.lNv.size() != 0) {
        break label1867;
      }
      i = 0;
      label1337:
      if ((i != 0) || ((bi.oW(paramMallTransactionObject.lOf)) && (bi.oW(paramMallTransactionObject.lNW)) && (bi.oW(paramMallTransactionObject.lNy)))) {
        break label1873;
      }
      paramf = new h(paramContext);
      paramf.lQz = true;
      localArrayList.add(paramf);
      localArrayList.add(com.tencent.mm.plugin.order.model.a.a(paramContext, paramMallTransactionObject));
      label1408:
      if (i != 0)
      {
        paramf = new j(paramContext);
        if (paramMallTransactionObject.lNw != 1) {
          break label1918;
        }
        if ((!bi.oW(paramMallTransactionObject.lOf)) || (!bi.oW(paramMallTransactionObject.lNW)) || (!bi.oW(paramMallTransactionObject.lNy)))
        {
          if (bi.oW(paramMallTransactionObject.lOg)) {
            break label1904;
          }
          paramf.lQD = paramMallTransactionObject.lOg;
          label1478:
          paramf.lQE = new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              paramAnonymousView = new LinkedList();
              LinkedList localLinkedList = new LinkedList();
              if (!bi.oW(paramMallTransactionObject.lNW))
              {
                localLinkedList.add(Integer.valueOf(0));
                paramAnonymousView.add(paramContext.getString(a.i.wallet_order_info_support_biz));
              }
              if (!bi.oW(paramMallTransactionObject.lNy))
              {
                localLinkedList.add(Integer.valueOf(1));
                paramAnonymousView.add(paramContext.getString(a.i.wallet_order_info_support_call));
              }
              if (!bi.oW(paramMallTransactionObject.lOf))
              {
                localLinkedList.add(Integer.valueOf(2));
                paramAnonymousView.add(paramContext.getString(a.i.wallet_order_info_support_safeguard));
              }
              if (localLinkedList.size() == 1)
              {
                com.tencent.mm.plugin.order.model.a.a(((Integer)localLinkedList.get(0)).intValue(), paramContext, paramMallTransactionObject);
                return;
              }
              com.tencent.mm.ui.base.h.a(paramContext, null, paramAnonymousView, localLinkedList, null, true, new a.5.1(this));
            }
          };
        }
      }
    }
    for (;;)
    {
      paramf.lNv = paramMallTransactionObject.lNv;
      paramf.mOnClickListener = new a.7(this, paramContext, paramMallTransactionObject);
      paramContext = new h(paramContext);
      paramContext.lQz = true;
      localArrayList.add(paramContext);
      localArrayList.add(paramf);
      return localArrayList;
      i = 0;
      break;
      label1555:
      if (paramMallTransactionObject.lNG == 11)
      {
        localObject1 = paramContext.getString(a.i.wallet_order_info_save_amount);
        break label149;
      }
      localObject1 = paramContext.getString(a.i.wallet_order_info_amount);
      break label149;
      label1588:
      ((g)localObject1).lQs = paramContext.getString(a.i.wallet_order_info_discount_summary, new Object[] { Integer.valueOf(localObject2.length), e.e(paramMallTransactionObject.lOb - paramMallTransactionObject.hUL, paramMallTransactionObject.lNV) });
      ((g)localObject1).a((String[])localObject2, TextUtils.TruncateAt.MIDDLE);
      break label353;
      label1645:
      paramf.setTitle(a.i.wallet_order_info_from);
      break label663;
      label1655:
      localObject1 = new f(paramContext);
      if (paramMallTransactionObject.lNG == 31)
      {
        ((f)localObject1).setTitle(a.i.wallet_order_info_remittance_memo);
        label1682:
        if (bi.oW(paramMallTransactionObject.lNL)) {
          break label1806;
        }
        localObject2 = paramContext.getString(a.i.wallet_order_info_check_detail);
        String str = paramMallTransactionObject.desc + " " + (String)localObject2;
        i = paramMallTransactionObject.desc.length();
        j = paramMallTransactionObject.desc.length();
        ((f)localObject1).a(str, i + 1, ((String)localObject2).length() + (j + 1), new a.2(this, paramMallTransactionObject, (f)localObject1, paramf));
      }
      for (;;)
      {
        localArrayList.add(localObject1);
        break;
        ((f)localObject1).setTitle(a.i.wallet_order_info_desc);
        break label1682;
        label1806:
        ((f)localObject1).setContent(paramMallTransactionObject.desc);
      }
      label1818:
      paramf.setContent(paramMallTransactionObject.lNP);
      if (bi.oW(paramMallTransactionObject.lNQ)) {
        break label1014;
      }
      paramf.Jw(paramMallTransactionObject.lNQ);
      break label1014;
      label1847:
      paramf.setContent(paramMallTransactionObject.lNS);
      localArrayList.add(paramf);
      break label1322;
      label1867:
      i = 1;
      break label1337;
      label1873:
      paramf = new h(paramContext);
      paramf.lQz = true;
      paramf.gOc = false;
      localArrayList.add(paramf);
      break label1408;
      label1904:
      paramf.lQD = paramContext.getString(a.i.wallet_order_info_support_customer_service);
      break label1478;
      label1918:
      if (!bi.oW(paramMallTransactionObject.lOg))
      {
        paramf.lQD = paramMallTransactionObject.lOg;
        paramf.lQE = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            a.a(paramContext, paramMallTransactionObject.lOf, paramMallTransactionObject);
          }
        };
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */