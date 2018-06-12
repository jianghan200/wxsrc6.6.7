package com.tencent.mm.protocal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class y
{
  public String qXe;
  public String qXf;
  public int ver;
  
  y(String paramString1, String paramString2, int paramInt)
  {
    this.qXe = paramString1;
    this.qXf = paramString2;
    this.ver = paramInt;
  }
  
  public static void J(String paramString1, String paramString2, int paramInt)
  {
    x.d("MicroMsg.RsaInfo", "summercert dkcert saveRsaInfo ver:%d keye:%s keyn:%s  ", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
    SharedPreferences.Editor localEditor = ad.getContext().getSharedPreferences("rsa_public_key_prefs", 4).edit();
    localEditor.putString("keye", paramString1);
    localEditor.putString("keyn", paramString2);
    localEditor.putInt("version", paramInt);
    localEditor.putInt("client_version", d.qVN);
    localEditor.commit();
  }
  
  public static y cgr()
  {
    SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("rsa_public_key_prefs", 4);
    y localy = new y(localSharedPreferences.getString("keye", ""), localSharedPreferences.getString("keyn", ""), localSharedPreferences.getInt("version", 0));
    int i = localSharedPreferences.getInt("client_version", 0);
    if (!localy.cgu())
    {
      if (i > 637665843) {
        return localy;
      }
      boolean bool = localSharedPreferences.edit().clear().commit();
      f.mDy.a(148L, 38L, 1L, false);
      x.i("MicroMsg.RsaInfo", "summercert clear old rsa lastClientVer[%d] nowVer[%d], commit[%b]", new Object[] { Integer.valueOf(i), Integer.valueOf(d.qVN), Boolean.valueOf(bool) });
    }
    f.mDy.a(148L, 39L, 1L, false);
    x.d("MicroMsg.RsaInfo", "summercert default req keye[%s], keyn[%s], ver[%d]", new Object[] { "010001", "D153E8A2B314D2110250A0A550DDACDCD77F5801F3D1CC21CB1B477E4F2DE8697D40F10265D066BE8200876BB7135EDC74CDBC7C4428064E0CDCBE1B6B92D93CEAD69EC27126DEBDE564AAE1519ACA836AA70487346C85931273E3AA9D24A721D0B854A7FCB9DED49EE03A44C189124FBEB8B17BB1DBE47A534637777D33EEC88802CD56D0C7683A796027474FEBF237FA5BF85C044ADC63885A70388CD3696D1F2E466EB6666EC8EFE1F91BC9353F8F0EAC67CC7B3281F819A17501E15D03291A2A189F6A35592130DE2FE5ED8E3ED59F65C488391E2D9557748D4065D00CBEA74EB8CA19867C65B3E57237BAA8BF0C0F79EBFC72E78AC29621C8AD61A2B79B".substring(0, 4) + "_" + "D153E8A2B314D2110250A0A550DDACDCD77F5801F3D1CC21CB1B477E4F2DE8697D40F10265D066BE8200876BB7135EDC74CDBC7C4428064E0CDCBE1B6B92D93CEAD69EC27126DEBDE564AAE1519ACA836AA70487346C85931273E3AA9D24A721D0B854A7FCB9DED49EE03A44C189124FBEB8B17BB1DBE47A534637777D33EEC88802CD56D0C7683A796027474FEBF237FA5BF85C044ADC63885A70388CD3696D1F2E466EB6666EC8EFE1F91BC9353F8F0EAC67CC7B3281F819A17501E15D03291A2A189F6A35592130DE2FE5ED8E3ED59F65C488391E2D9557748D4065D00CBEA74EB8CA19867C65B3E57237BAA8BF0C0F79EBFC72E78AC29621C8AD61A2B79B".substring(507, 511), Integer.valueOf(174) });
    return new y("010001", "D153E8A2B314D2110250A0A550DDACDCD77F5801F3D1CC21CB1B477E4F2DE8697D40F10265D066BE8200876BB7135EDC74CDBC7C4428064E0CDCBE1B6B92D93CEAD69EC27126DEBDE564AAE1519ACA836AA70487346C85931273E3AA9D24A721D0B854A7FCB9DED49EE03A44C189124FBEB8B17BB1DBE47A534637777D33EEC88802CD56D0C7683A796027474FEBF237FA5BF85C044ADC63885A70388CD3696D1F2E466EB6666EC8EFE1F91BC9353F8F0EAC67CC7B3281F819A17501E15D03291A2A189F6A35592130DE2FE5ED8E3ED59F65C488391E2D9557748D4065D00CBEA74EB8CA19867C65B3E57237BAA8BF0C0F79EBFC72E78AC29621C8AD61A2B79B", 174);
  }
  
  public static y cgs()
  {
    return new y("010001", "D8D2AE73FF601B93B1471B35870A1B59D7649EEA815CDD8CE5496BBD0C6CFE19C0E082F4E513B615C6030CCFCE3153E25AA00E8156D0311AF72ABBB9BBEC8B1D3751592234B1A621CA774E2EC50047A93FA0BC60DF0C10E8A65C3B29D13167EC217FC6A29034494870705CBF4AC929FBA0E1E656A8F8B50E779AD89BB4EEF6FF", 125);
  }
  
  public static y cgt()
  {
    x.d("MicroMsg.RsaInfo", "summercert default base keye[%s], keyn[%s], ver[%d]", new Object[] { "010001", "D55D10C78FAE31AEEA46BFF785E3CCD0144084E3E426D7A5CAABB8943E815EC235FD86CC426C537C2B6E5E99301FBD0ACB50B562E1867A9C92222F9BFD8F2359AD32A36D0F7D8BCDECCE523EBB4115DE250F5BEC19A11D563AD3FBB45E1A0E49B2D64DECEFE22DC01FC575CEA1A129A5765293168C0CDA1467873B91229ED398F417EB43671D87C41A2D713095F379F22FC4578FB8DB77A9F1897C014F4B5AAF06626AC970811098516FD82B4A84E2960B2F039C463C36DB4CFF46DB0C3E0392172C7022591EE6495AFBE759828F713899994E138897A027F60D104C6A90EE08C9C3FBAE3C2BF7EB0CB613FD1DB2BFC34A677E8FB31EF780957F3D5FD9A4C41D".substring(0, 4) + "_" + "D55D10C78FAE31AEEA46BFF785E3CCD0144084E3E426D7A5CAABB8943E815EC235FD86CC426C537C2B6E5E99301FBD0ACB50B562E1867A9C92222F9BFD8F2359AD32A36D0F7D8BCDECCE523EBB4115DE250F5BEC19A11D563AD3FBB45E1A0E49B2D64DECEFE22DC01FC575CEA1A129A5765293168C0CDA1467873B91229ED398F417EB43671D87C41A2D713095F379F22FC4578FB8DB77A9F1897C014F4B5AAF06626AC970811098516FD82B4A84E2960B2F039C463C36DB4CFF46DB0C3E0392172C7022591EE6495AFBE759828F713899994E138897A027F60D104C6A90EE08C9C3FBAE3C2BF7EB0CB613FD1DB2BFC34A677E8FB31EF780957F3D5FD9A4C41D".substring(507, 511), Integer.valueOf(173) });
    return new y("010001", "D55D10C78FAE31AEEA46BFF785E3CCD0144084E3E426D7A5CAABB8943E815EC235FD86CC426C537C2B6E5E99301FBD0ACB50B562E1867A9C92222F9BFD8F2359AD32A36D0F7D8BCDECCE523EBB4115DE250F5BEC19A11D563AD3FBB45E1A0E49B2D64DECEFE22DC01FC575CEA1A129A5765293168C0CDA1467873B91229ED398F417EB43671D87C41A2D713095F379F22FC4578FB8DB77A9F1897C014F4B5AAF06626AC970811098516FD82B4A84E2960B2F039C463C36DB4CFF46DB0C3E0392172C7022591EE6495AFBE759828F713899994E138897A027F60D104C6A90EE08C9C3FBAE3C2BF7EB0CB613FD1DB2BFC34A677E8FB31EF780957F3D5FD9A4C41D", 173);
  }
  
  /* Error */
  public static boolean cgv()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: new 170	java/io/FileWriter
    //   5: dup
    //   6: new 138	java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   13: getstatic 175	com/tencent/mm/compatible/util/e:bnE	Ljava/lang/String;
    //   16: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: ldc -79
    //   21: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: invokevirtual 157	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: invokespecial 180	java/io/FileWriter:<init>	(Ljava/lang/String;)V
    //   30: astore_2
    //   31: aload_2
    //   32: astore_1
    //   33: aload_2
    //   34: ldc -74
    //   36: invokevirtual 185	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   39: aload_2
    //   40: astore_1
    //   41: aload_2
    //   42: new 138	java/lang/StringBuilder
    //   45: dup
    //   46: ldc -69
    //   48: invokespecial 188	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   51: getstatic 193	com/tencent/mm/sdk/platformtools/d:CLIENT_VERSION	Ljava/lang/String;
    //   54: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: ldc -61
    //   59: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: invokevirtual 157	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: invokevirtual 185	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   68: aload_2
    //   69: astore_1
    //   70: aload_2
    //   71: new 138	java/lang/StringBuilder
    //   74: dup
    //   75: ldc -59
    //   77: invokespecial 188	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   80: new 199	java/text/SimpleDateFormat
    //   83: dup
    //   84: ldc -55
    //   86: invokespecial 202	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   89: new 204	java/util/Date
    //   92: dup
    //   93: invokespecial 205	java/util/Date:<init>	()V
    //   96: invokevirtual 209	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   99: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: ldc -45
    //   104: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: invokevirtual 157	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: invokevirtual 185	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   113: aload_2
    //   114: astore_1
    //   115: aload_2
    //   116: ldc -43
    //   118: invokevirtual 185	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   121: aload_2
    //   122: astore_1
    //   123: aload_2
    //   124: ldc -41
    //   126: invokevirtual 185	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   129: aload_2
    //   130: astore_1
    //   131: aload_2
    //   132: ldc -39
    //   134: invokevirtual 185	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   137: aload_2
    //   138: astore_1
    //   139: aload_2
    //   140: ldc -37
    //   142: invokevirtual 185	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   145: aload_2
    //   146: astore_1
    //   147: aload_2
    //   148: ldc -35
    //   150: invokevirtual 185	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   153: aload_2
    //   154: astore_1
    //   155: aload_2
    //   156: ldc -33
    //   158: invokevirtual 185	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   161: aload_2
    //   162: astore_1
    //   163: aload_2
    //   164: ldc -31
    //   166: invokevirtual 185	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   169: iconst_1
    //   170: istore_0
    //   171: aload_2
    //   172: invokevirtual 228	java/io/FileWriter:close	()V
    //   175: iload_0
    //   176: ireturn
    //   177: astore_3
    //   178: aconst_null
    //   179: astore_2
    //   180: aload_2
    //   181: astore_1
    //   182: ldc 24
    //   184: aload_3
    //   185: ldc 89
    //   187: iconst_0
    //   188: anewarray 4	java/lang/Object
    //   191: invokestatic 232	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload_2
    //   195: ifnull -20 -> 175
    //   198: aload_2
    //   199: invokevirtual 228	java/io/FileWriter:close	()V
    //   202: iconst_0
    //   203: ireturn
    //   204: astore_1
    //   205: iconst_0
    //   206: ireturn
    //   207: astore_2
    //   208: aconst_null
    //   209: astore_1
    //   210: aload_1
    //   211: ifnull +7 -> 218
    //   214: aload_1
    //   215: invokevirtual 228	java/io/FileWriter:close	()V
    //   218: aload_2
    //   219: athrow
    //   220: astore_1
    //   221: iconst_1
    //   222: ireturn
    //   223: astore_1
    //   224: goto -6 -> 218
    //   227: astore_2
    //   228: goto -18 -> 210
    //   231: astore_3
    //   232: goto -52 -> 180
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	175	0	bool	boolean
    //   32	150	1	localFileWriter1	java.io.FileWriter
    //   204	1	1	localException1	Exception
    //   209	6	1	localObject1	Object
    //   220	1	1	localException2	Exception
    //   223	1	1	localException3	Exception
    //   30	169	2	localFileWriter2	java.io.FileWriter
    //   207	12	2	localObject2	Object
    //   227	1	2	localObject3	Object
    //   177	8	3	localException4	Exception
    //   231	1	3	localException5	Exception
    // Exception table:
    //   from	to	target	type
    //   2	31	177	java/lang/Exception
    //   198	202	204	java/lang/Exception
    //   2	31	207	finally
    //   171	175	220	java/lang/Exception
    //   214	218	223	java/lang/Exception
    //   33	39	227	finally
    //   41	68	227	finally
    //   70	113	227	finally
    //   115	121	227	finally
    //   123	129	227	finally
    //   131	137	227	finally
    //   139	145	227	finally
    //   147	153	227	finally
    //   155	161	227	finally
    //   163	169	227	finally
    //   182	194	227	finally
    //   33	39	231	java/lang/Exception
    //   41	68	231	java/lang/Exception
    //   70	113	231	java/lang/Exception
    //   115	121	231	java/lang/Exception
    //   123	129	231	java/lang/Exception
    //   131	137	231	java/lang/Exception
    //   139	145	231	java/lang/Exception
    //   147	153	231	java/lang/Exception
    //   155	161	231	java/lang/Exception
    //   163	169	231	java/lang/Exception
  }
  
  public final boolean cgu()
  {
    return (this.ver == 0) || (bi.oW(this.qXe)) || (bi.oW(this.qXf));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */