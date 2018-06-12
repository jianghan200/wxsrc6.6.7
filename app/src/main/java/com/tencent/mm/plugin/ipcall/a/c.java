package com.tencent.mm.plugin.ipcall.a;

import android.database.Cursor;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.ipcall.a.g.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
{
  private static c koi;
  public boolean huc = false;
  private ArrayList<Integer> koj = new ArrayList();
  ArrayList<Integer> kok = new ArrayList();
  
  private void EM(String paramString)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return;
      try
      {
        paramString = new JSONObject(paramString).getJSONArray("restriction");
        x.d("MicroMsg.IPCallCountryCodeConfig", "restrictionCountryCode: %d", new Object[] { Integer.valueOf(paramString.length()) });
        this.kok.clear();
        int i = 0;
        while (i < paramString.length())
        {
          int j = paramString.getInt(i);
          this.kok.add(Integer.valueOf(j));
          i += 1;
        }
        return;
      }
      catch (Exception paramString)
      {
        x.printErrStackTrace("MicroMsg.IPCallCountryCodeConfig", paramString, "", new Object[0]);
        x.e("MicroMsg.IPCallCountryCodeConfig", "initConfigFromContent error: %s", new Object[] { paramString.getMessage() });
      }
    }
  }
  
  public static c aXb()
  {
    if (koi == null) {
      koi = new c();
    }
    return koi;
  }
  
  private void aXc()
  {
    this.koj.clear();
    Object localObject = g.AT().getValue("WeChatOutTopCountryCode");
    x.d("MicroMsg.IPCallCountryCodeConfig", "popularCountryConfig: %s", new Object[] { localObject });
    if (!bi.oW((String)localObject))
    {
      localObject = ((String)localObject).trim().split(",");
      int j = localObject.length;
      try
      {
        int k = localObject.length;
        int i = 0;
        while (i < k)
        {
          Integer localInteger = Integer.valueOf(bi.getInt(localObject[i], 0));
          this.koj.add(localInteger);
          i.aXx().y(localInteger.intValue(), j);
          j -= 1;
          i += 1;
        }
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        x.e("MicroMsg.IPCallCountryCodeConfig", "initPopularCountryFromDynamicConfig error: %s", new Object[] { localNumberFormatException.getMessage() });
      }
    }
  }
  
  public final void aXd()
  {
    Object localObject1 = i.aXx();
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(" ORDER BY IPCallPopularCountry.callTimeCount DESC,IPCallPopularCountry.lastCallTime DESC");
    localObject1 = ((j)localObject1).diF.b("SELECT IPCallPopularCountry.countryCode,IPCallPopularCountry.callTimeCount,IPCallPopularCountry.lastCallTime FROM IPCallPopularCountry  " + ((StringBuilder)localObject2).toString(), null, 2);
    if ((localObject1 != null) && (((Cursor)localObject1).moveToFirst()))
    {
      new ArrayList();
      do
      {
        localObject2 = new com.tencent.mm.plugin.ipcall.a.g.i();
        ((com.tencent.mm.plugin.ipcall.a.g.i)localObject2).d((Cursor)localObject1);
        localArrayList.add(Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.g.i)localObject2).field_countryCode));
      } while (((Cursor)localObject1).moveToNext());
    }
    if (localObject1 != null) {
      ((Cursor)localObject1).close();
    }
    if (localArrayList.size() > 0)
    {
      this.koj = localArrayList;
      return;
    }
    aXc();
  }
  
  public final List<Integer> aXe()
  {
    if (!this.huc) {
      fM(false);
    }
    return this.koj;
  }
  
  /* Error */
  public final void fM(boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_0
    //   6: getfield 25	com/tencent/mm/plugin/ipcall/a/c:huc	Z
    //   9: ifeq +8 -> 17
    //   12: iload_1
    //   13: ifne +4 -> 17
    //   16: return
    //   17: aload_0
    //   18: invokevirtual 213	com/tencent/mm/plugin/ipcall/a/c:aXd	()V
    //   21: new 153	java/lang/StringBuilder
    //   24: dup
    //   25: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   28: getstatic 219	com/tencent/mm/compatible/util/e:duN	Ljava/lang/String;
    //   31: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: ldc -35
    //   36: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: invokevirtual 170	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   42: astore 5
    //   44: aload_3
    //   45: astore_2
    //   46: new 223	java/io/File
    //   49: dup
    //   50: aload 5
    //   52: invokespecial 224	java/io/File:<init>	(Ljava/lang/String;)V
    //   55: astore 6
    //   57: aload_3
    //   58: astore_2
    //   59: aload 6
    //   61: invokevirtual 227	java/io/File:exists	()Z
    //   64: ifne +33 -> 97
    //   67: aload_3
    //   68: astore_2
    //   69: ldc 48
    //   71: ldc -27
    //   73: iconst_1
    //   74: anewarray 4	java/lang/Object
    //   77: dup
    //   78: iconst_0
    //   79: aload 5
    //   81: aastore
    //   82: invokestatic 68	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   85: aload_3
    //   86: astore_2
    //   87: aload_0
    //   88: iconst_1
    //   89: putfield 25	com/tencent/mm/plugin/ipcall/a/c:huc	Z
    //   92: aconst_null
    //   93: invokestatic 235	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   96: return
    //   97: aload_3
    //   98: astore_2
    //   99: new 237	java/io/FileInputStream
    //   102: dup
    //   103: aload 6
    //   105: invokespecial 240	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   108: astore_3
    //   109: new 242	java/io/BufferedReader
    //   112: dup
    //   113: new 244	java/io/InputStreamReader
    //   116: dup
    //   117: aload_3
    //   118: invokespecial 246	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   121: invokespecial 249	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   124: astore 4
    //   126: ldc 81
    //   128: astore_2
    //   129: aload 4
    //   131: invokevirtual 252	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   134: astore 5
    //   136: aload 5
    //   138: ifnull +26 -> 164
    //   141: new 153	java/lang/StringBuilder
    //   144: dup
    //   145: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   148: aload_2
    //   149: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: aload 5
    //   154: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: invokevirtual 170	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: astore_2
    //   161: goto -32 -> 129
    //   164: ldc 48
    //   166: ldc -2
    //   168: iconst_1
    //   169: anewarray 4	java/lang/Object
    //   172: dup
    //   173: iconst_0
    //   174: aload_2
    //   175: aastore
    //   176: invokestatic 68	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: aload_0
    //   180: aload_2
    //   181: invokespecial 256	com/tencent/mm/plugin/ipcall/a/c:EM	(Ljava/lang/String;)V
    //   184: aload_0
    //   185: iconst_1
    //   186: putfield 25	com/tencent/mm/plugin/ipcall/a/c:huc	Z
    //   189: aload_3
    //   190: invokestatic 235	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   193: return
    //   194: astore_2
    //   195: aload 4
    //   197: astore_3
    //   198: aload_2
    //   199: astore 4
    //   201: aload_3
    //   202: astore_2
    //   203: ldc 48
    //   205: aload 4
    //   207: ldc 81
    //   209: iconst_0
    //   210: anewarray 4	java/lang/Object
    //   213: invokestatic 85	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   216: aload_3
    //   217: astore_2
    //   218: ldc 48
    //   220: ldc_w 258
    //   223: iconst_1
    //   224: anewarray 4	java/lang/Object
    //   227: dup
    //   228: iconst_0
    //   229: aload 4
    //   231: invokevirtual 91	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   234: aastore
    //   235: invokestatic 94	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   238: aload_3
    //   239: invokestatic 235	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   242: return
    //   243: astore 4
    //   245: aload_2
    //   246: astore_3
    //   247: aload 4
    //   249: astore_2
    //   250: aload_3
    //   251: invokestatic 235	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   254: aload_2
    //   255: athrow
    //   256: astore_2
    //   257: goto -7 -> 250
    //   260: astore 4
    //   262: goto -61 -> 201
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	265	0	this	c
    //   0	265	1	paramBoolean	boolean
    //   45	136	2	localObject1	Object
    //   194	5	2	localException1	Exception
    //   202	53	2	localObject2	Object
    //   256	1	2	localObject3	Object
    //   1	250	3	localObject4	Object
    //   3	227	4	localObject5	Object
    //   243	5	4	localObject6	Object
    //   260	1	4	localException2	Exception
    //   42	111	5	str	String
    //   55	49	6	localFile	java.io.File
    // Exception table:
    //   from	to	target	type
    //   46	57	194	java/lang/Exception
    //   59	67	194	java/lang/Exception
    //   69	85	194	java/lang/Exception
    //   87	92	194	java/lang/Exception
    //   99	109	194	java/lang/Exception
    //   46	57	243	finally
    //   59	67	243	finally
    //   69	85	243	finally
    //   87	92	243	finally
    //   99	109	243	finally
    //   203	216	243	finally
    //   218	238	243	finally
    //   109	126	256	finally
    //   129	136	256	finally
    //   141	161	256	finally
    //   164	189	256	finally
    //   109	126	260	java/lang/Exception
    //   129	136	260	java/lang/Exception
    //   141	161	260	java/lang/Exception
    //   164	189	260	java/lang/Exception
  }
  
  public final boolean ru(int paramInt)
  {
    if (!this.huc) {
      fM(false);
    }
    if ((this.kok == null) || (this.kok.size() <= 0)) {
      return false;
    }
    return this.kok.contains(Integer.valueOf(paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */