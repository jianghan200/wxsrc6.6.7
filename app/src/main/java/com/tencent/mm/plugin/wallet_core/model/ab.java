package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.fa;
import com.tencent.mm.protocal.c.fb;
import com.tencent.mm.protocal.c.fc;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ab
{
  public static Bankcard a(fa paramfa)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletQueryBankcardParser", "Bankcard getBalance from balance info %s", new Object[] { paramfa });
    Bankcard localBankcard = null;
    boolean bool;
    if (paramfa != null)
    {
      localBankcard = new Bankcard((byte)0);
      a(localBankcard, paramfa.rfN, paramfa.rfO, bi.getInt(paramfa.rfJ, 0));
      localBankcard.plV = (bi.getInt(paramfa.rfJ, 0) / 100.0D);
      localBankcard.plW = paramfa.plW;
      localBankcard.plZ = paramfa.plZ;
      localBankcard.pma = paramfa.pma;
      localBankcard.plX = (bi.getInt(paramfa.rfL, 0) / 100.0D);
      localBankcard.field_cardType |= Bankcard.plL;
      localBankcard.field_bankcardType = paramfa.rfF;
      localBankcard.field_bindSerial = paramfa.rfG;
      localBankcard.field_forbidWord = paramfa.rfH;
      if (bi.oW(localBankcard.field_forbidWord)) {
        break label477;
      }
      localBankcard.field_bankcardState = 8;
      localBankcard.field_mobile = paramfa.bTi;
      if (bi.getInt(paramfa.rfM, 0) != 1) {
        break label485;
      }
      bool = true;
      label183:
      localBankcard.field_support_micropay = bool;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletQueryBankcardParser", "getBalance() support_micropay:" + paramfa.rfM);
      localBankcard.plY = paramfa.plY;
      Object localObject1 = ad.getContext().getString(a.i.wallet_balance_bank_name);
      localBankcard.field_desc = ((String)localObject1);
      localBankcard.field_bankName = ((String)localObject1);
      localBankcard.field_bankcardTail = "10000";
      localBankcard.field_forbid_title = paramfa.rfQ;
      localBankcard.field_forbid_url = paramfa.rfR;
      localObject1 = paramfa.rfT;
      if (localObject1 == null) {
        break label502;
      }
      paramfa = new JSONObject();
      try
      {
        paramfa.put("is_show_menu", ((fb)localObject1).rfU);
        Object localObject2 = ((fb)localObject1).rfV;
        localObject1 = new JSONArray();
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          fc localfc = (fc)((Iterator)localObject2).next();
          JSONObject localJSONObject = new JSONObject();
          localJSONObject.put("title", localfc.title);
          localJSONObject.put("jump_type", localfc.paB);
          localJSONObject.put("jump_h5_url", localfc.paC);
          localJSONObject.put("tinyapp_username", localfc.paD);
          localJSONObject.put("tinyapp_path", localfc.paE);
          ((JSONArray)localObject1).put(localJSONObject);
          continue;
        }
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.WalletQueryBankcardParser", localException, "Bankcard getBalance from balance, assemble menuInfoJson error: %s", new Object[] { localException.getMessage() });
      }
    }
    for (;;)
    {
      tmp449_446[0] = paramfa.toString();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WalletQueryBankcardParser", "balance menu info: %s", tmp449_446);
      g.Ei().DT().a(aa.a.sZr, paramfa.toString());
      return localBankcard;
      label477:
      localBankcard.field_bankcardState = 0;
      break;
      label485:
      bool = false;
      break label183;
      paramfa.put("balance_menu_item", localException);
    }
    label502:
    g.Ei().DT().a(aa.a.sZr, "");
    return localBankcard;
  }
  
  public static b a(JSONObject paramJSONObject, boolean paramBoolean)
  {
    int i = 0;
    if (paramJSONObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), json is null");
      return null;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), json is valid");
    b localb = new b();
    localb.plA = paramJSONObject.optString("fetch_charge_title");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletQueryBankcardParser", "fetch_charge_title:" + localb.plA);
    if (paramBoolean)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletQueryBankcardParser", "isBindQuery true");
      localb.oZS = paramJSONObject.optInt("is_cal_charge", 0);
      localb.oZR = paramJSONObject.optInt("is_show_charge", 0);
      localb.oZT = paramJSONObject.optInt("is_full_fetch_direct", 0);
      localb.oZU = (paramJSONObject.optDouble("min_charge_fee", 0.0D) / 100.0D);
      localb.mxI = (paramJSONObject.optDouble("remain_fee", 0.0D) / 100.0D);
      localb.plC = paramJSONObject.optString("card_list_wording_title", "");
      localb.plD = paramJSONObject.optString("card_list_wording_content", "");
      if (paramJSONObject.has("withdraw_sector")) {
        localb.plE = b.ad(paramJSONObject.optJSONObject("withdraw_sector"));
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletQueryBankcardParser", " is_cal_charge:" + localb.oZS + " is_show_charge:" + localb.oZR + " min_charge_fee:" + localb.oZU + " remain_fee:" + localb.mxI + " is_full_fetch_direct:" + localb.oZT);
      paramJSONObject = paramJSONObject.optJSONArray("item");
      if ((paramJSONObject == null) || (paramJSONObject.length() <= 0)) {
        break label513;
      }
      localb.plB = new LinkedList();
      label307:
      if (i >= paramJSONObject.length()) {
        break label483;
      }
      JSONObject localJSONObject = paramJSONObject.optJSONObject(i);
      if (localJSONObject == null) {
        break label452;
      }
      b.b localb1 = new b.b();
      localb1.aAL = localJSONObject.optString("key");
      localb1.value = localJSONObject.optString("value");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletQueryBankcardParser", "feeItem.key is " + localb1.aAL + " , feeItem.value is " + localb1.value);
      if ((!TextUtils.isEmpty(localb1.aAL)) && (!TextUtils.isEmpty(localb1.value))) {
        localb.plB.add(localb1);
      }
    }
    for (;;)
    {
      i += 1;
      break label307;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletQueryBankcardParser", "isBindQuery false");
      break;
      label452:
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletQueryBankcardParser", "item index " + i + " is empty");
    }
    label483:
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletQueryBankcardParser", "itemsList size is " + localb.plB.size());
    for (;;)
    {
      return localb;
      label513:
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), itemJsonArray is null");
    }
  }
  
  private static void a(Bankcard paramBankcard, long paramLong1, long paramLong2, int paramInt)
  {
    paramBankcard = new ab.1(paramLong2, paramLong1, paramInt, paramBankcard);
    com.tencent.mm.wallet_core.ui.e.a(new String[] { "wallet_balance_version", "wallet_balance_last_update_time", "wallet_balance" }, paramBankcard);
  }
  
  /* Error */
  public static void a(JSONObject paramJSONObject, int paramInt)
  {
    // Byte code:
    //   0: ldc 10
    //   2: ldc_w 479
    //   5: invokestatic 133	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   8: aload_0
    //   9: ldc_w 481
    //   12: invokevirtual 485	org/json/JSONObject:optLong	(Ljava/lang/String;)J
    //   15: lstore 5
    //   17: lload 5
    //   19: lconst_0
    //   20: lcmp
    //   21: ifle +1590 -> 1611
    //   24: lload 5
    //   26: invokestatic 489	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   29: invokestatic 494	com/tencent/mm/wallet_core/c/o:setTimeStamp	(Ljava/lang/String;)V
    //   32: aload_0
    //   33: ldc_w 496
    //   36: invokevirtual 499	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   39: astore 9
    //   41: ldc 10
    //   43: ldc_w 501
    //   46: invokestatic 133	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   49: new 503	com/tencent/mm/plugin/wallet_core/model/af
    //   52: dup
    //   53: invokespecial 504	com/tencent/mm/plugin/wallet_core/model/af:<init>	()V
    //   56: astore 8
    //   58: aload 9
    //   60: ifnull +1656 -> 1716
    //   63: aload 9
    //   65: invokevirtual 505	org/json/JSONObject:length	()I
    //   68: ifle +1648 -> 1716
    //   71: aload 8
    //   73: aload 9
    //   75: ldc_w 507
    //   78: invokevirtual 510	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   81: putfield 513	com/tencent/mm/plugin/wallet_core/model/af:field_is_reg	I
    //   84: aload 8
    //   86: aload 9
    //   88: ldc_w 515
    //   91: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   94: putfield 518	com/tencent/mm/plugin/wallet_core/model/af:field_true_name	Ljava/lang/String;
    //   97: aload 8
    //   99: aload 9
    //   101: ldc_w 520
    //   104: iconst_m1
    //   105: invokevirtual 327	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   108: putfield 523	com/tencent/mm/plugin/wallet_core/model/af:field_cre_type	I
    //   111: aload 8
    //   113: aload 9
    //   115: ldc_w 525
    //   118: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   121: putfield 528	com/tencent/mm/plugin/wallet_core/model/af:field_main_card_bind_serialno	Ljava/lang/String;
    //   124: aload 8
    //   126: aload 9
    //   128: ldc_w 530
    //   131: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   134: putfield 533	com/tencent/mm/plugin/wallet_core/model/af:field_cre_name	Ljava/lang/String;
    //   137: aload 8
    //   139: aload 9
    //   141: ldc_w 535
    //   144: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   147: putfield 538	com/tencent/mm/plugin/wallet_core/model/af:field_ftf_pay_url	Ljava/lang/String;
    //   150: aload 8
    //   152: aload 9
    //   154: ldc_w 540
    //   157: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   160: putfield 543	com/tencent/mm/plugin/wallet_core/model/af:field_reset_passwd_flag	Ljava/lang/String;
    //   163: aload 8
    //   165: aload 9
    //   167: ldc_w 545
    //   170: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   173: putfield 548	com/tencent/mm/plugin/wallet_core/model/af:field_find_passwd_url	Ljava/lang/String;
    //   176: invokestatic 554	com/tencent/mm/plugin/wallet_core/model/o:bOW	()Lcom/tencent/mm/plugin/wallet_core/model/ag;
    //   179: pop
    //   180: aload 8
    //   182: getfield 528	com/tencent/mm/plugin/wallet_core/model/af:field_main_card_bind_serialno	Ljava/lang/String;
    //   185: invokestatic 559	com/tencent/mm/plugin/wallet_core/model/ag:Pc	(Ljava/lang/String;)V
    //   188: aload 8
    //   190: ldc_w 561
    //   193: aload 9
    //   195: ldc_w 563
    //   198: ldc_w 561
    //   201: invokevirtual 359	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   204: invokevirtual 566	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   207: putfield 569	com/tencent/mm/plugin/wallet_core/model/af:field_isDomesticUser	Z
    //   210: aload 9
    //   212: ldc_w 571
    //   215: invokevirtual 376	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   218: astore 10
    //   220: aload 10
    //   222: ifnull +1440 -> 1662
    //   225: aload 8
    //   227: aload 10
    //   229: ldc_w 573
    //   232: iconst_0
    //   233: invokevirtual 327	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   236: putfield 576	com/tencent/mm/plugin/wallet_core/model/af:field_is_open_touch	I
    //   239: ldc 10
    //   241: new 117	java/lang/StringBuilder
    //   244: dup
    //   245: ldc_w 578
    //   248: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   251: aload 8
    //   253: getfield 576	com/tencent/mm/plugin/wallet_core/model/af:field_is_open_touch	I
    //   256: invokevirtual 389	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   259: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   262: invokestatic 133	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   265: aload 8
    //   267: aload 9
    //   269: ldc_w 580
    //   272: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   275: putfield 583	com/tencent/mm/plugin/wallet_core/model/af:field_lct_wording	Ljava/lang/String;
    //   278: aload 8
    //   280: aload 9
    //   282: ldc_w 585
    //   285: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   288: putfield 588	com/tencent/mm/plugin/wallet_core/model/af:field_lct_url	Ljava/lang/String;
    //   291: ldc 10
    //   293: new 117	java/lang/StringBuilder
    //   296: dup
    //   297: ldc_w 590
    //   300: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   303: aload 8
    //   305: getfield 583	com/tencent/mm/plugin/wallet_core/model/af:field_lct_wording	Ljava/lang/String;
    //   308: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: ldc_w 592
    //   314: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: aload 8
    //   319: getfield 588	com/tencent/mm/plugin/wallet_core/model/af:field_lct_url	Ljava/lang/String;
    //   322: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   328: invokestatic 133	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   331: aload 8
    //   333: aload 9
    //   335: ldc_w 594
    //   338: iconst_m1
    //   339: invokevirtual 327	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   342: putfield 597	com/tencent/mm/plugin/wallet_core/model/af:field_lqt_state	I
    //   345: aload 9
    //   347: ldc_w 599
    //   350: invokevirtual 376	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   353: astore 10
    //   355: ldc 10
    //   357: ldc_w 601
    //   360: iconst_2
    //   361: anewarray 4	java/lang/Object
    //   364: dup
    //   365: iconst_0
    //   366: aload 8
    //   368: getfield 597	com/tencent/mm/plugin/wallet_core/model/af:field_lqt_state	I
    //   371: invokestatic 606	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   374: aastore
    //   375: dup
    //   376: iconst_1
    //   377: aload 10
    //   379: aastore
    //   380: invokestatic 18	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   383: aload 10
    //   385: ifnull +42 -> 427
    //   388: aload 8
    //   390: aload 10
    //   392: ldc_w 608
    //   395: invokevirtual 610	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   398: putfield 613	com/tencent/mm/plugin/wallet_core/model/af:field_is_show_lqb	I
    //   401: aload 8
    //   403: aload 10
    //   405: ldc_w 615
    //   408: invokevirtual 610	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   411: putfield 618	com/tencent/mm/plugin/wallet_core/model/af:field_is_open_lqb	I
    //   414: aload 8
    //   416: aload 10
    //   418: ldc_w 620
    //   421: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   424: putfield 623	com/tencent/mm/plugin/wallet_core/model/af:field_lqb_open_url	Ljava/lang/String;
    //   427: aload 9
    //   429: ldc_w 625
    //   432: invokevirtual 376	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   435: astore 9
    //   437: ldc 10
    //   439: ldc_w 627
    //   442: iconst_1
    //   443: anewarray 4	java/lang/Object
    //   446: dup
    //   447: iconst_0
    //   448: aload 9
    //   450: aastore
    //   451: invokestatic 18	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   454: aload 9
    //   456: ifnull +81 -> 537
    //   459: aload 8
    //   461: aload 9
    //   463: ldc_w 629
    //   466: invokevirtual 610	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   469: putfield 632	com/tencent/mm/plugin/wallet_core/model/af:field_lqt_cell_is_show	I
    //   472: aload 8
    //   474: aload 9
    //   476: ldc_w 634
    //   479: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   482: putfield 637	com/tencent/mm/plugin/wallet_core/model/af:field_lqt_cell_icon	Ljava/lang/String;
    //   485: aload 8
    //   487: aload 9
    //   489: ldc_w 639
    //   492: invokevirtual 610	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   495: putfield 642	com/tencent/mm/plugin/wallet_core/model/af:field_lqt_cell_is_open_lqt	I
    //   498: aload 8
    //   500: aload 9
    //   502: ldc_w 644
    //   505: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   508: putfield 647	com/tencent/mm/plugin/wallet_core/model/af:field_lqt_cell_lqt_open_url	Ljava/lang/String;
    //   511: aload 8
    //   513: aload 9
    //   515: ldc_w 649
    //   518: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   521: putfield 652	com/tencent/mm/plugin/wallet_core/model/af:field_lqt_cell_lqt_title	Ljava/lang/String;
    //   524: aload 8
    //   526: aload 9
    //   528: ldc_w 654
    //   531: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   534: putfield 657	com/tencent/mm/plugin/wallet_core/model/af:field_lqt_cell_lqt_wording	Ljava/lang/String;
    //   537: iload_1
    //   538: invokestatic 661	com/tencent/mm/plugin/wallet_core/model/ab:zm	(I)Z
    //   541: ifne +13 -> 554
    //   544: iload_1
    //   545: iconst_3
    //   546: if_icmpeq +8 -> 554
    //   549: iload_1
    //   550: iconst_4
    //   551: if_icmpne +1943 -> 2494
    //   554: invokestatic 665	com/tencent/mm/kernel/g:Ek	()Lcom/tencent/mm/kernel/g;
    //   557: pop
    //   558: invokestatic 276	com/tencent/mm/kernel/g:Ei	()Lcom/tencent/mm/kernel/e;
    //   561: invokevirtual 282	com/tencent/mm/kernel/e:DT	()Lcom/tencent/mm/storage/x;
    //   564: getstatic 668	com/tencent/mm/storage/aa$a:sYw	Lcom/tencent/mm/storage/aa$a;
    //   567: aload 8
    //   569: getfield 597	com/tencent/mm/plugin/wallet_core/model/af:field_lqt_state	I
    //   572: invokestatic 606	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   575: invokevirtual 293	com/tencent/mm/storage/x:a	(Lcom/tencent/mm/storage/aa$a;Ljava/lang/Object;)V
    //   578: invokestatic 665	com/tencent/mm/kernel/g:Ek	()Lcom/tencent/mm/kernel/g;
    //   581: pop
    //   582: invokestatic 276	com/tencent/mm/kernel/g:Ei	()Lcom/tencent/mm/kernel/e;
    //   585: invokevirtual 282	com/tencent/mm/kernel/e:DT	()Lcom/tencent/mm/storage/x;
    //   588: getstatic 671	com/tencent/mm/storage/aa$a:sYx	Lcom/tencent/mm/storage/aa$a;
    //   591: aload 8
    //   593: getfield 583	com/tencent/mm/plugin/wallet_core/model/af:field_lct_wording	Ljava/lang/String;
    //   596: invokevirtual 293	com/tencent/mm/storage/x:a	(Lcom/tencent/mm/storage/aa$a;Ljava/lang/Object;)V
    //   599: goto +1895 -> 2494
    //   602: aload 8
    //   604: aload_0
    //   605: ldc_w 673
    //   608: invokevirtual 499	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   611: ldc_w 675
    //   614: invokevirtual 510	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   617: putfield 678	com/tencent/mm/plugin/wallet_core/model/af:field_switchConfig	I
    //   620: aload 8
    //   622: aload_0
    //   623: ldc_w 680
    //   626: invokevirtual 610	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   629: putfield 683	com/tencent/mm/plugin/wallet_core/model/af:field_paymenu_use_new	I
    //   632: ldc 10
    //   634: ldc_w 685
    //   637: iconst_1
    //   638: anewarray 4	java/lang/Object
    //   641: dup
    //   642: iconst_0
    //   643: aload 8
    //   645: getfield 683	com/tencent/mm/plugin/wallet_core/model/af:field_paymenu_use_new	I
    //   648: invokestatic 606	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   651: aastore
    //   652: invokestatic 18	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   655: aload_0
    //   656: ldc_w 687
    //   659: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   662: astore 9
    //   664: invokestatic 665	com/tencent/mm/kernel/g:Ek	()Lcom/tencent/mm/kernel/g;
    //   667: pop
    //   668: invokestatic 276	com/tencent/mm/kernel/g:Ei	()Lcom/tencent/mm/kernel/e;
    //   671: invokevirtual 282	com/tencent/mm/kernel/e:DT	()Lcom/tencent/mm/storage/x;
    //   674: getstatic 690	com/tencent/mm/storage/aa$a:sPz	Lcom/tencent/mm/storage/aa$a;
    //   677: aload 9
    //   679: invokestatic 693	com/tencent/mm/sdk/platformtools/bi:oV	(Ljava/lang/String;)Ljava/lang/String;
    //   682: invokevirtual 293	com/tencent/mm/storage/x:a	(Lcom/tencent/mm/storage/aa$a;Ljava/lang/Object;)V
    //   685: aload_0
    //   686: ldc_w 695
    //   689: invokevirtual 406	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   692: invokestatic 699	com/tencent/mm/plugin/wallet_core/model/ab:s	(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    //   695: astore 13
    //   697: aload_0
    //   698: ldc_w 701
    //   701: invokevirtual 406	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   704: invokestatic 704	com/tencent/mm/plugin/wallet_core/model/ab:t	(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    //   707: astore 14
    //   709: aload_0
    //   710: ldc_w 706
    //   713: invokevirtual 376	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   716: astore 10
    //   718: aload 10
    //   720: ifnonnull +1785 -> 2505
    //   723: ldc_w 297
    //   726: astore 9
    //   728: ldc 10
    //   730: ldc_w 708
    //   733: iconst_1
    //   734: anewarray 4	java/lang/Object
    //   737: dup
    //   738: iconst_0
    //   739: aload 9
    //   741: aastore
    //   742: invokestatic 18	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   745: aload 10
    //   747: ifnull +1010 -> 1757
    //   750: aload 10
    //   752: invokevirtual 505	org/json/JSONObject:length	()I
    //   755: ifle +1002 -> 1757
    //   758: new 20	com/tencent/mm/plugin/wallet_core/model/Bankcard
    //   761: dup
    //   762: iconst_0
    //   763: invokespecial 24	com/tencent/mm/plugin/wallet_core/model/Bankcard:<init>	(B)V
    //   766: astore 9
    //   768: aload 9
    //   770: aload 10
    //   772: ldc_w 710
    //   775: ldc2_w 711
    //   778: invokevirtual 715	org/json/JSONObject:optLong	(Ljava/lang/String;J)J
    //   781: aload 10
    //   783: ldc_w 717
    //   786: ldc2_w 718
    //   789: invokevirtual 715	org/json/JSONObject:optLong	(Ljava/lang/String;J)J
    //   792: aload 10
    //   794: ldc_w 721
    //   797: invokevirtual 610	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   800: invokestatic 47	com/tencent/mm/plugin/wallet_core/model/ab:a	(Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;JJI)V
    //   803: aload 9
    //   805: aload 10
    //   807: ldc_w 721
    //   810: invokevirtual 610	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   813: i2d
    //   814: ldc2_w 48
    //   817: ddiv
    //   818: putfield 53	com/tencent/mm/plugin/wallet_core/model/Bankcard:plV	D
    //   821: aload 9
    //   823: aload 10
    //   825: ldc_w 723
    //   828: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   831: putfield 57	com/tencent/mm/plugin/wallet_core/model/Bankcard:plW	Ljava/lang/String;
    //   834: aload 9
    //   836: aload 10
    //   838: ldc_w 725
    //   841: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   844: putfield 61	com/tencent/mm/plugin/wallet_core/model/Bankcard:plZ	Ljava/lang/String;
    //   847: aload 9
    //   849: aload 10
    //   851: ldc_w 727
    //   854: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   857: putfield 65	com/tencent/mm/plugin/wallet_core/model/Bankcard:pma	Ljava/lang/String;
    //   860: aload 9
    //   862: aload 10
    //   864: ldc_w 729
    //   867: invokevirtual 610	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   870: i2d
    //   871: ldc2_w 48
    //   874: ddiv
    //   875: putfield 71	com/tencent/mm/plugin/wallet_core/model/Bankcard:plX	D
    //   878: aload 9
    //   880: aload 9
    //   882: getfield 74	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_cardType	I
    //   885: getstatic 77	com/tencent/mm/plugin/wallet_core/model/Bankcard:plL	I
    //   888: ior
    //   889: putfield 74	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_cardType	I
    //   892: aload 9
    //   894: aload 10
    //   896: ldc_w 731
    //   899: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   902: putfield 83	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_bankcardType	Ljava/lang/String;
    //   905: aload 9
    //   907: aload 10
    //   909: ldc_w 733
    //   912: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   915: putfield 89	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_bindSerial	Ljava/lang/String;
    //   918: aload 9
    //   920: aload 10
    //   922: ldc_w 735
    //   925: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   928: putfield 95	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_forbidWord	Ljava/lang/String;
    //   931: aload 9
    //   933: getfield 95	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_forbidWord	Ljava/lang/String;
    //   936: invokestatic 99	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   939: ifne +791 -> 1730
    //   942: aload 9
    //   944: bipush 8
    //   946: putfield 102	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_bankcardState	I
    //   949: aload 9
    //   951: aload 10
    //   953: ldc_w 737
    //   956: invokevirtual 485	org/json/JSONObject:optLong	(Ljava/lang/String;)J
    //   959: putfield 740	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_fetchArriveTime	J
    //   962: aload 9
    //   964: aload 10
    //   966: ldc_w 742
    //   969: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   972: putfield 108	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_mobile	Ljava/lang/String;
    //   975: aload 10
    //   977: ldc_w 744
    //   980: iconst_0
    //   981: invokevirtual 327	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   984: iconst_1
    //   985: if_icmpne +1527 -> 2512
    //   988: iconst_1
    //   989: istore 7
    //   991: aload 9
    //   993: iload 7
    //   995: putfield 115	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_support_micropay	Z
    //   998: ldc 10
    //   1000: new 117	java/lang/StringBuilder
    //   1003: dup
    //   1004: ldc 119
    //   1006: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1009: aload 10
    //   1011: ldc_w 744
    //   1014: iconst_0
    //   1015: invokevirtual 327	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   1018: invokevirtual 389	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1021: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1024: invokestatic 133	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1027: aload 9
    //   1029: aload 10
    //   1031: ldc_w 746
    //   1034: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   1037: putfield 137	com/tencent/mm/plugin/wallet_core/model/Bankcard:plY	Ljava/lang/String;
    //   1040: invokestatic 143	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   1043: getstatic 148	com/tencent/mm/plugin/wxpay/a$i:wallet_balance_bank_name	I
    //   1046: invokevirtual 154	android/content/Context:getString	(I)Ljava/lang/String;
    //   1049: astore 11
    //   1051: aload 9
    //   1053: aload 11
    //   1055: putfield 157	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_desc	Ljava/lang/String;
    //   1058: aload 9
    //   1060: aload 11
    //   1062: putfield 160	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_bankName	Ljava/lang/String;
    //   1065: aload 9
    //   1067: ldc -94
    //   1069: putfield 165	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_bankcardTail	Ljava/lang/String;
    //   1072: aload 9
    //   1074: aload 10
    //   1076: ldc_w 748
    //   1079: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   1082: putfield 171	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_forbid_title	Ljava/lang/String;
    //   1085: aload 9
    //   1087: aload 10
    //   1089: ldc_w 750
    //   1092: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   1095: putfield 177	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_forbid_url	Ljava/lang/String;
    //   1098: aload 10
    //   1100: ldc_w 752
    //   1103: invokevirtual 376	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   1106: astore 10
    //   1108: aload 10
    //   1110: ifnull +629 -> 1739
    //   1113: aload 10
    //   1115: invokevirtual 267	org/json/JSONObject:toString	()Ljava/lang/String;
    //   1118: astore 10
    //   1120: ldc 10
    //   1122: ldc_w 266
    //   1125: iconst_1
    //   1126: anewarray 4	java/lang/Object
    //   1129: dup
    //   1130: iconst_0
    //   1131: aload 10
    //   1133: aastore
    //   1134: invokestatic 270	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1137: invokestatic 276	com/tencent/mm/kernel/g:Ei	()Lcom/tencent/mm/kernel/e;
    //   1140: invokevirtual 282	com/tencent/mm/kernel/e:DT	()Lcom/tencent/mm/storage/x;
    //   1143: getstatic 288	com/tencent/mm/storage/aa$a:sZr	Lcom/tencent/mm/storage/aa$a;
    //   1146: aload 10
    //   1148: invokevirtual 293	com/tencent/mm/storage/x:a	(Lcom/tencent/mm/storage/aa$a;Ljava/lang/Object;)V
    //   1151: goto +1346 -> 2497
    //   1154: aload_0
    //   1155: ldc_w 754
    //   1158: invokevirtual 610	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   1161: istore_3
    //   1162: ldc 10
    //   1164: ldc_w 756
    //   1167: iconst_1
    //   1168: anewarray 4	java/lang/Object
    //   1171: dup
    //   1172: iconst_0
    //   1173: iload_3
    //   1174: invokestatic 606	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1177: aastore
    //   1178: invokestatic 18	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1181: aload_0
    //   1182: ldc_w 758
    //   1185: invokevirtual 376	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   1188: astore 11
    //   1190: aload 11
    //   1192: ifnull +31 -> 1223
    //   1195: aload 11
    //   1197: ldc_w 760
    //   1200: invokevirtual 376	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   1203: astore 10
    //   1205: aload 10
    //   1207: ldc_w 762
    //   1210: invokevirtual 610	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   1213: pop
    //   1214: aload 10
    //   1216: ldc_w 764
    //   1219: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   1222: pop
    //   1223: invokestatic 770	com/tencent/mm/plugin/wallet_core/model/g:bOA	()Lcom/tencent/mm/plugin/wallet_core/model/g;
    //   1226: astore 10
    //   1228: aload 10
    //   1230: aload 11
    //   1232: putfield 774	com/tencent/mm/plugin/wallet_core/model/g:pmR	Lorg/json/JSONObject;
    //   1235: aload 10
    //   1237: getfield 774	com/tencent/mm/plugin/wallet_core/model/g:pmR	Lorg/json/JSONObject;
    //   1240: ifnull +531 -> 1771
    //   1243: aload 10
    //   1245: getfield 774	com/tencent/mm/plugin/wallet_core/model/g:pmR	Lorg/json/JSONObject;
    //   1248: ldc_w 760
    //   1251: invokevirtual 376	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   1254: astore 11
    //   1256: aload 10
    //   1258: aload 11
    //   1260: ldc_w 762
    //   1263: invokevirtual 610	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   1266: putfield 777	com/tencent/mm/plugin/wallet_core/model/g:pmQ	I
    //   1269: aload 10
    //   1271: aload 11
    //   1273: ldc_w 764
    //   1276: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   1279: putfield 780	com/tencent/mm/plugin/wallet_core/model/g:lMX	Ljava/lang/String;
    //   1282: ldc_w 782
    //   1285: ldc_w 784
    //   1288: iconst_3
    //   1289: anewarray 4	java/lang/Object
    //   1292: dup
    //   1293: iconst_0
    //   1294: aload 10
    //   1296: getfield 774	com/tencent/mm/plugin/wallet_core/model/g:pmR	Lorg/json/JSONObject;
    //   1299: aastore
    //   1300: dup
    //   1301: iconst_1
    //   1302: aload 10
    //   1304: getfield 777	com/tencent/mm/plugin/wallet_core/model/g:pmQ	I
    //   1307: invokestatic 606	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1310: aastore
    //   1311: dup
    //   1312: iconst_2
    //   1313: aload 10
    //   1315: getfield 780	com/tencent/mm/plugin/wallet_core/model/g:lMX	Ljava/lang/String;
    //   1318: aastore
    //   1319: invokestatic 18	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1322: aload_0
    //   1323: ldc_w 786
    //   1326: invokevirtual 406	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   1329: astore 10
    //   1331: aload 10
    //   1333: ifnull +489 -> 1822
    //   1336: aload 10
    //   1338: invokevirtual 410	org/json/JSONArray:length	()I
    //   1341: ifle +481 -> 1822
    //   1344: invokestatic 792	com/tencent/mm/plugin/wallet_core/model/d:bOx	()Lcom/tencent/mm/plugin/wallet_core/model/d;
    //   1347: aload 10
    //   1349: iconst_0
    //   1350: invokevirtual 794	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   1353: invokevirtual 798	com/tencent/mm/plugin/wallet_core/model/d:ae	(Lorg/json/JSONObject;)Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;
    //   1356: astore 10
    //   1358: aload 10
    //   1360: aload 10
    //   1362: getfield 74	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_cardType	I
    //   1365: getstatic 801	com/tencent/mm/plugin/wallet_core/model/Bankcard:plM	I
    //   1368: ior
    //   1369: putfield 74	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_cardType	I
    //   1372: aload_0
    //   1373: ldc_w 803
    //   1376: invokevirtual 406	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   1379: astore 11
    //   1381: aload_0
    //   1382: ldc_w 805
    //   1385: invokevirtual 406	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   1388: astore 12
    //   1390: aload 11
    //   1392: ifnull +1126 -> 2518
    //   1395: aload 11
    //   1397: invokevirtual 806	org/json/JSONArray:toString	()Ljava/lang/String;
    //   1400: ldc_w 297
    //   1403: invokestatic 809	com/tencent/mm/sdk/platformtools/bi:aG	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1406: astore 11
    //   1408: aload 12
    //   1410: ifnull +1116 -> 2526
    //   1413: aload 12
    //   1415: invokevirtual 806	org/json/JSONArray:toString	()Ljava/lang/String;
    //   1418: ldc_w 297
    //   1421: invokestatic 809	com/tencent/mm/sdk/platformtools/bi:aG	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1424: astore 12
    //   1426: ldc 10
    //   1428: ldc_w 811
    //   1431: iconst_2
    //   1432: anewarray 4	java/lang/Object
    //   1435: dup
    //   1436: iconst_0
    //   1437: aload 11
    //   1439: aastore
    //   1440: dup
    //   1441: iconst_1
    //   1442: aload 12
    //   1444: aastore
    //   1445: invokestatic 18	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1448: invokestatic 665	com/tencent/mm/kernel/g:Ek	()Lcom/tencent/mm/kernel/g;
    //   1451: pop
    //   1452: invokestatic 276	com/tencent/mm/kernel/g:Ei	()Lcom/tencent/mm/kernel/e;
    //   1455: invokevirtual 282	com/tencent/mm/kernel/e:DT	()Lcom/tencent/mm/storage/x;
    //   1458: getstatic 814	com/tencent/mm/storage/aa$a:sPx	Lcom/tencent/mm/storage/aa$a;
    //   1461: aload 11
    //   1463: invokevirtual 293	com/tencent/mm/storage/x:a	(Lcom/tencent/mm/storage/aa$a;Ljava/lang/Object;)V
    //   1466: invokestatic 665	com/tencent/mm/kernel/g:Ek	()Lcom/tencent/mm/kernel/g;
    //   1469: pop
    //   1470: invokestatic 276	com/tencent/mm/kernel/g:Ei	()Lcom/tencent/mm/kernel/e;
    //   1473: invokevirtual 282	com/tencent/mm/kernel/e:DT	()Lcom/tencent/mm/storage/x;
    //   1476: getstatic 817	com/tencent/mm/storage/aa$a:sPy	Lcom/tencent/mm/storage/aa$a;
    //   1479: aload 12
    //   1481: invokevirtual 293	com/tencent/mm/storage/x:a	(Lcom/tencent/mm/storage/aa$a;Ljava/lang/Object;)V
    //   1484: invokestatic 665	com/tencent/mm/kernel/g:Ek	()Lcom/tencent/mm/kernel/g;
    //   1487: pop
    //   1488: invokestatic 276	com/tencent/mm/kernel/g:Ei	()Lcom/tencent/mm/kernel/e;
    //   1491: invokevirtual 282	com/tencent/mm/kernel/e:DT	()Lcom/tencent/mm/storage/x;
    //   1494: iconst_1
    //   1495: invokevirtual 821	com/tencent/mm/storage/x:lm	(Z)V
    //   1498: aload_0
    //   1499: ldc_w 823
    //   1502: invokevirtual 376	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   1505: astore 11
    //   1507: new 412	java/util/LinkedList
    //   1510: dup
    //   1511: invokespecial 413	java/util/LinkedList:<init>	()V
    //   1514: astore 15
    //   1516: aload 11
    //   1518: ifnull +334 -> 1852
    //   1521: aload 11
    //   1523: ldc_w 825
    //   1526: invokevirtual 406	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   1529: astore 11
    //   1531: aload 11
    //   1533: ifnull +319 -> 1852
    //   1536: aload 11
    //   1538: invokevirtual 410	org/json/JSONArray:length	()I
    //   1541: istore 4
    //   1543: iconst_0
    //   1544: istore_2
    //   1545: iload_2
    //   1546: iload 4
    //   1548: if_icmpge +304 -> 1852
    //   1551: new 827	com/tencent/mm/plugin/wallet_core/model/c
    //   1554: dup
    //   1555: invokespecial 828	com/tencent/mm/plugin/wallet_core/model/c:<init>	()V
    //   1558: astore 12
    //   1560: aload 11
    //   1562: iload_2
    //   1563: invokevirtual 794	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   1566: astore 16
    //   1568: aload 12
    //   1570: aload 16
    //   1572: ldc_w 830
    //   1575: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   1578: putfield 833	com/tencent/mm/plugin/wallet_core/model/c:lMW	Ljava/lang/String;
    //   1581: aload 12
    //   1583: aload 16
    //   1585: ldc_w 835
    //   1588: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   1591: putfield 838	com/tencent/mm/plugin/wallet_core/model/c:plH	Ljava/lang/String;
    //   1594: aload 15
    //   1596: aload 12
    //   1598: invokeinterface 839 2 0
    //   1603: pop
    //   1604: iload_2
    //   1605: iconst_1
    //   1606: iadd
    //   1607: istore_2
    //   1608: goto -63 -> 1545
    //   1611: ldc 10
    //   1613: ldc_w 841
    //   1616: invokestatic 844	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1619: goto -1587 -> 32
    //   1622: astore_0
    //   1623: ldc 10
    //   1625: new 117	java/lang/StringBuilder
    //   1628: dup
    //   1629: ldc_w 846
    //   1632: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1635: aload_0
    //   1636: invokevirtual 260	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1639: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1642: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1645: invokestatic 304	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1648: ldc 10
    //   1650: aload_0
    //   1651: ldc_w 297
    //   1654: iconst_0
    //   1655: anewarray 4	java/lang/Object
    //   1658: invokestatic 264	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1661: return
    //   1662: ldc 10
    //   1664: ldc_w 848
    //   1667: invokestatic 304	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1670: invokestatic 554	com/tencent/mm/plugin/wallet_core/model/o:bOW	()Lcom/tencent/mm/plugin/wallet_core/model/ag;
    //   1673: invokevirtual 851	com/tencent/mm/plugin/wallet_core/model/ag:bPu	()Z
    //   1676: ifeq +824 -> 2500
    //   1679: iconst_1
    //   1680: istore_2
    //   1681: aload 8
    //   1683: iload_2
    //   1684: putfield 576	com/tencent/mm/plugin/wallet_core/model/af:field_is_open_touch	I
    //   1687: ldc 10
    //   1689: new 117	java/lang/StringBuilder
    //   1692: dup
    //   1693: ldc_w 853
    //   1696: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1699: aload 8
    //   1701: getfield 576	com/tencent/mm/plugin/wallet_core/model/af:field_is_open_touch	I
    //   1704: invokevirtual 389	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1707: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1710: invokestatic 304	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1713: goto -1448 -> 265
    //   1716: ldc 10
    //   1718: ldc_w 855
    //   1721: invokestatic 304	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1724: aconst_null
    //   1725: astore 8
    //   1727: goto -1125 -> 602
    //   1730: aload 9
    //   1732: iconst_0
    //   1733: putfield 102	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_bankcardState	I
    //   1736: goto -787 -> 949
    //   1739: invokestatic 276	com/tencent/mm/kernel/g:Ei	()Lcom/tencent/mm/kernel/e;
    //   1742: invokevirtual 282	com/tencent/mm/kernel/e:DT	()Lcom/tencent/mm/storage/x;
    //   1745: getstatic 288	com/tencent/mm/storage/aa$a:sZr	Lcom/tencent/mm/storage/aa$a;
    //   1748: ldc_w 297
    //   1751: invokevirtual 293	com/tencent/mm/storage/x:a	(Lcom/tencent/mm/storage/aa$a;Ljava/lang/Object;)V
    //   1754: goto +743 -> 2497
    //   1757: ldc 10
    //   1759: ldc_w 857
    //   1762: invokestatic 133	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1765: aconst_null
    //   1766: astore 9
    //   1768: goto -614 -> 1154
    //   1771: aload 10
    //   1773: iconst_0
    //   1774: putfield 777	com/tencent/mm/plugin/wallet_core/model/g:pmQ	I
    //   1777: aload 10
    //   1779: ldc_w 297
    //   1782: putfield 780	com/tencent/mm/plugin/wallet_core/model/g:lMX	Ljava/lang/String;
    //   1785: goto -503 -> 1282
    //   1788: astore 11
    //   1790: aload 10
    //   1792: iconst_0
    //   1793: putfield 777	com/tencent/mm/plugin/wallet_core/model/g:pmQ	I
    //   1796: aload 10
    //   1798: ldc_w 297
    //   1801: putfield 780	com/tencent/mm/plugin/wallet_core/model/g:lMX	Ljava/lang/String;
    //   1804: ldc_w 782
    //   1807: aload 11
    //   1809: ldc_w 297
    //   1812: iconst_0
    //   1813: anewarray 4	java/lang/Object
    //   1816: invokestatic 264	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1819: goto -537 -> 1282
    //   1822: ldc 10
    //   1824: ldc_w 859
    //   1827: invokestatic 304	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1830: aconst_null
    //   1831: astore 10
    //   1833: goto -461 -> 1372
    //   1836: astore 11
    //   1838: ldc 10
    //   1840: aload 11
    //   1842: ldc_w 297
    //   1845: iconst_0
    //   1846: anewarray 4	java/lang/Object
    //   1849: invokestatic 264	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1852: aload_0
    //   1853: ldc_w 861
    //   1856: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   1859: pop
    //   1860: aload_0
    //   1861: ldc_w 863
    //   1864: invokevirtual 376	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   1867: astore 12
    //   1869: aload 12
    //   1871: ifnonnull +111 -> 1982
    //   1874: ldc 10
    //   1876: ldc_w 865
    //   1879: invokestatic 304	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1882: aconst_null
    //   1883: astore 11
    //   1885: aload_0
    //   1886: ldc_w 867
    //   1889: invokevirtual 376	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   1892: astore 16
    //   1894: invokestatic 554	com/tencent/mm/plugin/wallet_core/model/o:bOW	()Lcom/tencent/mm/plugin/wallet_core/model/ag;
    //   1897: getfield 871	com/tencent/mm/plugin/wallet_core/model/ag:prE	Lcom/tencent/mm/plugin/wallet_core/model/b;
    //   1900: astore 12
    //   1902: ldc 10
    //   1904: ldc_w 873
    //   1907: iconst_1
    //   1908: anewarray 4	java/lang/Object
    //   1911: dup
    //   1912: iconst_0
    //   1913: aload 12
    //   1915: aastore
    //   1916: invokestatic 270	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1919: aload 16
    //   1921: ifnull +285 -> 2206
    //   1924: aload 16
    //   1926: iconst_1
    //   1927: invokestatic 875	com/tencent/mm/plugin/wallet_core/model/ab:a	(Lorg/json/JSONObject;Z)Lcom/tencent/mm/plugin/wallet_core/model/b;
    //   1930: astore 12
    //   1932: aload_0
    //   1933: ldc_w 877
    //   1936: invokevirtual 376	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   1939: astore 16
    //   1941: aload 16
    //   1943: ifnonnull +274 -> 2217
    //   1946: ldc 10
    //   1948: ldc_w 879
    //   1951: invokestatic 304	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1954: aconst_null
    //   1955: astore_0
    //   1956: invokestatic 554	com/tencent/mm/plugin/wallet_core/model/o:bOW	()Lcom/tencent/mm/plugin/wallet_core/model/ag;
    //   1959: aload 8
    //   1961: aload 13
    //   1963: aload 14
    //   1965: aload 9
    //   1967: aload 10
    //   1969: aload 11
    //   1971: aload 12
    //   1973: aload_0
    //   1974: iload_3
    //   1975: iload_1
    //   1976: aload 15
    //   1978: invokevirtual 882	com/tencent/mm/plugin/wallet_core/model/ag:a	(Lcom/tencent/mm/plugin/wallet_core/model/af;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;Lcom/tencent/mm/plugin/wallet_core/model/k;Lcom/tencent/mm/plugin/wallet_core/model/b;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;IILjava/util/List;)V
    //   1981: return
    //   1982: ldc 10
    //   1984: ldc_w 884
    //   1987: invokestatic 133	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1990: new 886	com/tencent/mm/plugin/wallet_core/model/k
    //   1993: dup
    //   1994: invokespecial 887	com/tencent/mm/plugin/wallet_core/model/k:<init>	()V
    //   1997: astore 11
    //   1999: aload 11
    //   2001: aload 12
    //   2003: ldc -32
    //   2005: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   2008: putfield 890	com/tencent/mm/plugin/wallet_core/model/k:field_title	Ljava/lang/String;
    //   2011: aload 11
    //   2013: aload 12
    //   2015: ldc_w 892
    //   2018: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   2021: putfield 895	com/tencent/mm/plugin/wallet_core/model/k:field_loan_jump_url	Ljava/lang/String;
    //   2024: ldc 10
    //   2026: new 117	java/lang/StringBuilder
    //   2029: dup
    //   2030: ldc_w 897
    //   2033: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2036: aload 11
    //   2038: getfield 895	com/tencent/mm/plugin/wallet_core/model/k:field_loan_jump_url	Ljava/lang/String;
    //   2041: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2044: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2047: invokestatic 133	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2050: aload 11
    //   2052: aload 12
    //   2054: ldc_w 899
    //   2057: iconst_0
    //   2058: invokevirtual 327	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   2061: putfield 902	com/tencent/mm/plugin/wallet_core/model/k:field_is_show_entry	I
    //   2064: aload 11
    //   2066: aload 12
    //   2068: ldc_w 904
    //   2071: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   2074: putfield 907	com/tencent/mm/plugin/wallet_core/model/k:field_tips	Ljava/lang/String;
    //   2077: aload 11
    //   2079: aload 12
    //   2081: ldc_w 909
    //   2084: iconst_0
    //   2085: invokevirtual 327	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   2088: putfield 912	com/tencent/mm/plugin/wallet_core/model/k:field_is_overdue	I
    //   2091: aload 12
    //   2093: ldc_w 914
    //   2096: invokevirtual 372	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   2099: ifeq +26 -> 2125
    //   2102: aload 11
    //   2104: aload 12
    //   2106: ldc_w 914
    //   2109: invokevirtual 917	org/json/JSONObject:optDouble	(Ljava/lang/String;)D
    //   2112: ldc2_w 48
    //   2115: ddiv
    //   2116: ldc_w 919
    //   2119: invokestatic 922	com/tencent/mm/wallet_core/ui/e:e	(DLjava/lang/String;)Ljava/lang/String;
    //   2122: putfield 925	com/tencent/mm/plugin/wallet_core/model/k:field_available_otb	Ljava/lang/String;
    //   2125: aload 12
    //   2127: ldc_w 927
    //   2130: invokevirtual 372	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   2133: ifeq +16 -> 2149
    //   2136: aload 11
    //   2138: aload 12
    //   2140: ldc_w 927
    //   2143: invokevirtual 610	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   2146: putfield 930	com/tencent/mm/plugin/wallet_core/model/k:field_red_dot_index	I
    //   2149: ldc 10
    //   2151: new 117	java/lang/StringBuilder
    //   2154: dup
    //   2155: ldc_w 932
    //   2158: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2161: aload 11
    //   2163: getfield 930	com/tencent/mm/plugin/wallet_core/model/k:field_red_dot_index	I
    //   2166: invokevirtual 389	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2169: ldc_w 934
    //   2172: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2175: aload 11
    //   2177: getfield 912	com/tencent/mm/plugin/wallet_core/model/k:field_is_overdue	I
    //   2180: invokevirtual 389	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2183: ldc_w 936
    //   2186: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2189: aload 11
    //   2191: getfield 902	com/tencent/mm/plugin/wallet_core/model/k:field_is_show_entry	I
    //   2194: invokevirtual 389	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2197: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2200: invokestatic 133	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2203: goto -318 -> 1885
    //   2206: ldc 10
    //   2208: ldc_w 938
    //   2211: invokestatic 304	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   2214: goto -282 -> 1932
    //   2217: ldc 10
    //   2219: ldc_w 940
    //   2222: iconst_1
    //   2223: anewarray 4	java/lang/Object
    //   2226: dup
    //   2227: iconst_0
    //   2228: aload 16
    //   2230: invokevirtual 267	org/json/JSONObject:toString	()Ljava/lang/String;
    //   2233: aastore
    //   2234: invokestatic 18	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2237: new 20	com/tencent/mm/plugin/wallet_core/model/Bankcard
    //   2240: dup
    //   2241: iconst_0
    //   2242: invokespecial 24	com/tencent/mm/plugin/wallet_core/model/Bankcard:<init>	(B)V
    //   2245: astore_0
    //   2246: aload_0
    //   2247: aload 16
    //   2249: ldc_w 942
    //   2252: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   2255: putfield 83	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_bankcardType	Ljava/lang/String;
    //   2258: aload_0
    //   2259: aload 16
    //   2261: ldc_w 944
    //   2264: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   2267: putfield 89	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_bindSerial	Ljava/lang/String;
    //   2270: aload_0
    //   2271: aload 16
    //   2273: ldc_w 946
    //   2276: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   2279: putfield 160	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_bankName	Ljava/lang/String;
    //   2282: aload_0
    //   2283: aload 16
    //   2285: ldc_w 948
    //   2288: invokevirtual 485	org/json/JSONObject:optLong	(Ljava/lang/String;)J
    //   2291: l2d
    //   2292: ldc2_w 48
    //   2295: ddiv
    //   2296: putfield 53	com/tencent/mm/plugin/wallet_core/model/Bankcard:plV	D
    //   2299: aload_0
    //   2300: aload 16
    //   2302: ldc_w 721
    //   2305: invokevirtual 485	org/json/JSONObject:optLong	(Ljava/lang/String;)J
    //   2308: l2d
    //   2309: ldc2_w 48
    //   2312: ddiv
    //   2313: putfield 71	com/tencent/mm/plugin/wallet_core/model/Bankcard:plX	D
    //   2316: aload_0
    //   2317: new 950	com/tencent/mm/plugin/wallet_core/model/e
    //   2320: dup
    //   2321: invokespecial 951	com/tencent/mm/plugin/wallet_core/model/e:<init>	()V
    //   2324: putfield 955	com/tencent/mm/plugin/wallet_core/model/Bankcard:pmc	Lcom/tencent/mm/plugin/wallet_core/model/e;
    //   2327: aload_0
    //   2328: getfield 955	com/tencent/mm/plugin/wallet_core/model/Bankcard:pmc	Lcom/tencent/mm/plugin/wallet_core/model/e;
    //   2331: aload 16
    //   2333: ldc_w 957
    //   2336: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   2339: putfield 960	com/tencent/mm/plugin/wallet_core/model/e:lCU	Ljava/lang/String;
    //   2342: aload_0
    //   2343: aload 16
    //   2345: ldc_w 962
    //   2348: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   2351: putfield 95	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_forbidWord	Ljava/lang/String;
    //   2354: aload_0
    //   2355: aload 16
    //   2357: ldc_w 748
    //   2360: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   2363: putfield 171	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_forbid_title	Ljava/lang/String;
    //   2366: aload_0
    //   2367: aload 16
    //   2369: ldc_w 750
    //   2372: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   2375: putfield 177	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_forbid_url	Ljava/lang/String;
    //   2378: aload_0
    //   2379: aload 16
    //   2381: ldc_w 964
    //   2384: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   2387: putfield 57	com/tencent/mm/plugin/wallet_core/model/Bankcard:plW	Ljava/lang/String;
    //   2390: aload_0
    //   2391: aload 16
    //   2393: ldc_w 742
    //   2396: invokevirtual 315	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   2399: putfield 108	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_mobile	Ljava/lang/String;
    //   2402: aload 16
    //   2404: ldc_w 744
    //   2407: iconst_0
    //   2408: invokevirtual 327	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   2411: iconst_1
    //   2412: if_icmpne +122 -> 2534
    //   2415: iconst_1
    //   2416: istore 7
    //   2418: aload_0
    //   2419: iload 7
    //   2421: putfield 115	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_support_micropay	Z
    //   2424: aload_0
    //   2425: aload_0
    //   2426: getfield 74	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_cardType	I
    //   2429: getstatic 967	com/tencent/mm/plugin/wallet_core/model/Bankcard:plO	I
    //   2432: ior
    //   2433: putfield 74	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_cardType	I
    //   2436: aload_0
    //   2437: getfield 160	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_bankName	Ljava/lang/String;
    //   2440: invokestatic 99	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   2443: ifeq +16 -> 2459
    //   2446: aload_0
    //   2447: invokestatic 143	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   2450: getstatic 970	com/tencent/mm/plugin/wxpay/a$i:wallet_lqt_title	I
    //   2453: invokevirtual 154	android/content/Context:getString	(I)Ljava/lang/String;
    //   2456: putfield 160	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_bankName	Ljava/lang/String;
    //   2459: aload_0
    //   2460: aload_0
    //   2461: getfield 160	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_bankName	Ljava/lang/String;
    //   2464: putfield 157	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_desc	Ljava/lang/String;
    //   2467: aload_0
    //   2468: getfield 95	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_forbidWord	Ljava/lang/String;
    //   2471: invokestatic 99	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   2474: ifne +12 -> 2486
    //   2477: aload_0
    //   2478: bipush 8
    //   2480: putfield 102	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_bankcardState	I
    //   2483: goto -527 -> 1956
    //   2486: aload_0
    //   2487: iconst_0
    //   2488: putfield 102	com/tencent/mm/plugin/wallet_core/model/Bankcard:field_bankcardState	I
    //   2491: goto -535 -> 1956
    //   2494: goto -1892 -> 602
    //   2497: goto -1343 -> 1154
    //   2500: iconst_0
    //   2501: istore_2
    //   2502: goto -821 -> 1681
    //   2505: aload 10
    //   2507: astore 9
    //   2509: goto -1781 -> 728
    //   2512: iconst_0
    //   2513: istore 7
    //   2515: goto -1524 -> 991
    //   2518: ldc_w 297
    //   2521: astore 11
    //   2523: goto -1115 -> 1408
    //   2526: ldc_w 297
    //   2529: astore 12
    //   2531: goto -1105 -> 1426
    //   2534: iconst_0
    //   2535: istore 7
    //   2537: goto -119 -> 2418
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2540	0	paramJSONObject	JSONObject
    //   0	2540	1	paramInt	int
    //   1544	958	2	i	int
    //   1161	814	3	j	int
    //   1541	8	4	k	int
    //   15	10	5	l	long
    //   989	1547	7	bool	boolean
    //   56	1904	8	localaf	af
    //   39	2469	9	localObject1	Object
    //   218	2288	10	localObject2	Object
    //   1049	512	11	localObject3	Object
    //   1788	20	11	localException1	Exception
    //   1836	5	11	localException2	Exception
    //   1883	639	11	localObject4	Object
    //   1388	1142	12	localObject5	Object
    //   695	1267	13	localArrayList1	ArrayList
    //   707	1257	14	localArrayList2	ArrayList
    //   1514	463	15	localLinkedList	LinkedList
    //   1566	837	16	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   8	17	1622	java/lang/Exception
    //   24	32	1622	java/lang/Exception
    //   32	58	1622	java/lang/Exception
    //   63	220	1622	java/lang/Exception
    //   225	265	1622	java/lang/Exception
    //   265	383	1622	java/lang/Exception
    //   388	427	1622	java/lang/Exception
    //   427	454	1622	java/lang/Exception
    //   459	537	1622	java/lang/Exception
    //   537	544	1622	java/lang/Exception
    //   554	599	1622	java/lang/Exception
    //   602	718	1622	java/lang/Exception
    //   728	745	1622	java/lang/Exception
    //   750	949	1622	java/lang/Exception
    //   949	988	1622	java/lang/Exception
    //   991	1108	1622	java/lang/Exception
    //   1113	1151	1622	java/lang/Exception
    //   1154	1190	1622	java/lang/Exception
    //   1195	1223	1622	java/lang/Exception
    //   1223	1235	1622	java/lang/Exception
    //   1282	1331	1622	java/lang/Exception
    //   1336	1372	1622	java/lang/Exception
    //   1372	1390	1622	java/lang/Exception
    //   1395	1408	1622	java/lang/Exception
    //   1413	1426	1622	java/lang/Exception
    //   1426	1516	1622	java/lang/Exception
    //   1611	1619	1622	java/lang/Exception
    //   1662	1679	1622	java/lang/Exception
    //   1681	1713	1622	java/lang/Exception
    //   1716	1724	1622	java/lang/Exception
    //   1730	1736	1622	java/lang/Exception
    //   1739	1754	1622	java/lang/Exception
    //   1757	1765	1622	java/lang/Exception
    //   1790	1819	1622	java/lang/Exception
    //   1822	1830	1622	java/lang/Exception
    //   1838	1852	1622	java/lang/Exception
    //   1852	1869	1622	java/lang/Exception
    //   1874	1882	1622	java/lang/Exception
    //   1885	1919	1622	java/lang/Exception
    //   1924	1932	1622	java/lang/Exception
    //   1932	1941	1622	java/lang/Exception
    //   1946	1954	1622	java/lang/Exception
    //   1956	1981	1622	java/lang/Exception
    //   1982	2125	1622	java/lang/Exception
    //   2125	2149	1622	java/lang/Exception
    //   2149	2203	1622	java/lang/Exception
    //   2206	2214	1622	java/lang/Exception
    //   2217	2415	1622	java/lang/Exception
    //   2418	2459	1622	java/lang/Exception
    //   2459	2483	1622	java/lang/Exception
    //   2486	2491	1622	java/lang/Exception
    //   1235	1282	1788	java/lang/Exception
    //   1771	1785	1788	java/lang/Exception
    //   1521	1531	1836	java/lang/Exception
    //   1536	1543	1836	java/lang/Exception
    //   1551	1604	1836	java/lang/Exception
  }
  
  private static ArrayList<Bankcard> s(JSONArray paramJSONArray)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletQueryBankcardParser", "getBankcards()");
    ArrayList localArrayList = new ArrayList();
    if ((paramJSONArray != null) && (paramJSONArray.length() > 0))
    {
      int j = paramJSONArray.length();
      int i = 0;
      while (i < j)
      {
        Object localObject = paramJSONArray.getJSONObject(i);
        localObject = d.bOx().ae((JSONObject)localObject);
        if (localObject != null)
        {
          d.d((Bankcard)localObject);
          localArrayList.add(localObject);
        }
        i += 1;
      }
    }
    return localArrayList;
  }
  
  private static ArrayList<Bankcard> t(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramJSONArray != null) && (paramJSONArray.length() > 0))
    {
      int j = paramJSONArray.length();
      int i = 0;
      if (i < j)
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
        Bankcard localBankcard = new Bankcard();
        localBankcard.field_cardType |= Bankcard.plK;
        localBankcard.field_bankName = localJSONObject.getString("bank_name");
        localBankcard.field_bankcardType = localJSONObject.getString("bank_type");
        localBankcard.field_bankcardTypeName = localJSONObject.optString("bankacc_type_name");
        localBankcard.plR = localJSONObject.getString("card_id");
        localBankcard.field_bizUsername = localJSONObject.getString("app_username");
        localBankcard.field_wxcreditState = localJSONObject.getInt("card_status");
        if (localBankcard.field_wxcreditState != 2) {}
        for (localBankcard.field_bankcardState = 9;; localBankcard.field_bankcardState = 0)
        {
          localBankcard.field_desc = ad.getContext().getString(a.i.wallet_wxcredit_card_desc, new Object[] { localBankcard.field_bankName, localBankcard.field_bankcardTail });
          localBankcard.pmc = new e();
          localBankcard.pmc.lCU = localJSONObject.getString("logo_url");
          localBankcard.pmc.pmn = localJSONObject.getString("background_logo_url");
          localBankcard.pmc.pmo = localJSONObject.getString("big_logo_url");
          localArrayList.add(localBankcard);
          i += 1;
          break;
        }
      }
    }
    return localArrayList;
  }
  
  public static boolean zm(int paramInt)
  {
    return (paramInt == 9) || (paramInt == 10) || (paramInt == 11) || (paramInt == 12) || (paramInt == 13) || (paramInt == 14) || (paramInt == 15) || (paramInt == 16) || (paramInt == 17) || (paramInt == 18) || (paramInt == 19) || (paramInt == 20) || (paramInt == 21) || (paramInt == 22) || (paramInt == 23);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */