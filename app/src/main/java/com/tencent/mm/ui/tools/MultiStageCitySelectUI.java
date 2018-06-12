package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelsimple.j;
import com.tencent.mm.pluginsdk.permission.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.RegionCodeDecoder.Region;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import java.util.ArrayList;
import java.util.List;

public class MultiStageCitySelectUI
  extends MMPreference
  implements e
{
  private static List<RegionCodeDecoder.Region> uBa;
  private int bUw = 0;
  private a.a cXs = new MultiStageCitySelectUI.1(this);
  private String countryCode = null;
  private String dDe = null;
  private String dDf = null;
  private com.tencent.mm.modelgeo.c dMm;
  private String dYy = null;
  private o eMS = new o((byte)0);
  private f eOE;
  private ag handler = new ag(Looper.getMainLooper());
  private String uAP = null;
  private String uAQ = null;
  private boolean uAR = false;
  private int uAS = -1;
  private RegionCodeDecoder.Region[] uAT;
  private boolean uAU = false;
  private boolean uAV = true;
  private boolean uAW = true;
  private boolean uAX = false;
  private boolean uAY = false;
  private ZoneRecommandPreference uAZ;
  private String uBb;
  private Runnable uBc = new MultiStageCitySelectUI.4(this);
  
  private void czL()
  {
    if (this.dMm == null) {
      this.dMm = com.tencent.mm.modelgeo.c.OB();
    }
    this.dMm.a(this.cXs, true);
  }
  
  private void czM()
  {
    switch (this.bUw)
    {
    default: 
      return;
    case 2: 
      this.dDe = null;
      return;
    case 1: 
      this.dDf = null;
      return;
    }
    this.countryCode = null;
  }
  
  /* Error */
  private static List<RegionCodeDecoder.Region> czN()
  {
    // Byte code:
    //   0: invokestatic 142	com/tencent/mm/storage/RegionCodeDecoder:cmS	()Lcom/tencent/mm/storage/RegionCodeDecoder;
    //   3: astore_0
    //   4: aload_0
    //   5: invokestatic 148	com/tencent/mm/sdk/platformtools/w:chP	()Ljava/lang/String;
    //   8: putfield 151	com/tencent/mm/storage/RegionCodeDecoder:tcp	Ljava/lang/String;
    //   11: aload_0
    //   12: invokevirtual 154	com/tencent/mm/storage/RegionCodeDecoder:cmT	()Ljava/lang/String;
    //   15: astore_1
    //   16: aload_1
    //   17: invokestatic 160	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   20: ifeq +38 -> 58
    //   23: ldc -94
    //   25: new 164	java/lang/StringBuilder
    //   28: dup
    //   29: ldc -90
    //   31: invokespecial 169	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   34: aload_0
    //   35: getfield 151	com/tencent/mm/storage/RegionCodeDecoder:tcp	Ljava/lang/String;
    //   38: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: invokevirtual 176	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: invokestatic 182	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   47: aconst_null
    //   48: astore_0
    //   49: aload_0
    //   50: invokestatic 160	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   53: ifeq +29 -> 82
    //   56: aconst_null
    //   57: areturn
    //   58: new 164	java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   65: getstatic 186	com/tencent/mm/storage/RegionCodeDecoder:tco	Ljava/lang/String;
    //   68: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: aload_1
    //   72: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 176	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: astore_0
    //   79: goto -30 -> 49
    //   82: new 188	java/util/ArrayList
    //   85: dup
    //   86: invokespecial 189	java/util/ArrayList:<init>	()V
    //   89: astore 6
    //   91: aload_0
    //   92: invokestatic 195	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   95: astore_3
    //   96: new 197	java/io/InputStreamReader
    //   99: dup
    //   100: aload_3
    //   101: invokespecial 200	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   104: astore_2
    //   105: new 202	java/io/BufferedReader
    //   108: dup
    //   109: aload_2
    //   110: invokespecial 205	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   113: astore 4
    //   115: aconst_null
    //   116: astore_1
    //   117: aconst_null
    //   118: astore_0
    //   119: aload 4
    //   121: invokevirtual 208	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   124: astore 5
    //   126: aload 5
    //   128: ifnull +256 -> 384
    //   131: aload 5
    //   133: ldc -46
    //   135: invokevirtual 216	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   138: astore 7
    //   140: new 218	com/tencent/mm/storage/RegionCodeDecoder$Region
    //   143: dup
    //   144: invokespecial 219	com/tencent/mm/storage/RegionCodeDecoder$Region:<init>	()V
    //   147: astore 5
    //   149: aload 7
    //   151: arraylength
    //   152: iconst_2
    //   153: if_icmpne +391 -> 544
    //   156: aload 5
    //   158: aload 7
    //   160: iconst_1
    //   161: aaload
    //   162: invokevirtual 222	com/tencent/mm/storage/RegionCodeDecoder$Region:setName	(Ljava/lang/String;)V
    //   165: aload 7
    //   167: iconst_0
    //   168: aaload
    //   169: ldc -32
    //   171: invokevirtual 216	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   174: astore 7
    //   176: aload 7
    //   178: iconst_0
    //   179: aaload
    //   180: astore 8
    //   182: aload 5
    //   184: aload 8
    //   186: invokevirtual 227	com/tencent/mm/storage/RegionCodeDecoder$Region:setCountryCode	(Ljava/lang/String;)V
    //   189: aload 8
    //   191: invokestatic 160	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   194: ifne -75 -> 119
    //   197: aload 7
    //   199: arraylength
    //   200: iconst_1
    //   201: if_icmpne +44 -> 245
    //   204: aload 5
    //   206: aload 8
    //   208: invokevirtual 230	com/tencent/mm/storage/RegionCodeDecoder$Region:setCode	(Ljava/lang/String;)V
    //   211: aload 5
    //   213: iconst_0
    //   214: invokevirtual 234	com/tencent/mm/storage/RegionCodeDecoder$Region:setProvince	(Z)V
    //   217: aload 5
    //   219: iconst_0
    //   220: invokevirtual 237	com/tencent/mm/storage/RegionCodeDecoder$Region:setCity	(Z)V
    //   223: aload 5
    //   225: iconst_1
    //   226: invokevirtual 240	com/tencent/mm/storage/RegionCodeDecoder$Region:setCountry	(Z)V
    //   229: aload 5
    //   231: astore_1
    //   232: aload 6
    //   234: aload 5
    //   236: invokeinterface 246 2 0
    //   241: pop
    //   242: goto +302 -> 544
    //   245: aload 7
    //   247: arraylength
    //   248: iconst_2
    //   249: if_icmpne +63 -> 312
    //   252: aload 5
    //   254: aload 7
    //   256: iconst_1
    //   257: aaload
    //   258: invokevirtual 230	com/tencent/mm/storage/RegionCodeDecoder$Region:setCode	(Ljava/lang/String;)V
    //   261: aload 5
    //   263: iconst_1
    //   264: invokevirtual 234	com/tencent/mm/storage/RegionCodeDecoder$Region:setProvince	(Z)V
    //   267: aload 5
    //   269: iconst_0
    //   270: invokevirtual 240	com/tencent/mm/storage/RegionCodeDecoder$Region:setCountry	(Z)V
    //   273: aload 5
    //   275: iconst_0
    //   276: invokevirtual 237	com/tencent/mm/storage/RegionCodeDecoder$Region:setCity	(Z)V
    //   279: aload_1
    //   280: ifnull +267 -> 547
    //   283: aload_1
    //   284: invokevirtual 249	com/tencent/mm/storage/RegionCodeDecoder$Region:getCountryCode	()Ljava/lang/String;
    //   287: aload 5
    //   289: invokevirtual 249	com/tencent/mm/storage/RegionCodeDecoder$Region:getCountryCode	()Ljava/lang/String;
    //   292: invokevirtual 252	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   295: ifeq +252 -> 547
    //   298: aload_1
    //   299: iconst_1
    //   300: invokevirtual 255	com/tencent/mm/storage/RegionCodeDecoder$Region:setHasChildren	(Z)V
    //   303: aload 5
    //   305: aload_1
    //   306: invokevirtual 259	com/tencent/mm/storage/RegionCodeDecoder$Region:setParent	(Lcom/tencent/mm/storage/RegionCodeDecoder$Region;)V
    //   309: goto +238 -> 547
    //   312: aload 7
    //   314: arraylength
    //   315: iconst_3
    //   316: if_icmpne +65 -> 381
    //   319: aload 5
    //   321: aload 7
    //   323: iconst_2
    //   324: aaload
    //   325: invokevirtual 230	com/tencent/mm/storage/RegionCodeDecoder$Region:setCode	(Ljava/lang/String;)V
    //   328: aload 5
    //   330: iconst_1
    //   331: invokevirtual 237	com/tencent/mm/storage/RegionCodeDecoder$Region:setCity	(Z)V
    //   334: aload 5
    //   336: iconst_0
    //   337: invokevirtual 240	com/tencent/mm/storage/RegionCodeDecoder$Region:setCountry	(Z)V
    //   340: aload 5
    //   342: iconst_0
    //   343: invokevirtual 234	com/tencent/mm/storage/RegionCodeDecoder$Region:setProvince	(Z)V
    //   346: aload 5
    //   348: iconst_0
    //   349: invokevirtual 255	com/tencent/mm/storage/RegionCodeDecoder$Region:setHasChildren	(Z)V
    //   352: aload_0
    //   353: ifnull +28 -> 381
    //   356: aload_0
    //   357: invokevirtual 262	com/tencent/mm/storage/RegionCodeDecoder$Region:getCode	()Ljava/lang/String;
    //   360: aload 7
    //   362: iconst_1
    //   363: aaload
    //   364: invokevirtual 252	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   367: ifeq +14 -> 381
    //   370: aload 5
    //   372: aload_0
    //   373: invokevirtual 259	com/tencent/mm/storage/RegionCodeDecoder$Region:setParent	(Lcom/tencent/mm/storage/RegionCodeDecoder$Region;)V
    //   376: aload_0
    //   377: iconst_1
    //   378: invokevirtual 255	com/tencent/mm/storage/RegionCodeDecoder$Region:setHasChildren	(Z)V
    //   381: goto -149 -> 232
    //   384: aload_3
    //   385: ifnull +7 -> 392
    //   388: aload_3
    //   389: invokestatic 267	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   392: aload_2
    //   393: invokestatic 269	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   396: aload 4
    //   398: invokestatic 269	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   401: aload 6
    //   403: areturn
    //   404: astore_1
    //   405: aconst_null
    //   406: astore_0
    //   407: aconst_null
    //   408: astore_2
    //   409: aconst_null
    //   410: astore_3
    //   411: ldc_w 271
    //   414: aload_1
    //   415: ldc_w 273
    //   418: iconst_1
    //   419: anewarray 275	java/lang/Object
    //   422: dup
    //   423: iconst_0
    //   424: aload_1
    //   425: invokevirtual 278	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   428: aastore
    //   429: invokestatic 282	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   432: aload_3
    //   433: ifnull +7 -> 440
    //   436: aload_3
    //   437: invokestatic 267	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   440: aload_2
    //   441: ifnull +7 -> 448
    //   444: aload_2
    //   445: invokestatic 269	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   448: aload_0
    //   449: ifnull -48 -> 401
    //   452: aload_0
    //   453: invokestatic 269	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   456: goto -55 -> 401
    //   459: astore_0
    //   460: aconst_null
    //   461: astore_1
    //   462: aconst_null
    //   463: astore_2
    //   464: aconst_null
    //   465: astore_3
    //   466: aload_3
    //   467: ifnull +7 -> 474
    //   470: aload_3
    //   471: invokestatic 267	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   474: aload_2
    //   475: ifnull +7 -> 482
    //   478: aload_2
    //   479: invokestatic 269	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   482: aload_1
    //   483: ifnull +7 -> 490
    //   486: aload_1
    //   487: invokestatic 269	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   490: aload_0
    //   491: athrow
    //   492: astore_0
    //   493: aconst_null
    //   494: astore_1
    //   495: aconst_null
    //   496: astore_2
    //   497: goto -31 -> 466
    //   500: astore_0
    //   501: aconst_null
    //   502: astore_1
    //   503: goto -37 -> 466
    //   506: astore_0
    //   507: aload 4
    //   509: astore_1
    //   510: goto -44 -> 466
    //   513: astore 4
    //   515: aload_0
    //   516: astore_1
    //   517: aload 4
    //   519: astore_0
    //   520: goto -54 -> 466
    //   523: astore_1
    //   524: aconst_null
    //   525: astore_0
    //   526: aconst_null
    //   527: astore_2
    //   528: goto -117 -> 411
    //   531: astore_1
    //   532: aconst_null
    //   533: astore_0
    //   534: goto -123 -> 411
    //   537: astore_1
    //   538: aload 4
    //   540: astore_0
    //   541: goto -130 -> 411
    //   544: goto -425 -> 119
    //   547: aload 5
    //   549: astore_0
    //   550: goto -318 -> 232
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	450	0	localObject1	Object
    //   459	32	0	localObject2	Object
    //   492	1	0	localObject3	Object
    //   500	1	0	localObject4	Object
    //   506	10	0	localObject5	Object
    //   519	31	0	localObject6	Object
    //   15	291	1	localObject7	Object
    //   404	21	1	localException1	Exception
    //   461	56	1	localObject8	Object
    //   523	1	1	localException2	Exception
    //   531	1	1	localException3	Exception
    //   537	1	1	localException4	Exception
    //   104	424	2	localInputStreamReader	java.io.InputStreamReader
    //   95	376	3	localInputStream	java.io.InputStream
    //   113	395	4	localBufferedReader	java.io.BufferedReader
    //   513	26	4	localObject9	Object
    //   124	424	5	localObject10	Object
    //   89	313	6	localArrayList	ArrayList
    //   138	223	7	arrayOfString	String[]
    //   180	27	8	str	String
    // Exception table:
    //   from	to	target	type
    //   91	96	404	java/lang/Exception
    //   91	96	459	finally
    //   96	105	492	finally
    //   105	115	500	finally
    //   119	126	506	finally
    //   131	176	506	finally
    //   182	229	506	finally
    //   232	242	506	finally
    //   245	279	506	finally
    //   283	309	506	finally
    //   312	352	506	finally
    //   356	381	506	finally
    //   411	432	513	finally
    //   96	105	523	java/lang/Exception
    //   105	115	531	java/lang/Exception
    //   119	126	537	java/lang/Exception
    //   131	176	537	java/lang/Exception
    //   182	229	537	java/lang/Exception
    //   232	242	537	java/lang/Exception
    //   245	279	537	java/lang/Exception
    //   283	309	537	java/lang/Exception
    //   312	352	537	java/lang/Exception
    //   356	381	537	java/lang/Exception
  }
  
  private void czO()
  {
    if (this.uAZ != null) {
      this.uAZ.czY();
    }
  }
  
  public final int Ys()
  {
    return R.i.zoneselect;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    int i = 0;
    j localj;
    Object localObject;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if (paraml.getType() == 665)
      {
        localj = (j)paraml;
        paraml = localj.country;
        paramString = localj.csK;
        localObject = localj.csL;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiStageCitySelectUI", "current location country %s, province %s, city %s", new Object[] { paraml, paramString, localObject });
        RegionCodeDecoder.Region[] arrayOfRegion = RegionCodeDecoder.cmS().cmU();
        paramInt2 = arrayOfRegion.length;
        paramInt1 = 0;
        if (paramInt1 >= paramInt2) {
          break label316;
        }
        localj = arrayOfRegion[paramInt1];
        if (!localj.getCode().equalsIgnoreCase(paraml)) {
          break label259;
        }
        arrayOfRegion = RegionCodeDecoder.cmS().Zj(localj.getCode());
        paramInt2 = arrayOfRegion.length;
        paramInt1 = 0;
        label133:
        if (paramInt1 >= paramInt2) {
          break label251;
        }
        paraml = arrayOfRegion[paramInt1];
        if (!paraml.getCode().equalsIgnoreCase(paramString)) {
          break label244;
        }
        arrayOfRegion = RegionCodeDecoder.cmS().gb(localj.getCode(), paraml.getCode());
        paramInt2 = arrayOfRegion.length;
        paramInt1 = i;
        label181:
        if (paramInt1 >= paramInt2) {
          break label239;
        }
        paramString = arrayOfRegion[paramInt1];
        if (!paramString.getCode().equalsIgnoreCase((String)localObject)) {
          break label232;
        }
      }
    }
    for (;;)
    {
      label203:
      if ((localj == null) && (paraml == null) && (paramString == null)) {
        if (this.uAZ != null) {
          this.uAZ.czY();
        }
      }
      label232:
      label239:
      label244:
      label251:
      label259:
      while (this.uAZ == null)
      {
        return;
        paramInt1 += 1;
        break label181;
        paramString = null;
        break label203;
        paramInt1 += 1;
        break label133;
        paramString = null;
        paraml = null;
        break label203;
        paramInt1 += 1;
        break;
      }
      localObject = this.uAZ;
      ((ZoneRecommandPreference)localObject).status = 1;
      ((ZoneRecommandPreference)localObject).uCG = localj;
      ((ZoneRecommandPreference)localObject).uCH = paraml;
      ((ZoneRecommandPreference)localObject).uCI = paramString;
      ((ZoneRecommandPreference)localObject).czX();
      return;
      czO();
      return;
      label316:
      paramString = null;
      paraml = null;
      localj = null;
    }
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    Object localObject3 = null;
    Object localObject1;
    label100:
    label603:
    Object localObject2;
    if ((paramPreference instanceof ZonePreference))
    {
      paramPreference = ((ZonePreference)paramPreference).uCD;
      if ((paramPreference == null) || (bi.oW(paramPreference.getCode())))
      {
        localObject1 = new StringBuilder("onPreferenceTreeClick error item, code:");
        if (paramPreference == null)
        {
          paramf = Integer.valueOf(-1);
          localObject1 = ((StringBuilder)localObject1).append(paramf).append(" ,name:");
          if (paramPreference != null) {
            break label100;
          }
        }
        for (paramf = "null";; paramf = paramPreference.getName())
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MultiStageCitySelectUI", paramf);
          return false;
          paramf = paramPreference.getCode();
          break;
        }
      }
      if (this.bUw == 3)
      {
        this.countryCode = "CN";
        this.dDf = paramPreference.getCode();
        this.uAP = paramPreference.getName();
      }
      if (this.bUw == 0)
      {
        this.countryCode = paramPreference.getCode();
        this.dYy = paramPreference.getName();
        if (paramPreference.hasChildren()) {
          break label603;
        }
        if (!this.uAU)
        {
          au.HU();
          com.tencent.mm.model.c.DT().set(12324, this.countryCode);
          au.HU();
          com.tencent.mm.model.c.DT().set(12325, this.dDf);
          au.HU();
          com.tencent.mm.model.c.DT().set(12326, this.dDe);
        }
        paramf = new Intent();
        paramf.putExtra("CountryName", this.dYy);
        paramf.putExtra("ProviceName", this.uAP);
        paramf.putExtra("CityName", this.uAQ);
        paramf.putExtra("Country", this.countryCode);
        paramf.putExtra("Contact_Province", this.dDf);
        paramf.putExtra("Contact_City", this.dDe);
        YC();
        setResult(-1, paramf);
        finish();
      }
      for (;;)
      {
        return true;
        if (this.bUw == 1)
        {
          this.dDf = paramPreference.getCode();
          this.uAP = paramPreference.getName();
          break;
        }
        if (this.bUw == 2)
        {
          this.dDe = paramPreference.getCode();
          this.uAQ = paramPreference.getName();
          if (("CN".equalsIgnoreCase(this.countryCode)) || ("HK".equalsIgnoreCase(this.countryCode)) || ("MO".equalsIgnoreCase(this.countryCode)) || ("TW".equalsIgnoreCase(this.countryCode)))
          {
            this.dYy = null;
            break;
          }
          this.uAP = null;
          break;
        }
        if (this.bUw != 4) {
          break;
        }
        if ((paramPreference.getParent() != null) && (!paramPreference.hasChildren()))
        {
          this.dDe = paramPreference.getCode();
          this.uAQ = paramPreference.getName();
          this.dDf = paramPreference.getParent().getCode();
          this.uAP = paramPreference.getParent().getName();
          this.countryCode = paramPreference.getCountryCode();
          this.dYy = null;
          break;
        }
        if ((paramPreference.hasChildren()) && (paramPreference.getParent() != null))
        {
          this.dDf = paramPreference.getCode();
          this.uAP = paramPreference.getName();
          this.countryCode = paramPreference.getCountryCode();
          this.dYy = null;
          break;
        }
        this.countryCode = paramPreference.getCode();
        this.dYy = paramPreference.getName();
        this.dDf = null;
        this.uAP = null;
        this.dDe = null;
        this.uAQ = null;
        break;
        localObject1 = new Intent(this, MultiStageCitySelectUI.class);
        localObject2 = new Bundle();
        ((Bundle)localObject2).putString("Country", this.countryCode);
        ((Bundle)localObject2).putString("Provice", this.dDf);
        ((Bundle)localObject2).putString("CountryName", this.dYy);
        ((Bundle)localObject2).putString("ProviceName", this.uAP);
        ((Bundle)localObject2).putBoolean("GetAddress", this.uAU);
        ((Bundle)localObject2).putBoolean("ShowSelectedLocation", this.uAW);
        if (this.uAR)
        {
          paramPreference = paramPreference.getCountryCode();
          paramf = paramPreference;
          if (bi.oW(paramPreference)) {
            paramf = this.countryCode;
          }
          if (("CN".equalsIgnoreCase(paramf)) || ("HK".equalsIgnoreCase(paramf)) || ("MO".equalsIgnoreCase(paramf)) || ("TW".equalsIgnoreCase(paramf))) {
            ((Bundle)localObject2).putBoolean("IsNeedShowSearchBar", true);
          }
        }
        ((Intent)localObject1).putExtras((Bundle)localObject2);
        YC();
        startActivityForResult((Intent)localObject1, 1);
      }
    }
    int i;
    RegionCodeDecoder.Region[] arrayOfRegion;
    label875:
    label900:
    label925:
    label943:
    label952:
    label962:
    label971:
    label1017:
    Intent localIntent;
    if (paramPreference.mKey.equals("current_location"))
    {
      if (this.uAZ.status != 1) {
        break label1124;
      }
      i = 1;
      if (i != 0)
      {
        paramf = this.uAZ;
        arrayOfRegion = new RegionCodeDecoder.Region[3];
        arrayOfRegion[0] = paramf.uCG;
        arrayOfRegion[1] = paramf.uCH;
        arrayOfRegion[2] = paramf.uCI;
        au.HU();
        paramPreference = com.tencent.mm.model.c.DT();
        if (arrayOfRegion[0] != null) {
          break label1129;
        }
        paramf = null;
        paramPreference.set(12324, paramf);
        au.HU();
        paramPreference = com.tencent.mm.model.c.DT();
        if (arrayOfRegion[1] != null) {
          break label1140;
        }
        paramf = null;
        paramPreference.set(12325, paramf);
        au.HU();
        paramPreference = com.tencent.mm.model.c.DT();
        if (arrayOfRegion[2] != null) {
          break label1151;
        }
        paramf = null;
        paramPreference.set(12326, paramf);
        if (arrayOfRegion[0] != null) {
          break label1162;
        }
        localObject1 = null;
        if (arrayOfRegion[0] != null) {
          break label1174;
        }
        paramf = null;
        if (arrayOfRegion[1] != null) {
          break label1185;
        }
        localObject2 = null;
        if (arrayOfRegion[1] != null) {
          break label1197;
        }
        paramPreference = null;
        if ((!"CN".equalsIgnoreCase((String)localObject1)) && (!"HK".equalsIgnoreCase((String)localObject1)) && (!"MO".equalsIgnoreCase((String)localObject1)) && (!"TW".equalsIgnoreCase((String)localObject1))) {
          break label1208;
        }
        paramf = null;
        localIntent = new Intent();
        localIntent.putExtra("CountryName", paramf);
        localIntent.putExtra("ProviceName", paramPreference);
        if (arrayOfRegion[2] != null) {
          break label1213;
        }
        paramf = null;
        label1055:
        localIntent.putExtra("CityName", paramf);
        localIntent.putExtra("Country", (String)localObject1);
        localIntent.putExtra("Contact_Province", (String)localObject2);
        if (arrayOfRegion[2] != null) {
          break label1224;
        }
      }
    }
    label1124:
    label1129:
    label1140:
    label1151:
    label1162:
    label1174:
    label1185:
    label1197:
    label1208:
    label1213:
    label1224:
    for (paramf = (f)localObject3;; paramf = arrayOfRegion[2].getCode())
    {
      localIntent.putExtra("Contact_City", paramf);
      YC();
      setResult(-1, localIntent);
      finish();
      return false;
      i = 0;
      break;
      paramf = arrayOfRegion[0].getCode();
      break label875;
      paramf = arrayOfRegion[1].getCode();
      break label900;
      paramf = arrayOfRegion[2].getCode();
      break label925;
      localObject1 = arrayOfRegion[0].getCode();
      break label943;
      paramf = arrayOfRegion[0].getName();
      break label952;
      localObject2 = arrayOfRegion[1].getCode();
      break label962;
      paramPreference = arrayOfRegion[1].getName();
      break label971;
      paramPreference = null;
      break label1017;
      paramf = arrayOfRegion[2].getName();
      break label1055;
    }
  }
  
  public final void czK()
  {
    if (this.bUw == 3)
    {
      localObject1 = RegionCodeDecoder.cmS().Zj("CN");
      this.uAT = ((RegionCodeDecoder.Region[])localObject1);
      if ((this.uAT != null) && (this.uAT.length > 0)) {
        break label252;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MultiStageCitySelectUI", "initZoneItems error ,check zone lists!");
    }
    label252:
    label462:
    label572:
    do
    {
      return;
      if (bi.oW(this.countryCode))
      {
        localObject2 = RegionCodeDecoder.cmS().cmU();
        localObject1 = localObject2;
        if (!this.uAX) {
          break;
        }
        localObject3 = new ArrayList();
        if (localObject2 != null)
        {
          int j = localObject2.length;
          i = 0;
          while (i < j)
          {
            localObject1 = localObject2[i];
            if ((!"CN".equalsIgnoreCase(((RegionCodeDecoder.Region)localObject1).getCode())) && (!"HK".equalsIgnoreCase(((RegionCodeDecoder.Region)localObject1).getCode())) && (!"TW".equalsIgnoreCase(((RegionCodeDecoder.Region)localObject1).getCode())) && (!"MO".equalsIgnoreCase(((RegionCodeDecoder.Region)localObject1).getCode()))) {
              ((List)localObject3).add(localObject1);
            }
            i += 1;
          }
        }
        localObject1 = new RegionCodeDecoder.Region[((List)localObject3).size()];
        ((List)localObject3).toArray((Object[])localObject1);
        break;
      }
      if (bi.oW(this.dDf))
      {
        localObject1 = RegionCodeDecoder.cmS().Zj(this.countryCode);
        break;
      }
      localObject1 = RegionCodeDecoder.cmS().gb(this.countryCode, this.dDf);
      break;
      this.eOE.removeAll();
      au.HU();
      localObject1 = (String)com.tencent.mm.model.c.DT().get(12324, null);
      au.HU();
      Object localObject2 = (String)com.tencent.mm.model.c.DT().get(12325, null);
      au.HU();
      Object localObject3 = (String)com.tencent.mm.model.c.DT().get(12326, null);
      this.uAW = getIntent().getBooleanExtra("ShowSelectedLocation", true);
      int i = 0;
      if (i < this.uAT.length)
      {
        ZonePreference localZonePreference;
        if ((this.uAT[i] != null) && (!bi.oW(this.uAT[i].getCode())) && (!bi.oW(this.uAT[i].getName())))
        {
          localZonePreference = new ZonePreference(this);
          localZonePreference.a(this.uAT[i]);
          if (!this.uAW) {
            break label572;
          }
          if ((this.bUw != 0) || (!this.uAT[i].getCode().equalsIgnoreCase((String)localObject1))) {
            break label462;
          }
          this.eOE.a(localZonePreference, 0);
          localZonePreference.setSummary(R.l.setting_zone_selected_location);
        }
        for (;;)
        {
          i += 1;
          break;
          if ((this.bUw == 1) && (this.uAT[i].getCode().equalsIgnoreCase((String)localObject2)))
          {
            this.eOE.a(localZonePreference, 0);
            localZonePreference.setSummary(R.l.setting_zone_selected_location);
          }
          else if ((this.bUw == 2) && (this.uAT[i].getCode().equalsIgnoreCase((String)localObject3)))
          {
            this.eOE.a(localZonePreference, 0);
            localZonePreference.setSummary(R.l.setting_zone_selected_location);
          }
          else
          {
            this.eOE.a(localZonePreference);
            continue;
            this.eOE.a(localZonePreference);
          }
        }
      }
      if (this.bUw == 3)
      {
        localObject1 = new ZoneSelectOtherCountryPreference(this);
        ((ZoneSelectOtherCountryPreference)localObject1).text = getString(R.l.setting_zone_non_china_mainland);
        ((ZoneSelectOtherCountryPreference)localObject1).uCL = new MultiStageCitySelectUI.2(this);
        this.eOE.a((Preference)localObject1);
      }
      localObject1 = new PreferenceCategory(this.mController.tml);
      this.eOE.a((Preference)localObject1);
    } while ((this.bUw != 0) && (this.bUw != 3));
    if (this.uAV)
    {
      localObject1 = new PreferenceTitleCategory(this);
      ((PreferenceTitleCategory)localObject1).setTitle(R.l.setting_zone_category_get_location);
      this.eOE.a((Preference)localObject1, 0);
      this.uAZ = new ZoneRecommandPreference(this);
      this.uAZ.setKey("current_location");
      this.eOE.a(this.uAZ, 1);
      boolean bool = a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiStageCitySelectUI", "settings district,checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
      if (bool) {
        czL();
      }
    }
    Object localObject1 = new PreferenceTitleCategory(this);
    ((PreferenceTitleCategory)localObject1).setTitle(R.l.setting_zone_category_all_locations);
    if (this.uAV)
    {
      this.eOE.a((Preference)localObject1, 2);
      return;
    }
    this.eOE.a((Preference)localObject1, 0);
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.nearby_friend_city_select);
    setBackBtn(new MultiStageCitySelectUI.5(this));
    this.uAU = getIntent().getBooleanExtra("GetAddress", false);
    this.countryCode = getIntent().getStringExtra("Country");
    this.dDf = getIntent().getStringExtra("Provice");
    this.dYy = getIntent().getStringExtra("CountryName");
    this.uAP = getIntent().getStringExtra("ProviceName");
    Intent localIntent = getIntent();
    boolean bool;
    if (!bi.fU(this))
    {
      bool = true;
      this.uAV = localIntent.getBooleanExtra("IsAutoPosition", bool);
      this.uAR = getIntent().getBooleanExtra("IsRealNameVerifyScene", false);
      this.uAX = getIntent().getBooleanExtra("IsSelectNonChinaCountry", false);
      this.uAY = getIntent().getBooleanExtra("IsNeedShowSearchBar", false);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiStageCitySelectUI", " country = " + this.countryCode + " province =" + this.dDf + " city = " + this.dDe + " " + this.dYy + " " + this.uAP + " " + this.uAR + " " + this.uAX);
      if (!this.uAR) {
        break label287;
      }
      this.bUw = 3;
    }
    for (;;)
    {
      czK();
      return;
      bool = false;
      break;
      label287:
      if (this.countryCode == null)
      {
        this.bUw = 0;
        this.dDf = null;
        this.dDe = null;
      }
      else if (this.dDf == null)
      {
        this.bUw = 1;
        this.dDe = null;
      }
      else
      {
        this.bUw = 2;
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    }
    do
    {
      return;
    } while (paramInt2 != -1);
    setResult(-1, paramIntent);
    finish();
  }
  
  public void onBackPressed()
  {
    czM();
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    au.DF().a(665, this);
    this.eOE = this.tCL;
    initView();
    long l;
    if (this.uAY) {
      if ((uBa == null) || (uBa.size() <= 0))
      {
        l = bi.VG();
        paramBundle = RegionCodeDecoder.cmS().cmU();
        if ((paramBundle != null) && (paramBundle.length > 0)) {
          break label95;
        }
      }
    }
    for (;;)
    {
      a(this.eMS);
      this.eMS.uBw = new MultiStageCitySelectUI.3(this);
      return;
      label95:
      if ((uBa == null) || (uBa.size() <= 0))
      {
        paramBundle = czN();
        uBa = paramBundle;
        if (paramBundle != null) {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiStageCitySelectUI", "buildAllSearchRegion used %sms, size: %s", new Object[] { Long.valueOf(bi.bI(l)), Integer.valueOf(uBa.size()) });
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    au.DF().b(665, this);
    if (this.dMm != null) {
      this.dMm.c(this.cXs);
    }
    super.onDestroy();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiStageCitySelectUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    do
    {
      return;
      if ((paramArrayOfInt[0] == 0) && (this.uAZ != null))
      {
        czL();
        return;
      }
    } while (this.uAZ == null);
    this.uAZ.czY();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/tools/MultiStageCitySelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */