package com.tencent.mm.plugin.card.sharecard.a;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.d.s;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.c;
import com.tencent.mm.plugin.card.sharecard.model.i;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.plugin.card.sharecard.model.m;
import com.tencent.mm.plugin.card.sharecard.model.p;
import com.tencent.mm.plugin.card.sharecard.ui.b.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class b
{
  private static boolean dFt = false;
  public static boolean hyf = false;
  public b.a hye = null;
  private Context mContext;
  
  public b(Context paramContext)
  {
    this.mContext = paramContext;
    hyf = false;
  }
  
  private static void I(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = (Map)am.axn().getValue("key_share_user_info_map");
    if (localObject == null) {
      localObject = new HashMap();
    }
    for (;;)
    {
      ArrayList localArrayList = (ArrayList)((Map)localObject).get(paramString2);
      if (localArrayList == null) {
        localArrayList = new ArrayList();
      }
      for (;;)
      {
        int i = 0;
        while (i < localArrayList.size())
        {
          com.tencent.mm.plugin.card.sharecard.model.r localr = (com.tencent.mm.plugin.card.sharecard.model.r)localArrayList.get(i);
          if ((paramString3 != null) && (paramString3.equals(localr.hyG)))
          {
            localr.hyI = false;
            localr.share_count -= 1;
            localr.hyH.remove(paramString1);
            localArrayList.set(i, localr);
          }
          i += 1;
        }
        ((Map)localObject).put(paramString2, localArrayList);
        am.axn().putValue("key_share_user_info_map", localObject);
        return;
      }
    }
  }
  
  private static String a(Context paramContext, ArrayList<String> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      x.e("MicroMsg.ShareCardDataMgr", "getShareUserName， username_list == null || username_list.size() == 0");
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    if ((i < paramArrayList.size()) && (i < 2))
    {
      if (i != 0) {
        localStringBuilder.append("、");
      }
      String str1 = com.tencent.mm.model.r.gU((String)paramArrayList.get(i));
      String str2 = com.tencent.mm.model.r.gT((String)paramArrayList.get(i));
      if (!TextUtils.isEmpty(str1)) {
        localStringBuilder.append(str1);
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append(str2);
      }
    }
    if (paramContext == null)
    {
      x.e("MicroMsg.ShareCardDataMgr", "context == null");
      return "";
    }
    if ((paramArrayList.size() == 1) || (paramArrayList.size() == 2)) {
      return paramContext.getString(a.g.card_share_card_users, new Object[] { localStringBuilder.toString() });
    }
    return paramContext.getString(a.g.card_share_card_list_more_users, new Object[] { localStringBuilder.toString(), Integer.valueOf(paramArrayList.size()) });
  }
  
  public static void a(Context paramContext, com.tencent.mm.plugin.card.base.b paramb)
  {
    x.i("MicroMsg.ShareCardDataMgr", "updateShareCardData()");
    x.i("MicroMsg.ShareCardDataMgr", "card id:" + paramb.awq() + " cardtpid:" + paramb.awr());
    cb(paramb.awq(), paramb.awr());
    if (paramContext != null) {
      aa(paramContext, paramb.awr());
    }
    I(paramb.awq(), paramb.awr(), paramb.aws());
    xs(paramb.awr());
  }
  
  private static void a(com.tencent.mm.plugin.card.sharecard.model.l paraml1, com.tencent.mm.plugin.card.sharecard.model.l paraml2, boolean paramBoolean)
  {
    if ((paraml1 == null) && (paraml2 == null))
    {
      x.e("MicroMsg.ShareCardDataMgr", "don't updateCategoryType(), newData == null && oldData == null");
      return;
    }
    if ((paraml1 != null) && (paraml1.hyu == null) && (paraml1.hyt == null) && (paraml2 != null) && (paraml2.hyu == null) && (paraml2.hyt == null))
    {
      x.e("MicroMsg.ShareCardDataMgr", "don't updateCategoryType(), newData.local_city_list == null && oldData.local_city_list == null");
      return;
    }
    x.i("MicroMsg.ShareCardDataMgr", "updateCategoryType()");
    Object localObject1 = (ArrayList)am.axn().getValue("key_share_card_local_city_category_info_list");
    if (localObject1 == null) {
      localObject1 = new ArrayList();
    }
    for (;;)
    {
      ArrayList localArrayList = (ArrayList)am.axn().getValue("key_share_card_other_city_category_info_list");
      if (localArrayList == null) {
        localArrayList = new ArrayList();
      }
      for (;;)
      {
        int i = 0;
        int j = 0;
        if (paramBoolean)
        {
          am.axq().nN(10);
          ((ArrayList)localObject1).clear();
          am.axq().nN(0);
          localArrayList.clear();
          i = 0;
        }
        for (;;)
        {
          long l1 = System.currentTimeMillis();
          long l2 = g.Ei().dqq.dO(Thread.currentThread().getId());
          Object localObject2;
          if ((paraml1 != null) && (paraml1.hyt != null) && (paraml1.hyt.size() > 0))
          {
            int k = 0;
            for (;;)
            {
              if (k < paraml1.hyt.size())
              {
                localObject2 = (m)paraml1.hyt.get(k);
                am.axq().I(((m)localObject2).huU, 10, k + j);
                i locali = new i();
                locali.huU = ((m)localObject2).huU;
                locali.hyo = (k + j);
                ((ArrayList)localObject1).add(locali);
                k += 1;
                continue;
                j = i;
                if (paraml2 != null)
                {
                  j = i;
                  if (paraml2.hyt != null)
                  {
                    j = i;
                    if (paraml2.hyt.size() >= 0) {
                      j = paraml2.hyt.size();
                    }
                  }
                }
                if ((paraml2 == null) || (paraml2.hyu == null) || (paraml2.hyu.size() < 0)) {
                  break label650;
                }
                i = paraml2.hyu.size();
                break;
              }
            }
            if ((!paramBoolean) && (paraml2 != null) && (paraml2.hyt != null)) {
              paraml1.hyt.addAll(paraml2.hyt);
            }
          }
          for (;;)
          {
            am.axn().putValue("key_share_card_local_city_category_info_list", localObject1);
            if ((paraml1 == null) || (paraml1.hyu == null) || (paraml1.hyu.size() <= 0)) {
              break label620;
            }
            j = 0;
            while (j < paraml1.hyu.size())
            {
              localObject1 = (m)paraml1.hyu.get(j);
              am.axq().I(((m)localObject1).huU, 0, j + i);
              localObject2 = new i();
              ((i)localObject2).huU = ((m)localObject1).huU;
              ((i)localObject2).hyo = (j + i);
              localArrayList.add(localObject2);
              j += 1;
            }
            if ((paraml1 != null) && (!paramBoolean) && (paraml2 != null) && (paraml2.hyt != null)) {
              paraml1.hyt = paraml2.hyt;
            }
          }
          if ((!paramBoolean) && (paraml2 != null) && (paraml2.hyu != null)) {
            paraml1.hyu.addAll(paraml2.hyu);
          }
          for (;;)
          {
            am.axn().putValue("key_share_card_other_city_category_info_list", localArrayList);
            g.Ei().dqq.gp(l2);
            x.d("MicroMsg.ShareCardDataMgr", "updateCategoryType  >> updateCategoryInfo use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
            return;
            label620:
            if ((paraml1 != null) && (!paramBoolean) && (paraml2 != null) && (paraml2.hyu != null)) {
              paraml1.hyu = paraml2.hyu;
            }
          }
          label650:
          i = 0;
        }
      }
    }
  }
  
  private void a(com.tencent.mm.plugin.card.sharecard.model.l paraml, boolean paramBoolean)
  {
    int j = 0;
    if (paraml == null)
    {
      x.e("MicroMsg.ShareCardDataMgr", "don't parserShareCardListData, data is null");
      return;
    }
    x.i("MicroMsg.ShareCardDataMgr", "parserShareCardListData()");
    Object localObject1 = (Map)am.axn().getValue("key_share_card_annoucement_map");
    if (localObject1 == null) {
      localObject1 = new HashMap();
    }
    for (;;)
    {
      Object localObject2 = (Map)am.axn().getValue("key_share_card_count_map");
      if (localObject2 == null) {
        localObject2 = new HashMap();
      }
      for (;;)
      {
        Object localObject3 = (Map)am.axn().getValue("key_share_card_username_map");
        if (localObject3 == null) {
          localObject3 = new HashMap();
        }
        for (;;)
        {
          ArrayList localArrayList1 = (ArrayList)am.axn().getValue("key_share_card_local_city_ids");
          if (localArrayList1 == null) {
            localArrayList1 = new ArrayList();
          }
          for (;;)
          {
            ArrayList localArrayList2 = (ArrayList)am.axn().getValue("key_share_card_other_city_ids");
            if (localArrayList2 == null) {
              localArrayList2 = new ArrayList();
            }
            for (;;)
            {
              ArrayList localArrayList3 = (ArrayList)am.axn().getValue("key_share_card_other_city_top_info_list");
              if (localArrayList3 == null) {
                localArrayList3 = new ArrayList();
              }
              for (;;)
              {
                if (paramBoolean)
                {
                  localArrayList1.clear();
                  localArrayList2.clear();
                  localArrayList3.clear();
                }
                ArrayList localArrayList4 = new ArrayList();
                int i;
                m localm;
                Object localObject4;
                if ((paraml.hyt != null) && (paraml.hyt.size() > 0))
                {
                  i = 0;
                  if (i < paraml.hyt.size())
                  {
                    localm = (m)paraml.hyt.get(i);
                    if (!TextUtils.isEmpty(localm.hyB)) {
                      ((Map)localObject1).put(localm.huU, localm.hyB);
                    }
                    int k = am.axq().xz(localm.huU);
                    ((Map)localObject2).put(localm.huU, Integer.valueOf(k));
                    ((Map)localObject3).put(localm.huU, l(am.axq().xy(localm.huU)));
                    if (!localArrayList4.contains(localm.huU))
                    {
                      localObject4 = am.axq().xA(localm.huU);
                      if ((TextUtils.isEmpty((CharSequence)localObject4)) || (localArrayList1.contains(localObject4))) {
                        break label458;
                      }
                      localArrayList1.add(localObject4);
                    }
                    for (;;)
                    {
                      localArrayList4.add(localm.huU);
                      localObject4 = new p();
                      ((p)localObject4).huU = localm.huU;
                      ((p)localObject4).top = localm.top;
                      localArrayList3.add(localObject4);
                      i += 1;
                      break;
                      label458:
                      if (!localArrayList1.contains(localm.cac)) {
                        localArrayList1.add(localm.cac);
                      }
                    }
                  }
                }
                localArrayList4.clear();
                if ((paraml.hyu != null) && (paraml.hyu.size() > 0))
                {
                  i = j;
                  if (i < paraml.hyu.size())
                  {
                    localm = (m)paraml.hyu.get(i);
                    if (!TextUtils.isEmpty(localm.hyB)) {
                      ((Map)localObject1).put(localm.huU, localm.hyB);
                    }
                    j = am.axq().xz(localm.huU);
                    ((Map)localObject2).put(localm.huU, Integer.valueOf(j));
                    ((Map)localObject3).put(localm.huU, l(am.axq().xy(localm.huU)));
                    if (!localArrayList4.contains(localm.huU))
                    {
                      localObject4 = am.axq().xA(localm.huU);
                      if ((TextUtils.isEmpty((CharSequence)localObject4)) || (localArrayList2.contains(localObject4))) {
                        break label729;
                      }
                      localArrayList2.add(localObject4);
                    }
                    for (;;)
                    {
                      localArrayList4.add(localm.huU);
                      localObject4 = new p();
                      ((p)localObject4).huU = localm.huU;
                      ((p)localObject4).top = localm.top;
                      localArrayList3.add(localObject4);
                      i += 1;
                      break;
                      label729:
                      if (!localArrayList2.contains(localm.cac)) {
                        localArrayList2.add(localm.cac);
                      }
                    }
                  }
                }
                am.axn().putValue("key_share_card_annoucement_map", localObject1);
                am.axn().putValue("key_share_card_count_map", localObject2);
                am.axn().putValue("key_share_card_username_map", localObject3);
                am.axn().putValue("key_share_card_local_city", paraml.hyv);
                am.axn().putValue("key_share_card_local_city_ids", localArrayList1);
                am.axn().putValue("key_share_card_other_city_ids", localArrayList2);
                am.axn().putValue("key_share_card_other_city_top_info_list", localArrayList3);
                return;
              }
            }
          }
        }
      }
    }
  }
  
  public static void aa(Context paramContext, String paramString)
  {
    x.i("MicroMsg.ShareCardDataMgr", "updateCardCountbyCardTpId() card_tp_id:" + paramString);
    Object localObject1 = (Map)am.axn().getValue("key_share_card_count_map");
    if (localObject1 == null) {
      localObject1 = new HashMap();
    }
    for (;;)
    {
      Map localMap = (Map)am.axn().getValue("key_share_card_username_map");
      Object localObject2 = localMap;
      if (localMap == null) {
        localObject2 = new HashMap();
      }
      ((Map)localObject1).put(paramString, Integer.valueOf(am.axq().xz(paramString)));
      ((Map)localObject2).put(paramString, a(paramContext, am.axq().xy(paramString)));
      am.axn().putValue("key_share_card_count_map", localObject1);
      am.axn().putValue("key_share_card_username_map", localObject2);
      return;
    }
  }
  
  public static int axE()
  {
    int i = 0;
    Object localObject1 = am.axi();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(" where (status=0 OR status=5) AND card_type=10");
    localObject2 = "select count(*) from UserCardInfo" + ((StringBuilder)localObject2).toString();
    localObject1 = ((c)localObject1).diF.b((String)localObject2, null, 2);
    if (localObject1 == null) {
      return 0;
    }
    if (((Cursor)localObject1).moveToFirst()) {
      i = ((Cursor)localObject1).getInt(0);
    }
    ((Cursor)localObject1).close();
    return i;
  }
  
  public static void axF()
  {
    long l1 = System.currentTimeMillis();
    long l2 = g.Ei().dqq.dO(Thread.currentThread().getId());
    x.i("MicroMsg.ShareCardDataMgr", "updateShareCardCategory()");
    Object localObject = (ArrayList)am.axn().getValue("key_share_card_local_city_category_info_list");
    if (localObject == null) {
      localObject = new ArrayList();
    }
    for (;;)
    {
      ArrayList localArrayList = (ArrayList)am.axn().getValue("key_share_card_other_city_category_info_list");
      if (localArrayList == null) {
        localArrayList = new ArrayList();
      }
      for (;;)
      {
        int i = 0;
        while (i < ((ArrayList)localObject).size())
        {
          i locali = (i)((ArrayList)localObject).get(i);
          am.axq().I(locali.huU, 10, locali.hyo);
          i += 1;
        }
        i = 0;
        while (i < localArrayList.size())
        {
          localObject = (i)localArrayList.get(i);
          am.axq().I(((i)localObject).huU, 0, ((i)localObject).hyo);
          i += 1;
        }
        g.Ei().dqq.gp(l2);
        x.i("MicroMsg.ShareCardDataMgr", "updateShareCardCategory  >> updateCategoryInfo use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
        return;
      }
    }
  }
  
  public static int axG()
  {
    if (axI()) {
      return 1;
    }
    if (axH())
    {
      if (hyf) {
        return 3;
      }
      return 4;
    }
    return 0;
  }
  
  public static boolean axH()
  {
    ArrayList localArrayList = (ArrayList)am.axn().getValue("key_share_card_other_city_ids");
    return (localArrayList != null) && (localArrayList.size() > 0);
  }
  
  public static boolean axI()
  {
    ArrayList localArrayList = (ArrayList)am.axn().getValue("key_share_card_local_city_ids");
    return (localArrayList != null) && (localArrayList.size() > 0);
  }
  
  public static void axJ()
  {
    x.i("MicroMsg.ShareCardDataMgr", "delelteAllIllegalStatusCard()");
    com.tencent.mm.sdk.f.e.post(new b.2(), "delelteAllIllegalStatusCard");
  }
  
  public static boolean axK()
  {
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)am.axn().getValue("key_share_card_layout_data");
    if (locall == null) {
      return true;
    }
    return locall.hyw;
  }
  
  public static boolean axL()
  {
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)am.axn().getValue("key_share_card_layout_data");
    if (locall == null) {
      return true;
    }
    return locall.hyx;
  }
  
  public static void cb(String paramString1, String paramString2)
  {
    if (dFt)
    {
      x.i("MicroMsg.ShareCardDataMgr", "is isUpdating data, don't do updateCardIdsListByCardId");
      return;
    }
    x.i("MicroMsg.ShareCardDataMgr", "do updateCardIdsListByCardId");
    dFt = true;
    ArrayList localArrayList = nJ(1);
    if ((localArrayList != null) && (localArrayList.contains(paramString1)))
    {
      localArrayList.remove(paramString1);
      String str = am.axq().ce(paramString1, paramString2);
      if (!TextUtils.isEmpty(str)) {
        localArrayList.add(str);
      }
      am.axn().putValue("key_share_card_local_city_ids", localArrayList);
    }
    localArrayList = nJ(2);
    if ((localArrayList != null) && (localArrayList.contains(paramString1)))
    {
      localArrayList.remove(paramString1);
      paramString1 = am.axq().ce(paramString1, paramString2);
      if (!TextUtils.isEmpty(paramString1)) {
        localArrayList.add(paramString1);
      }
      am.axn().putValue("key_share_card_other_city_ids", localArrayList);
    }
    dFt = false;
  }
  
  public static void cc(String paramString1, String paramString2)
  {
    x.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId card_id:" + paramString1 + ", card_tp_id:" + paramString2);
    ArrayList localArrayList1 = nJ(1);
    if ((localArrayList1 != null) && (localArrayList1.contains(paramString1))) {}
    ArrayList localArrayList2;
    do
    {
      return;
      localArrayList2 = nJ(2);
    } while ((localArrayList2 != null) && (localArrayList2.contains(paramString1)));
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)am.axn().getValue("key_share_card_layout_data");
    if (locall == null)
    {
      x.e("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId data == null");
      return;
    }
    int j = am.axq().xz(paramString2);
    int k = xu(paramString2);
    x.e("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId realCount:" + j + " cacheCount:" + k);
    int i;
    if ((locall.hyt != null) && (locall.hyt.size() > 0) && ((k <= 0) || (j == 1))) {
      i = 0;
    }
    while (i < locall.hyt.size())
    {
      m localm = (m)locall.hyt.get(i);
      if ((paramString2 != null) && (paramString2.contains(localm.huU)))
      {
        localArrayList1.add(paramString1);
        am.axn().putValue("key_share_card_local_city_ids", localArrayList1);
        x.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId add for local ids, card id is " + paramString1);
        return;
      }
      i += 1;
      continue;
      x.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId, not add for local_ids");
    }
    if ((localArrayList2 != null) && ((k <= 0) || (j == 1)))
    {
      localArrayList2.add(paramString1);
      am.axn().putValue("key_share_card_other_city_ids", localArrayList2);
      x.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId add for other ids, card id is " + paramString1);
      return;
    }
    x.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId, not add for other_ids");
  }
  
  public static String cd(String paramString1, String paramString2)
  {
    x.i("MicroMsg.ShareCardDataMgr", "initShareUserCardId()");
    if (paramString2 != null)
    {
      paramString2 = xv(paramString2);
      if ((paramString2 != null) && (paramString2.size() > 0))
      {
        paramString2 = (com.tencent.mm.plugin.card.sharecard.model.r)paramString2.get(0);
        if ((paramString2 != null) && (paramString2.hyH != null) && (paramString2.hyH.size() > 0) && (!paramString1.equals(paramString2.hyH.get(0))))
        {
          paramString1 = (String)paramString2.hyH.get(0);
          x.i("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), mCardId is not first!, reset it");
          return paramString1;
        }
        x.i("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), mCardId is first!");
        return paramString1;
      }
      x.e("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), shareUserInfoList is null");
      return paramString1;
    }
    x.e("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), card_tp_id is null");
    return paramString1;
  }
  
  private String l(ArrayList<String> paramArrayList)
  {
    return a(this.mContext, paramArrayList);
  }
  
  public static String ld(String paramString)
  {
    Map localMap = (Map)am.axn().getValue("key_share_card_username_map");
    if (localMap == null) {
      return "";
    }
    return (String)localMap.get(paramString);
  }
  
  public static ArrayList<String> nJ(int paramInt)
  {
    ArrayList localArrayList2;
    ArrayList localArrayList1;
    if (paramInt == 1)
    {
      localArrayList2 = (ArrayList)am.axn().getValue("key_share_card_local_city_ids");
      if (localArrayList2 != null)
      {
        localArrayList1 = localArrayList2;
        if (localArrayList2.size() != 0) {}
      }
      else
      {
        x.e("MicroMsg.ShareCardDataMgr", "getCardIds() ids == null || ids.size() == 0 for showType == " + paramInt);
        localArrayList1 = nK(paramInt);
      }
    }
    do
    {
      return localArrayList1;
      if (paramInt != 2) {
        break label118;
      }
      localArrayList2 = (ArrayList)am.axn().getValue("key_share_card_other_city_ids");
      if (localArrayList2 == null) {
        break;
      }
      localArrayList1 = localArrayList2;
    } while (localArrayList2.size() != 0);
    x.e("MicroMsg.ShareCardDataMgr", "getCardIds() ids == null || ids.size() == 0 for showType == " + paramInt);
    return nK(paramInt);
    label118:
    return null;
  }
  
  private static ArrayList<String> nK(int paramInt)
  {
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)am.axn().getValue("key_share_card_layout_data");
    if (locall == null)
    {
      x.e("MicroMsg.ShareCardDataMgr", "getCardIdsByType() data == null for showType = " + paramInt);
      return null;
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    m localm;
    String str;
    if (paramInt == 1)
    {
      if ((locall.hyt != null) && (locall.hyt.size() > 0))
      {
        paramInt = 0;
        if (paramInt < locall.hyt.size())
        {
          localm = (m)locall.hyt.get(paramInt);
          if (!localArrayList2.contains(localm.huU))
          {
            str = am.axq().xA(localm.huU);
            if ((TextUtils.isEmpty(str)) || (localArrayList1.contains(str))) {
              break label171;
            }
            localArrayList1.add(str);
          }
          for (;;)
          {
            localArrayList2.add(localm.huU);
            paramInt += 1;
            break;
            label171:
            if (!localArrayList1.contains(localm.cac)) {
              localArrayList1.add(localm.cac);
            }
          }
        }
        am.axn().putValue("key_share_card_local_city_ids", localArrayList1);
      }
      return localArrayList1;
    }
    if (paramInt == 2)
    {
      if ((locall.hyu != null) && (locall.hyu.size() > 0))
      {
        paramInt = 0;
        if (paramInt < locall.hyu.size())
        {
          localm = (m)locall.hyu.get(paramInt);
          if (!localArrayList2.contains(localm.huU))
          {
            str = am.axq().xA(localm.huU);
            if ((TextUtils.isEmpty(str)) || (localArrayList1.contains(str))) {
              break label322;
            }
            localArrayList1.add(str);
          }
          for (;;)
          {
            localArrayList2.add(localm.huU);
            paramInt += 1;
            break;
            label322:
            if (!localArrayList1.contains(localm.cac)) {
              localArrayList1.add(localm.cac);
            }
          }
        }
        am.axn().putValue("key_share_card_other_city_ids", localArrayList1);
      }
      return localArrayList1;
    }
    return null;
  }
  
  public static boolean nL(int paramInt)
  {
    Object localObject = (Integer)am.axn().getValue("key_share_card_show_type");
    if (localObject == null) {
      return false;
    }
    if (((Integer)localObject).intValue() == 0) {
      return false;
    }
    if (paramInt == 0)
    {
      localObject = (ArrayList)am.axn().getValue("key_share_card_other_city_ids");
      return (localObject != null) && (((ArrayList)localObject).size() != 0);
    }
    if (paramInt == 10)
    {
      localObject = (ArrayList)am.axn().getValue("key_share_card_local_city_ids");
      return (localObject != null) && (((ArrayList)localObject).size() != 0);
    }
    return false;
  }
  
  public static void xs(String paramString)
  {
    x.i("MicroMsg.ShareCardDataMgr", "updateShareUserInfo()");
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.ShareCardDataMgr", "updateShareUserInfo(), card_tp_id is empty");
      return;
    }
    com.tencent.mm.sdk.f.e.post(new b.1(paramString, new ag(Looper.getMainLooper())), "updateShareUserInfo_thread");
  }
  
  public static String xt(String paramString)
  {
    Map localMap = (Map)am.axn().getValue("key_share_card_annoucement_map");
    if (localMap == null) {
      return "";
    }
    return (String)localMap.get(paramString);
  }
  
  public static int xu(String paramString)
  {
    Map localMap = (Map)am.axn().getValue("key_share_card_count_map");
    if (localMap == null) {
      return 0;
    }
    paramString = (Integer)localMap.get(paramString);
    if (paramString == null) {
      return 0;
    }
    return paramString.intValue();
  }
  
  public static ArrayList<com.tencent.mm.plugin.card.sharecard.model.r> xv(String paramString)
  {
    Map localMap = (Map)am.axn().getValue("key_share_user_info_map");
    Object localObject = localMap;
    if (localMap == null) {
      localObject = new HashMap();
    }
    localObject = (ArrayList)((Map)localObject).get(paramString);
    paramString = (String)localObject;
    if (localObject == null) {
      paramString = new ArrayList();
    }
    return paramString;
  }
  
  public static boolean xw(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    Object localObject2 = (ArrayList)am.axn().getValue("key_share_card_other_city_top_info_list");
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new ArrayList();
    }
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (p)((Iterator)localObject1).next();
      if ((localObject2 != null) && (paramString.equals(((p)localObject2).huU)) && (((p)localObject2).top == 1)) {
        return true;
      }
    }
    return false;
  }
  
  public static void xx(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    ArrayList localArrayList = (ArrayList)am.axn().getValue("key_share_card_other_city_top_info_list");
    if (localArrayList == null) {
      localArrayList = new ArrayList();
    }
    for (;;)
    {
      int i = 0;
      while (i < localArrayList.size())
      {
        p localp = (p)localArrayList.get(i);
        if ((localp != null) && (paramString.equals(localp.huU)) && (localp.top == 1))
        {
          localp.hyF = true;
          localArrayList.set(i, localp);
          am.axn().putValue("key_share_card_other_city_top_info_list", localArrayList);
          return;
        }
        i += 1;
      }
      break;
    }
  }
  
  public final void af(String paramString, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString)) {
      x.e("MicroMsg.ShareCardDataMgr", "updateGetShareLayoutData json is empty");
    }
    long l;
    int j;
    do
    {
      return;
      l = System.currentTimeMillis();
      localObject1 = s.yf(paramString);
      localObject2 = (com.tencent.mm.plugin.card.sharecard.model.l)am.axn().getValue("key_share_card_layout_data");
      if (localObject1 == null)
      {
        x.e("MicroMsg.ShareCardDataMgr", "updateGetShareLayoutData data == null");
        a((com.tencent.mm.plugin.card.sharecard.model.l)localObject1, (com.tencent.mm.plugin.card.sharecard.model.l)localObject2, paramBoolean);
        am.axn().putValue("key_share_card_layout_data", localObject1);
        return;
      }
      if (paramBoolean) {
        com.tencent.mm.plugin.card.d.l.xX(paramString);
      }
      a((com.tencent.mm.plugin.card.sharecard.model.l)localObject1, paramBoolean);
      a((com.tencent.mm.plugin.card.sharecard.model.l)localObject1, (com.tencent.mm.plugin.card.sharecard.model.l)localObject2, paramBoolean);
      am.axn().putValue("key_share_card_layout_data", localObject1);
      j = 0;
      i = j;
      if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).hyt != null)
      {
        i = j;
        if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).hyt.size() > 0) {
          i = ((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).hyt.size();
        }
      }
      j = i;
      if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).hyu != null)
      {
        j = i;
        if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).hyu.size() > 0) {
          j = i + ((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).hyu.size();
        }
      }
    } while (j <= 0);
    int i = (int)(System.currentTimeMillis() - l);
    paramString = new ArrayList();
    Object localObject1 = new IDKey();
    ((IDKey)localObject1).SetID(281);
    ((IDKey)localObject1).SetKey(10);
    ((IDKey)localObject1).SetValue(1L);
    Object localObject2 = new IDKey();
    ((IDKey)localObject2).SetID(281);
    ((IDKey)localObject2).SetKey(11);
    ((IDKey)localObject2).SetValue(i);
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(281);
    localIDKey1.SetKey(12);
    localIDKey1.SetValue(j);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(281);
    localIDKey2.SetKey(14);
    localIDKey2.SetValue(i / j);
    paramString.add(localObject1);
    paramString.add(localObject2);
    paramString.add(localIDKey1);
    paramString.add(localIDKey2);
    com.tencent.mm.plugin.report.service.h.mEJ.b(paramString, true);
  }
  
  public final void init()
  {
    if ((com.tencent.mm.plugin.card.sharecard.model.l)am.axn().getValue("key_share_card_layout_data") == null)
    {
      x.e("MicroMsg.ShareCardDataMgr", "initShareCardLayoutData, data cache is empty!, load data from db!");
      Object localObject = com.tencent.mm.plugin.card.d.l.azU();
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        x.e("MicroMsg.ShareCardDataMgr", "initShareCardLayoutData, json is empty");
        return;
      }
      localObject = s.yf((String)localObject);
      if (localObject != null)
      {
        x.i("MicroMsg.ShareCardDataMgr", "load share card layout data success!");
        am.axn().putValue("key_share_card_layout_data", localObject);
        a((com.tencent.mm.plugin.card.sharecard.model.l)localObject, true);
        return;
      }
      x.e("MicroMsg.ShareCardDataMgr", "load share card layout data fail!");
      return;
    }
    x.i("MicroMsg.ShareCardDataMgr", "the share card layout cache is valid!");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */