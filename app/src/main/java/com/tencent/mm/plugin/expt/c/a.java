package com.tencent.mm.plugin.expt.c;

import android.util.Base64;
import com.tencent.mm.g.c.az;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends az
{
  protected static c.a dhO;
  private HashMap<String, String> iII = null;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "exptId";
    locala.sKA.put("exptId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" exptId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "exptId";
    locala.columns[1] = "groupId";
    locala.sKA.put("groupId", "INTEGER");
    localStringBuilder.append(" groupId INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "exptSeq";
    locala.sKA.put("exptSeq", "INTEGER");
    localStringBuilder.append(" exptSeq INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "exptContent";
    locala.sKA.put("exptContent", "TEXT");
    localStringBuilder.append(" exptContent TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "startTime";
    locala.sKA.put("startTime", "LONG");
    localStringBuilder.append(" startTime LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "endTime";
    locala.sKA.put("endTime", "LONG");
    localStringBuilder.append(" endTime LONG");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  private static void a(HashMap<String, String> paramHashMap, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {}
    String str;
    do
    {
      return;
      str = paramJSONObject.optString("Key");
      paramJSONObject = paramJSONObject.optString("Val");
    } while ((bi.oW(str)) || (bi.oW(paramJSONObject)));
    paramHashMap.put(str, new String(Base64.decode(paramJSONObject, 0)));
  }
  
  public final boolean AC(String paramString)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      String str = toString();
      this.field_exptContent = paramString;
      this.field_exptId = localJSONObject.optInt("ExptId");
      this.field_groupId = localJSONObject.optInt("GroupId");
      this.field_exptSeq = localJSONObject.optInt("ExptSequence");
      this.field_startTime = localJSONObject.optLong("StartTime");
      this.field_endTime = localJSONObject.optLong("EndTime");
      x.v("MicroMsg.ExptItem", "convertFrom new [%s] old[%s] args[%s]", new Object[] { toString(), str, paramString });
      return true;
    }
    catch (Exception localException)
    {
      h.mEJ.a(863L, 5L, 1L, false);
      x.e("MicroMsg.ExptItem", "%d convertFrom [%s] error [%s]", new Object[] { Integer.valueOf(hashCode()), paramString, localException.toString() });
    }
    return false;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  /* Error */
  public final HashMap<String, String> aIF()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 98	com/tencent/mm/plugin/expt/c/a:iII	Ljava/util/HashMap;
    //   6: ifnull +10 -> 16
    //   9: aload_0
    //   10: getfield 98	com/tencent/mm/plugin/expt/c/a:iII	Ljava/util/HashMap;
    //   13: astore_2
    //   14: aload_2
    //   15: areturn
    //   16: aload_0
    //   17: getfield 140	com/tencent/mm/plugin/expt/c/a:field_exptContent	Ljava/lang/String;
    //   20: invokestatic 116	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   23: ifne +142 -> 165
    //   26: aload_0
    //   27: getfield 140	com/tencent/mm/plugin/expt/c/a:field_exptContent	Ljava/lang/String;
    //   30: astore_3
    //   31: new 104	org/json/JSONObject
    //   34: dup
    //   35: aload_3
    //   36: invokespecial 136	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   39: ldc -34
    //   41: invokevirtual 226	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   44: astore_3
    //   45: aload_3
    //   46: ifnull -32 -> 14
    //   49: new 127	java/util/HashMap
    //   52: dup
    //   53: invokespecial 227	java/util/HashMap:<init>	()V
    //   56: astore_2
    //   57: aload_3
    //   58: instanceof 229
    //   61: ifeq +48 -> 109
    //   64: aload_3
    //   65: checkcast 229	org/json/JSONArray
    //   68: astore_3
    //   69: aload_3
    //   70: ifnull +29 -> 99
    //   73: iconst_0
    //   74: istore_1
    //   75: iload_1
    //   76: aload_3
    //   77: invokevirtual 232	org/json/JSONArray:length	()I
    //   80: if_icmpge +19 -> 99
    //   83: aload_2
    //   84: aload_3
    //   85: iload_1
    //   86: invokevirtual 236	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   89: invokestatic 238	com/tencent/mm/plugin/expt/c/a:a	(Ljava/util/HashMap;Lorg/json/JSONObject;)V
    //   92: iload_1
    //   93: iconst_1
    //   94: iadd
    //   95: istore_1
    //   96: goto -21 -> 75
    //   99: aload_0
    //   100: aload_2
    //   101: putfield 98	com/tencent/mm/plugin/expt/c/a:iII	Ljava/util/HashMap;
    //   104: aload_0
    //   105: getfield 98	com/tencent/mm/plugin/expt/c/a:iII	Ljava/util/HashMap;
    //   108: areturn
    //   109: aload_3
    //   110: instanceof 104
    //   113: ifeq +11 -> 124
    //   116: aload_2
    //   117: aload_3
    //   118: checkcast 104	org/json/JSONObject
    //   121: invokestatic 238	com/tencent/mm/plugin/expt/c/a:a	(Ljava/util/HashMap;Lorg/json/JSONObject;)V
    //   124: goto -25 -> 99
    //   127: astore_3
    //   128: aconst_null
    //   129: astore_2
    //   130: ldc -79
    //   132: ldc -16
    //   134: iconst_2
    //   135: anewarray 181	java/lang/Object
    //   138: dup
    //   139: iconst_0
    //   140: aload_3
    //   141: invokevirtual 213	java/lang/Exception:toString	()Ljava/lang/String;
    //   144: aastore
    //   145: dup
    //   146: iconst_1
    //   147: aload_0
    //   148: getfield 150	com/tencent/mm/plugin/expt/c/a:field_exptId	I
    //   151: invokestatic 212	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   154: aastore
    //   155: invokestatic 216	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   158: goto -59 -> 99
    //   161: astore_3
    //   162: goto -32 -> 130
    //   165: aconst_null
    //   166: astore_2
    //   167: goto -68 -> 99
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	170	0	this	a
    //   74	22	1	i	int
    //   1	166	2	localHashMap	HashMap
    //   30	88	3	localObject	Object
    //   127	14	3	localException1	Exception
    //   161	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   31	45	127	java/lang/Exception
    //   49	57	127	java/lang/Exception
    //   57	69	161	java/lang/Exception
    //   75	92	161	java/lang/Exception
    //   109	124	161	java/lang/Exception
  }
  
  public final String toString()
  {
    return "{ Id: " + this.field_exptId + " group: " + this.field_groupId + " seq: " + this.field_exptSeq + " startTime: " + this.field_startTime + " endTime: " + this.field_endTime + " content: " + this.field_exptContent + " }";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/expt/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */