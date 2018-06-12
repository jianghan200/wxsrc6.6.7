package com.tencent.mm.wallet_core.c;

import android.os.Build;
import android.text.TextUtils;
import com.tencent.mm.ab.e;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.protocal.c.aw;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class i
  extends m
{
  public com.tencent.mm.ab.b diG;
  public e diJ;
  public int pmS = 0;
  public String pmT = "";
  public int pmU = 0;
  public String pmV = "";
  public int pmW = 0;
  public String uXh = "";
  public String uXi = "";
  public String uXj = "";
  public boolean uXk = false;
  protected String uXl;
  public boolean uXm = false;
  private Map<String, String> uXn = new HashMap();
  public boolean uXo = false;
  
  public final void F(Map<String, String> paramMap)
  {
    Object localObject1 = paramMap;
    if (paramMap == null) {
      localObject1 = new HashMap();
    }
    if (localObject1 != null) {
      ((Map)localObject1).remove("uin");
    }
    if (!f.cfE()) {
      ((Map)localObject1).put("jsapi_reqkey", f.cfF());
    }
    this.uXn = ((Map)localObject1);
    J(true, true);
    StringBuilder localStringBuilder;
    if (localObject1 != null)
    {
      paramMap = ((Map)localObject1).keySet().toArray();
      Arrays.sort(paramMap);
      localStringBuilder = new StringBuilder();
      int i = 0;
      int k;
      for (int j = 0; i < paramMap.length; j = k)
      {
        Object localObject2 = paramMap[i];
        String str = (String)((Map)localObject1).get(localObject2);
        k = j;
        if (!bi.oW(str))
        {
          if (j != 0) {
            localStringBuilder.append("&");
          }
          localStringBuilder.append(localObject2);
          localStringBuilder.append("=");
          b(localStringBuilder, str);
          k = 1;
        }
        i += 1;
      }
      if (!com.tencent.mm.sdk.a.b.chp()) {
        break label379;
      }
      x.v("MicroMsg.NetScenePayBase", "RQ: Cmd : " + bNX() + ", req = " + localStringBuilder.toString() + " " + toString() + " " + bi.cjd().toString());
      localObject1 = OT(localStringBuilder.toString());
      if (j == 0) {
        break label431;
      }
    }
    label379:
    label431:
    for (paramMap = "&";; paramMap = "")
    {
      localStringBuilder.append(paramMap);
      localStringBuilder.append("WCPaySign");
      localStringBuilder.append("=");
      localStringBuilder.append((String)localObject1);
      paramMap = localStringBuilder.toString().getBytes();
      paramMap = new bhy().bq(paramMap);
      a(this.diG, paramMap);
      x.i("MicroMsg.NetScenePayBase", "setRequestData getPayCgicmd: %s type: %s this: %s cgi %s ", new Object[] { Integer.valueOf(bNX()), Integer.valueOf(getType()), toString(), this.diG.uri });
      return;
      x.i("MicroMsg.NetScenePayBase", "RQ: Cmd : " + bNX() + ", req = " + localStringBuilder.toString() + " " + toString());
      break;
    }
  }
  
  public abstract void J(boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract String OT(String paramString);
  
  public abstract void a(int paramInt, String paramString, JSONObject paramJSONObject);
  
  public abstract void a(com.tencent.mm.ab.b paramb, bhy parambhy);
  
  public final void a(PayInfo paramPayInfo, Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    a(paramPayInfo, paramMap1, paramMap2, false);
  }
  
  public final void a(PayInfo paramPayInfo, Map<String, String> paramMap1, Map<String, String> paramMap2, boolean paramBoolean)
  {
    Object localObject = paramMap2;
    if (paramMap2 == null) {
      localObject = new HashMap();
    }
    if (paramPayInfo == null)
    {
      x.e("MicroMsg.NetScenePayBase", "Cmd : " + bNX() + ", payInfo is null");
      ((Map)localObject).put("devicename", Build.MODEL);
      aC((Map)localObject);
      return;
    }
    paramMap1.put("req_key", paramPayInfo.bOd);
    paramMap1.put("partner_id", paramPayInfo.partnerId);
    paramMap1.put("pay_sign", paramPayInfo.cdL);
    if (paramPayInfo.qUO >= 0) {
      paramMap1.put("auto_deduct_flag", paramPayInfo.qUO);
    }
    if (paramPayInfo.bVY > 0) {
      paramMap1.put("pay_scene", paramPayInfo.bVY);
    }
    if (paramPayInfo.bVZ >= 0) {
      paramMap1.put("bindbankscene", paramPayInfo.bVZ);
    }
    if (!bi.oW(paramPayInfo.qUP)) {
      paramMap1.put("deduct_bank_type", paramPayInfo.qUP);
    }
    if (!bi.oW(paramPayInfo.qUQ)) {
      paramMap1.put("deduct_bind_serial", paramPayInfo.qUQ);
    }
    if (paramBoolean) {
      paramMap1.put("use_touch", "0");
    }
    for (;;)
    {
      paramMap1.put("fp_identify_num", paramPayInfo.pxO);
      if (!TextUtils.isEmpty(paramPayInfo.bQb)) {
        paramMap1.put("encrypted_pay_info", URLEncoder.encode(paramPayInfo.bQb));
      }
      if (!TextUtils.isEmpty(paramPayInfo.bQc)) {
        paramMap1.put("encrypted_rsa_sign", URLEncoder.encode(paramPayInfo.bQc));
      }
      ((Map)localObject).put("uuid", paramPayInfo.fMk);
      ((Map)localObject).put("appid", paramPayInfo.appId);
      ((Map)localObject).put("appsource", paramPayInfo.pCO);
      ((Map)localObject).put("channel", paramPayInfo.bVU);
      ((Map)localObject).put("devicename", Build.MODEL);
      ((Map)localObject).put("soter_req", paramPayInfo.bVE);
      return;
      paramMap1.put("use_touch", paramPayInfo.pxN);
    }
  }
  
  public void a(c paramc, JSONObject paramJSONObject) {}
  
  public final void aB(Map<String, String> paramMap)
  {
    Object localObject1 = paramMap;
    if (paramMap == null) {
      localObject1 = new HashMap();
    }
    if (localObject1 != null) {
      ((Map)localObject1).remove("uin");
    }
    if (this.uXn == null) {
      this.uXn = new HashMap();
    }
    if (this.uXn != null) {
      this.uXn.remove("uin");
    }
    paramMap = ((Map)localObject1).keySet().toArray();
    int i = 0;
    while (i < paramMap.length)
    {
      Object localObject2 = paramMap[i];
      String str = (String)((Map)localObject1).get(localObject2);
      if (this.uXn.containsKey(localObject2)) {
        this.uXn.remove(localObject2);
      }
      this.uXn.put((String)localObject2, str);
      i += 1;
    }
    F(this.uXn);
  }
  
  public final void aC(Map<String, String> paramMap)
  {
    J(false, false);
    if (paramMap != null)
    {
      Object localObject1 = com.tencent.mm.plugin.wallet_core.model.i.bOL();
      if (localObject1 != null)
      {
        x.i("MicroMsg.NetScenePayBase", "location found");
        paramMap.put("province", ((aw)localObject1).csK);
        if (!paramMap.containsKey("city")) {
          paramMap.put("city", ((aw)localObject1).csL);
        }
        paramMap.put("location_timestamp", ((aw)localObject1).raY);
        paramMap.put("encrypt_key", ((aw)localObject1).rbc);
        paramMap.put("encrypt_userinfo", ((aw)localObject1).rbb);
        if (com.tencent.mm.plugin.wallet_core.model.i.bOO()) {
          paramMap.put("encrypt_cellinfo", ((aw)localObject1).rbd);
        }
      }
      localObject1 = paramMap.keySet().toArray();
      Arrays.sort((Object[])localObject1);
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 0;
      int k;
      for (int j = 0; i < localObject1.length; j = k)
      {
        Object localObject2 = localObject1[i];
        String str = (String)paramMap.get(localObject2);
        k = j;
        if (!bi.oW(str))
        {
          if (j != 0) {
            localStringBuilder.append("&");
          }
          localStringBuilder.append(localObject2);
          localStringBuilder.append("=");
          localStringBuilder.append(str);
          k = 1;
        }
        i += 1;
      }
      if (com.tencent.mm.sdk.a.b.chp()) {
        x.d("MicroMsg.NetScenePayBase", "Cmd : " + bNX() + ", wxreq = " + localStringBuilder.toString());
      }
      x.d("MicroMsg.NetScenePayBase", "wxreq: " + localStringBuilder.toString());
      paramMap = localStringBuilder.toString().getBytes();
      paramMap = new bhy().bq(paramMap);
      b(this.diG, paramMap);
    }
  }
  
  public abstract void b(com.tencent.mm.ab.b paramb, bhy parambhy);
  
  public void b(StringBuilder paramStringBuilder, String paramString)
  {
    paramStringBuilder.append(paramString);
  }
  
  public abstract int bNX();
  
  public boolean bOn()
  {
    return false;
  }
  
  public final int baY()
  {
    return bNX();
  }
  
  public boolean bkT()
  {
    reset();
    return false;
  }
  
  public boolean bkU()
  {
    return true;
  }
  
  public String blM()
  {
    return null;
  }
  
  public boolean brf()
  {
    return false;
  }
  
  public final String cCY()
  {
    return this.uXl;
  }
  
  public abstract n d(com.tencent.mm.ab.b paramb);
  
  /* Error */
  public final void e(int paramInt1, int paramInt2, String paramString, com.tencent.mm.network.q paramq)
  {
    // Byte code:
    //   0: iload_1
    //   1: istore 6
    //   3: iload_2
    //   4: istore 5
    //   6: getstatic 432	com/tencent/mm/platformtools/af:eye	Z
    //   9: ifeq +25 -> 34
    //   12: iload_1
    //   13: istore 6
    //   15: iload_2
    //   16: istore 5
    //   18: sipush 1686
    //   21: aload_0
    //   22: invokevirtual 151	com/tencent/mm/wallet_core/c/i:bNX	()I
    //   25: if_icmpne +9 -> 34
    //   28: iconst_3
    //   29: istore 6
    //   31: iconst_m1
    //   32: istore 5
    //   34: ldc -114
    //   36: ldc_w 434
    //   39: bipush 8
    //   41: anewarray 163	java/lang/Object
    //   44: dup
    //   45: iconst_0
    //   46: aload_0
    //   47: invokevirtual 211	com/tencent/mm/wallet_core/c/i:getType	()I
    //   50: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   53: aastore
    //   54: dup
    //   55: iconst_1
    //   56: aload 4
    //   58: invokeinterface 437 1 0
    //   63: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   66: aastore
    //   67: dup
    //   68: iconst_2
    //   69: aload 4
    //   71: invokeinterface 440 1 0
    //   76: aastore
    //   77: dup
    //   78: iconst_3
    //   79: aload_0
    //   80: invokevirtual 151	com/tencent/mm/wallet_core/c/i:bNX	()I
    //   83: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   86: aastore
    //   87: dup
    //   88: iconst_4
    //   89: iload 6
    //   91: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   94: aastore
    //   95: dup
    //   96: iconst_5
    //   97: iload 5
    //   99: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   102: aastore
    //   103: dup
    //   104: bipush 6
    //   106: aload_3
    //   107: aastore
    //   108: dup
    //   109: bipush 7
    //   111: aload_0
    //   112: invokevirtual 164	java/lang/Object:toString	()Ljava/lang/String;
    //   115: aastore
    //   116: invokestatic 220	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: aload_0
    //   120: aload 4
    //   122: checkcast 213	com/tencent/mm/ab/b
    //   125: invokevirtual 442	com/tencent/mm/wallet_core/c/i:d	(Lcom/tencent/mm/ab/b;)Lcom/tencent/mm/wallet_core/c/n;
    //   128: astore 8
    //   130: aload 8
    //   132: getfield 447	com/tencent/mm/wallet_core/c/n:rPw	I
    //   135: istore_2
    //   136: aload 8
    //   138: getfield 450	com/tencent/mm/wallet_core/c/n:rPx	Ljava/lang/String;
    //   141: astore 11
    //   143: aload 8
    //   145: getfield 453	com/tencent/mm/wallet_core/c/n:uXp	I
    //   148: istore 7
    //   150: aload 8
    //   152: getfield 456	com/tencent/mm/wallet_core/c/n:iwT	Ljava/lang/String;
    //   155: astore 10
    //   157: invokestatic 462	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   160: getstatic 467	com/tencent/mm/plugin/wxpay/a$i:wallet_data_err	I
    //   163: invokevirtual 473	android/content/Context:getString	(I)Ljava/lang/String;
    //   166: astore 4
    //   168: aconst_null
    //   169: astore 9
    //   171: aload 8
    //   173: getfield 477	com/tencent/mm/wallet_core/c/n:rPv	Lcom/tencent/mm/protocal/c/bhy;
    //   176: invokestatic 482	com/tencent/mm/platformtools/ab:b	(Lcom/tencent/mm/protocal/c/bhy;)Ljava/lang/String;
    //   179: astore 8
    //   181: aload 8
    //   183: invokestatic 120	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   186: ifne +593 -> 779
    //   189: new 484	org/json/JSONObject
    //   192: dup
    //   193: aload 8
    //   195: invokespecial 485	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   198: astore 9
    //   200: aload 4
    //   202: astore 8
    //   204: aload_0
    //   205: aload 9
    //   207: ldc_w 487
    //   210: invokevirtual 490	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   213: putfield 423	com/tencent/mm/wallet_core/c/i:uXl	Ljava/lang/String;
    //   216: aload 4
    //   218: astore 8
    //   220: aload 9
    //   222: ldc_w 492
    //   225: invokevirtual 496	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   228: istore_1
    //   229: aload 4
    //   231: astore 8
    //   233: aload 9
    //   235: ldc_w 498
    //   238: invokevirtual 490	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   241: astore 4
    //   243: aload 4
    //   245: astore 8
    //   247: aload_0
    //   248: aload 9
    //   250: ldc_w 500
    //   253: invokevirtual 490	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   256: putfield 34	com/tencent/mm/wallet_core/c/i:uXh	Ljava/lang/String;
    //   259: aload 4
    //   261: astore 8
    //   263: aload_0
    //   264: aload 9
    //   266: ldc_w 502
    //   269: invokevirtual 490	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   272: putfield 36	com/tencent/mm/wallet_core/c/i:uXi	Ljava/lang/String;
    //   275: aload 4
    //   277: astore 8
    //   279: aload_0
    //   280: aload 9
    //   282: ldc_w 504
    //   285: invokevirtual 490	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   288: putfield 38	com/tencent/mm/wallet_core/c/i:uXj	Ljava/lang/String;
    //   291: aload 4
    //   293: astore 8
    //   295: aload_0
    //   296: aload 9
    //   298: ldc_w 506
    //   301: invokevirtual 509	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   304: putfield 42	com/tencent/mm/wallet_core/c/i:pmS	I
    //   307: aload 4
    //   309: astore 8
    //   311: aload_0
    //   312: aload 9
    //   314: ldc_w 511
    //   317: invokevirtual 490	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   320: putfield 44	com/tencent/mm/wallet_core/c/i:pmT	Ljava/lang/String;
    //   323: aload 4
    //   325: astore 8
    //   327: aload_0
    //   328: aload 9
    //   330: ldc_w 513
    //   333: invokevirtual 509	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   336: putfield 46	com/tencent/mm/wallet_core/c/i:pmU	I
    //   339: aload 4
    //   341: astore 8
    //   343: aload 9
    //   345: ldc_w 515
    //   348: invokevirtual 519	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   351: astore 12
    //   353: aload 12
    //   355: ifnull +349 -> 704
    //   358: aload 4
    //   360: astore 8
    //   362: aload_0
    //   363: aload 12
    //   365: invokevirtual 520	org/json/JSONObject:toString	()Ljava/lang/String;
    //   368: putfield 48	com/tencent/mm/wallet_core/c/i:pmV	Ljava/lang/String;
    //   371: aload 4
    //   373: astore 8
    //   375: aload_0
    //   376: aload 9
    //   378: ldc_w 522
    //   381: invokevirtual 509	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   384: putfield 50	com/tencent/mm/wallet_core/c/i:pmW	I
    //   387: aload 4
    //   389: astore 8
    //   391: aload 9
    //   393: ldc_w 524
    //   396: iconst_0
    //   397: invokevirtual 527	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   400: ifeq +53 -> 453
    //   403: aload 4
    //   405: astore 8
    //   407: invokestatic 533	com/tencent/mm/wallet_core/c/s:cDi	()Lcom/tencent/mm/wallet_core/c/s;
    //   410: pop
    //   411: aload 4
    //   413: astore 8
    //   415: invokestatic 536	com/tencent/mm/wallet_core/c/s:cDh	()Ljava/lang/String;
    //   418: astore 12
    //   420: aload 4
    //   422: astore 8
    //   424: ldc -114
    //   426: ldc_w 538
    //   429: iconst_1
    //   430: anewarray 163	java/lang/Object
    //   433: dup
    //   434: iconst_0
    //   435: aload 12
    //   437: aastore
    //   438: invokestatic 220	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   441: aload 4
    //   443: astore 8
    //   445: invokestatic 533	com/tencent/mm/wallet_core/c/s:cDi	()Lcom/tencent/mm/wallet_core/c/s;
    //   448: aload 12
    //   450: invokevirtual 541	com/tencent/mm/wallet_core/c/s:abV	(Ljava/lang/String;)V
    //   453: aload 4
    //   455: astore 8
    //   457: aload_0
    //   458: iconst_1
    //   459: putfield 52	com/tencent/mm/wallet_core/c/i:uXm	Z
    //   462: aload 10
    //   464: astore 8
    //   466: ldc -114
    //   468: ldc_w 543
    //   471: bipush 13
    //   473: anewarray 163	java/lang/Object
    //   476: dup
    //   477: iconst_0
    //   478: aload_0
    //   479: invokevirtual 211	com/tencent/mm/wallet_core/c/i:getType	()I
    //   482: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   485: aastore
    //   486: dup
    //   487: iconst_1
    //   488: aload_0
    //   489: invokevirtual 151	com/tencent/mm/wallet_core/c/i:bNX	()I
    //   492: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   495: aastore
    //   496: dup
    //   497: iconst_2
    //   498: iload 6
    //   500: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   503: aastore
    //   504: dup
    //   505: iconst_3
    //   506: iload 5
    //   508: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   511: aastore
    //   512: dup
    //   513: iconst_4
    //   514: aload_3
    //   515: aastore
    //   516: dup
    //   517: iconst_5
    //   518: iload_2
    //   519: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   522: aastore
    //   523: dup
    //   524: bipush 6
    //   526: aload 11
    //   528: aastore
    //   529: dup
    //   530: bipush 7
    //   532: iload 7
    //   534: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   537: aastore
    //   538: dup
    //   539: bipush 8
    //   541: aload 8
    //   543: aastore
    //   544: dup
    //   545: bipush 9
    //   547: iload_1
    //   548: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   551: aastore
    //   552: dup
    //   553: bipush 10
    //   555: aload 4
    //   557: aastore
    //   558: dup
    //   559: bipush 11
    //   561: aload 9
    //   563: aastore
    //   564: dup
    //   565: bipush 12
    //   567: aload_0
    //   568: invokevirtual 164	java/lang/Object:toString	()Ljava/lang/String;
    //   571: aastore
    //   572: invokestatic 220	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   575: new 545	com/tencent/mm/wallet_core/c/c
    //   578: dup
    //   579: iload 6
    //   581: iload 5
    //   583: aload_3
    //   584: invokespecial 548	com/tencent/mm/wallet_core/c/c:<init>	(IILjava/lang/String;)V
    //   587: astore 16
    //   589: iload 6
    //   591: ifne +303 -> 894
    //   594: iload 5
    //   596: ifne +298 -> 894
    //   599: iload_2
    //   600: ifeq +198 -> 798
    //   603: ldc -114
    //   605: ldc_w 550
    //   608: invokestatic 553	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   611: aload 16
    //   613: sipush 1000
    //   616: iload_2
    //   617: aload 11
    //   619: iconst_1
    //   620: invokevirtual 556	com/tencent/mm/wallet_core/c/c:e	(IILjava/lang/String;I)V
    //   623: iload 6
    //   625: ifne +381 -> 1006
    //   628: ldc -114
    //   630: ldc_w 558
    //   633: invokestatic 237	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   636: aload 9
    //   638: ifnull +910 -> 1548
    //   641: aload 16
    //   643: getfield 561	com/tencent/mm/wallet_core/c/c:errType	I
    //   646: ifne +11 -> 657
    //   649: aload 16
    //   651: getfield 564	com/tencent/mm/wallet_core/c/c:errCode	I
    //   654: ifeq +10 -> 664
    //   657: aload_0
    //   658: invokevirtual 566	com/tencent/mm/wallet_core/c/i:brf	()Z
    //   661: ifeq +876 -> 1537
    //   664: aload_0
    //   665: aload 16
    //   667: getfield 564	com/tencent/mm/wallet_core/c/c:errCode	I
    //   670: aload 16
    //   672: getfield 569	com/tencent/mm/wallet_core/c/c:Yy	Ljava/lang/String;
    //   675: aload 9
    //   677: invokevirtual 571	com/tencent/mm/wallet_core/c/i:a	(ILjava/lang/String;Lorg/json/JSONObject;)V
    //   680: aload_0
    //   681: aload 16
    //   683: aload 9
    //   685: invokevirtual 573	com/tencent/mm/wallet_core/c/i:a	(Lcom/tencent/mm/wallet_core/c/c;Lorg/json/JSONObject;)V
    //   688: aload_0
    //   689: getfield 40	com/tencent/mm/wallet_core/c/i:uXk	Z
    //   692: ifeq +867 -> 1559
    //   695: ldc -114
    //   697: ldc_w 575
    //   700: invokestatic 407	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   703: return
    //   704: aload 4
    //   706: astore 8
    //   708: aload_0
    //   709: ldc 32
    //   711: putfield 48	com/tencent/mm/wallet_core/c/i:pmV	Ljava/lang/String;
    //   714: goto -343 -> 371
    //   717: astore 10
    //   719: aload 8
    //   721: astore 4
    //   723: aload 9
    //   725: astore 8
    //   727: ldc -114
    //   729: new 108	java/lang/StringBuilder
    //   732: dup
    //   733: ldc_w 577
    //   736: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   739: aload 10
    //   741: invokevirtual 578	java/lang/Exception:toString	()Ljava/lang/String;
    //   744: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   747: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   750: invokestatic 553	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   753: sipush 55447
    //   756: istore_1
    //   757: invokestatic 462	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   760: getstatic 581	com/tencent/mm/plugin/wxpay/a$i:wallet_json_err	I
    //   763: invokevirtual 473	android/content/Context:getString	(I)Ljava/lang/String;
    //   766: astore 10
    //   768: aload 8
    //   770: astore 9
    //   772: aload 10
    //   774: astore 8
    //   776: goto -310 -> 466
    //   779: ldc -114
    //   781: ldc_w 583
    //   784: invokestatic 553	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   787: sipush 55448
    //   790: istore_1
    //   791: aload 10
    //   793: astore 8
    //   795: goto -329 -> 466
    //   798: iload 7
    //   800: ifeq +27 -> 827
    //   803: ldc -114
    //   805: ldc_w 585
    //   808: invokestatic 553	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   811: aload 16
    //   813: sipush 1000
    //   816: iload 7
    //   818: aload 8
    //   820: iconst_2
    //   821: invokevirtual 556	com/tencent/mm/wallet_core/c/c:e	(IILjava/lang/String;I)V
    //   824: goto -201 -> 623
    //   827: iload_1
    //   828: ifeq +55 -> 883
    //   831: ldc -114
    //   833: ldc_w 587
    //   836: invokestatic 553	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   839: iload_1
    //   840: sipush 55447
    //   843: if_icmpeq +25 -> 868
    //   846: iload_1
    //   847: sipush 55448
    //   850: if_icmpeq +18 -> 868
    //   853: aload 16
    //   855: sipush 1000
    //   858: iload_1
    //   859: aload 4
    //   861: iconst_2
    //   862: invokevirtual 556	com/tencent/mm/wallet_core/c/c:e	(IILjava/lang/String;I)V
    //   865: goto -242 -> 623
    //   868: aload 16
    //   870: sipush 1000
    //   873: iconst_2
    //   874: aload 4
    //   876: iconst_2
    //   877: invokevirtual 556	com/tencent/mm/wallet_core/c/c:e	(IILjava/lang/String;I)V
    //   880: goto -257 -> 623
    //   883: ldc -114
    //   885: ldc_w 589
    //   888: invokestatic 222	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   891: goto -268 -> 623
    //   894: ldc -114
    //   896: ldc_w 591
    //   899: invokestatic 553	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   902: aload_3
    //   903: ldc_w 592
    //   906: invokestatic 598	com/tencent/mm/sdk/platformtools/bl:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   909: astore_3
    //   910: aload_3
    //   911: ifnull +31 -> 942
    //   914: ldc -114
    //   916: ldc_w 600
    //   919: invokestatic 407	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   922: aload 16
    //   924: aload_3
    //   925: ldc_w 602
    //   928: invokeinterface 112 2 0
    //   933: checkcast 114	java/lang/String
    //   936: putfield 569	com/tencent/mm/wallet_core/c/c:Yy	Ljava/lang/String;
    //   939: goto -316 -> 623
    //   942: iload 5
    //   944: iconst_m1
    //   945: if_icmpeq +11 -> 956
    //   948: iload 5
    //   950: sipush 65036
    //   953: if_icmpne +28 -> 981
    //   956: ldc -114
    //   958: ldc_w 604
    //   961: invokestatic 553	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   964: aload 16
    //   966: invokestatic 462	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   969: getstatic 607	com/tencent/mm/plugin/wxpay/a$i:wallet_net_err	I
    //   972: invokevirtual 473	android/content/Context:getString	(I)Ljava/lang/String;
    //   975: putfield 569	com/tencent/mm/wallet_core/c/c:Yy	Ljava/lang/String;
    //   978: goto -355 -> 623
    //   981: ldc -114
    //   983: ldc_w 609
    //   986: invokestatic 553	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   989: aload 16
    //   991: invokestatic 462	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   994: getstatic 467	com/tencent/mm/plugin/wxpay/a$i:wallet_data_err	I
    //   997: invokevirtual 473	android/content/Context:getString	(I)Ljava/lang/String;
    //   1000: putfield 569	com/tencent/mm/wallet_core/c/c:Yy	Ljava/lang/String;
    //   1003: goto -380 -> 623
    //   1006: invokestatic 397	com/tencent/mm/plugin/wallet_core/model/i:bOO	()Z
    //   1009: ifne +37 -> 1046
    //   1012: ldc -114
    //   1014: ldc_w 611
    //   1017: invokestatic 237	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1020: goto -384 -> 636
    //   1023: astore_3
    //   1024: ldc -114
    //   1026: ldc_w 613
    //   1029: iconst_1
    //   1030: anewarray 163	java/lang/Object
    //   1033: dup
    //   1034: iconst_0
    //   1035: aload_3
    //   1036: invokevirtual 616	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1039: aastore
    //   1040: invokestatic 618	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1043: goto -407 -> 636
    //   1046: invokestatic 362	com/tencent/mm/plugin/wallet_core/model/i:bOL	()Lcom/tencent/mm/protocal/c/aw;
    //   1049: astore_3
    //   1050: aload_3
    //   1051: ifnull -415 -> 636
    //   1054: aload_3
    //   1055: getfield 389	com/tencent/mm/protocal/c/aw:rbc	Ljava/lang/String;
    //   1058: invokestatic 120	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   1061: ifne -425 -> 636
    //   1064: aload_3
    //   1065: getfield 402	com/tencent/mm/protocal/c/aw:rbd	Ljava/lang/String;
    //   1068: invokestatic 120	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   1071: ifne -435 -> 636
    //   1074: aload_0
    //   1075: invokevirtual 151	com/tencent/mm/wallet_core/c/i:bNX	()I
    //   1078: istore_1
    //   1079: aload_3
    //   1080: getfield 389	com/tencent/mm/protocal/c/aw:rbc	Ljava/lang/String;
    //   1083: astore 17
    //   1085: aload_3
    //   1086: getfield 394	com/tencent/mm/protocal/c/aw:rbb	Ljava/lang/String;
    //   1089: astore 18
    //   1091: aload_3
    //   1092: getfield 402	com/tencent/mm/protocal/c/aw:rbd	Ljava/lang/String;
    //   1095: astore 19
    //   1097: aload 19
    //   1099: invokestatic 120	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   1102: ifne -466 -> 636
    //   1105: aload 19
    //   1107: invokevirtual 621	java/lang/String:length	()I
    //   1110: istore_2
    //   1111: ldc 32
    //   1113: astore_3
    //   1114: ldc 32
    //   1116: astore 15
    //   1118: ldc 32
    //   1120: astore 14
    //   1122: ldc 32
    //   1124: astore 13
    //   1126: ldc 32
    //   1128: astore 12
    //   1130: iload_2
    //   1131: sipush 5000
    //   1134: if_icmple +130 -> 1264
    //   1137: ldc -114
    //   1139: ldc_w 623
    //   1142: invokestatic 237	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1145: aload 15
    //   1147: astore 4
    //   1149: aload 14
    //   1151: astore 8
    //   1153: aload 13
    //   1155: astore 10
    //   1157: aload 12
    //   1159: astore 11
    //   1161: ldc -114
    //   1163: ldc_w 625
    //   1166: invokestatic 237	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1169: new 627	com/tencent/mm/g/b/a/c
    //   1172: dup
    //   1173: invokespecial 628	com/tencent/mm/g/b/a/c:<init>	()V
    //   1176: astore 12
    //   1178: aload 12
    //   1180: iload_1
    //   1181: putfield 631	com/tencent/mm/g/b/a/c:cgm	I
    //   1184: aload 12
    //   1186: iload 6
    //   1188: putfield 634	com/tencent/mm/g/b/a/c:cgn	I
    //   1191: aload 12
    //   1193: iload 5
    //   1195: putfield 637	com/tencent/mm/g/b/a/c:cgo	I
    //   1198: aload 12
    //   1200: aload 17
    //   1202: putfield 640	com/tencent/mm/g/b/a/c:cgp	Ljava/lang/String;
    //   1205: aload 12
    //   1207: aload 18
    //   1209: putfield 643	com/tencent/mm/g/b/a/c:cgq	Ljava/lang/String;
    //   1212: aload 12
    //   1214: iload_2
    //   1215: invokestatic 645	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1218: putfield 648	com/tencent/mm/g/b/a/c:cgr	Ljava/lang/String;
    //   1221: aload 12
    //   1223: aload_3
    //   1224: putfield 651	com/tencent/mm/g/b/a/c:cgs	Ljava/lang/String;
    //   1227: aload 12
    //   1229: aload 4
    //   1231: putfield 654	com/tencent/mm/g/b/a/c:cgt	Ljava/lang/String;
    //   1234: aload 12
    //   1236: aload 8
    //   1238: putfield 657	com/tencent/mm/g/b/a/c:cgu	Ljava/lang/String;
    //   1241: aload 12
    //   1243: aload 10
    //   1245: putfield 660	com/tencent/mm/g/b/a/c:cgv	Ljava/lang/String;
    //   1248: aload 12
    //   1250: aload 11
    //   1252: putfield 663	com/tencent/mm/g/b/a/c:cgw	Ljava/lang/String;
    //   1255: aload 12
    //   1257: invokevirtual 666	com/tencent/mm/g/b/a/c:RD	()Z
    //   1260: pop
    //   1261: goto -625 -> 636
    //   1264: iload_2
    //   1265: sipush 4000
    //   1268: if_icmple +66 -> 1334
    //   1271: aload 19
    //   1273: iconst_0
    //   1274: sipush 1000
    //   1277: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1280: astore_3
    //   1281: aload 19
    //   1283: sipush 1000
    //   1286: sipush 2000
    //   1289: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1292: astore 4
    //   1294: aload 19
    //   1296: sipush 2000
    //   1299: sipush 3000
    //   1302: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1305: astore 8
    //   1307: aload 19
    //   1309: sipush 3000
    //   1312: sipush 4000
    //   1315: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1318: astore 10
    //   1320: aload 19
    //   1322: sipush 4000
    //   1325: iload_2
    //   1326: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1329: astore 11
    //   1331: goto -170 -> 1161
    //   1334: iload_2
    //   1335: sipush 3000
    //   1338: if_icmple +57 -> 1395
    //   1341: aload 19
    //   1343: iconst_0
    //   1344: sipush 1000
    //   1347: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1350: astore_3
    //   1351: aload 19
    //   1353: sipush 1000
    //   1356: sipush 2000
    //   1359: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1362: astore 4
    //   1364: aload 19
    //   1366: sipush 2000
    //   1369: sipush 3000
    //   1372: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1375: astore 8
    //   1377: aload 19
    //   1379: sipush 3000
    //   1382: iload_2
    //   1383: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1386: astore 10
    //   1388: aload 12
    //   1390: astore 11
    //   1392: goto -231 -> 1161
    //   1395: iload_2
    //   1396: sipush 2000
    //   1399: if_icmple +48 -> 1447
    //   1402: aload 19
    //   1404: iconst_0
    //   1405: sipush 1000
    //   1408: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1411: astore_3
    //   1412: aload 19
    //   1414: sipush 1000
    //   1417: sipush 2000
    //   1420: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1423: astore 4
    //   1425: aload 19
    //   1427: sipush 2000
    //   1430: iload_2
    //   1431: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1434: astore 8
    //   1436: aload 12
    //   1438: astore 11
    //   1440: aload 13
    //   1442: astore 10
    //   1444: goto -283 -> 1161
    //   1447: iload_2
    //   1448: sipush 1000
    //   1451: if_icmple +39 -> 1490
    //   1454: aload 19
    //   1456: iconst_0
    //   1457: sipush 1000
    //   1460: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1463: astore_3
    //   1464: aload 19
    //   1466: sipush 1000
    //   1469: iload_2
    //   1470: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1473: astore 4
    //   1475: aload 12
    //   1477: astore 11
    //   1479: aload 13
    //   1481: astore 10
    //   1483: aload 14
    //   1485: astore 8
    //   1487: goto -326 -> 1161
    //   1490: aload 12
    //   1492: astore 11
    //   1494: aload 13
    //   1496: astore 10
    //   1498: aload 14
    //   1500: astore 8
    //   1502: aload 15
    //   1504: astore 4
    //   1506: iload_2
    //   1507: ifle -346 -> 1161
    //   1510: aload 19
    //   1512: iconst_0
    //   1513: iload_2
    //   1514: invokevirtual 670	java/lang/String:substring	(II)Ljava/lang/String;
    //   1517: astore_3
    //   1518: aload 12
    //   1520: astore 11
    //   1522: aload 13
    //   1524: astore 10
    //   1526: aload 14
    //   1528: astore 8
    //   1530: aload 15
    //   1532: astore 4
    //   1534: goto -373 -> 1161
    //   1537: ldc -114
    //   1539: ldc_w 672
    //   1542: invokestatic 222	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1545: goto -865 -> 680
    //   1548: ldc -114
    //   1550: ldc_w 674
    //   1553: invokestatic 222	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1556: goto -876 -> 680
    //   1559: aload_0
    //   1560: getfield 676	com/tencent/mm/wallet_core/c/i:diJ	Lcom/tencent/mm/ab/e;
    //   1563: aload 16
    //   1565: getfield 561	com/tencent/mm/wallet_core/c/c:errType	I
    //   1568: aload 16
    //   1570: getfield 564	com/tencent/mm/wallet_core/c/c:errCode	I
    //   1573: aload 16
    //   1575: getfield 569	com/tencent/mm/wallet_core/c/c:Yy	Ljava/lang/String;
    //   1578: aload_0
    //   1579: invokeinterface 681 5 0
    //   1584: return
    //   1585: astore 10
    //   1587: aconst_null
    //   1588: astore 8
    //   1590: goto -863 -> 727
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1593	0	this	i
    //   0	1593	1	paramInt1	int
    //   0	1593	2	paramInt2	int
    //   0	1593	3	paramString	String
    //   0	1593	4	paramq	com.tencent.mm.network.q
    //   4	1190	5	i	int
    //   1	1186	6	j	int
    //   148	669	7	k	int
    //   128	1461	8	localObject1	Object
    //   169	602	9	localObject2	Object
    //   155	308	10	str1	String
    //   717	23	10	localException1	Exception
    //   766	759	10	localObject3	Object
    //   1585	1	10	localException2	Exception
    //   141	1380	11	localObject4	Object
    //   351	1168	12	localObject5	Object
    //   1124	399	13	str2	String
    //   1120	407	14	str3	String
    //   1116	415	15	str4	String
    //   587	987	16	localc	c
    //   1083	118	17	str5	String
    //   1089	119	18	str6	String
    //   1095	416	19	str7	String
    // Exception table:
    //   from	to	target	type
    //   204	216	717	java/lang/Exception
    //   220	229	717	java/lang/Exception
    //   233	243	717	java/lang/Exception
    //   247	259	717	java/lang/Exception
    //   263	275	717	java/lang/Exception
    //   279	291	717	java/lang/Exception
    //   295	307	717	java/lang/Exception
    //   311	323	717	java/lang/Exception
    //   327	339	717	java/lang/Exception
    //   343	353	717	java/lang/Exception
    //   362	371	717	java/lang/Exception
    //   375	387	717	java/lang/Exception
    //   391	403	717	java/lang/Exception
    //   407	411	717	java/lang/Exception
    //   415	420	717	java/lang/Exception
    //   424	441	717	java/lang/Exception
    //   445	453	717	java/lang/Exception
    //   457	462	717	java/lang/Exception
    //   708	714	717	java/lang/Exception
    //   628	636	1023	java/lang/Exception
    //   1006	1020	1023	java/lang/Exception
    //   1046	1050	1023	java/lang/Exception
    //   1054	1111	1023	java/lang/Exception
    //   1137	1145	1023	java/lang/Exception
    //   1161	1261	1023	java/lang/Exception
    //   1271	1331	1023	java/lang/Exception
    //   1341	1388	1023	java/lang/Exception
    //   1402	1436	1023	java/lang/Exception
    //   1454	1475	1023	java/lang/Exception
    //   1510	1518	1023	java/lang/Exception
    //   189	200	1585	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/wallet_core/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */